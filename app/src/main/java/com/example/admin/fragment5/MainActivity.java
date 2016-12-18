package com.example.admin.fragment5;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        F1 f1=new F1();//a.create obj for fragment1
        F2 f2=new F2();
        FragmentManager manager=getSupportFragmentManager();//b.get manager object

        FragmentTransaction transaction=manager.beginTransaction();//c.set transaction
        transaction.add(R.id.frame1,f1);//d.add fargment
        transaction.add(R.id.frame2,f2);
        transaction.commit();//e.save transaction

    }
}
