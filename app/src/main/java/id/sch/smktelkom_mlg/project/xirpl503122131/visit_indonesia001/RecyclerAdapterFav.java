package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Rehan on 12/1/2016.
 */

public class RecyclerAdapterFav extends RecyclerView.Adapter<RecyclerViewHolderFav> {
    public static final String TITLE = "Title";
    public static final String DESC = "Desc";
    public static final String LOC = "Location";

    //deklarasi variable context

    private final Context context;

    String[] name = {"Kawah Ijen", "Bunaken", "Borobudur", "Raja Ampat", "Kepulauan Seribu"};
    String[] desc = {"Papua", "Sulawesi", "Yogyakarta", "Malang", "Pulau Komodo"};
    int[] img = {R.drawable.j10, R.drawable.u7, R.drawable.j9, R.drawable.p2, R.drawable.j2};
    // menampilkan list item dalam bentuk text dengan tipe data string dengan variable name

    LayoutInflater inflater;
    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //memberi aksi saat cardview diklik berdasarkan posisi tertentu
            RecyclerViewHolderFav vholder = (RecyclerViewHolderFav) v.getTag();
            int position = vholder.getPosition();
            if (position == 0 && position < getItemCount()) {
                Intent intent = new Intent(context, JawaActivity.class)
                        .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
            if (position == 1 && position < getItemCount()) {
                Intent intent = new Intent(context, SulawesiActivity.class)
                        .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
            if (position == 2 && position < getItemCount()) {
                Intent intent = new Intent(context, JawaActivity.class)
                        .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
            if (position == 3 && position < getItemCount()) {
                Intent intent = new Intent(context, PapuaActivity.class)
                        .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
            if (position == 4 && position < getItemCount()) {
                Intent intent = new Intent(context, JawaActivity.class)
                        .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        }
    };

    public RecyclerAdapterFav(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerViewHolderFav onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_list1, parent, false);
        RecyclerViewHolderFav viewHolderFav = new RecyclerViewHolderFav(v);
        return viewHolderFav;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolderFav holder, int position) {
        holder.tv1F.setText(name[position]);
        holder.tv1F.setOnClickListener(clickListener);
        holder.tv1F.setTag(holder);
        holder.tv2F.setText(desc[position]);
        holder.imageViewF.setOnClickListener(clickListener);
        holder.imageViewF.setTag(holder);
        holder.imageViewF.setImageResource(img[position]);
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

}
