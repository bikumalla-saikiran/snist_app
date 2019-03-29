package com.example.saikiran.snist_feedback;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class screen1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);

    }
    public void click(View v)
    {
        Intent it = new Intent(screen1.this,screen2.class);
        startActivity(it);
    }
}
