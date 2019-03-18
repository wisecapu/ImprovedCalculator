package com.example.calculatormichael;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText EditText1;
    EditText EditText2;
    TextView Results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Adding   (View view){
        EditText EditText1 = (EditText)findViewById(R.id.EditText1);
        EditText EditText2 = (EditText)findViewById(R.id.EditText2);
        TextView Results = (TextView)findViewById(R.id.Results);

        // converting va;ues

        double FirstNumber = Float.parseFloat(EditText1.getText().toString());
        double SecondNumber = Float.parseFloat(EditText2.getText().toString());
        double Outcome = FirstNumber + SecondNumber;
        Results.setText(Outcome + "");



    }


    public void Minus (View view){
        EditText EditText1 = (EditText)findViewById(R.id.EditText1);
        EditText EditText2 = (EditText)findViewById(R.id.EditText2);
        TextView Results = (TextView)findViewById(R.id.Results);

        // converting va;ues

        double FirstNumber = Float.parseFloat(EditText1.getText().toString());
        double SecondNumber = Float.parseFloat(EditText2.getText().toString());
        double Outcome = FirstNumber - SecondNumber;
        Results.setText(Outcome + "");


        Results.setText(Outcome + "");



    }

    public void Multiplication ( View view){
        EditText EditText1 = (EditText)findViewById(R.id.EditText1);
        EditText EditText2 = (EditText)findViewById(R.id.EditText2);
        TextView Results = (TextView)findViewById(R.id.Results);

        // converting va;ues

        double FirstNumber = Float.parseFloat(EditText1.getText().toString());
        double SecondNumber = Float.parseFloat(EditText2.getText().toString());
        double Outcome = FirstNumber * SecondNumber;
        Results.setText(Outcome + "");

        Results.setText(Outcome + "");



    }



    public void Divide (View view){
        EditText EditText1 = (EditText)findViewById(R.id.EditText1);
        EditText EditText2 = (EditText)findViewById(R.id.EditText2);
        TextView Results = (TextView)findViewById(R.id.Results);

        // converting va;ues

        double FirstNumber = Float.parseFloat(EditText1.getText().toString());
        double SecondNumber = Float.parseFloat(EditText2.getText().toString());
        double Outcome = FirstNumber / SecondNumber;
        Results.setText(Outcome + "");

        Results.setText(Outcome + "");





    }
}