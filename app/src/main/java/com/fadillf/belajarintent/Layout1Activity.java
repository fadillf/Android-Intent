package com.fadillf.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Layout1Activity extends AppCompatActivity implements View.OnClickListener {
    Button btnMenu;
    Button btnLayout2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout1);

        btnMenu = (Button) findViewById(R.id.btn_menu);
        btnMenu.setOnClickListener(this);

        btnLayout2 = (Button) findViewById(R.id.btn_layout2);
        btnLayout2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_menu:
                Intent menu = new Intent(Layout1Activity.this, MenuLatihanActivity.class);
                startActivity(menu);
                break;

            case R.id.btn_layout2:
                Intent layout2 = new Intent(Layout1Activity.this, Layout2Activity.class);
                startActivity(layout2);
                break;
            default:
                break;
        }
    }

}