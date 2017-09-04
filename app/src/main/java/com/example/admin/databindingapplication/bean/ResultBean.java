package com.example.admin.databindingapplication.bean;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.example.admin.databindingapplication.activity.Main2Activity;

import static android.R.attr.id;

/**
 * 作者：created  by jash on 2017/9/1
 * 版本：1.0.0.
 */

public class ResultBean {
//    private int id;
//
//    private int total;
//
//    private int clicks;
//
//    private int finish;
//
//    private int year;
//
    private String update_time;

//
//    private int mid;
//
//    private int is_pay;
//
//    private int only_album;
//
//    private int status;
//
//    private int seqs_count_a;
//
//    private int seqs_count_i;
//
//    private int seqs_count_w;
//
//    private int pgcer_id;
//
//    private int score;
//
//    private int dt_sort;

    private String title;

//    private String subtitle;
//
//    private String type;
//
//    private String actors;
//
//    private String videos_is_pay;

//    private List<String> directors_name ;
//
//    private List<String> actors_name ;
//
//    private List<String> styles_name ;
//
//    private List<String> areas_name ;

    private String cover_url;

//    private String cover_sqr;
//
//    private String cover_h_url;
//
//    private String has;
//
//    private List<String> sites ;
//
//    private String duration;
//
//    private String last_seq;



    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getTotal() {
//        return total;
//    }
//
//    public void setTotal(int total) {
//        this.total = total;
//    }
//
//    public int getClicks() {
//        return clicks;
//    }
//
//    public void setClicks(int clicks) {
//        this.clicks = clicks;
//    }
//
//    public int getFinish() {
//        return finish;
//    }
//
//    public void setFinish(int finish) {
//        this.finish = finish;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public String getUpdate_time() {
//        return update_time;
//    }
//
//    public void setUpdate_time(String update_time) {
//        this.update_time = update_time;
//    }
//
//    public int getMid() {
//        return mid;
//    }
//
//    public void setMid(int mid) {
//        this.mid = mid;
//    }
//
//    public int getIs_pay() {
//        return is_pay;
//    }
//
//    public void setIs_pay(int is_pay) {
//        this.is_pay = is_pay;
//    }
//
//    public int getOnly_album() {
//        return only_album;
//    }
//
//    public void setOnly_album(int only_album) {
//        this.only_album = only_album;
//    }
//
//    public int getStatus() {
//        return status;
//    }
//
//    public void setStatus(int status) {
//        this.status = status;
//    }
//
//    public int getSeqs_count_a() {
//        return seqs_count_a;
//    }
//
//    public void setSeqs_count_a(int seqs_count_a) {
//        this.seqs_count_a = seqs_count_a;
//    }
//
//    public int getSeqs_count_i() {
//        return seqs_count_i;
//    }
//
//    public void setSeqs_count_i(int seqs_count_i) {
//        this.seqs_count_i = seqs_count_i;
//    }
//
//    public int getSeqs_count_w() {
//        return seqs_count_w;
//    }
//
//    public void setSeqs_count_w(int seqs_count_w) {
//        this.seqs_count_w = seqs_count_w;
//    }
//
//    public int getPgcer_id() {
//        return pgcer_id;
//    }
//
//    public void setPgcer_id(int pgcer_id) {
//        this.pgcer_id = pgcer_id;
//    }
//
//    public int getScore() {
//        return score;
//    }
//
//    public void setScore(int score) {
//        this.score = score;
//    }
//
//    public int getDt_sort() {
//        return dt_sort;
//    }
//
//    public void setDt_sort(int dt_sort) {
//        this.dt_sort = dt_sort;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getSubtitle() {
//        return subtitle;
//    }
//
//    public void setSubtitle(String subtitle) {
//        this.subtitle = subtitle;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public String getActors() {
//        return actors;
//    }
//
//    public void setActors(String actors) {
//        this.actors = actors;
//    }
//
//    public String getVideos_is_pay() {
//        return videos_is_pay;
//    }
//
//    public void setVideos_is_pay(String videos_is_pay) {
//        this.videos_is_pay = videos_is_pay;
//    }
//
////    public List<String> getDirectors_name() {
////        return directors_name;
////    }
////
////    public void setDirectors_name(List<String> directors_name) {
////        this.directors_name = directors_name;
////    }
////
////    public List<String> getActors_name() {
////        return actors_name;
////    }
////
////    public void setActors_name(List<String> actors_name) {
////        this.actors_name = actors_name;
////    }
////
////    public List<String> getStyles_name() {
////        return styles_name;
////    }
////
////    public void setStyles_name(List<String> styles_name) {
////        this.styles_name = styles_name;
////    }
////
////    public List<String> getAreas_name() {
////        return areas_name;
////    }
////
////    public void setAreas_name(List<String> areas_name) {
////        this.areas_name = areas_name;
////    }
//
//    public String getCover_url() {
//        return cover_url;
//    }
//
//    public void setCover_url(String cover_url) {
//        this.cover_url = cover_url;
//    }
//
//    public String getCover_sqr() {
//        return cover_sqr;
//    }
//
//    public void setCover_sqr(String cover_sqr) {
//        this.cover_sqr = cover_sqr;
//    }
//
//    public String getCover_h_url() {
//        return cover_h_url;
//    }
//
//    public void setCover_h_url(String cover_h_url) {
//        this.cover_h_url = cover_h_url;
//    }
//
//    public String getHas() {
//        return has;
//    }
//
//    public void setHas(String has) {
//        this.has = has;
//    }
//
//    public List<String> getSites() {
//        return sites;
//    }
//
//    public void setSites(List<String> sites) {
//        this.sites = sites;
//    }
//
//    public String getDuration() {
//        return duration;
//    }
//
//    public void setDuration(String duration) {
//        this.duration = duration;
//    }
//
//    public String getLast_seq() {
//        return last_seq;
//    }
//
//    public void setLast_seq(String last_seq) {
//        this.last_seq = last_seq;
//    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCover_url() {
        return cover_url;
    }

    public void setCover_url(String cover_url) {
        this.cover_url = cover_url;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }
    public void getOnclick(Context context){
        Intent intent=new Intent(context, Main2Activity.class);
        intent.putExtra("title",title);
        context.startActivity(intent);
        Toast.makeText(context, title, Toast.LENGTH_SHORT).show();

    }
}
