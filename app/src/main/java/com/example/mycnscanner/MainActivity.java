package com.example.mycnscanner;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
ImageView img;
Button btnbd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=(ImageView) findViewById(R.id.imglogo);
        btnbd=(Button) findViewById(R.id.btnbd);
        evenClick();
    }
    private void evenClick() {
        btnbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent1 = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent1);
            }
        });
    }
}
