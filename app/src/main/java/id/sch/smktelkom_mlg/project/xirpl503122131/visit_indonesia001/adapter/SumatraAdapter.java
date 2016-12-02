package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001.R;
import id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001.model.Sumatra;


public class SumatraAdapter extends RecyclerView.Adapter<SumatraAdapter.ViewHolder> {
    ArrayList<Sumatra> hotelList;

    IHotelAdapter mIHotelAdapter;

    public SumatraAdapter(Context context, ArrayList<Sumatra> hotelList) {
        this.hotelList = hotelList;
        mIHotelAdapter = (IHotelAdapter) context;
    }

    @Override
    public SumatraAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_sumatra, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(SumatraAdapter.ViewHolder holder, int position) {
        Sumatra sumatra = hotelList.get(position);
        holder.tvJudul.setText(sumatra.judul);
        holder.tvDeskripsi.setText(sumatra.deskripsi);
        holder.ivFoto.setImageURI(Uri.parse(sumatra.foto));

    }

    @Override
    public int getItemCount() {
        if (hotelList != null)
            return hotelList.size();
        return 0;
    }

    public interface IHotelAdapter {
        void doClick(int pos);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvJudul;
        TextView tvDeskripsi;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mIHotelAdapter.doClick(getAdapterPosition());
                }
            });
        }
    }
}
