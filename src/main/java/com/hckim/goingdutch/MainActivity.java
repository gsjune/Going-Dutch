package com.hckim.goingdutch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mPersonalMoneyTextView;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPersonalMoneyTextView = (TextView) findViewById(R.id.money_text);

    }

    public void personalButtonClicked(View view) {
//        Toast.makeText(this, "잘 눌림", Toast.LENGTH_SHORT).show();
        mPersonalMoneyTextView.setText("10");

    }
}
