package com.android.happyworkday.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.happyworkday.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OutlineFragment extends Fragment {


    public OutlineFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_outline,container,false);
    }

}
