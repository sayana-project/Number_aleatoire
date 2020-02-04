package com.example.number_aleatoire.vue;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.number_aleatoire.R;
import com.example.number_aleatoire.controller.Control;

import static com.example.number_aleatoire.model.RandomNum.getMax;
import static com.example.number_aleatoire.model.RandomNum.getMin;


public class RandNumbActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rand_numb);
        init();
        ecouteRandomRes();

    }

    // propriété
    private TextView RandText;
    private ImageButton ImgButton_R;
    private Control control;
    public int push;

    private void init(){
        RandText = (TextView) findViewById(R.id.RanText);
        ImgButton_R = (ImageButton)findViewById(R.id.ImgButton_R);
    }

    private void ecouteRandomRes() {
        ((ImageButton) findViewById(R.id.ImgButton_R)).setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
              int min, max, rnum;



              min = getMin();
              max = getMax();

              push = push +1;
              rnum= (int) (Math.random() *( min + max));
              RandText.setText(" "+ rnum);



            }
        });
    }


}


/*
    private void ecouteRandomRes() {
        ((ImageButton) findViewById(R.id.ImgButton_R)).setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
 */