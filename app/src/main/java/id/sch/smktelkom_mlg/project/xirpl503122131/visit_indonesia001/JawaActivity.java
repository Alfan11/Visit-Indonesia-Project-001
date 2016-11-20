package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class JawaActivity extends AppCompatActivity {
    public static final String TITLE = "Title";
    public static final String DESC = "Desc";
    public static final String LOC = "Location";
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
                String title = getResources().getString(R.string.j1);
                String desc = getResources().getString(R.string.jd1);
                String loc = getResources().getString(R.string.jl1);

                Intent intent = new Intent(JawaActivity.this, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                startActivity(intent);
            }
        });

        btj2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getResources().getString(R.string.j2);
                String desc = getResources().getString(R.string.jd2);
                String loc = getResources().getString(R.string.jl2);

                Intent intent = new Intent(JawaActivity.this, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                startActivity(intent);
            }
        });

        btj3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getResources().getString(R.string.j3);
                String desc = getResources().getString(R.string.jd3);
                String loc = getResources().getString(R.string.jl3);

                Intent intent = new Intent(JawaActivity.this, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                startActivity(intent);
            }
        });

        btj4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getResources().getString(R.string.j3);
                String desc = getResources().getString(R.string.jd3);
                String loc = getResources().getString(R.string.jl3);

                Intent intent = new Intent(JawaActivity.this, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                startActivity(intent);
            }
        });

        btj5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getResources().getString(R.string.j3);
                String desc = getResources().getString(R.string.jd3);
                String loc = getResources().getString(R.string.jl3);

                Intent intent = new Intent(JawaActivity.this, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                startActivity(intent);
            }
        });
    }
}
