package com.example.admin.databindingapplication.utils;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.admin.databindingapplication.R;

/**
 * 作者：created  by jash on 2017/9/1
 * 版本：1.0.0.
 */

public class bindingUtils {
    @BindingAdapter("loadUrl")
    public static  void imageLoag(ImageView view,String url){
        Glide.with(view.getContext())
                .load(url)
                .placeholder(R.mipmap.ic_launcher)
                .into(view);
    }
}
