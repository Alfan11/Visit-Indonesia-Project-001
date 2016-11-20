package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SulawesiActivity extends AppCompatActivity {
    Button btu1, btu2, btu3, btu4, btu5, btu6, btu7, btu8, btu9, btu10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sulawesi);

        setTitle("Sulawesi");

        btu1 = (Button) findViewById(R.id.buttonU1);
        btu2 = (Button) findViewById(R.id.buttonU2);
        btu3 = (Button) findViewById(R.id.buttonU3);
        btu4 = (Button) findViewById(R.id.buttonU4);
        btu5 = (Button) findViewById(R.id.buttonU5);
        btu6 = (Button) findViewById(R.id.buttonU6);
        btu7 = (Button) findViewById(R.id.buttonU7);
        btu8 = (Button) findViewById(R.id.buttonU8);
        btu9 = (Button) findViewById(R.id.buttonU9);
        btu10 = (Button) findViewById(R.id.buttonU10);

        btu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SulawesiActivity.this, DetailActivity.class));
            }
        });

        btu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SulawesiActivity.this, DetailActivity.class));
            }
        });

        btu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SulawesiActivity.this, DetailActivity.class));
            }
        });

        btu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SulawesiActivity.this, DetailActivity.class));
            }
        });
    }
}
