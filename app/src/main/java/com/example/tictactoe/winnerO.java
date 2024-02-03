package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class winnerO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner_o);
        Button backbtn;
        backbtn = findViewById(R.id.obtnnext);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oback;
                oback = new Intent(winnerO.this,MainActivity.class);
                startActivity(oback);
                finish();
            }
        });
    }
}