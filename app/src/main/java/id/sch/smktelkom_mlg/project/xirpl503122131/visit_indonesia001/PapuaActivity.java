package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class PapuaActivity extends AppCompatActivity {
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
                startActivity(new Intent(PapuaActivity.this, DetailActivity.class));
            }
        });

        btp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PapuaActivity.this, DetailActivity.class));
            }
        });

        btp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PapuaActivity.this, DetailActivity.class));
            }
        });

        btp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PapuaActivity.this, DetailActivity.class));
            }
        });

        btp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PapuaActivity.this, DetailActivity.class));
            }
        });
    }
}
