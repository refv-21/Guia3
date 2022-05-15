package sv.edu.udb.discusinderesultados2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    private TextView tvNombre;
    private TextView tvSalarioNeto;
    private TextView tvSalarioTotal;
    private TextView tvHorasTrabajadas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvNombre = (TextView) findViewById(R.id.txtNombreF);
        tvSalarioNeto = (TextView) findViewById(R.id.txtSalarioNF);
        tvSalarioTotal = (TextView) findViewById(R.id.txtSalarioF);
        tvHorasTrabajadas = (TextView) findViewById(R.id.txtHorasF);


        Bundle bundle = getIntent().getExtras();
        String trabajador = bundle.getString("txtNombre");
        String salarioTotalGanado = bundle.getString("salario2");
        String salarioNetoTotal = bundle.getString("salarioNeto2");
        String horasTrabajadas = bundle.getString("txtHora");

        tvNombre.setText("Trabajador: " + trabajador);
        tvHorasTrabajadas.setText("Trabajo un total de: " + horasTrabajadas + " Horas");
        tvSalarioTotal.setText("El Salario sin deducciones es: $" + salarioTotalGanado);
        tvSalarioNeto.setText("El salario con deducciones es: $" + salarioNetoTotal);
    }

    public void finalizar(View v) {

        finish();
    }
}