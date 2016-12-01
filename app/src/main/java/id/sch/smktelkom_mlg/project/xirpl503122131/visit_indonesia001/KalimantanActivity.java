package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class KalimantanActivity extends AppCompatActivity {
    public static final String TITLE = "Title";
    public static final String DESC = "Desc";
    public static final String LOC = "Location";
    ImageButton btk1, btk2, btk3, btk4, btk5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalimantan);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setTitle("Kalimantan");

        btk1 = (ImageButton) findViewById(R.id.buttonK1);
        btk2 = (ImageButton) findViewById(R.id.buttonK2);
        btk3 = (ImageButton) findViewById(R.id.buttonK3);
        btk4 = (ImageButton) findViewById(R.id.buttonK4);
        btk5 = (ImageButton) findViewById(R.id.buttonK5);

        btk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getResources().getString(R.string.k1);
                String desc = getResources().getString(R.string.kd1);
                String loc = getResources().getString(R.string.kl1);

                Intent intent = new Intent(KalimantanActivity.this, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                startActivity(intent);
            }
        });

        btk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getResources().getString(R.string.k2);
                String desc = getResources().getString(R.string.kd2);
                String loc = getResources().getString(R.string.kl2);

                Intent intent = new Intent(KalimantanActivity.this, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                startActivity(intent);
            }
        });

        btk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getResources().getString(R.string.k3);
                String desc = getResources().getString(R.string.kd3);
                String loc = getResources().getString(R.string.kl3);

                Intent intent = new Intent(KalimantanActivity.this, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                startActivity(intent);
            }
        });

        btk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getResources().getString(R.string.k4);
                String desc = getResources().getString(R.string.kd4);
                String loc = getResources().getString(R.string.kl4);

                Intent intent = new Intent(KalimantanActivity.this, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                startActivity(intent);
            }
        });

        btk5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getResources().getString(R.string.k5);
                String desc = getResources().getString(R.string.kd5);
                String loc = getResources().getString(R.string.kl5);

                Intent intent = new Intent(KalimantanActivity.this, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                startActivity(intent);
            }
        });
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
