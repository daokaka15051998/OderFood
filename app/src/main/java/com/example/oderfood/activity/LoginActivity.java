package com.example.oderfood.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.oderfood.R;

public class LoginActivity extends AppCompatActivity {

    private EditText edtUserName, edtPassWord;
    private Button btnLogin;
    private CheckBox checkBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUserName = findViewById(R.id.edtUserName);
        edtPassWord = findViewById(R.id.edtPassWord);
        btnLogin = findViewById(R.id.btnLogin);
        checkBox = findViewById(R.id.btnCheckbox);
    }

    public void btnLogin(View view) {
        String userName = "admin";
        String passWord = "admin";
        if (edtUserName.getText().toString().equals(userName)  && edtPassWord.getText().toString().equals(passWord)){
            Toast.makeText(getApplicationContext(), "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(LoginActivity.this,MainActivity.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(getApplicationContext(), "Đăng nhập không thành công", Toast.LENGTH_SHORT).show();
        }
    }
}