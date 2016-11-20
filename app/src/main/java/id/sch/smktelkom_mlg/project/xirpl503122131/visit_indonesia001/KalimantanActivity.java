package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class KalimantanActivity extends AppCompatActivity {

    ImageButton btk1, btk2, btk3, btk4, btk5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalimantan);

        setTitle("Kalimantan");

        btk1 = (ImageButton) findViewById(R.id.buttonK1);
        btk2 = (ImageButton) findViewById(R.id.buttonK2);
        btk3 = (ImageButton) findViewById(R.id.buttonK3);
        btk4 = (ImageButton) findViewById(R.id.buttonK4);
        btk5 = (ImageButton) findViewById(R.id.buttonK5);

        btk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KalimantanActivity.this, DetailActivity.class));
            }
        });

        btk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KalimantanActivity.this, DetailActivity.class));
            }
        });

        btk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KalimantanActivity.this, DetailActivity.class));
            }
        });

        btk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KalimantanActivity.this, DetailActivity.class));
            }
        });
    }
}
