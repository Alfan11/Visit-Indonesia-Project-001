package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
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

        iv = (ImageView) findViewById(R.id.imageFoto);
        tvDetail = (TextView) findViewById(R.id.place_detail);
        tvLoc = (TextView) findViewById(R.id.place_location);

        String title = getIntent().getStringExtra(SumatraActivity.TITLE);
        String desc = getIntent().getStringExtra(SumatraActivity.DESC);
        String loc = getIntent().getStringExtra(SumatraActivity.LOC);

        setTitle(title);
        tvDetail.setText(desc);
        tvLoc.setText(loc);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Hello", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }
}
