package com.myapplication.smartchairui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.myapplication.smartchairui.R;

/**
 * Created by samruddhi on 3/2/19.
 */

public class thirdfragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        LinearLayout layout =(LinearLayout)inflater.inflate(R.layout.third,null);
        return layout;
    }
}
