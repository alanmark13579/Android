package com.example.homeworkswitchpage;


import android.os.Bundle;



import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.TextView;


public class FragmentFirst extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentManager manager = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
       // super.onCreate(savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        Button SwitchButton =(Button) view.findViewById(R.id.SwitchButton);
       TextView TextView1 = view.findViewById(R.id.textView1);
        //使用匿名型別實作Click Event。
        SwitchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //do something
                FragmentSecond fragment2 = new FragmentSecond(); //初始化接著要switch的fragment
                transaction.replace(R.id.center, fragment2, "fragment2"); //switch　framgent
                transaction.commit(); //使framgent變化生效
            }
        });
        return view ;
    }

}