package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private static final String TAG = "MyApp2";
    TextView textView;
    Button button2;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initUI();
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "onClick: ");
                Intent intent = new Intent();
                intent.putExtra("name",1);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }

    private void initUI(){
       textView = findViewById(R.id.textView);
       imageView = findViewById(R.id.imageView);
       button2 = findViewById(R.id.button3);
    }
}