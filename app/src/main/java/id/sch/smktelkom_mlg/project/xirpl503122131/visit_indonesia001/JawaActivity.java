package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class JawaActivity extends AppCompatActivity {
    ImageButton btj1, btj2, btj3, btj4, btj5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawa);

        setTitle("Jawa");

        btj1 = (ImageButton) findViewById(R.id.buttonJ1);
        btj2 = (ImageButton) findViewById(R.id.buttonJ2);
        btj3 = (ImageButton) findViewById(R.id.buttonJ3);
        btj4 = (ImageButton) findViewById(R.id.buttonJ4);
        btj5 = (ImageButton) findViewById(R.id.buttonJ5);

        btj1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(JawaActivity.this, DetailActivity.class));
            }
        });

        btj2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(JawaActivity.this, DetailActivity.class));
            }
        });

        btj3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(JawaActivity.this, DetailActivity.class));
            }
        });
    }
}
