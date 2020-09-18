package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView)findViewById(R.id.show_count);

    }


    public void showToast(View view) {
        toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        this.mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void countDown(View view){
        if (mCount > 0)
            this.mCount--;
        else {
            toast = Toast.makeText(this, R.string.toast_error_message, Toast.LENGTH_SHORT);
            toast.show();
        }
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}
