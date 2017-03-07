package com.tibaes.tictactoemanual;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Integer countOne = 0,countTwo= 0, countThree = 0, countFour = 0, countFive = 0 ;
    Integer countSix = 0,countSeven= 0, countEight= 0, countNine = 0;

    TextView txtOne, txtTwo, txtThree, txtFour, txtFive, txtSix, txtSeven, txtEight, txtNine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNewGame = (Button) findViewById(R.id.btn_new);
        btnNewGame.setOnClickListener(new View.OnClickListener() {
            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                countOne = 0;
                countTwo = 0;
                countThree = 0;
                countFour = 0;
                countFive = 0;
                countSix = 0;
                countSeven= 0;
                countNine = 0;

                txtOne.setText("");
                txtTwo.setText("");
                txtThree.setText("");
                txtFour.setText("");
                txtFive.setText("");
                txtSix.setText("");
                txtSeven.setText("");
                txtEight.setText("");
                txtNine.setText("");
            }
        });

        txtOne = (TextView) findViewById(R.id.txt_pos_one);
        txtOne.setOnClickListener(new View.OnClickListener() {
            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                switch (countOne){
                    case 0:
                        txtOne.setText("X");
                        countOne++;
                        break;
                    case 1:
                        txtOne.setText("O");
                        countOne++;
                        break;
                    case 2:
                        txtOne.setText("");
                        countOne = 0;
                        break;
                }
            }
        });

        txtTwo = (TextView) findViewById(R.id.txt_pos_two);
        txtTwo.setOnClickListener(new View.OnClickListener() {
            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                switch (countTwo){
                    case 0:
                        txtTwo.setText("X");
                        countTwo++;
                        break;
                    case 1:
                        txtTwo.setText("O");
                        countTwo++;
                        break;
                    case 2:
                        txtTwo.setText("");
                        countTwo = 0;
                        break;
                }
            }
        });

        txtThree = (TextView) findViewById(R.id.txt_pos_three);
        txtThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (countThree){
                    case 0:
                        txtThree.setText("X");
                        countThree++;
                        break;
                    case 1:
                        txtThree.setText("O");
                        countThree++;
                        break;
                    case 2:
                        txtThree.setText("");
                        countThree = 0;
                        break;
                }
            }
        });

        txtFour = (TextView) findViewById(R.id.txt_pos_four);
        txtFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (countFour){
                    case 0:
                        txtFour.setText("X");
                        countFour++;
                        break;
                    case 1:
                        txtFour.setText("O");
                        countFour++;
                        break;
                    case 2:
                        txtFour.setText("");
                        countFour = 0;
                        break;
                }
            }
        });

        txtFive = (TextView) findViewById(R.id.txt_pos_five);
        txtFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (countFive){
                    case 0:
                        txtFive.setText("X");
                        countFive++;
                        break;
                    case 1:
                        txtFive.setText("O");
                        countFive++;
                        break;
                    case 2:
                        txtFive.setText("");
                        countFive = 0;
                        break;
                }
            }
        });

        txtSix = (TextView) findViewById(R.id.txt_pos_six);
        txtSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (countSix){
                    case 0:
                        txtSix.setText("X");
                        countSix++;
                        break;
                    case 1:
                        txtSix.setText("O");
                        countSix++;
                        break;
                    case 2:
                        txtSix.setText("");
                        countSix = 0;
                        break;
                }
            }
        });

        txtSeven = (TextView) findViewById(R.id.txt_pos_seven);
        txtSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (countSeven){
                    case 0:
                        txtSeven.setText("X");
                        countSeven++;
                        break;
                    case 1:
                        txtSeven.setText("O");
                        countSeven++;
                        break;
                    case 2:
                        txtSeven.setText("");
                        countSeven = 0;
                        break;
                }
            }
        });

        txtEight = (TextView) findViewById(R.id.txt_pos_eight);
        txtEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (countEight){
                    case 0:
                        txtEight.setText("X");
                        countEight++;
                        break;
                    case 1:
                        txtEight.setText("O");
                        countEight++;
                        break;
                    case 2:
                        txtEight.setText("");
                        countEight = 0;
                        break;
                }
            }
        });

        txtNine = (TextView) findViewById(R.id.txt_pos_nine);
        txtNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (countNine){
                    case 0:
                        txtNine.setText("X");
                        countNine++;
                        break;
                    case 1:
                        txtNine.setText("O");
                        countNine++;
                        break;
                    case 2:
                        txtNine.setText("");
                        countNine = 0;
                        break;
                }
            }
        });
    }
}
