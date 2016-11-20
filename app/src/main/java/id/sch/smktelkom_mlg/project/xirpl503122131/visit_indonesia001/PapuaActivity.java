package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PapuaActivity extends AppCompatActivity {
    Button btp1, btp2, btp3, btp4, btp5, btp6, btp7, btp8, btp9, btp10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_papua);

        setTitle("Papua");

        btp1 = (Button) findViewById(R.id.buttonP1);
        btp2 = (Button) findViewById(R.id.buttonP2);
        btp3 = (Button) findViewById(R.id.buttonP3);
        btp4 = (Button) findViewById(R.id.buttonP4);
        btp5 = (Button) findViewById(R.id.buttonP5);
        btp6 = (Button) findViewById(R.id.buttonP6);
        btp7 = (Button) findViewById(R.id.buttonP7);
        btp8 = (Button) findViewById(R.id.buttonP8);
        btp9 = (Button) findViewById(R.id.buttonP9);
        btp10 = (Button) findViewById(R.id.buttonP10);

        btp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PapuaActivity.this, DetailActivity.class));
            }
        });
    }
}
