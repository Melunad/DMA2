package com.example.project;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyApp";
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BlankFragment f1 = new BlankFragment();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.conteiner,f1);
                ft.commit();
            }
        });
    }


    private void initUI(){
        button = findViewById(R.id.button);
    }
    public void onCleck_fragment_button(View view){
        Log.i(TAG, "onCleck_fragment_button: ");
        onResume();
        onPause();
        onStop();
        onDestroy();
    }

}