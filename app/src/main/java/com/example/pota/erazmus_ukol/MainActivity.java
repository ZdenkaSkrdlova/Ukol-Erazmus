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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener, AdapterView.OnItemSelectedListener {

    EditText editText1, editText2, editText3;
    TextView vysledek;
    Spinner spinner;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initParams();
    }

    protected void initParams() {
        intent = new Intent(this, Activity2.class);

        editText1 = (EditText) findViewById(R.id.kusy);
        editText2 = (EditText) findViewById(R.id.cena);
        editText3 = (EditText) findViewById(R.id.smeny);
        vysledek = (TextView) findViewById(R.id.vysledek);
        spinner = (Spinner) findViewById(R.id.notebooky);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.spinnerTyp, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        for (EditText text : new EditText[] {editText1,editText2, editText3}) {
            if (text.getText().length() == 0) {
                Toast.makeText(this, "Některá pole jsou prázdná", Toast.LENGTH_LONG).show();
                return;
            }
        }
        double kusy = Float.parseFloat(editText1.getText().toString());
        double cena = Float.parseFloat(editText2.getText().toString());
        double smeny = Float.parseFloat(editText3.getText().toString());
        double vypocet = cena * 0.01 * kusy * smeny;

        switch (position) {
            case 1:
                intent.putExtra("vedlejsiAktivita", String.valueOf("Tva mesicni vyplata za notebooky MSI je " + vypocet));
                break;

            case 2:
                intent.putExtra("vedlejsiAktivita",String.valueOf("Tva mesicni vyplata za notebooky ACER je " + vypocet));
                break;

            case 3:
                intent.putExtra("vedlejsiAktivita",String.valueOf("Tva mesicni vyplata za notebooky ASUS je " + vypocet));
                break;

            case 4:
                intent.putExtra("vedlejsiAktivita",String.valueOf("Tva mesicni vyplata za notebooky LENOVO je " + vypocet));
                break;

            case 5:
                intent.putExtra("vedlejsiAktivita",String.valueOf("Tva mesicni vyplata za notebooky MACKBOOK je " + vypocet));
                break;

            case 6:
                intent.putExtra("vedlejsiAktivita",String.valueOf("Tva mesicni vyplata za notebooky DELL je " + vypocet));
                break;
        }
        vysledek.setText("Výsledek je " + vypocet);
        startActivity(intent);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {}
    @Override
    public void onNothingSelected(AdapterView<?> parent) {}
}
