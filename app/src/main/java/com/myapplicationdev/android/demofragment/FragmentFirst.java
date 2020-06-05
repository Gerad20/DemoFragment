package com.myapplicationdev.android.demofragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Button;



/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFirst extends Fragment {

    Button btnAddText;
    TextView tvFrag1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first, container, false);

        tvFrag1 = view.findViewById(R.id.tvFrag);
        btnAddText = view.findViewById(R.id.btnTextFrag);

        btnAddText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = tvFrag1.getText().toString() + "\n" + "New Data";
                tvFrag1.setText(data);
            }
        });

        return view;
    }
}

