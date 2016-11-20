package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class JawaActivity extends AppCompatActivity {
    Button btj1, btj2, btj3, btj4, btj5, btj6, btj7, btj8, btj9, btj10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawa);

        setTitle("Jawa");

        btj1 = (Button) findViewById(R.id.buttonJ1);
        btj2 = (Button) findViewById(R.id.buttonJ2);
        btj3 = (Button) findViewById(R.id.buttonJ3);
        btj4 = (Button) findViewById(R.id.buttonJ4);
        btj5 = (Button) findViewById(R.id.buttonJ5);
        btj6 = (Button) findViewById(R.id.buttonJ6);
        btj7 = (Button) findViewById(R.id.buttonJ7);
        btj8 = (Button) findViewById(R.id.buttonJ8);
        btj9 = (Button) findViewById(R.id.buttonJ9);
        btj10 = (Button) findViewById(R.id.buttonJ10);

        btj1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(JawaActivity.this, DetailActivity.class));
            }
        });
    }
}
