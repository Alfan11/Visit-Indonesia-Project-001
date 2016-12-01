package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView tvDetail, tvLoc;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        iv = (ImageView) findViewById(R.id.imageFoto);
        tvDetail = (TextView) findViewById(R.id.place_detail);
        tvLoc = (TextView) findViewById(R.id.place_location);

        //SUMATRA
        String title = getIntent().getStringExtra(SumatraActivity.TITLE);
        String desc = getIntent().getStringExtra(SumatraActivity.DESC);
        String loc = getIntent().getStringExtra(SumatraActivity.LOC);

        setTitle(title);
        tvDetail.setText(desc);
        tvLoc.setText(loc);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
