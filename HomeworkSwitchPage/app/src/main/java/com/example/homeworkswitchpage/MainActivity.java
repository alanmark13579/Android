package com.example.homeworkswitchpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private FragmentManager manager;
    private FragmentTransaction transaction;
    private boolean bool = true  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //初始化先到FragmentFirst
        manager = getSupportFragmentManager();   //取得activity內所有的fragment
        transaction = manager.beginTransaction();//初始化manger的變化
        FragmentFirst fragment1 = new FragmentFirst(); //初始化接著要switch的framgent
        transaction.replace(R.id.center, fragment1, "fragment1"); //switch　framgent
        bool = false ;
        transaction.commit(); //使framgent變化生效
    }
    //switch button
    public void onClick(View view) {
    //透過下方程式碼，取得Activity中執行的個體。
        transaction = manager.beginTransaction();
        //切換到 framgent_frist
        if(bool == true){
            FragmentFirst fragment1 = new FragmentFirst();
            transaction.replace(R.id.center, fragment1, "fragment1");
            bool = false ;
        }//切換到 framgent_second
        else{
            FragmentSecond fragment2 = new FragmentSecond();
            transaction.replace(R.id.center, fragment2, "fragment2");
            bool = true ;
        }
        transaction.commit();
    }

}