package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class winnerX extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner_x);
        Button btnx;
        btnx = findViewById(R.id.xbtnnext);
      btnx.setOnClickListener(new View.OnClickListener() {

          @Override
          public void onClick(View v) {
              Intent xintent;
              xintent = new Intent(winnerX.this,MainActivity.class);
              startActivity(xintent);
              finish();
          }
      });


    }
}