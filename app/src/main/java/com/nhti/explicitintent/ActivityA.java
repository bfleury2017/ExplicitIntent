package com.nhti.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityA extends AppCompatActivity {

    private static final int request_code = 5;


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
        startActivityForResult(intent, request_code);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if ((requestCode == request_code) && (resultCode == RESULT_OK)) {
            TextView textView1 = (TextView) findViewById(R.id.textView1);

            String returnString = data.getExtras().getString("returnData");
            textView1.setText(returnString);
        }
    }
}
