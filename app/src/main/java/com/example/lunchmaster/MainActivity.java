package com.example.lunchmaster;

import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final Random myRandom = new Random();

        Button buttonGenerate = (Button)findViewById(R.id.generate);
        final TextView textGenerateNumber = (TextView)findViewById(R.id.generatenumber);

        buttonGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] myLunch = new String[]{"Indisk buffé","Itamae", "Eatery","Bangkok","Public","Picoteo","Norobata","S","Amida","Nonni","Mathilde","Volta","Pontus in the park","Phil's"};
                int idx = new Random().nextInt(myLunch.length);
            String random = (myLunch[idx]);
            //int nxt = myRandom.nextInt(100);

                textGenerateNumber.setText(String.valueOf(random));
            }
        });

    }
}