package com.example.nimishbongale.sickprofinal;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    EditText a1i,a1ii,a2,a3,a4,a5,a6,a7,a8;
    String A1i,A1ii,A2,A3,A4,A5,A6,A7,A8,msg="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        a1i = findViewById(R.id.a1i);
        a1ii = findViewById(R.id.a1ii);
        a2 = findViewById(R.id.a2);
        a3 = findViewById(R.id.a3);
        a4 = findViewById(R.id.a4);
        a5 = findViewById(R.id.a5);
        a6 = findViewById(R.id.a6);
        a7 = findViewById(R.id.a7);
        a8 = findViewById(R.id.a8);
        Button s = findViewById(R.id.submit);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg="";
                A1i = a1i.getText().toString();
                A1ii = a1ii.getText().toString();
                A2 = a2.getText().toString();
                A3 = a3.getText().toString();
                A4 = a4.getText().toString();
                A5 = a5.getText().toString();
                A6 = a6.getText().toString();
                A7 = a7.getText().toString();
                A8 = a8.getText().toString();
                if (!(A1i.isEmpty() || A1ii.isEmpty() || A2.isEmpty() || A3.isEmpty() || A4.isEmpty() || A5.isEmpty() || A6.isEmpty() || A7.isEmpty() || A8.isEmpty())) {
                    if ((A4.charAt(0)) == 'n' || (A4.charAt(0)) == 'N') {
                        msg += "Please Exercise Regularly\n";
                    } else if ((A4.charAt(0)) == 'Y' || (A4.charAt(0)) == 'y') {
                        msg += "Please keep continuing to Exercise Regularly\n";
                    }
                    if ((A5.charAt(0)) == 'n' || (A5.charAt(0)) == 'N') {
                        msg += "Reduce or try to avoid smoking/alcohol consumption\n";
                    } else if ((A5.charAt(0)) == 'Y' || (A5.charAt(0)) == 'y') {
                        msg += "Please don't get into the habit of smoking or consuming Alcohol\n";
                    }
                    msg+="\nAnd most importantly, follow a healthy diet and your doctor's advice";
                    showMessage("Small Suggestion", msg);
                } else {
                    Toast.makeText(ThirdActivity.this, "Please fill in all the fields", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public void showMessage(String title,String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setCancelable(true);
        builder.show();
    }
}
