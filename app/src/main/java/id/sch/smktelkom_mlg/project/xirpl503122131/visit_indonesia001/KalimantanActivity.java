package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class KalimantanActivity extends AppCompatActivity {

    Button btk1, btk2, btk3, btk4, btk5, btk6, btk7, btk8, btk9, btk10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalimantan);

        setTitle("Kalimantan");

        btk1 = (Button) findViewById(R.id.buttonK1);
        btk2 = (Button) findViewById(R.id.buttonK2);
        btk3 = (Button) findViewById(R.id.buttonK3);
        btk4 = (Button) findViewById(R.id.buttonK4);
        btk5 = (Button) findViewById(R.id.buttonK5);
        btk6 = (Button) findViewById(R.id.buttonK6);
        btk7 = (Button) findViewById(R.id.buttonK7);
        btk8 = (Button) findViewById(R.id.buttonK8);
        btk9 = (Button) findViewById(R.id.buttonK9);
        btk10 = (Button) findViewById(R.id.buttonK10);

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
