package com.nhti.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Bundle extras = getIntent().getExtras();

        if (extras == null) {
            return;
        }

        String qString = extras.getString("qString");

        final TextView textView = (TextView) findViewById(R.id.textView1);
        textView.setText(qString);
    }


}
