package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class SumatraActivity extends AppCompatActivity {
    public static final String TITLE = "Title";
    public static final String DESC = "Desc";
    public static final String LOC = "Location";
    ImageButton bts1, bts2, bts5, bts6, bts9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumatra);

        setTitle("Sumatra");

        bts1 = (ImageButton) findViewById(R.id.buttonS1);
        bts2 = (ImageButton) findViewById(R.id.buttonS2);
        bts5 = (ImageButton) findViewById(R.id.buttonS5);
        bts6 = (ImageButton) findViewById(R.id.buttonS6);
        bts9 = (ImageButton) findViewById(R.id.buttonS9);

        bts1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] img = {R.drawable.s1};
                String title = "Danau Maninjau";
                String desc = "Test deskripsi asld;flasdhfladsf";
                String loc = "adfadsfadsfasdfadsf";

                Intent intent = new Intent(SumatraActivity.this, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                startActivity(intent);
            }
        });

        bts2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] img = {R.drawable.s2};
                String title = "Lembah Arau";
                String desc = "Test deskripsi asld;flasdhfladsf";
                String loc = "adfadsfadsfasdfadsf";

                Intent intent = new Intent(SumatraActivity.this, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                startActivity(intent);
            }
        });

        bts5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] img = {R.drawable.s5};
                String title = "Gunung Sibayak";
                String desc = "Test deskripsi asld;flasdhfladsf";
                String loc = "adfadsfadsfasdfadsf";

                Intent intent = new Intent(SumatraActivity.this, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                startActivity(intent);
            }
        });

        bts6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] img = {R.drawable.s6};
                String title = "Danau Toba";
                String desc = "Test deskripsi asld;flasdhfladsf";
                String loc = "adfadsfadsfasdfadsf";

                Intent intent = new Intent(SumatraActivity.this, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                startActivity(intent);
            }
        });

        bts9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] img = {R.drawable.s9};
                String title = "Pantai Batu Batu Bertupang";
                String desc = "Test deskripsi asld;flasdhfladsf";
                String loc = "adfadsfadsfasdfadsf";

                Intent intent = new Intent(SumatraActivity.this, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                startActivity(intent);
            }
        });
    }
}
