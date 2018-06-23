package com.nabesh.mpesa;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Act2 extends AppCompatActivity {
TextView textView1,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        textView1=findViewById(R.id.tv);
        textView2=findViewById(R.id.tv2);
    }

    public void click(View view) {
//        Intent serach=new Intent(ContactsContract.Contacts);
//        startActivity(serach);
    }

    public void next(View view) {
        Intent intent=new Intent(this,phonenumber.class);
        startActivity(intent);
    }
}
