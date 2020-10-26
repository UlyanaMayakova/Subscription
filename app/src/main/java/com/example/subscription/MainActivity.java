package com.example.subscription;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView output = findViewById(R.id.outputText);
        Button okButton = findViewById(R.id.okButton);
        Button cancelButton = findViewById(R.id.cancelButton);
        final EditText name = findViewById(R.id.userNameInsert);
        final EditText email = findViewById(R.id.emailInsert);


        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String userName = name.getText().toString();
                final String userEmail = email.getText().toString();
                String outputText = "Подписка на рассылку успешно оформлена для пользователя "
                        + userName + " на электронный адрес " + userEmail;
                output.setText(outputText);
            }
        });

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setText(null);
                email.setText(null);
                output.setText(null);
            }
        });
    }
}