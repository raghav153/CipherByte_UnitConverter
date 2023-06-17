package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button weightbtn, currencybtn, lengthbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightbtn = findViewById(R.id.weightbtn);
        currencybtn = findViewById(R.id.currencybtn);
        lengthbtn = findViewById(R.id.lengthbtn);

        weightbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create new fragment and transaction
                FragmentManager fragmentManager = getSupportFragmentManager();

                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setReorderingAllowed(true);

                // Replace whatever is in the fragment_container view with this fragment
                transaction.replace(R.id.fragmentContainerView, WeightFragment.class, null);

                transaction.addToBackStack("name");
                // Commit the transaction
                transaction.commit();
            }
        });

        currencybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create new fragment and transaction
                FragmentManager fragmentManager = getSupportFragmentManager();

                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setReorderingAllowed(true);

                // Replace whatever is in the fragment_container view with this fragment
                transaction.replace(R.id.fragmentContainerView, CurrencyFragment.class, null);

                transaction.addToBackStack("name");
                // Commit the transaction
                transaction.commit();
            }
        });

       lengthbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create new fragment and transaction
                FragmentManager fragmentManager = getSupportFragmentManager();

                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setReorderingAllowed(true);

                // Replace whatever is in the fragment_container view with this fragment
                transaction.replace(R.id.fragmentContainerView, LengthFragment.class, null);

                transaction.addToBackStack("name");
                // Commit the transaction
                transaction.commit();
            }
        });
    }
}