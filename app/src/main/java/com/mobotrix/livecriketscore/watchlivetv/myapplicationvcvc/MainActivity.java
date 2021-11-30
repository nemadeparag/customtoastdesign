package com.mobotrix.livecriketscore.watchlivetv.myapplicationvcvc;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import paragnemade.customtoastmsg.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int i = Color.parseColor("#53CD89");
        Toaster.txtlayouttoast2(this,"This is Toast Message","#FF0000",i );
    }
}