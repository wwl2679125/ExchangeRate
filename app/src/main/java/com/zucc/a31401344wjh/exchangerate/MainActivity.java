package com.zucc.a31401344wjh.exchangerate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mCalcButton;
    private TextView mConvertedTextView;
    private EditText mAmountEditText;
    private Spinner mForSprinner,mHomeSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAmountEditText = (EditText)findViewById(R.id.edt_amount);
        mCalcButton = (Button)findViewById(R.id.btn_calc);
        mConvertedTextView = (TextView)findViewById(R.id.txt_converted);
        mForSprinner = (Spinner)findViewById(R.id.spn_for);
        mHomeSpinner = (Spinner)findViewById(R.id.spn_hom);


    }
}
