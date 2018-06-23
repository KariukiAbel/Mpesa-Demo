package com.nabesh.mpesa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Withdraw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_withdraw);
    }

    public void ts(View view) {
        Intent magent=new Intent(this,Agent.class);
        startActivity(magent);
    }

    public void ts2(View view) {
    }
}
