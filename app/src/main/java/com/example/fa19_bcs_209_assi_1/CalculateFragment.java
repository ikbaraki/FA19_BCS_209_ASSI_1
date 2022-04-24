package com.example.fa19_bcs_209_assi_1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
public class CalculateFragment extends Fragment {
    Button add;
    Button sub;
    Button mul;
    Button divide;
    TextView storedNo;
    TextView result;
    Data data;

    public CalculateFragment() {

    }

    public static CalculateFragment newInstance() {
        CalculateFragment fragment = new CalculateFragment();
        return fragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        data=new ViewModelProvider((MainActivity)context).get(Data.class);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onResume() {
        super.onResume();
        float n1=data.getNumber1();
        float n2=data.getNumber2();
        float n3=data.getNumber3();
        String store="Stored Numbers: "+String.valueOf(n1)+" "+String.valueOf(n2)+" "+String.valueOf(n3);
        storedNo.setText(store);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float re= n1+n2+n3;
                result.append("\n Addition: "+String.valueOf(re));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float re= n1-n2-n3;
                result.append("\n Subtraction: "+String.valueOf(re));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float re= n1*n2*n3;
                result.append("\n Multiplication: "+String.valueOf(re));
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float re= n1/n2/n3;
                result.append("\n Division: "+String.valueOf(re));
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_calculate, container, false);
        add=view.findViewById(R.id.Add);
        sub=view.findViewById(R.id.subtract);
        mul=view.findViewById(R.id.Multiply);
        divide=view.findViewById(R.id.divide);
        storedNo=view.findViewById(R.id.StoredNoDidplay);
        result=view.findViewById(R.id.Result);
        return view;
    }
}