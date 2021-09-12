package edu.mssu.cis385.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int mCount = 0;
    private TextView mShowCount;
    private int mZero = 0;
    private Button mButtonCount;
    private View view1;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonCount = (Button) findViewById(R.id.button_count);
        mShowCount = (TextView) findViewById(R.id.show_count);
        view1 = (View) findViewById(R.id.zero_button);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
        openMainActivity2();
    }
    public void onClick(View view) {
        openMainActivity2();
    }
    public void openMainActivity2() {
        Intent intent = new Intent(this, MainActivity2.class);
        str = (String) mShowCount.getText().toString();
        intent.putExtra("message_key",str);
        startActivity(intent);
    }

    public void countUp(View view) {
        mCount++;
        view1.setBackgroundColor(getResources().getColor(R.color.purple_200));
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        if (mCount % 2 == 0){
            view.setBackgroundColor(getResources().getColor(R.color.purple_200));
        }
        else{
            view.setBackgroundColor(getResources().getColor(R.color.teal_200));
        }
    }

    public void showZero(View view) {
        mShowCount.setText(Integer.toString(mZero));
        mCount = 0;
        view1.setBackgroundColor(getResources().getColor(R.color.black));
        if (mCount % 2 == 0){
            mButtonCount.setBackgroundColor(getResources().getColor(R.color.purple_200));
        }
        else{
            mButtonCount.setBackgroundColor(getResources().getColor(R.color.teal_200));
        }
    }
}