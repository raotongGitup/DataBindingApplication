package com.example.admin.databindingapplication.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.admin.databindingapplication.BR;
import com.example.admin.databindingapplication.R;
import com.example.admin.databindingapplication.adapter.CommentRecyclerAdapter;
import com.example.admin.databindingapplication.application.MyApplication;
import com.example.admin.databindingapplication.bean.ResultBean;
import com.example.admin.databindingapplication.bean.RootBean;
import com.example.admin.databindingapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity implements Callback<RootBean> {
    private ActivityMainBinding binding;
    private MyApplication application;
    private CommentRecyclerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding= DataBindingUtil.setContentView(this, R.layout.activity_main);
       application= (MyApplication) getApplication();
        downLoad();
    }
    private void downLoad() {
        application.getAnInterface().getpust().enqueue(this);
        Map<Class<?>,Pair<Integer,Integer>> map= new HashMap<>();
        map.put(null,Pair.create(R.layout.recyclerview_item,BR.item ));
        adapter=new CommentRecyclerAdapter<ResultBean>(MainActivity.this,new ArrayList<ResultBean>(),map);
        binding.recyclerview.setAdapter(adapter);

    }

    @Override
    public void onResponse(Call<RootBean> call, Response<RootBean> response) {
        RootBean bean=response.body();
        if(bean.getStatus()==1){
            for (int i = 0; i < bean.getResult().size(); i++) {
                adapter.add(bean.getResult().get(i));
            }
           }

    }

    @Override
    public void onFailure(Call<RootBean> call, Throwable t) {
        t.getMessage();
        Toast.makeText(this, t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();

    }
}
