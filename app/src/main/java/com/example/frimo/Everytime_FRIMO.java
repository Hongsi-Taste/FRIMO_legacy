package com.example.frimo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Everytime_FRIMO extends Fragment {

    // Fragment를 만들고 레이아웃이랑 연결
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.everytime_frimo, container, false);

        return rootView;
    }
}