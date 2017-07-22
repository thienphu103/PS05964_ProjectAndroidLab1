package com.example.a.lab1;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public EditText txt;
    public Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClick();
    }
    public void OnClick() {
        txt = (EditText) findViewById(R.id.txtName);
        btn = (Button) findViewById(R.id.btnB);
        txt.setHint("Name");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=txt.getText().toString();
                Toast.makeText(MainActivity.this, "Hello My Name Is "+name, Toast.LENGTH_LONG).show();
        }
        });
    }

}