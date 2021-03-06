package com.example.naveenkumark.testjava8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
public static final String TAG = "TAG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int i = 10;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button)findViewById(R.id.button);

        if("\u0401\u0436\u0438\u0433".equals("Ёжиг")) {
            throw new RuntimeException("Encoding fail");
        }




        /*b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/






        b.setOnClickListener((View v) ->
        {
            Log.d(TAG, "onCreate: onClick");
            testFunctionalInterfaceLambda( (p) ->
            {
                Log.d(TAG, "onCreate: Inside Lambda");
                return p.id;
            });

            testLambda1();
            testLambda2();
        }
        );

    }


    public void testLambda1(){

        Log.d("TAG", "testLambda1: ");
        Log.e(TAG, "test Lambda error: " );
        Log.i(TAG, "test Lambda info: ");
        Log.v(TAG, "verbose");
        Log.w(TAG, "test Lambda: ");
        Log.wtf(TAG, "WTF");
        Log.wtf(TAG, "WTF");
    }

    public void testLambda2(){
        Log.d("TAG", "testLambda2: ");
    }

    public void testFunctionalInterfaceLambda(Person.testInterface ti){

        Person p = new Person("Naveen Kumar", 31, 1);
        int i = ti.getId(p);
        Log.d(TAG, "testFunctionalInterfaceLambda: " + ti.getId(p));


    }

    public void testOptional(){
        Person p = new Person("Naveen", 31, 1);
    }


}
