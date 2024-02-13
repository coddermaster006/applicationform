package com.example.applicationform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.viewmodel.CreationExtras;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.EmptyStackException;

public class MainActivity extends AppCompatActivity {

    EditText etname;

    EditText etemail;

    EditText etcode;

    EditText etmobile;

    RadioGroup radioGroup;

    EditText etcountry;

    EditText etzipcode;

    Button btnproceed;

    TextView textview;

    TextView textview1;

    TextView textview2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etname = findViewById(R.id.etname);
        etemail = findViewById(R.id.etemail);
        etcode = findViewById(R.id.etcode);
        etmobile = findViewById(R.id.etmobile);
        radioGroup = findViewById(R.id.radiogroup);
        etcountry = findViewById(R.id.etcountry);
        etzipcode = findViewById(R.id.etzipcode);
        btnproceed = findViewById(R.id.btnproceed);
        textview = findViewById(R.id.textview);
        textview1 = findViewById(R.id.textview1);
        textview2=findViewById(R.id.textview2);
        btnproceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strname  = etname.getText().toString();
                String stremail = etemail.getText().toString();
                String strcode = etcode.getText().toString();
                String mobile =  etmobile.getText().toString();
                String strcountry =etcountry.getText().toString();
                String strzipcode= etzipcode.getText().toString();


                if(strname.isEmpty())
                {
                    etname.setError("Please Enter Name");
                }else if (stremail.isEmpty())
                {
                    etemail.setError("Please Enter Email Id");
                }else if(strcode.isEmpty())
                {
                    etcode.setError("Please Enter Country Code");
                }else if(mobile.isEmpty())
                {
                    etmobile.setError("Please Enter Mobile No.");
                }else if(strcountry.isEmpty())
                {
                    etcountry.setError("Please Enter Country Name");
                }else if(strzipcode.isEmpty())
                {
                    etzipcode.setError("Please Enter Zipcode");
                }
                else
                {


                }

                textview.setText(strname);
                textview1.setText(stremail);
                textview2.setText(mobile);

                int selctedbtnid = radioGroup.getCheckedRadioButtonId();

                if(selctedbtnid==-1)
                {
                    Toast.makeText(MainActivity.this, "Please Select One Option", Toast.LENGTH_SHORT).show();
                }
                else {
                    RadioButton radiobtn = findViewById(selctedbtnid);

                    String gender = radiobtn.getText().toString();
                    Toast.makeText(MainActivity.this,gender, Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}