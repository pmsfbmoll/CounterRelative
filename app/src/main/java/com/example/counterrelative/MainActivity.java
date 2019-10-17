package com.example.counterrelative;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    protected short counter=0;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView);
    }
    public void onClickIncrement(View v){
        tv.setText(Short.toString(++counter));
    }
    public void onClickToast(View v){
        Toast.makeText(MainActivity.this,Short.toString(counter), Toast.LENGTH_LONG).show();
    }
}
