package com.nabesh.mpesa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class phonenumber extends AppCompatActivity {
Button bnt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phonenumber);
        bnt=findViewById(R.id.btn);
    }

    public void Next(View view) {
        Intent mintent=new Intent(this,Amount.class);
        startActivity(mintent);
    }
}
