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

//透過下方程式碼，取得Activity中執行的個體。
        manager = getSupportFragmentManager();


    }
    //換頁的按鈕設定
    public void onClick(View view) {
//透過下方程式碼，取得Activity中執行的個體。
        transaction = manager.beginTransaction();
        if(bool == true){
            FragmentFirst fragment1 = new FragmentFirst();
            transaction.replace(R.id.center, fragment1, "fragment1");
            bool = false ;
        }
        else{
            FragmentSecond fragment2 = new FragmentSecond();
            transaction.replace(R.id.center, fragment2, "fragment2");
            bool = true ;
        }
//呼叫commit讓變更生效。
        transaction.commit();
    }

}