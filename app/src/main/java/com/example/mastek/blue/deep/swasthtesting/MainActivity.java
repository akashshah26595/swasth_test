package com.example.mastek.blue.deep.swasthtesting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
    Button btnLogin;
    Intent intent;
    Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button beginFeedbackButton = (Button) findViewById(R.id.beginFeedbackButton);
        beginFeedbackButton.setOnClickListener(this);
        btnLogin = (Button)findViewById(R.id.btnStartLogin);
        btnRegister = (Button)findViewById(R.id.btnStartRegister);
        btnLogin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        String response = getIntent().getStringExtra("response");
        Toast.makeText(getApplicationContext(),"Welcome.... " + response, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        int x = v.getId();
        switch(x)
        {
            case R.id.btnStartLogin:
                 intent = new Intent(this, Login.class);
                startActivity(intent);
                finish();
                break;
            case R.id.btnStartRegister:
                 intent = new Intent(this, Register.class);
                startActivity(intent);
                finish();
                break;
            case R.id.beginFeedbackButton:
                 intent = new Intent(this, FeedbackActivity.class);
                startActivity(intent);
                finish();
                break;
        }

    }
}
