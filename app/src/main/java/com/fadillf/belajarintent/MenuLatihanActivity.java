package com.fadillf.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuLatihanActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLayout1;
    Button btnLayout2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_latihan);


        btnLayout1 = (Button) findViewById(R.id.btn_layout1);
        btnLayout1.setOnClickListener(this);

        btnLayout2 = (Button) findViewById(R.id.btn_layout2);
        btnLayout2.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_layout1:
                Intent layout1 = new Intent(MenuLatihanActivity.this, Layout1Activity.class);
                startActivity(layout1);
                break;
            case R.id.btn_layout2:
                Intent layout2 = new Intent(MenuLatihanActivity.this, Layout2Activity.class);
                startActivity(layout2);
                break;
            default:
                break;
        }
    }
}