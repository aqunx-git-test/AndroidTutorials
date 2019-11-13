package com.example.hello_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView)findViewById(R.id.tvShowCount);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, "Hello, Toast", Toast.LENGTH_SHORT);
        toast.show();

    }

    private int mCount = 0;
    private TextView mShowCount;
    public void countUp(View view) {
        mCount++;
        if(mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));

        }
    }
}
