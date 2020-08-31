package com.fadillf.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Layout2Activity extends AppCompatActivity implements View.OnClickListener{

    Button btnMenu;
    Button btnLayout1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2);

        btnMenu = (Button) findViewById(R.id.btn_menu);
        btnMenu.setOnClickListener(this);

        btnLayout1 = (Button) findViewById(R.id.btn_layout1);
        btnLayout1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_menu:
                Intent menu = new Intent(Layout2Activity.this, MenuLatihanActivity.class);
                startActivity(menu);
                break;

            case R.id.btn_layout1:
                Intent layout1 = new Intent(Layout2Activity.this, Layout1Activity.class);
                startActivity(layout1);
                break;
            default:
                break;
        }
    }
}