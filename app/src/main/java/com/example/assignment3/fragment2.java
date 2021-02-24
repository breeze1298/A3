package com.example.assignment3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class fragment2 extends Fragment {


    TextView t;
    public fragment2() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.layout_fragment2, container, false);

         t=view.findViewById(R.id.data);

        Bundle b=this.getArguments();
        String data=b.getString("Data");
        t.setText(data);

        return view;
    }


    @Override
    public void onResume() {
        super.onResume();

        Toast.makeText(getActivity(), "On Resume State ", Toast.LENGTH_LONG).show();

    }
}