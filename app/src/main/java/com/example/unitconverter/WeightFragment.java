package com.example.unitconverter;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class WeightFragment extends Fragment {

    public WeightFragment() {
        // Required empty public constructor
    }

    public static WeightFragment newInstance() {
        WeightFragment fragment = new WeightFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_weight, container, false);
        Button kgconvert = view.findViewById(R.id.kgconvert);
        TextView kgoutput = view.findViewById(R.id.kgoutput);
        EditText kginput = view.findViewById(R.id.kginput);

        kgconvert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String s = kginput.getText().toString();
                int kg = Integer.parseInt(s);
                double pound = kg*2.2042;
                kgoutput.setText("Pound value is " + String.format("%.2f", pound));

            }
        });

        return view;
    }
}