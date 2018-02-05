package com.example.formulario;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText etnombre,etapellido,etedad;
    RadioGroup rgsexo;
    CheckBox cbestudiante;
    Spinner spprovincias;
    TextView txtfinal;
    Button btnaceptar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnombre=(EditText)findViewById(R.id.et_nombre);
        etapellido=(EditText)findViewById(R.id.et_apellidos);
        etedad=(EditText)findViewById(R.id.et_edad);

        rgsexo= (RadioGroup)findViewById(R.id.rg_sexo);

        cbestudiante=(CheckBox)findViewById(R.id.cb_estudiante);

        spprovincias= (Spinner)findViewById(R.id.sp_provincias);

        txtfinal= (TextView)findViewById(R.id.txt_final);


        String [] provincias= {"Cadiz","Malaga","Almeria","Granada","Huelva","Sevilla","Jaen","Cordoba"};

        ArrayAdapter<String> adaptadorprovincias= new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,provincias);

        spprovincias.setAdapter(adaptadorprovincias);

    }//On Create


    public void clickaceptar (View view){

        String nombre= etnombre.getText().toString()+" ";
        String apellidos= etapellido.getText().toString()+" ";
        String edad= etedad.getText().toString()+" ";
        String provincias= spprovincias.getSelectedItem().toString()+" ";

        int idradio= rgsexo.getCheckedRadioButtonId();



        if(nombre.equals(" ")||apellidos.equals("")||edad.equals(" ")){

            if(provincias.equals("")){

                if(idradio == -1){

                    btnaceptar.setEnabled(false);


                }


            }
        }else{

            txtfinal.setText(nombre+apellidos+edad+idradio+provincias);

            btnaceptar.setEnabled(true);


        }


    }


}//Fin
