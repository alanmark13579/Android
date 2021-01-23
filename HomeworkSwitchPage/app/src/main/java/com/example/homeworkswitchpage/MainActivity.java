package com.example.homeworkswitchpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity  {

    private FragmentManager manager;
    private FragmentTransaction transaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //難以維護
        setContentView(R.layout.activity_main);

        //初始化先到FragmentFirst
        manager = getSupportFragmentManager();   //取得activity內所有的fragment
        transaction = manager.beginTransaction();//初始化manger的變化
        FragmentFirst fragment1 = new FragmentFirst(); //初始化接著要switch的fragment
        transaction.replace(R.id.center, fragment1, "fragment1"); //switch　framgent
        transaction.commit(); //使framgent變化生效
    }
}