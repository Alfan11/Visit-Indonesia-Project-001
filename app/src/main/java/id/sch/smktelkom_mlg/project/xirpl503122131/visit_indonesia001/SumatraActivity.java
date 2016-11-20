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
                int imageResource = R.drawable.s1;
                String title = getResources().getString(R.string.s1);
                String desc = getResources().getString(R.string.sd1);
                String loc = getResources().getString(R.string.sl1);

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
                String title = getResources().getString(R.string.s2);
                String desc = getResources().getString(R.string.sd2);
                String loc = getResources().getString(R.string.sl2);

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
                String title = getResources().getString(R.string.s5);
                String desc = getResources().getString(R.string.sd5);
                String loc = getResources().getString(R.string.sl5);

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
                String title = getResources().getString(R.string.s6);
                String desc = getResources().getString(R.string.sd6);
                String loc = getResources().getString(R.string.sl6);

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
                String title = getResources().getString(R.string.s9);
                String desc = getResources().getString(R.string.sd9);
                String loc = getResources().getString(R.string.sl9);

                Intent intent = new Intent(SumatraActivity.this, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                startActivity(intent);
            }
        });
    }
}
