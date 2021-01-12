package com.example.homeworkswitchpage;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment_second extends Fragment {
    private TextView mTxtR;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        // Fragment剛被建立時執行此方法
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {

        super.onActivityCreated(savedInstanceState);

        mTxtR = (TextView) getView().findViewById(R.id.txtR);

    }

    @Override
    public void onPause()
    {
        // 當Fragment要從螢幕消失時執行此方法
        super.onPause();
    }
}