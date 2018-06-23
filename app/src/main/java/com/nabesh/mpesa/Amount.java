package com.nabesh.mpesa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Amount extends AppCompatActivity {
    Button btc;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amount);
        btc=findViewById(R.id.btn2);
        editText=findViewById(R.id.ed2);
    }

    public void page(View view) {
        Intent mIntent=new Intent(this,pin.class);
        startActivity(mIntent);
    }
}
