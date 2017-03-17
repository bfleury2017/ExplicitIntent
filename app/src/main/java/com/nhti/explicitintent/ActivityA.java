package com.nhti.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, ActivityB.class);

        final EditText editText1 = (EditText) findViewById(R.id.editText1);
        String myString = editText1.getText().toString();
        intent.putExtra("qString", myString);
        startActivity(intent);
    }
}
