package com.example.fa19_bcs_209_assi_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ActionFragment.Replace {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionFragment actionFragment;
        InputDataFragment inputDataFragment;
        MessageFragment messageFragment;
        FragmentManager fragmentManager;
        FragmentTransaction fragmentTransaction;
        CalculateFragment calculateFragment;
        Data data;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            int Orientation=getResources().getConfiguration().orientation;
            if(Orientation== Configuration.ORIENTATION_LANDSCAPE)
            {fragmentManager=getSupportFragmentManager();
                fragmentTransaction=fragmentManager.beginTransaction();
                actionFragment=ActionFragment.newInstance();
                inputDataFragment=InputDataFragment.newInstance();
                messageFragment=MessageFragment.newInstance();
                calculateFragment=CalculateFragment.newInstance();
                fragmentTransaction.add(R.id.ActionFrag,actionFragment);
                fragmentTransaction.add(R.id.messagefrag,messageFragment);
                fragmentTransaction.commit();}
            data=new ViewModelProvider(this).get(Data.class);
        }

        @Override
        public void rep() {
            FragmentTransaction fragmentTransaction1=fragmentManager.beginTransaction();
            fragmentTransaction1.replace(R.id.messagefrag,inputDataFragment);
            fragmentTransaction1.commit();
        }

        @Override
        public void repcal() {
            FragmentTransaction fragmentTransaction3=fragmentManager.beginTransaction();
            fragmentTransaction3.replace(R.id.messagefrag,calculateFragment);
            fragmentTransaction3.commit();
        }
    }
}