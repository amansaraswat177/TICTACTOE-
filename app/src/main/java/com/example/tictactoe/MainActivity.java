package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int flag = 0;
    int a;
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }
    private void init(){
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }
    public void Check(View view){

        Button btnCurrent = (Button) view;
        if(btnCurrent.getText().toString().equals("")){
        count++;


        if(flag == 0){
            btnCurrent.setText("X");
            flag = 1;
        } else{
            btnCurrent.setText("O");
            flag = 0;
        }
        if(count>4){
            b1=btn1.getText().toString();
            b2=btn2.getText().toString();
            b3=btn3.getText().toString();
            b4=btn4.getText().toString();
            b5=btn5.getText().toString();
            b6=btn6.getText().toString();
            b7=btn7.getText().toString();
            b8=btn8.getText().toString();
            b9=btn9.getText().toString();

            // concitions
            // conditions for X
            if (b1.equals("X") && b2.equals("X") && b3.equals("X")) {
                // 1st row
                restart();
                Toast.makeText(this, "Winner is: X", Toast.LENGTH_SHORT).show();
                winnerX();
            } else if (b4.equals("X") && b5.equals("X") && b6.equals("X")) {
                // 2nd row
                restart();
                Toast.makeText(this, "Winner is: X", Toast.LENGTH_SHORT).show();
                winnerX();
            } else if (b7.equals("X") && b8.equals("X") && b9.equals("X")) {
                // 3rd row
                restart();
                Toast.makeText(this, "Winner is: X", Toast.LENGTH_SHORT).show();
                winnerX();
            } else if (b1.equals("X") && b4.equals("X") && b7.equals("X")) {
                // 1st column
                restart();
                Toast.makeText(this, "Winner is: X", Toast.LENGTH_SHORT).show();
                winnerX();
            } else if (b2.equals("X") && b5.equals("X") && b8.equals("X")) {
                // 2nd column
                restart();
                Toast.makeText(this, "Winner is: X", Toast.LENGTH_SHORT).show();
                winnerX();
            } else if (b3.equals("X") && b6.equals("X") && b9.equals("X")) {
                // 3rd column
                restart();
                Toast.makeText(this, "Winner is: X", Toast.LENGTH_SHORT).show();
                winnerX();
            } else if (b1.equals("X") && b5.equals("X") && b9.equals("X")) {
                // Diagonal from top-left to bottom-right
                restart();
                Toast.makeText(this, "Winner is: X", Toast.LENGTH_SHORT).show();
                winnerX();
            } else if (b3.equals("X") && b5.equals("X") && b7.equals("X")) {
                // Diagonal from top-right to bottom-left
                restart();
                Toast.makeText(this, "Winner is: X", Toast.LENGTH_SHORT).show();
                winnerX();
            }
            // conditions for O
            else if (b1.equals("O") && b2.equals("O") && b3.equals("O")) {
                // 1st row
                restart();
                Toast.makeText(this, "Winner is: O", Toast.LENGTH_SHORT).show();
                winnerO();
            } else if (b4.equals("O") && b5.equals("O") && b6.equals("O")) {
                // 2nd row
                restart();
                Toast.makeText(this, "Winner is: O", Toast.LENGTH_SHORT).show();
                winnerO();
            } else if (b7.equals("O") && b8.equals("O") && b9.equals("O")) {
                // 3rd row
                restart();
                Toast.makeText(this, "Winner is: O", Toast.LENGTH_SHORT).show();
                winnerO();
            } else if (b1.equals("O") && b4.equals("O") && b7.equals("O")) {
                // 1st column
                restart();
                Toast.makeText(this, "Winner is: O", Toast.LENGTH_SHORT).show();
                winnerO();
            } else if (b2.equals("O") && b5.equals("O") && b8.equals("O")) {
                // 2nd column
                restart();
                Toast.makeText(this, "Winner is: O", Toast.LENGTH_SHORT).show();
                winnerO();
            } else if (b3.equals("O") && b6.equals("O") && b9.equals("O")) {
                // 3rd column
                restart();
                Toast.makeText(this, "Winner is: O", Toast.LENGTH_SHORT).show();
                winnerO();
            } else if (b1.equals("O") && b5.equals("O") && b9.equals("O")) {
                // Diagonal from top-left to bottom-right
                restart();
                Toast.makeText(this, "Winner is: O", Toast.LENGTH_SHORT).show();
                winnerO();
            } else if (b3.equals("O") && b5.equals("O") && b7.equals("O")) {
                // Diagonal from top-right to bottom-left
                restart();
                Toast.makeText(this, "Winner is: O", Toast.LENGTH_SHORT).show();
              winnerO();
            }
            // Game Draw
            else if(count == 9){
                restart();
                Toast.makeText(this,"Game Draw", Toast.LENGTH_LONG).show();
                showDraw();
            }
        }
        }
    }
     private void winnerO(){
        Intent owinner;
        owinner = new Intent(MainActivity.this,winnerO.class);
        startActivity(owinner);
        finish();
     }
     private void winnerX(){
         Intent winner;
         winner = new Intent(MainActivity.this,winnerX.class);
         startActivity(winner);
         finish();
     }
//private void winner(){
//    Intent winner;
//        if (a == 0){
//
//            winner = new Intent(MainActivity.this,winnerX.class);
//
//        }
//        else {
//            winner = new Intent(MainActivity.this,winnerO.class);
//        }
//    startActivity(winner);
//        finish();
//}
    private void showDraw() {
        Intent intent = new Intent(this, draw.class);
        startActivity(intent);
        finish(); // Finish MainActivity so it won't be accessible after game ends
    }
    public void restart(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        flag = 0;
        count = 0;
    }

}