package com.example.fa19_bcs_209_assi_1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class InputDataFragment extends Fragment {
    Button storedata;
    EditText number1;
    EditText number2;
    EditText number3;
    Data data;

    public InputDataFragment() {
        // Required empty public constructor
    }


    public static InputDataFragment newInstance() {
        InputDataFragment fragment = new InputDataFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        data=new ViewModelProvider((MainActivity)context).get(Data.class);
    }

    @Override
    public void onResume() {
        super.onResume();
        storedata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1= Float.parseFloat(number1.getText().toString());
                float n2= Float.parseFloat(number2.getText().toString());
                float n3= Float.parseFloat(number3.getText().toString());
                data.setNumber1(n1);
                data.setNumber2(n2);
                data.setNumber3(n3);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_input_data, container, false);
        storedata= view.findViewById(R.id.StoreNumbers);
        number1=view.findViewById(R.id.Number1);
        number2=view.findViewById(R.id.Number2);
        number3=view.findViewById(R.id.Number3);
        return view;
    }

}