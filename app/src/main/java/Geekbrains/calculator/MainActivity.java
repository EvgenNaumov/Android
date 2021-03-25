package Geekbrains.calculator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView2;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button buttonAdd;
    private Button buttonReduce;
    private Button buttonDivide;
    private Button buttonMult;
    private Button buttonEqual;
    private Button buttonCancel;
    private Button buttonPercent;
    private Button buttonDot;
    private Button buttonComma;
    private Button buttonMark;

    MainLogic mainLogic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calculator_new);

        initView();
        initLogic();
    }

    private void initLogic() {
        mainLogic = new MainLogic();
    }

    private void initView() {
        textView2 = findViewById(R.id.textView2);

        init_CancelButton();
        init_equal_button();
        init_button1();
        init_button2();
        init_button3();
        init_button4();
        init_button5();
        init_button6();
        init_button7();
        init_button8();
        init_button9();
        init_button0();
        init_buttonAdd();
        init_buttonReduce();
        init_buttonDivide();
        init_buttonMult();
        init_percentButton();
        init_buttonDot();
        ini_buttonComma();
        init_buttonMark();


    }

    private void init_button0() {
        button0 = findViewById(R.id.button22);
        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String buttonText = button0.getText().toString();
                showTextonTextView(buttonText);
            }
        });
    }

    private void showTextonTextView(String inText) {
        String oldText = (String) textView2.getText();
        String newText = oldText + " " + inText;
        textView2.setText("");
        textView2.setText(newText);
    }

    private void init_buttonDot() {
        buttonDot = findViewById(R.id.button13);
        buttonDot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void init_buttonMult() {
        buttonMult = findViewById(R.id.button21);
        buttonMult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String buttonText = buttonMult.getText().toString();
                showTextonTextView(buttonText);

            }
        });
    }

    private void init_button9() {
        button9 = findViewById(R.id.button20);
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String buttonText = button9.getText().toString();
                showTextonTextView(buttonText);
            }
        });
    }

    private void init_button8() {
        button8 = findViewById(R.id.button19);
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void init_buttonReduce() {
        buttonReduce = findViewById(R.id.button17);
        buttonReduce.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void init_buttonAdd() {
        buttonAdd = findViewById(R.id.button_add);
        buttonAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void init_button7() {
        button7 = findViewById(R.id.button18);
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });
    }


    private void init_button6() {
        button6 = findViewById(R.id.button16);
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void init_button5() {
        button5 = findViewById(R.id.button15);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void init_button4() {
        button4 = findViewById(R.id.button14);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void init_button3() {
        button3 = findViewById(R.id.button12);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void init_button2() {
        button2 = findViewById(R.id.button11);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void init_button1() {
        button1 = findViewById(R.id.button10);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void init_equal_button() {
        buttonEqual = findViewById(R.id.button_cancel);
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void init_CancelButton() {
        buttonCancel = findViewById(R.id.button_cancel);
        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR2)
            @Override
            public void onClick(View view) {
                textView2.setText(String.format(""));
            }
        });
    }

    private void init_percentButton() {
        buttonPercent = findViewById(R.id.button28);
        buttonPercent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void init_buttonDivide() {
        buttonDivide = findViewById(R.id.button24);
        buttonDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void ini_buttonComma() {
        buttonComma = findViewById(R.id.button23);
        buttonComma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void init_buttonMark() {
        buttonMark = findViewById(R.id.button27);
        buttonMark.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

            }
        });
    }

}
