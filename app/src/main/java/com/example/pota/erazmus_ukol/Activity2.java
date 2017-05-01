package com.example.pota.erazmus_ukol;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Bundle bundle = getIntent().getExtras();
        String text = bundle.getString("vedlejsiAktivita");
        TextView textFinal = (TextView) findViewById(R.id.vyplata);
        textFinal.setText(text);
    }
}
