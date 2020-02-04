package com.example.number_aleatoire.vue;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.number_aleatoire.R;

public class MainActivity extends AppCompatActivity {

    //propriété
/*
    private EditText Res_number;
    private Button R_button;
    private Button H_button;
    private ImageButton imgbutRan2;
*/

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //R_button = (Button) findViewById(R.id.R_button);
        //H_button = (Button) findViewById(R.id.H_button);

        ecouteMenu((Button)findViewById(R.id.R_button), RandNumbActivity.class);
        ecouteMenu((Button)findViewById(R.id.H_button), HistoActivity.class);

    }

    private void ecouteMenu(Button btn, final Class classe){
        btn.setOnClickListener(new Button.OnClickListener(){
        // mode classic
        //((Button)findViewById(R.id.R_button)).setOnClickListener(new Button.OnClickListener(){
           // public void onClick(View v){
        @Override
                public void onClick(View v){
                Intent intent = new Intent ( MainActivity.this, classe);
                startActivity(intent);
            }

        });

    }


}






