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

import id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001.adapter.JawaAdapter;
import id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001.model.Jawa;

public class JawaActivity extends AppCompatActivity implements JawaAdapter.IHotelAdapter {
    public static final String HOTEL = "hotel";
    ArrayList<Jawa> mList = new ArrayList<>();
    JawaAdapter mAdapter;
    RecyclerView rvJawa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawa);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Jawa");

        rvJawa = (RecyclerView) findViewById(R.id.recycler_view_jawa);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rvJawa.setLayoutManager(layoutManager);
        mAdapter = new JawaAdapter(this, mList);
        rvJawa.setAdapter(mAdapter);

        filData();
    }

    private void filData() {
        Resources resources = getResources();
        String[] arJudul = resources.getStringArray(R.array.placesJawa);
        String[] arDeskripsi = resources.getStringArray(R.array.place_descJawa);
        String[] arDetail = resources.getStringArray(R.array.place_detailsJawa);
        String[] arLokasi = resources.getStringArray(R.array.place_locationsJawa);
        TypedArray a = resources.obtainTypedArray(R.array.places_pictureJawa);
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
            mList.add(new Jawa(arJudul[i], arDeskripsi[i], arDetail[i],
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
        Intent intent = new Intent(this, DetailActivity3.class);
        intent.putExtra(HOTEL, mList.get(pos));
        startActivity(intent);
    }
}
