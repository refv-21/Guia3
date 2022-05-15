package sv.edu.udb.discusinderesultados2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private EditText txtHora;
    private Button btnCalculo;
    double horaPrecio = 8.50;
    double descuentoIss = 0.02;
    double descuentoAfp = 0.03;
    double impuestoRenta = 0.04;
    double totalSalario, salarioNeto, deducc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = (EditText) findViewById(R.id.txtNombre);
        txtHora = (EditText) findViewById(R.id.txtHora);
    }

    public void mainActivity2(View v) {
        String nombre = txtNombre.getText().toString();
        String valorHoras = txtHora.getText().toString();

        int hora = Integer.parseInt(valorHoras);

        totalSalario = horaPrecio * hora;
        deducc = (totalSalario * descuentoIss) + (totalSalario * descuentoAfp) + (totalSalario * impuestoRenta);
        salarioNeto = totalSalario - deducc;
        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra("txtNombre", txtNombre.getText().toString());
        i.putExtra("salario2", String.valueOf(totalSalario));
        i.putExtra("salarioNeto2", String.valueOf(salarioNeto));
        i.putExtra("txtHora", txtHora.getText().toString());
        startActivity(i);
    }
}