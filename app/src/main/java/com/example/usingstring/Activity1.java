package com.example.usingstring;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {

    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        Log.i("Lifecycle",
                "onCreate() invoked");

        textView2 = findViewById(R.id.textView2);
        textView2.setText(R.string.Msg2);

    }

    public void onStart()
    {
        super.onStart();
        Log.i("Lifecycle",
                "onStart() invoked");
    }

    public void onRestart()
    {

        super.onRestart();
        Log.i("Lifecycle",
                "onRestart() invoked");

    }
    public void onStop()
    {

        super.onStop();
        Log.i("Lifecycle",
                "onStop() invoked");

    }
    public void onDestroy()
    {

        super.onDestroy();
        Log.i("Lifecycle",
                "onDestroy() invoked");

    }
}