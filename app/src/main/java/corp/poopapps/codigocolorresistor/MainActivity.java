package corp.poopapps.codigocolorresistor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.BatchUpdateException;

public class MainActivity extends AppCompatActivity {

    double primera, segunda, tercera, cuarta, valor;
    int aux;
    String suma;
    TextView resistor;
    Button Bcalcular, banda1, banda2, banda3, banda4;
    Button negro1, cafe1, rojo1, naranja1, amarillo1, verde1, azul1, morado1, gris1, blanco1, dorado1, plateado1;
    Button negro2, cafe2, rojo2, naranja2, amarillo2, verde2, azul2, morado2, gris2, blanco2, dorado2, plateado2;
    Button negro3, cafe3, rojo3, naranja3, amarillo3, verde3, azul3, morado3, gris3, blanco3, dorado3, plateado3;
    Button negro4, cafe4, rojo4, naranja4, amarillo4, verde4, azul4, morado4, gris4, blanco4, dorado4, plateado4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resistor = (TextView)findViewById(R.id.resistor);
        Bcalcular = (Button)findViewById(R.id.Bcalcular);
        banda1 = (Button)findViewById(R.id.banda1);
        banda2 = (Button)findViewById(R.id.banda2);
        banda3 = (Button)findViewById(R.id.banda3);
        banda4 = (Button)findViewById(R.id.banda4);
        negro1 = (Button)findViewById(R.id.negro1);
        negro2 = (Button)findViewById(R.id.negro2);
        negro3 = (Button)findViewById(R.id.negro3);
        negro4 = (Button)findViewById(R.id.negro4);
        cafe1 = (Button)findViewById(R.id.cafe1);
        cafe2 = (Button)findViewById(R.id.cafe2);
        cafe3 = (Button)findViewById(R.id.cafe3);
        cafe4 = (Button)findViewById(R.id.cafe4);
        rojo1 = (Button)findViewById(R.id.rojo1);
        rojo2 = (Button)findViewById(R.id.rojo2);
        rojo3 = (Button)findViewById(R.id.rojo3);
        rojo4 = (Button)findViewById(R.id.rojo4);
        naranja1 = (Button)findViewById(R.id.naranja1);
        naranja2 = (Button)findViewById(R.id.naranja2);
        naranja3 = (Button)findViewById(R.id.naranja3);
        naranja4 = (Button)findViewById(R.id.naranja4);
        amarillo1 = (Button)findViewById(R.id.amarillo1);
        amarillo2 = (Button)findViewById(R.id.amarillo2);
        amarillo3 = (Button)findViewById(R.id.amarillo3);
        amarillo4 = (Button)findViewById(R.id.amarillo4);
        verde1 = (Button)findViewById(R.id.verde1);
        verde2 = (Button)findViewById(R.id.verde2);
        verde3 = (Button)findViewById(R.id.verde3);
        verde4 = (Button)findViewById(R.id.verde4);
        azul1 = (Button)findViewById(R.id.azul1);
        azul2 = (Button)findViewById(R.id.azul2);
        azul3 = (Button)findViewById(R.id.azul3);
        azul4 = (Button)findViewById(R.id.azul4);
        morado1 = (Button)findViewById(R.id.morado1);
        morado2 = (Button)findViewById(R.id.morado2);
        morado3 = (Button)findViewById(R.id.morado3);
        morado4 = (Button)findViewById(R.id.morado4);
        gris1 = (Button)findViewById(R.id.gris1);
        gris2 = (Button)findViewById(R.id.gris2);
        gris3 = (Button)findViewById(R.id.gris3);
        gris4 = (Button)findViewById(R.id.gris4);
        blanco1 = (Button)findViewById(R.id.blanco1);
        blanco2 = (Button)findViewById(R.id.blanco2);
        blanco3 = (Button)findViewById(R.id.blanco3);
        blanco4 = (Button)findViewById(R.id.blanco4);
        dorado1 = (Button)findViewById(R.id.dorado1);
        dorado2 = (Button)findViewById(R.id.dorado2);
        dorado3 = (Button)findViewById(R.id.dorado3);
        dorado4 = (Button)findViewById(R.id.dorado4);
        plateado1 = (Button)findViewById(R.id.plateado1);
        plateado2 = (Button)findViewById(R.id.plateado2);
        plateado3 = (Button)findViewById(R.id.plateado3);
        plateado4 = (Button)findViewById(R.id.plateado4);

    }

    public void Click1(View view) {

        switch (view.getId()){
            case R.id.cafe1:
                banda1.setBackgroundColor(getResources().getColor(R.color.maroon));
                primera = 1;
                break;
            case R.id.rojo1:
                banda1.setBackgroundColor(getResources().getColor(R.color.red));
                primera = 2;
                break;
            case R.id.naranja1:
                banda1.setBackgroundColor(getResources().getColor(R.color.orange));
                primera = 3;
                break;
            case R.id.amarillo1:
                banda1.setBackgroundColor(getResources().getColor(R.color.yellow));
                primera = 4;
                break;
            case R.id.verde1:
                banda1.setBackgroundColor(getResources().getColor(R.color.green));
                primera = 5;
                break;
            case R.id.azul1:
                banda1.setBackgroundColor(getResources().getColor(R.color.blue));
                primera = 6;
                break;
            case R.id.morado1:
                banda1.setBackgroundColor(getResources().getColor(R.color.purple));
                primera = 7;
                break;
            case R.id.gris1:
                banda1.setBackgroundColor(getResources().getColor(R.color.gray));
                primera = 8;
                break;
            case R.id.blanco1:
                banda1.setBackgroundColor(getResources().getColor(R.color.white));
                primera = 9;
                break;
        }
    }

    public void Click2(View view) {

        switch (view.getId()){
            case R.id.negro2:
                banda2.setBackgroundColor(getResources().getColor(R.color.black));
                segunda = 0;
                break;
            case R.id.cafe2:
                banda2.setBackgroundColor(getResources().getColor(R.color.maroon));
                segunda = 1;
                break;
            case R.id.rojo2:
                banda2.setBackgroundColor(getResources().getColor(R.color.red));
                segunda = 2;
                break;
            case R.id.naranja2:
                banda2.setBackgroundColor(getResources().getColor(R.color.orange));
                segunda = 3;
                break;
            case R.id.amarillo2:
                banda2.setBackgroundColor(getResources().getColor(R.color.yellow));
                segunda = 4;
                break;
            case R.id.verde2:
                banda2.setBackgroundColor(getResources().getColor(R.color.green));
                segunda = 5;
                break;
            case R.id.azul2:
                banda2.setBackgroundColor(getResources().getColor(R.color.blue));
                segunda = 6;
                break;
            case R.id.morado2:
                banda2.setBackgroundColor(getResources().getColor(R.color.purple));
                segunda = 7;
                break;
            case R.id.gris2:
                banda2.setBackgroundColor(getResources().getColor(R.color.gray));
                segunda = 8;
                break;
            case R.id.blanco2:
                banda2.setBackgroundColor(getResources().getColor(R.color.white));
                segunda = 9;
                break;
        }

    }

    public void Click3(View view) {

        switch (view.getId()){
            case R.id.negro3:
                banda3.setBackgroundColor(getResources().getColor(R.color.black));
                tercera = 1;
                break;
            case R.id.cafe3:
                banda3.setBackgroundColor(getResources().getColor(R.color.maroon));
                tercera = 10;
                break;
            case R.id.rojo3:
                banda3.setBackgroundColor(getResources().getColor(R.color.red));
                tercera = 100;
                break;
            case R.id.naranja3:
                banda3.setBackgroundColor(getResources().getColor(R.color.orange));
                tercera = 1000;
                break;
            case R.id.amarillo3:
                banda3.setBackgroundColor(getResources().getColor(R.color.yellow));
                tercera = 10000;
                break;
            case R.id.verde3:
                banda3.setBackgroundColor(getResources().getColor(R.color.green));
                tercera = 100000;
                break;
            case R.id.azul3:
                banda3.setBackgroundColor(getResources().getColor(R.color.blue));
                tercera = 1000000;
                break;
            case R.id.morado3:
                banda3.setBackgroundColor(getResources().getColor(R.color.purple));
                tercera = 10000000;
                break;
            case R.id.gris3:
                banda3.setBackgroundColor(getResources().getColor(R.color.gray));
                tercera = 100000000;
                break;
            case R.id.blanco3:
                banda3.setBackgroundColor(getResources().getColor(R.color.white));
                tercera = 1000000000;
                break;
            case R.id.dorado3:
                banda3.setBackgroundColor(getResources().getColor(R.color.gold));
                tercera = 0.1;
                break;
            case R.id.plateado3:
                banda3.setBackgroundColor(getResources().getColor(R.color.silver));
                tercera = 0.01;
                break;
        }

    }

    public void Click4(View view) {

        switch (view.getId()){
            case R.id.cafe4:
                banda4.setBackgroundColor(getResources().getColor(R.color.maroon));
                cuarta = 1;
                break;
            case R.id.rojo4:
                banda4.setBackgroundColor(getResources().getColor(R.color.red));
                cuarta = 2;
                break;
            case R.id.verde4:
                banda4.setBackgroundColor(getResources().getColor(R.color.green));
                cuarta = 0.5;
                break;
            case R.id.azul4:
                banda4.setBackgroundColor(getResources().getColor(R.color.blue));
                cuarta = 0.25;
                break;
            case R.id.morado4:
                banda4.setBackgroundColor(getResources().getColor(R.color.purple));
                cuarta = 0.10;
                break;
            case R.id.gris4:
                banda4.setBackgroundColor(getResources().getColor(R.color.gray));
                cuarta = 0.05;
                break;
            case R.id.dorado4:
                banda4.setBackgroundColor(getResources().getColor(R.color.gold));
                cuarta = 5;
                break;
            case R.id.plateado4:
                banda4.setBackgroundColor(getResources().getColor(R.color.silver));
                cuarta = 10;
                break;
        }

    }

    public void OnClickButton(View view) {



        resistor.setText("");
            valor = 0;
            valor = ((primera * 10) + segunda) * tercera;
            //aux = (int) valor;
            suma = String.valueOf(valor);

        resistor.setText(suma+" [Ω]±"+cuarta+"%");
    }
}
