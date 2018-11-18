package com.lazo.controlvehicularcsjpiu.forms;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.lazo.controlvehicularcsjpiu.R;
import com.lazo.controlvehicularcsjpiu.bd.ConexionSQLiteHelper;
import com.lazo.controlvehicularcsjpiu.utils.utils;

public class FormRegUsuarios extends AppCompatActivity {

    EditText campoId, campoDNI, campoApePaterno, campoApeMaterno;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_reg_usuarios);

        campoId = (EditText) findViewById(R.id.txtId);
        campoDNI= (EditText) findViewById(R.id.txtDNI);
        campoApePaterno = (EditText) findViewById(R.id.txtApePaterno);
        campoApeMaterno = (EditText) findViewById(R.id.txtApeMaterno);

    }

    public void onClick(View view) {
        registrarUsuarios();
    }

    private void registrarUsuarios() {
        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(this, "bd_proyecto", null, 1);
        //ABRIR BASE DE DATOS
        SQLiteDatabase db=conn.getWritableDatabase();

        //AGREGAR con el put.
        // Contentvalues que nos provee Android

        ContentValues values= new ContentValues();

        values.put(utils.CAMPO_ID,campoId.getText().toString());
        values.put(utils.CAMPO_DNI,campoDNI.getText().toString());
        values.put(utils.CAMPO_AP_PATERNO,campoApePaterno.getText().toString());
        values.put(utils.CAMPO_AP_MATERNO,campoApeMaterno.getText().toString());

        //DATO Long
        Long idResultante=db.insert(utils.TABLA_USUARIO,utils.CAMPO_ID,values);
        Toast.makeText(getApplicationContext(), "ID REGISTRO: "+idResultante,Toast.LENGTH_SHORT).show();
    }
}
