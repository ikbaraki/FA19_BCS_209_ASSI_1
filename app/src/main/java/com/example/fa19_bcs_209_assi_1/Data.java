package com.example.fa19_bcs_209_assi_1;

import androidx.lifecycle.ViewModel;

public class Data extends ViewModel {
    private float number1=0;
    private float number2=0;
    private float number3=0;



    public void setNumber1(float number1) {
        this.number1 = number1;
    }

    public void setNumber2(float number2) {
        this.number2 = number2;
    }

    public void setNumber3(float number3) {
        this.number3 = number3;
    }

    public float getNumber1() {
        return number1;
    }

    public float getNumber2() {
        return number2;
    }

    public float getNumber3() {
        return number3;
    }
}
