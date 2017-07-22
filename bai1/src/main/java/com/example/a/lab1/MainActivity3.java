package com.example.a.lab1;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {

    public ImageButton btn_in;
    public ImageButton btn_out;
    public ImageView img;
    int hei=170;
    int wid=215;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        OnClick();
    }

    public void OnClick() {
        btn_in = (ImageButton) findViewById(R.id.btn_img_in);
        btn_out =(ImageButton) findViewById(R.id.btn_img_out);
        img =(ImageView) findViewById(R.id.img_car);
        btn_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hei=hei+50;
                wid=wid+50;

                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(hei,wid);
                img.setLayoutParams(layoutParams);
            }
        });
        btn_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hei=hei-50;
                wid=wid-50;
                ConstraintLayout.LayoutParams layoutParams  = new ConstraintLayout.LayoutParams(hei,wid);
                img.setLayoutParams(layoutParams);
            }
        });

    }

}
