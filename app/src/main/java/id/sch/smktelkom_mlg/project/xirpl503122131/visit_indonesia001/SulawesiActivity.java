package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class SulawesiActivity extends AppCompatActivity {
    public static final String TITLE = "Title";
    public static final String DESC = "Desc";
    public static final String LOC = "Location";
    ImageButton btu1, btu2, btu3, btu4, btu5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sulawesi);

        setTitle("Sulawesi");

        btu1 = (ImageButton) findViewById(R.id.buttonU1);
        btu2 = (ImageButton) findViewById(R.id.buttonU2);
        btu3 = (ImageButton) findViewById(R.id.buttonU3);
        btu4 = (ImageButton) findViewById(R.id.buttonU4);
        btu5 = (ImageButton) findViewById(R.id.buttonU5);

        btu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getResources().getString(R.string.u1);
                String desc = getResources().getString(R.string.ud1);
                String loc = getResources().getString(R.string.ul1);

                Intent intent = new Intent(SulawesiActivity.this, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                startActivity(intent);
            }
        });

        btu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getResources().getString(R.string.u2);
                String desc = getResources().getString(R.string.ud2);
                String loc = getResources().getString(R.string.ul2);

                Intent intent = new Intent(SulawesiActivity.this, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                startActivity(intent);
            }
        });

        btu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getResources().getString(R.string.u3);
                String desc = getResources().getString(R.string.ud3);
                String loc = getResources().getString(R.string.ul3);

                Intent intent = new Intent(SulawesiActivity.this, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                startActivity(intent);
            }
        });

        btu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getResources().getString(R.string.u4);
                String desc = getResources().getString(R.string.ud4);
                String loc = getResources().getString(R.string.ul4);

                Intent intent = new Intent(SulawesiActivity.this, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                startActivity(intent);
            }
        });

        btu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getResources().getString(R.string.u5);
                String desc = getResources().getString(R.string.ud5);
                String loc = getResources().getString(R.string.ul5);

                Intent intent = new Intent(SulawesiActivity.this, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                startActivity(intent);
            }
        });
    }
}
