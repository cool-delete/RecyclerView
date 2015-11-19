package com.lovejazzie.lreanrv;

/**
 * Created by Administrator on 2015/9/2.
 */
public class CellData {
    public CellData(String title,String content){//一开始就会把数据都都存进来成员变量中 有多个成员变量接受这些数据
    // 由下标i逐个访问
        this.title=title;
        this.content=content;
    }
    public String title ="title";
    public String content="content";
}
