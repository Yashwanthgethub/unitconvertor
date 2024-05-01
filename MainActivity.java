package com.example.unitconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
//declaring Widgets
    EditText editTextNumber;
    TextView textView3 ,textView2 ,textView4 ,textView5;
    Button button;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Instantiating Widgets
        textView3 = findViewById(R.id.textView3);
        textView2=findViewById(R.id.textView2);
        textView4=findViewById(R.id.textView4);
        textView5=findViewById(R.id.textView5);
        editTextNumber=findViewById(R.id.editTextNumber);
        button = findViewById(R.id.button);
        //adding a click event for button
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Calling ConvertFromKiloToPound Method

                convetFromKiloToPound();


            }
        });

    }

    private void convetFromKiloToPound() {
        //This method will convert the values entered in editText
        //From Kilo to Pounds
        String valueEnteredinKILO=editTextNumber.getText().toString();
        //CONVERTING String to number
        double Kilo=Double.parseDouble(valueEnteredinKILO);
        //converting kilo to pounds
        double pounds =Kilo*2.205;
        //displaying the value
        textView5.setText("");
    }
}