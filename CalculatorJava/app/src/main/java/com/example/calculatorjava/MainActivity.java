package com.example.calculatorjava;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonPlus, buttonMinus, buttonDelete,
            buttonMul, buttonCe, buttonDel, buttonEqual, buttonPercentage, buttonDot, buttonSqrt;

    EditText displayText,checkText;

    float value0, value1,value3;

    boolean flagPlus, flagMinus, flagMul, flagDel, flagPercentage, dotCheck,zeroCheck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        displayText = findViewById(R.id.displayText);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonCe = findViewById(R.id.buttonCe);
        buttonDel = findViewById(R.id.buttonDel);
        buttonDelete = findViewById(R.id.buttonDelete);
        buttonDot = findViewById(R.id.buttonDot);
        buttonMul = findViewById(R.id.buttonMultiple);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonPercentage = findViewById(R.id.buttonPercentage);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonSqrt = findViewById(R.id.buttonSqrt);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayText.getText().toString().length() == 0) {
                    displayText.setText(displayText.getText() + "0");
                    zeroCheck = true;
                } else if (displayText.getText().toString().length() == 1 && !zeroCheck || displayText.getText().toString().length() > 1) {
                    displayText.setText(displayText.getText() + "0");
                }

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayText.getText().toString().length() == 1 && displayText.getText().toString().equals("0")) {
                    displayText.setText("");
                }
                else {
                    displayText.setText(displayText.getText() + "1");
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayText.getText().toString().length() == 1 && displayText.getText().toString().equals("0")) {
                    displayText.setText(displayText.getText() + "");
                }
                else {
                    displayText.setText(displayText.getText() + "2");
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayText.getText().toString().length() == 1 && displayText.getText().toString().equals("0")) {
                    displayText.setText(displayText.getText() + "");
                }
                else {
                    displayText.setText(displayText.getText() + "3");
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayText.getText().toString().length() == 1 && displayText.getText().toString().equals("0")) {
                    displayText.setText(displayText.getText() + "");
                }
                else {
                    displayText.setText(displayText.getText() + "4");
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayText.getText().toString().length() == 1 && displayText.getText().toString().equals("0")) {
                    displayText.setText(displayText.getText() + "");
                }
                else {
                    displayText.setText(displayText.getText() + "5");
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayText.getText().toString().length() == 1 && displayText.getText().toString().equals("0")) {
                    displayText.setText(displayText.getText() + "");
                }
                else {
                    displayText.setText(displayText.getText() + "6");
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayText.getText().toString().length() == 1 && displayText.getText().toString().equals("0")) {
                    displayText.setText(displayText.getText() + "");
                }
                else {
                    displayText.setText(displayText.getText() + "7");
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayText.getText().toString().length() == 1 && displayText.getText().toString().equals("0")) {
                    displayText.setText(displayText.getText() + "");
                }
                else {
                    displayText.setText(displayText.getText() + "8");
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayText.getText().toString().length() == 1 && displayText.getText().toString().equals("0")) {
                    displayText.setText(displayText.getText() + "");
                }
                else {
                    displayText.setText(displayText.getText() + "9");
                }
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayText.getText().toString().length() == 0) {
                    flagPlus = true;
                    flagDel = false;
                    flagMinus = false;
                    flagMul = false;
                    flagPercentage = false;
                  displayText.setText(null);

                } else {
                    value0 = Float.parseFloat(displayText.getText() + "");
                    flagPlus = true;
                    flagDel = false;
                    flagMinus = false;
                    flagMul = false;
                    flagPercentage = false;
                    displayText.setText(null);
                }
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayText.getText().toString().length() == 0) {
                    flagPlus = false;
                    flagDel = false;
                    flagMinus = true;
                    flagMul = false;
                    flagPercentage = false;
                    displayText.setText(null);
                } else {
                    value0 = Float.parseFloat(displayText.getText() + "");
                    flagPlus = false;
                    flagDel = false;
                    flagMinus = true;
                    flagMul = false;
                    flagPercentage = false;
                    displayText.setText(null);
                }
            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayText.getText().toString().length() == 0) {
                    flagPlus = false;
                    flagDel = false;
                    flagMinus = false;
                    flagMul = true;
                    flagPercentage = false;
                    displayText.setText(null);
                } else {
                    value0 = Float.parseFloat(displayText.getText() + "");
                    flagPlus = false;
                    flagDel = false;
                    flagMinus = false;
                    flagMul = true;
                    flagPercentage = false;
                    displayText.setText(null);
                }
            }
        });
        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayText.getText().toString().length() == 0) {
                    flagPlus = false;
                    flagDel = true;
                    flagMinus = false;
                    flagMul = false;
                    flagPercentage = false;
                    displayText.setText(null);
                } else {
                    value0 = Float.parseFloat(displayText.getText() + "");
                    flagPlus = false;
                    flagDel = true;
                    flagMinus = false;
                    flagMul = false;
                    flagPercentage = false;
                    displayText.setText(null);
                }
            }
        });
        buttonPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayText.getText().toString().length() == 0) {
                    flagPlus = false;
                    flagDel = false;
                    flagMinus = false;
                    flagMul = false;
                    flagPercentage = true;
                    displayText.setText(null);
                } else {
                    value0 = Float.parseFloat(displayText.getText() + "");
                    flagPlus = false;
                    flagDel = false;
                    flagMinus = false;
                    flagMul = false;
                    flagPercentage = true;
                    displayText.setText(null);
                }
            }
        });
        buttonSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayText.getText().toString().length() == 0) {
                    displayText.setText("0");
                }
                else {
                    value0 = Float.parseFloat(displayText.getText() + "");
                    value1 = (float) Math.sqrt(value0);
                    displayText.setText(value1 + "");
                    dotCheck = true;
                }
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displayText.getText().toString().length() == 0) {
                    displayText.setText("0.");
                    dotCheck = true;
                }
                if (!dotCheck){
                    displayText.setText(displayText.getText() + ".");
                    dotCheck = true;
                }
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (displayText.getText() != null) {
                    value1 = Float.parseFloat(displayText.getText() + "");
                    Float check = value1;
                    if (flagPlus) {
                        value3 = value0 + value1;
                        if (value3 == Math.round(value3)){
                            displayText.setText(Math.round(value3) + "");
                            dotCheck = false;
                        }
                        else{
                            displayText.setText(value3 + "");
                            dotCheck = true;
                        }
                        flagPlus = false;
                    }
                    if (flagMinus) {
                        value3 = value0 - value1;
                        if (value3 == Math.round(value3)){
                            displayText.setText(Math.round(value3) + "");
                            dotCheck = false;
                        }
                        else{
                            displayText.setText(value3 + "");
                            dotCheck= true;
                        }
                        flagMinus = false;
                    }
                    if (flagMul) {
                        value3 = value0 * value1;
                        if (value3 == Math.round(value3)){
                            displayText.setText(Math.round(value3) + "");
                            dotCheck = false;
                        }
                        else{
                            displayText.setText(value3 + "");
                            dotCheck = true;
                        }
                        flagMul = false;
                    }
                    if (flagDel) {
                        value3 = value0 / value1;
                        if (value3 == Math.round(value3)){
                            displayText.setText(Math.round(value0) + "");
                            dotCheck = false;
                        }
                        else{
                            displayText.setText(value3 + "");
                            dotCheck = true;
                        }
                        flagDel = false;
                    }
                    if (flagPercentage) {
                        value3 = value0 / value1;
                        value3 = value3 * 100;
                        if (value3 == Math.round(value3)){
                            displayText.setText(Math.round(value3) + "%");
                            dotCheck = false;
                        }
                        else{
                            displayText.setText(value3 + "%");
                            dotCheck = true;
                        }
                        flagPercentage = false;
                    }
                }
                else {
                    displayText.setText(null);
                }
            }
        });
        buttonCe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText.setText("");
                flagPlus = false;
                flagDel = false;
                flagMinus = false;
                flagMul = false;
                flagPercentage = false;
                zeroCheck = false;
                dotCheck = false;
            }
        });
        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newText = displayText.getText().toString();
                displayText.setText(newText.substring(0, newText.length() - 1));
                newText = newText.substring(newText.length() - 1);
                if (newText.equals("+")) {
                    flagPlus = false;
                }
                if (newText.equals("-")) {
                    flagMinus = false;
                }
                if (newText.equals("*")) {
                    flagMul = false;
                }
                if (newText.equals("/")) {
                    flagDel = false;
                }
                if (newText.equals(".")) {
                    dotCheck = false;
                }
                if (newText.equals("0") && displayText.getText().toString().length() == 0) {
                    zeroCheck = false;
                }
            }
        });

    }
}