package com.example.excercise2_bt3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    View.OnClickListener buttonListener;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bPlus,bSub,bMult,bDiv,bResult,bReset;
    TextView textView;
    Integer lastValue=0,currentValue;
    String operation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.result);
        b0=findViewById(R.id.btn_0);
        b1=findViewById(R.id.btn_1);
        b2=findViewById(R.id.btn_2);
        b3=findViewById(R.id.btn_3);
        b4=findViewById(R.id.btn_4);
        b5=findViewById(R.id.btn_5);
        b6=findViewById(R.id.btn_6);
        b7=findViewById(R.id.btn_7);
        b8=findViewById(R.id.btn_8);
        b9=findViewById(R.id.btn_9);
        bPlus=findViewById(R.id.btn_pluss);
        bSub=findViewById(R.id.btn_sub);
        bDiv=findViewById(R.id.btn_div);
        bMult=findViewById(R.id.btn_multi);
        bResult=findViewById(R.id.btn_result);
        bReset=findViewById(R.id.btn_reset);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setButtonListener(view);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setButtonListener(view);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setButtonListener(view);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setButtonListener(view);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setButtonListener(view);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setButtonListener(view);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setButtonListener(view);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setButtonListener(view);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setButtonListener(view);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setButtonListener(view);
            }
        });
        bPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setButtonListener(view);
            }
        });
        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setButtonListener(view);
            }
        });
        bMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setButtonListener(view);
            }
        });
        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setButtonListener(view);
            }
        });
        bReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setButtonListener(view);
            }
        });
        bResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setButtonListener(view);
            }
        });



    }

    public void setButtonListener(View view){
        Button button=(Button) view;
        String data=button.getText().toString();
        switch (data){
            case "0":
                setvalue(textView,"0");
                break;

            case "1":
                setvalue(textView,"1");
                break;

            case "2":
                setvalue(textView,"2");
                break;

            case "3":
                setvalue(textView,"3");
                break;

            case "4":
                setvalue(textView,"4");
                break;

            case "5":
                setvalue(textView,"5");
                break;

            case "6":
                setvalue(textView,"6");
                break;

            case "7":
                setvalue(textView,"7");
                break;

            case "8":
                setvalue(textView,"8");
                break;

            case "9":
                setvalue(textView,"9");
                break;
            case "Reset":
                resetvalue();
                break;
            case "+":
                operation="plus";
                lastValue=Integer.parseInt(textView.getText().toString());
                resetvalue();
                break;
            case "-":
                operation="sub";
                lastValue=Integer.parseInt(textView.getText().toString());
                resetvalue();
                break;
            case "*":
                operation="mult";
                lastValue=Integer.parseInt(textView.getText().toString());
                resetvalue();
                break;
            case "/":
                operation="div";
                lastValue=Integer.parseInt(textView.getText().toString());
                resetvalue();
                break;
            case "Result":
                currentValue=Integer.parseInt(textView.getText().toString());
                process(lastValue,currentValue);
                break;

        }

    }

    private void setvalue(TextView a,String b) {
        String last=a.getText().toString();
        if(!last.equals("0")){
            last +=b;
            b=last;
        }
        a.setText(b);
    }
    private void resetvalue(){
        textView.setText("0");
    }
    private Integer process(Integer a,Integer b){
        Integer presult=0;
        if(operation=="plus"){
            presult=a+b;
            textView.setText(presult.toString());
        }
        if(operation=="sub"){
            presult=a-b;
            textView.setText(presult.toString());
        }
        if(operation=="mult"){
            presult=a*b;
            textView.setText(presult.toString());
        }
        if(operation=="div"){
            presult=a/b;
            textView.setText(presult.toString());
        }
        return  presult;
    }
}