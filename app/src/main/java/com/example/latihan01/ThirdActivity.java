package com.example.latihan01;

public class ThirdActivity {
    //When a button clicked
    Intent returnIntent = new Intent();
    setResult(SecondActivity.REQUEST_CODE, returnIntent);
    finish();
}
