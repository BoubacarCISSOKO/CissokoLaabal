package com.example.ourlaabal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ZoneActivity<string> extends AppCompatActivity {

    Button zone2;
    EditText edit3;
    String varEdit3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zone);
        zone2=(Button) findViewById(R.id.button);
        edit3=(EditText) findViewById(R.id.editText8);
        zone2.setOnClickListener(new Button.OnClickListener(){
            @Override

            public void onClick(View view){
                varEdit3=edit3.getText().toString();
                if (varEdit3.isEmpty()){

                    Toast.makeText(getApplicationContext(),"desolé tu fou quoi là ? merde remplis moi les  2 champs ",Toast.LENGTH_LONG).show();
                }
                else{

                    Intent i = new Intent(ZoneActivity.this, ZoneActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}
