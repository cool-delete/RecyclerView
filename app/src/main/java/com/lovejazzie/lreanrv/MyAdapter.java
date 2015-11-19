package com.lovejazzie.lreanrv;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2015/9/2.
 */
class MyAdapter extends RecyclerView.Adapter {


    class VIewHolder extends RecyclerView.ViewHolder {//这个类受控于tx对象
        private View root;
        private  TextView tv,tvTitle,tvcontent;




/*
                public VIewHolder(TextView itemView) {
                    super(itemView);
                    tv = itemView;//和tx对象绑定了
                }

                public TextView getTv() {返回tv对象

                    return tv;//返回对象
        //        }


              @Override
              public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {根据i传进来的
                 ViewHolder每一个ViewHolder都绑定了tv
                VIewHolder vh = (VIewHolder) viewHolder;先把传进来的ViewHolder通过类型转换成
                 子类VIewHolder,这里父类充当了桥梁的工作ViewHolder
                        vh.getTv().setText(data[i]);
            }
*/




        public VIewHolder(View root) {//用root对象绑定了list_call了"构造函数"
            super(root);//绑定了list_call了
            tvTitle= (TextView) root.findViewById(R.id.tvTitle);//用roo对象
            tvcontent = (TextView) root.findViewById(R.id.tvcontent);
            //第三步
        }



        public TextView getTvTitle() {
            return tvTitle;
        }

        public TextView getTvcontent() {
            return tvcontent;
        }
    }
        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        return new VIewHolder(LayoutInflater.from(viewGroup.getContext()).//匿名调用把布局文件转换成view//第二步
                inflate(R.layout.list_cell, null));//绑定布局文件 在viewGroup的context中
        // 第二个参数是绑定的布局文件 第二个参数是父级容器 为空






            /*
                  return new VIewHolder(new TextView(viewGroup.getContext()));// textview构建在
                  ViewHolder的父容器中 用context代表
            */
    }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {//i是多少就执行方法多少次
                // ViewHolder每一个ViewHolder都绑定了tv
                VIewHolder vh = (VIewHolder) viewHolder;//先把传进来的ViewHolder通过类型转换成
                // 子类VIewHolder,这里父类充当了桥梁的工作
                CellData cd = data[i];//根据下标i把数据传入引用中,
                // CellData类 CellData类会把数据保存到到成员变量.
                // cd只是引用不是对象
                vh.getTvTitle().setText(cd.title);//cd引用调用成员变量
                vh.getTvcontent().setText(cd.content);
        }//第四步

        @Override
        public int getItemCount() {//获取RecyclerView子对象的数量
        return 3;//数字多少 创建的RecyclerView子对象的数量就有多少//第一步 也是最后一步
    }

        private CellData[] data = new CellData[]{
        //创建数组,当读取数组时 会根据下标把数据传到celldata类去
            new CellData("极客学院","IT职业教育"),
            new CellData("新闻","这个新闻真不错"),
            new CellData("新闻","这个新闻真不错")
            };
//    private String[] data = new String[]{"我爱你", "张羡", "想你了", "么么哒"};
}
