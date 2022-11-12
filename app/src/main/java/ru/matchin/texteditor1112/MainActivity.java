package ru.matchin.texteditor1112;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextStyleState currentState = TextStyleState.REGULAR;
    Button buttonRegular;
    Button buttonBold;
    Button buttonItalic;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ctrl+D позволяет копировать строку на которой находится курсор
        buttonRegular = findViewById(R.id.buttonRegular);
        buttonBold = findViewById(R.id.buttonBold);
        buttonItalic = findViewById(R.id.buttonItalic);

        textView = findViewById(R.id.textView);

        buttonRegular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentState = TextStyleState.REGULAR;
                textView.setTypeface(Typeface.DEFAULT);
            }
        });

        buttonBold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentState = TextStyleState.BOLD;
                textView.setTypeface(textView.getTypeface(), Typeface.BOLD);
            }
        });

        buttonItalic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentState = TextStyleState.ITALIC;
                textView.setTypeface(textView.getTypeface(), Typeface.ITALIC);
            }
        });
    }
}