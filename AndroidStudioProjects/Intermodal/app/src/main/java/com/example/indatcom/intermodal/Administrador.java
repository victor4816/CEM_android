package com.example.indatcom.intermodal;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Administrador extends ActionBarActivity {
Button personal;
    Button equipos;
    Button bodega;
    Button compras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrador);
        personal = (Button)findViewById(R.id.btnPersonal);
        equipos = (Button)findViewById(R.id.btnEquipos);
        bodega = (Button)findViewById(R.id.btnBodega);
        compras = (Button)findViewById(R.id.btnCompras);
personal.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intento = new Intent(Administrador.this,Personal.class);
        startActivity(intento);
    }
});
        equipos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(Administrador.this,Equipos.class);
                startActivity(intento);
            }
        });
        bodega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(Administrador.this,Bodega.class);
                startActivity(intento);
            }
        });
        compras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(Administrador.this,Compra.class);
                startActivity(intento);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_administrador, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
