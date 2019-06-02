package com.example.cal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et;
    double x,y;
    String a, last="not";
    boolean bo=true;
    int endd= 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById (R.id.et);
    }

    public void plus(View view) {
        if(bo){
            a=et.getText().toString();
            if((a.length()!=0)&&(a.length()<11)){
                x=Double.parseDouble(a);
                et.setHint(" "+x);
                et.setText(" ");
                bo=false;}
            else {
                et.setText(" ");
                et.setHint("DISPLAY");
                bo=true;
            }
        }
        else {
            a = et.getText().toString();
            if ((a.length() != 0) && (a.length() < 11)) {
                y = Double.parseDouble(a);
                switch (endd) {
                    case 1:
                        x = x + y;
                        break;
                    case 2:
                        x = x - y;
                        break;
                    case 3:
                        x = x * y;
                        break;
                    case 4:
                        if (y != 0) {
                            x = x / y;
                        } else {
                            et.setText(" ");
                            et.setHint("error");
                            bo = true;
                        }
                        break;
                }
                et.setHint(" " + x);
                et.setText(" ");

            } else {
                et.setText(" ");
                et.setHint("DISPLAY");
                bo = true;
            }
        }
    endd=1;
    }

    public void minus(View view){
        if(bo){
            a=et.getText().toString();
            if((a.length()!=0)&&(a.length()<11)){
                x=Double.parseDouble(a);
                et.setHint(" "+x);
                et.setText(" ");
                bo=false;}
            else {
                et.setText(" ");
                et.setHint("DISPLAY");
                bo=true;
            }
        }
        else {
            a = et.getText().toString();
            if ((a.length() != 0) && (a.length() < 11)) {
                y = Double.parseDouble(a);
                switch (endd) {
                    case 1:
                        x = x + y;
                        break;
                    case 2:
                        x = x - y;
                        break;
                    case 3:
                        x = x * y;
                        break;
                    case 4:
                        if (y != 0) {
                            x = x / y;
                        } else {
                            et.setText(" ");
                            et.setHint("error");
                            bo = true;
                        }
                        break;
                }
                et.setHint(" " + x);
                et.setText(" ");

            } else {
                et.setText(" ");
                et.setHint("DISPLAY");
                bo = true;
            }
        }
        endd=2;
    }

    public void kefel(View view) {
        if(bo){
            a=et.getText().toString();
            if((a.length()!=0)&&(a.length()<11)){
                x=Double.parseDouble(a);
                et.setHint(" "+x);
                et.setText(" ");
                bo=false;}
            else {
                et.setText(" ");
                et.setHint("DISPLAY");
                bo=true;
            }
        }
        else {
            a = et.getText().toString();
            if ((a.length() != 0) && (a.length() < 11)) {
                y = Double.parseDouble(a);
                switch (endd) {
                    case 1:
                        x = x + y;
                        break;
                    case 2:
                        x = x - y;
                        break;
                    case 3:
                        x = x * y;
                        break;
                    case 4:
                        if (y != 0) {
                            x = x / y;
                        } else {
                            et.setText(" ");
                            et.setHint("error");
                            bo = true;
                        }
                        break;
                }
                et.setHint(" " + x);
                et.setText(" ");

            } else {
                et.setText(" ");
                et.setHint("DISPLAY");
                bo = true;
            }
        }
        endd=3;
    }

    public void hiluk(View view) {
        if(bo){
            a=et.getText().toString();
            if((a.length()!=0)&&(a.length()<11)){
                x=Double.parseDouble(a);
                et.setHint(" "+x);
                et.setText(" ");
                bo=false;}
            else {
                et.setText(" ");
                et.setHint("DISPLAY");
                bo=true;
            }
        }
        else {
            a = et.getText().toString();
            if ((a.length() != 0) && (a.length() < 11)) {
                y = Double.parseDouble(a);
                switch (endd) {
                    case 1:
                        x = x + y;
                        break;
                    case 2:
                        x = x - y;
                        break;
                    case 3:
                        x = x * y;
                        break;
                    case 4:
                        if (y != 0) {
                            x = x / y;
                        } else {
                            et.setText(" ");
                            et.setHint("error");
                            bo = true;
                        }
                        break;
                }
                et.setHint(" " + x);
                et.setText(" ");

            } else {
                et.setText(" ");
                et.setHint("DISPLAY");
                bo = true;
            }
        }
        endd=4;
    }

    public void clean(View view) {
        et.setText(" ");
        et.setHint(" ");
        bo=true;
    }

    public void shave(View view) {
        if(bo){
            a=et.getText().toString();
            if((a.length()!=0)&&(a.length()<11)){
                x=Double.parseDouble(a);
                et.setHint("answer"+x);
                bo=false;}
            else {
                et.setText(" ");
                et.setHint("DISPLAY");
                bo=true;
            }
        }
        else {
            a = et.getText().toString();
            if ((a.length() != 0) && (a.length() < 11)) {
                y = Double.parseDouble(a);
                switch (endd) {
                    case 1:
                        x = x + y;
                        break;
                    case 2:
                        x = x - y;
                        break;
                    case 3:
                        x = x * y;
                        break;
                    case 4:
                        if (y != 0) {
                            x = x / y;
                        } else {
                            et.setText(" ");
                            et.setHint("error");
                            bo = true;
                        }
                        break;
                }
                et.setText("the answer is:" +x);
                last=" "+x;


            } else {
                et.setText(" ");
                et.setHint("DISPLAY");
                bo = true;
            }
        }
    }

    public void credits(View view) {

    }
}
