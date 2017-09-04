package com.example.admin.databindingapplication;

import com.example.admin.databindingapplication.bean.RootBean;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * 作者：created  by jash on 2017/9/1
 * 版本：1.0.0.
 */

public interface ServiceInterface {
       @GET("http://search.shouji.baofeng.com/channel.php?type=1&sort=c&offset=0&limit=24&style=0&area=0&year=0&pay=1&dtg=7&platf=android&mtype=lowend&g=37&ver=6.2.03&td=0&s=774FAE85E48B0F699B419687E40C4C14674CBB9C")
       Call<RootBean>  getpust();
}
