package com.example.unitconverter;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LengthFragment extends Fragment {

    public LengthFragment() {
        // Required empty public constructor
    }

    public static LengthFragment newInstance() {
        LengthFragment fragment = new LengthFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_length, container, false);
        Button mtrconvert = view.findViewById(R.id.mtrconvert);
        TextView mtroutput = view.findViewById(R.id.mtroutput);
        EditText mtrinput = view.findViewById(R.id.mtrinput);

        mtrconvert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String s = mtrinput.getText().toString();
                int mtr = Integer.parseInt(s);
                double inch = mtr*39.3701;
                mtroutput.setText("Inch value is " + String.format("%.2f", inch));

            }
        });

        return view;
    }
}