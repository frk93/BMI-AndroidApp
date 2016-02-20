package com.example.farrukh.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

      final   Button b = (Button) findViewById(R.id.button);
      final   EditText e = (EditText) findViewById(R.id.editText);
      final   EditText e1 = (EditText) findViewById(R.id.editText2);
      final   EditText e2 = (EditText) findViewById(R.id.editText3);
        final   TextView text = (TextView) findViewById(R.id.textView4);
        final  TextView text1 = (TextView) findViewById(R.id.textView5);




        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final  String height = e1.getText().toString();
                final  String weight = e2.getText().toString();


                final float a = Float.parseFloat(height);
                final float c = Float.parseFloat(weight);
                final float ax= (float) (a / 3.2808);
                float bmi = (float) ( c  / ( ax * ax ) );

                text.setText(String.valueOf(bmi));

                if ( bmi < 18.5 )
                    text1.setText(" < 18.5 - Underweight");
                else if( bmi > 18.5 && bmi < 24.9)
                    text1.setText(" 18.5 - 24.9 Normal Weight");
                else if( bmi > 25 && bmi < 29.9)
                    text1.setText(" 25 - 29.9 Overweight ");
                else if( bmi > 30 && bmi < 34.9)
                    text1.setText(" 30 - 34.9 Obese ");
                else if( bmi > 35 && bmi < 38.9)
                    text1.setText(" 35 - 38.9 Very Obese ");
                else
                    text1.setText("above Morbidly Obese");

            }
        });


    }


}
