package edu.mssu.cis385.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView theShowCount;
    private TextView receiver_msg;
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        theShowCount = (TextView) findViewById(R.id.show_count);
        receiver_msg = (TextView) findViewById(R.id.showCount2);
        String message = intent.getStringExtra("message_key");
        receiver_msg.setText(message);

    }


}