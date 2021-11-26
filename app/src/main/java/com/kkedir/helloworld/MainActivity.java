package com.kkedir.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView =((TextView) findViewById(R.id.text));

        //user can tap a button to change the text color of the label
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change the text color of the label
                ((TextView)findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.Orange));
            }
        });

        //user can tap a button to change the background color
        findViewById(R.id.changeBackgroundcolorButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.dark_blue));
            }
        });

        //user can tap a button to change the text string of the label
        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });

        //user can tap on the background view to reset all views to default settings
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //1. Reset the text to "Hello from Korme!" id - @id/text
                textView.setText("Hello from Korme");

                //2. Reset the color of the to original color
                textView.setTextColor(getResources().getColor(R.color.cardview_dark_background));

                //3. Reset the background color
                    // Original background color - R.color.light_burgandy
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.light_burgandy));
            }
        });

        //user can change tap to change the string button to update the label with the text from the field.
        findViewById(R.id.changeCustomText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change the text view to what's  in the edit text view
                String userEnteredText = ((EditText) findViewById(R.id.editText)).getText().toString();

                //if the text field is empty update label with default text string.
                if(userEnteredText.isEmpty()){
                    textView.setText("Enter your own text!");
                }else
                    textView.setText(userEnteredText);
            }
        });


    }
}