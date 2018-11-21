package com.example.sarah.challenge;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private Button Login;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etPassword);
        Login = (Button)findViewById(R.id.btnLogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });

    }
    private void validate(String username, String userPassword)
    {
        if((username.equals("Admin")) && (userPassword.equals("Admin")))
        {
            Toast toast;
            Context context = getApplicationContext();
            String message = "You're connected";
            toast = Toast.makeText(context,message,Toast.LENGTH_SHORT);
            toast.show();
        }else{
            counter--;
            if(counter == 0)
            {
                Login.setEnabled(false);
            }
        }
    }
}