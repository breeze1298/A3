package com.example.assignment3;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

public class fragment1 extends Fragment {

    String s;
    EditText t1;

    public fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.layout_fragment1, container, false);

        t1=view.findViewById(R.id.txt);
        view.findViewById(R.id.send).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                s = t1.getText().toString().trim();
                if (s.isEmpty())
                {
                    t1.setError("Enter Any Text !");

                }
                else
                {
                    sendData();
                }

            }
        });


        return view;
    }

   private void sendData()
    {
        Bundle b = new Bundle();
        b.putString("Data", s);

        fragment2 f=new fragment2();
        f.setArguments(b);

        t1.setText("");
        Toast.makeText(getActivity(), "Data Send Successfully !! ", Toast.LENGTH_SHORT).show();
        getFragmentManager().beginTransaction().replace(R.id.frame,f).commit();

    }
}