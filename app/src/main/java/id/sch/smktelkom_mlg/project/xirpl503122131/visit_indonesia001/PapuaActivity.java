package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class PapuaActivity extends AppCompatActivity {
    public static final String TITLE = "Title";
    public static final String DESC = "Desc";
    public static final String LOC = "Location";
    ImageButton btp1, btp2, btp3, btp4, btp5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_papua);

        setTitle("Papua");

        btp1 = (ImageButton) findViewById(R.id.buttonP1);
        btp2 = (ImageButton) findViewById(R.id.buttonP2);
        btp3 = (ImageButton) findViewById(R.id.buttonP3);
        btp4 = (ImageButton) findViewById(R.id.buttonP4);
        btp5 = (ImageButton) findViewById(R.id.buttonP5);

        btp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getResources().getString(R.string.p1);
                String desc = getResources().getString(R.string.pd1);
                String loc = getResources().getString(R.string.pl1);

                Intent intent = new Intent(PapuaActivity.this, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                startActivity(intent);
            }
        });

        btp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getResources().getString(R.string.p2);
                String desc = getResources().getString(R.string.pd2);
                String loc = getResources().getString(R.string.pl2);

                Intent intent = new Intent(PapuaActivity.this, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                startActivity(intent);
            }
        });

        btp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getResources().getString(R.string.p3);
                String desc = getResources().getString(R.string.pd3);
                String loc = getResources().getString(R.string.pl3);

                Intent intent = new Intent(PapuaActivity.this, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                startActivity(intent);
            }
        });

        btp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getResources().getString(R.string.p4);
                String desc = getResources().getString(R.string.pd4);
                String loc = getResources().getString(R.string.pl4);

                Intent intent = new Intent(PapuaActivity.this, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                startActivity(intent);
            }
        });

        btp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getResources().getString(R.string.p5);
                String desc = getResources().getString(R.string.pd5);
                String loc = getResources().getString(R.string.pl5);

                Intent intent = new Intent(PapuaActivity.this, DetailActivity.class);
                intent.putExtra(TITLE, title);
                intent.putExtra(DESC, desc);
                intent.putExtra(LOC, loc);
                startActivity(intent);
            }
        });
    }
}
