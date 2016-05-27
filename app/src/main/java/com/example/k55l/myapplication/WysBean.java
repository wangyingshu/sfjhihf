package com.example.k55l.myapplication;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by K55L on 2016/5/26.
 */

public class WysBean {
    private String date;
    private String xinqing;
    private String tianqi;
    private String neirong;

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong;
    }

    public String getDate() {
        return date;
    }
    public void setDate(long currentTime ) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年-MM月dd日-HH时mm分ss秒");
        Date date = new Date(currentTime);
        String time = simpleDateFormat.format(date);
        this.date = time;
    }
    public String getTianqi() {
        return tianqi;
    }
    public void setTianqi(String tianqi) {
        this.tianqi = tianqi;
    }
    public String getXinqing() {
        return xinqing;
    }
    public void setXinqing(String xinqing) {
        this.xinqing = xinqing;
    }
}
