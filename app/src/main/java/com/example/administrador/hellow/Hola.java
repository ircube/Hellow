package com.example.administrador.hellow;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class Hola extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola);


        Button boomButton =(Button) findViewById(R.id.button);
        boomButton.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                changeField2Content();
            }
        } );
        Button boomButton2 =(Button) findViewById(R.id.button2);
        boomButton2.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                setContentView(R.layout.activity_segundo);
            }
        } );
    }

    public void changeField2Content() {
        EditText field1 = (EditText) findViewById(R.id.field1);
        String s1 = field1.getText().toString();

        TextView field2 = (TextView) findViewById(R.id.field2);
        //String s2 = field1.getText().toString();
        field2.setText(s1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hola, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            System.out.println("sin opciones :D");
            return true;
        }

        if (id == R.id.m1) {
            String ss =(String) item.getTitle();
            System.out.println("Es la opcion: " + ss);
            return true;
        }

        if (id == R.id.m2) {
            String ss =(String) item.getTitle();
            System.out.println("Es la opcion: " + ss );
            return true;
        }



        return super.onOptionsItemSelected(item);
    }
}
