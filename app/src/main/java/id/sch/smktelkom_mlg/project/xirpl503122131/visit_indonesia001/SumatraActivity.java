package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001.adapter.SumatraAdapter;
import id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001.model.Sumatra;

public class SumatraActivity extends AppCompatActivity implements SumatraAdapter.IHotelAdapter {
    public static final String HOTEL = "hotel";
    ArrayList<Sumatra> mList = new ArrayList<>();
    SumatraAdapter mAdapter;
    RecyclerView rvSumatra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumatra);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Sumatra");

        rvSumatra = (RecyclerView) findViewById(R.id.recycler_view_sumatra);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rvSumatra.setLayoutManager(layoutManager);
        mAdapter = new SumatraAdapter(this, mList);
        rvSumatra.setAdapter(mAdapter);

        filData();
    }

    private void filData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.places);
        String[] arDeskripsi = resources.getStringArray(R.array.place_desc);
        String[] arDetail = resources.getStringArray(R.array.place_details);
        String[] arLokasi = resources.getStringArray(R.array.place_locations);
        TypedArray a = resources.obtainTypedArray(R.array.places_picture);
        String[] arFoto = new String[a.length()];
        for (int i = 0; i < arFoto.length; i++) {
            int id = a.getResourceId(i, 0);
            arFoto[i] = ContentResolver.SCHEME_ANDROID_RESOURCE + "://"
                    + resources.getResourcePackageName(id) + '/'
                    + resources.getResourceTypeName(id) + '/'
                    + resources.getResourceEntryName(id);
        }
        a.recycle();

        for (int i = 0; i < arJudul.length; i++) {
            mList.add(new Sumatra(arJudul[i], arDeskripsi[i], arDetail[i],
                    arLokasi[i], arFoto[i]));
        }
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void doClick(int pos) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(HOTEL, mList.get(pos));
        startActivity(intent);
    }
}
