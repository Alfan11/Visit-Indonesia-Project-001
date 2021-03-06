package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    //deklarasi variable context

    private final Context context;

    String[] name = {"Sumatra", "Kalimantan", "Sulawesi", "Jawa",
            "Papua"};
    String[] desc = {"20 Wisata", "10 Wisata", "11 Wisata", "10 Wisata", "10 Wisata"};
    int[] img = {R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5};
    // menampilkan list item dalam bentuk text dengan tipe data string dengan variable name

    LayoutInflater inflater;
    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //member aksi saat cardview diklik berdasarkan posisi tertentu
            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();
            int position = vholder.getPosition();
            if (position == 0 && position < getItemCount()) {
                Intent intent = new Intent(context, SumatraActivity.class);
                context.startActivity(intent);
            }
            if (position == 1 && position < getItemCount()) {
                Intent intent = new Intent(context, KalimantanActivity.class);
                context.startActivity(intent);
            }
            if (position == 2 && position < getItemCount()) {
                Intent intent = new Intent(context, SulawesiActivity.class);
                context.startActivity(intent);
            }
            if (position == 3 && position < getItemCount()) {
                Intent intent = new Intent(context, JawaActivity.class);
                context.startActivity(intent);
            }
            if (position == 4 && position < getItemCount()) {
                Intent intent = new Intent(context, PapuaActivity.class);
                context.startActivity(intent);
            }
        }
    };

    public RecyclerAdapter(Context context) {
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.item_list, parent, false);
        RecyclerViewHolder viewHolder = new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.tv1.setText(name[position]);
        holder.tv1.setOnClickListener(clickListener);
        holder.tv1.setTag(holder);
        holder.tv2.setText(desc[position]);
        holder.imageView.setOnClickListener(clickListener);
        holder.imageView.setTag(holder);
        holder.imageView.setImageResource(img[position]);
    }

    @Override
    public int getItemCount() {
        return name.length;
    }
}
