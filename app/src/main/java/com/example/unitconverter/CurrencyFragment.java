package com.example.unitconverter;

import static com.example.unitconverter.R.id.inrconvert;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CurrencyFragment extends Fragment {

    public CurrencyFragment() {
        // Required empty public constructor
    }

    public static CurrencyFragment newInstance() {
        CurrencyFragment fragment = new CurrencyFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_currency, container, false);

        Button inrconvert = view.findViewById(R.id.inrconvert);
        TextView inroutput = view.findViewById(R.id.inroutput);
        EditText inrinput = view.findViewById(R.id.inrinput);

        inrconvert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String s = inrinput.getText().toString();
                int currency = Integer.parseInt(s);
                double usd = currency*0.012;
                inroutput.setText("USD value is " + String.format("%.2f", usd));

            }
        });

        return view;
    }
}