package com.example.lenovo.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private int onCreateCounter;
    private int onResumeCounter;
    private int onPauseCounter;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        onCreateCounter++;
        TextView textView=(TextView) findViewById(R.id.onCreate_tv);
        textView.setTextSize(20);
        textView.setText("onCreate() called "+""+onCreateCounter);
        startNewActivity();
        getTheIntent();
    }
    public void getTheIntent()
    {
        Intent intent=getIntent();

    }
    @Override
    protected void onResume() {
        super.onResume();
        onResumeCounter++;
        TextView textView=(TextView) findViewById(R.id.onResume_tv);
        textView.setTextSize(20);
        textView.setText("onResume() called "+""+onResumeCounter);

    }

    @Override
    protected void onPause() {
        super.onPause();
        onPauseCounter++;
        TextView textView=(TextView) findViewById(R.id.onPause_tv);
        textView.setTextSize(20);
        textView.setText("onPause() called "+""+onPauseCounter);
    }
    public void startNewActivity()
    {
        button= (Button) findViewById(R.id.button_main);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
