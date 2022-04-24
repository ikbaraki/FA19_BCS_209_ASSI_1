package com.example.fa19_bcs_209_assi_1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ActionFragment extends Fragment {
    Button inputdata;
    Replace replace;
    Button calculate;
    public ActionFragment() {

    }
    public static ActionFragment newInstance() {
        ActionFragment fragment = new ActionFragment();
        return fragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        replace=(MainActivity)context;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onResume() {
        super.onResume();
        inputdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replace.rep();
            }
        });
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replace.repcal();
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_action, container, false);
        inputdata=view.findViewById(R.id.inputdata);
        calculate=view.findViewById(R.id.calculate);
        return view;
    }
    public interface Replace{
        void rep();
        void repcal();
    }
}