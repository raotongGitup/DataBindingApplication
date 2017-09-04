package com.example.admin.databindingapplication.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.admin.databindingapplication.R;
import com.example.admin.databindingapplication.databinding.ActivityMain2Binding;

public class Main2Activity extends AppCompatActivity {
    private ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      binding= DataBindingUtil.setContentView(this,R.layout.activity_main2);
        Intent intent=getIntent();
        binding.textview.setText(intent.getStringExtra("title"));
    }
}
