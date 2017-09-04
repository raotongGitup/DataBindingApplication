package com.example.admin.databindingapplication.bean;

import java.util.List;

/**
 * 作者：created  by jash on 2017/9/1
 * 版本：1.0.0.
 */

public class RootBean {
    private int status;

    private String msg;

    private List<ResultBean> result ;

//    private int count;
//
//    private int begin;
//
//    private int end;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

//    public int getCount() {
//        return count;
//    }
//
//    public void setCount(int count) {
//        this.count = count;
//    }
//
//    public int getBegin() {
//        return begin;
//    }
//
//    public void setBegin(int begin) {
//        this.begin = begin;
//    }
//
//    public int getEnd() {
//        return end;
//    }
//
//    public void setEnd(int end) {
//        this.end = end;
//    }
}
