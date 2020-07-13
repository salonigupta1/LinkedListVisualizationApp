package com.example.linkedlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView nullimage1,r1,r2,r3;
    ImageView nullimage2;
    ImageView r0image;
    ImageView q0image;
    ImageView pimage, lastbutton;
    Button step2, step1;
    Button step3;
    Button step4;
    Button step5,button1, button2, button3, button4;

    public void step1(View view){
        nullimage1.setVisibility(View.VISIBLE);
        nullimage2.setVisibility(View.VISIBLE);
        r0image.setVisibility(View.VISIBLE);
        q0image.setVisibility(View.VISIBLE);
        pimage.setVisibility(View.VISIBLE);
        step1.setVisibility(View.INVISIBLE);
        step2.setVisibility(View.VISIBLE);
        button1.setText("7 | /0");

    }

    public void step2(View view){
        nullimage2.setVisibility(View.INVISIBLE);
        q0image.setVisibility(View.INVISIBLE);
        pimage.setImageResource(R.drawable.qarrow);
        r1.setVisibility(View.VISIBLE);
        r1.setImageResource(R.drawable.parrow);
        step2.setVisibility(View.INVISIBLE);
        step3.setVisibility(View.VISIBLE);
        button2.setText("5 | A1");

    }

    public void step3(View view){
        nullimage1.setVisibility(View.INVISIBLE);
        r0image.setVisibility(View.INVISIBLE);
        pimage.setImageResource(R.drawable.rarrow);
        r1.setImageResource(R.drawable.qarrow);
        r2.setVisibility(View.VISIBLE);
        r2.setImageResource(R.drawable.parrow);
        step3.setVisibility(View.INVISIBLE);
        step4.setVisibility(View.VISIBLE);
        button3.setText("3 | A2");
    }

    public void step4(View view){
        nullimage1.setVisibility(View.INVISIBLE);
        r0image.setVisibility(View.INVISIBLE);
        pimage.setVisibility(View.INVISIBLE);
        r1.setImageResource(R.drawable.rarrow);
        r2.setVisibility(View.VISIBLE);
        r2.setImageResource(R.drawable.qarrow);
        r3.setVisibility(View.VISIBLE);
        r3.setImageResource(R.drawable.parrow);
        step4.setVisibility(View.INVISIBLE);
        step5.setVisibility(View.VISIBLE);
        button4.setText("1 | A3");
    }
    public void step5(View view){
        nullimage1.setVisibility(View.INVISIBLE);
        r0image.setVisibility(View.INVISIBLE);
        pimage.setImageResource(R.drawable.rarrow);
        r1.setVisibility(View.INVISIBLE);
        r2.setImageResource(R.drawable.rarrow);
        r3.setImageResource(R.drawable.qarrow);
        step3.setVisibility(View.INVISIBLE);
        step4.setVisibility(View.VISIBLE);
        lastbutton.setVisibility(View.VISIBLE);
        lastbutton.setImageResource(R.drawable.parrow);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nullimage1 = findViewById(R.id.nullimage1);
        nullimage2 = findViewById(R.id.nullimage2);
        r0image = findViewById(R.id.r0);
        q0image = findViewById(R.id.q0);
        pimage = findViewById(R.id.p0);
        step2 = findViewById(R.id.stepbutton2);
        step3 = findViewById(R.id.stepbutton3);
        step4 = findViewById(R.id.stepbutton4);
        step5 = findViewById(R.id.stepbutton5);
        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);
        step1 = findViewById(R.id.stepbutton1);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        lastbutton = findViewById(R.id.last);

    }
}