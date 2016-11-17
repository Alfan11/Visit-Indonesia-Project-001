package id.sch.smktelkom_mlg.project.xirpl503122131.visit_indonesia001;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class SumatraActivity extends AppCompatActivity {
    Button bts1, bts2, bts3, bts4, bts5, bts6, bts7, bts8, bts9, bts10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumatra);

        setTitle("Sumatra");

        bts1 = (Button) findViewById(R.id.buttonS1);
        bts2 = (Button) findViewById(R.id.buttonS2);
        bts3 = (Button) findViewById(R.id.buttonS3);
        bts4 = (Button) findViewById(R.id.buttonS4);
        bts5 = (Button) findViewById(R.id.buttonS5);
        bts6 = (Button) findViewById(R.id.buttonS6);
        bts7 = (Button) findViewById(R.id.buttonS7);
        bts8 = (Button) findViewById(R.id.buttonS8);
        bts9 = (Button) findViewById(R.id.buttonS9);
        bts10 = (Button) findViewById(R.id.buttonS10);

    }
}
