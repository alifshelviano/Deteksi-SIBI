package com.aldev.lite.SIBI.deteksi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class image_view extends AppCompatActivity
{
    private Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_view);
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity0();
            }
        });


    }
    public void openActivity0() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }


}


