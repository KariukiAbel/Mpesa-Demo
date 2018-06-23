package com.nabesh.mpesa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lv;
    String [] items={"Send Money","Withdraw Cash","Buy Airtime","Loans and Savings","Lipa na M-Pesa","My Account"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       lv=findViewById(R.id.list);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,items);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
       if (position==0){
           Intent meIntent=new Intent(this,Act2.class);
           startActivity(meIntent);
       }if (position==1){
           Intent with=new Intent(this,Withdraw.class);
           startActivity(with);
        }if (position==2){
           Intent air=new Intent(this,Airtime.class);
           startActivity(air);
        }if (position==3){
           Intent losa=new Intent(this,LoanSavings.class);
           startActivity(losa);
        }if (position==4){
           Intent lipa=new Intent(this,Lipa.class);
           startActivity(lipa);
        }if (position==5){
           Intent acc=new Intent(this,Account.class);
           startActivity(acc);
        }
    }
}
