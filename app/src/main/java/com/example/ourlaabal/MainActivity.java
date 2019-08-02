package com.example.ourlaabal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TextView zone ;
    EditText edit1,edit2;
    String varEdit1,varEdit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zone=(TextView) findViewById(R.id.button);
        edit1=(EditText) findViewById(R.id.editText5);
        edit2=(EditText) findViewById(R.id.editText6);
        zone.setOnClickListener(new View.OnClickListener()


        {
            @Override
            public void onClick(View view) {

                varEdit1=edit1.getText().toString();
                varEdit2=edit2.getText().toString();

                if (varEdit1.isEmpty()| varEdit2.isEmpty()){
                    Toast.makeText(getApplicationContext(),"desolé tu fou quoi là ? merde remplis moi les  2 champs ",Toast.LENGTH_LONG).show();
                }
                else {
                Intent i = new Intent(MainActivity.this, ZoneActivity.class);
                startActivity(i);
                }
            }
        });


    }

    @Override
    public void onClick(View view) {

    }
}
