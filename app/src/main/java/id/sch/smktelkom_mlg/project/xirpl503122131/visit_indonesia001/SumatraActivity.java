package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SumatraActivity extends AppCompatActivity {
    Button bts1, bts2, bts3, bts4, bts5, bts6, bts7, bts8, bts9, bts10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumatra);

        setTitle("Sumatra");

        bts1 = (Button) findViewById(R.id.buttonS1);
        bts2 = (Button) findViewById(R.id.buttonS2);
        bts3 = (Button) findViewById(R.id.buttonS3);
        bts4 = (Button) findViewById(R.id.buttonS4);
        bts5 = (Button) findViewById(R.id.buttonS5);
        bts6 = (Button) findViewById(R.id.buttonS6);
        bts7 = (Button) findViewById(R.id.buttonS7);
        bts8 = (Button) findViewById(R.id.buttonS8);
        bts9 = (Button) findViewById(R.id.buttonS9);
        bts10 = (Button) findViewById(R.id.buttonS10);

        bts1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SumatraActivity.this, DetailActivity.class));
            }
        });

        bts2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SumatraActivity.this, DetailActivity.class));
            }
        });

        bts3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SumatraActivity.this, DetailActivity.class));
            }
        });

        bts4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SumatraActivity.this, DetailActivity.class));
            }
        });

        bts5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SumatraActivity.this, DetailActivity.class));
            }
        });

        bts6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SumatraActivity.this, DetailActivity.class));
            }
        });

        bts7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SumatraActivity.this, DetailActivity.class));
            }
        });

        bts8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SumatraActivity.this, DetailActivity.class));
            }
        });

        bts9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SumatraActivity.this, DetailActivity.class));
            }
        });

        bts10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SumatraActivity.this, DetailActivity.class));
            }
        });
    }
}
