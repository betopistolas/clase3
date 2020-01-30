package com.example.clase3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    int positionImage = 1;
    private LinearLayout fondo;
    private TextView textViewIzq,textViewDer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fondo = (LinearLayout) findViewById(R.id.fondo);
        textViewIzq = (TextView) findViewById(R.id.Izq);
        textViewDer = (TextView) findViewById(R.id.Der);
        fondo.addView(resultImage(positionImage),0);
    }

    public void onClickIzq(View view){
        positionImage--;
        if(positionImage == 0){
            positionImage = 3;
        }
        fondo.addView(resultImage(positionImage),0);

        return;
    }
    private ImageView resultImage(int positionImage){
        LinearLayout.LayoutParams viewParamsCenter = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        ImageView img = new ImageView( this);

        switch (positionImage){
            case 1 :
                img.setImageResource(R.drawable.picture1);
                break;
        }
        img.setLayoutParams(viewParamsCenter);

        return img;
    }


    public void onClickDer(View view){
        positionImage++;
        if(positionImage == 4){
            positionImage = 1;
        }
        fondo.addView(resultImage(positionImage),0);
        return;
    }
}
