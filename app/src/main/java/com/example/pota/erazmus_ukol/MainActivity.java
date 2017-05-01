package com.example.pota.erazmus_ukol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemSelectedListener {

    Spinner spinner;
    EditText editText1;
    EditText editText2;
    EditText editText3;
    TextView vysledek;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.notebooky);
        editText1 = (EditText) findViewById(R.id.kusy);
        editText2 = (EditText) findViewById(R.id.cena);
        editText3 = (EditText) findViewById(R.id.smeny);
        vysledek = (TextView) findViewById(R.id.vysledek);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.spinnerTyp, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        double kusy;
        double cena;
        double smeny;
        double vypocet = 0;
        switch (position) {
            case 1:
                kusy = Float.parseFloat(editText1.getText().toString());
                cena = Float.parseFloat(editText2.getText().toString());
                smeny = Float.parseFloat(editText3.getText().toString());
                vypocet = cena * 0.01 * kusy * smeny;
                intent = new Intent(this, Activity2.class);
                intent.putExtra("vedlejsiAktivita",String.valueOf("Tva mesicni vyplata za notebooky MSI je " + vypocet));
                startActivity(intent);
                break;
            case 2:
                kusy = Float.parseFloat(editText1.getText().toString());
                cena = Float.parseFloat(editText2.getText().toString());
                smeny = Float.parseFloat(editText3.getText().toString());
                vypocet = cena * 0.01 * kusy * smeny;
                intent = new Intent(this, Activity2.class);
                intent.putExtra("vedlejsiAktivita",String.valueOf("Tva mesicni vyplata za notebooky ACER je " + vypocet));
                startActivity(intent);
                break;
            case 3:
                kusy = Float.parseFloat(editText1.getText().toString());
                cena = Float.parseFloat(editText2.getText().toString());
                smeny = Float.parseFloat(editText3.getText().toString());
                vypocet = cena * 0.01 * kusy * smeny;
                intent = new Intent(this, Activity2.class);
                intent.putExtra("vedlejsiAktivita",String.valueOf("Tva mesicni vyplata za notebooky ASUS je " + vypocet));
                startActivity(intent);
                break;
            case 4:
                kusy = Float.parseFloat(editText1.getText().toString());
                cena = Float.parseFloat(editText2.getText().toString());
                smeny = Float.parseFloat(editText3.getText().toString());
                vypocet = cena * 0.01 * kusy * smeny;
                intent = new Intent(this, Activity2.class);
                intent.putExtra("vedlejsiAktivita",String.valueOf("Tva mesicni vyplata za notebooky LENOVO je " + vypocet));
                startActivity(intent);
                break;
            case 5:
                kusy = Float.parseFloat(editText1.getText().toString());
                cena = Float.parseFloat(editText2.getText().toString());
                smeny = Float.parseFloat(editText3.getText().toString());
                vypocet = cena * 0.01 * kusy * smeny;
                intent = new Intent(this, Activity2.class);
                intent.putExtra("vedlejsiAktivita",String.valueOf("Tva mesicni vyplata za notebooky MACKBOOK je " + vypocet));
                startActivity(intent);
                break;
            case 6:
                kusy = Float.parseFloat(editText1.getText().toString());
                cena = Float.parseFloat(editText2.getText().toString());
                smeny = Float.parseFloat(editText3.getText().toString());
                vypocet = cena * 0.01 * kusy * smeny;
                intent = new Intent(this, Activity2.class);
                intent.putExtra("vedlejsiAktivita",String.valueOf("Tva mesicni vyplata za notebooky DELL je " + vypocet));
                startActivity(intent);
                break;
        }
        vysledek.setText("Výsledek je " + vypocet);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
