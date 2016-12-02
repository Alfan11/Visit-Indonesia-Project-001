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
    int[] img = {R.drawable.j3, R.drawable.u2, R.drawable.j2, R.drawable.p2, R.drawable.j5};
    // menampilkan list item dalam bentuk text dengan tipe data string dengan variable name

    LayoutInflater inflater;
    View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //memberi aksi saat cardview diklik berdasarkan posisi tertentu
            RecyclerViewHolderFav vholder = (RecyclerViewHolderFav) v.getTag();
            int position = vholder.getPosition();
            if (position == 0 && position < getItemCount()) {
                String title = context.getResources().getString(R.string.j3);
                String desc = context.getResources().getString(R.string.jd3);
                String loc = context.getResources().getString(R.string.jl3);

                Intent intent = new Intent(context, DetailActivity.class)
                        .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                context.startActivity(intent);
            }
            if (position == 1 && position < getItemCount()) {
                String title = context.getResources().getString(R.string.u2);
                String desc = context.getResources().getString(R.string.ud2);
                String loc = context.getResources().getString(R.string.ul2);

                Intent intent = new Intent(context, DetailActivity.class)
                        .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                context.startActivity(intent);

            }
            if (position == 2 && position < getItemCount()) {
                String title = context.getResources().getString(R.string.j2);
                String desc = context.getResources().getString(R.string.jd2);
                String loc = context.getResources().getString(R.string.jl2);

                Intent intent = new Intent(context, DetailActivity.class)
                        .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                context.startActivity(intent);
            }
            if (position == 3 && position < getItemCount()) {
                String title = context.getResources().getString(R.string.p2);
                String desc = context.getResources().getString(R.string.pd2);
                String loc = context.getResources().getString(R.string.pl2);

                Intent intent = new Intent(context, DetailActivity.class)
                        .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                context.startActivity(intent);
            }
            if (position == 4 && position < getItemCount()) {
                String title = context.getResources().getString(R.string.j5);
                String desc = context.getResources().getString(R.string.jd5);
                String loc = context.getResources().getString(R.string.jl5);

                Intent intent = new Intent(context, DetailActivity.class)
                        .setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
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
