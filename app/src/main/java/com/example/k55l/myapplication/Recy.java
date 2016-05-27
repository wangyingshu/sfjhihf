package com.example.k55l.myapplication;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by K55L on 2016/5/21.
 */

public class Recy extends RecyclerView.Adapter<Recy.MyViewHolder> {

    private ArrayList<String> list = new ArrayList<String>();
    Context context;

    public Recy(Context context) {
        this.context = context;
        for (int i = 0; i < 200; i++) {
            list.add(i + "");
        }
    }

    public Recy.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

      Recy.MyViewHolder recy = new Recy.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.main, parent, false));
        return recy;
    }

    @Override
    public void onBindViewHolder(final Recy.MyViewHolder holder,final int position) {
        holder.date.setText(list.get(position));
        holder.tianqi.setText(list.get(position));
        holder.xinqing.setText(list.get(position));
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(holder.relativeLayout,position+"",Snackbar.LENGTH_LONG).show();
            }
});
        }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView date;
        TextView tianqi;
        TextView xinqing;
        RelativeLayout relativeLayout;
        public MyViewHolder(View itemView) {
            super(itemView);
            date = (TextView) itemView.findViewById(R.id.date);
            tianqi = (TextView) itemView.findViewById(R.id.tianqi);
            xinqing = (TextView) itemView.findViewById(R.id.xingqing);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.item_main);
        }
    }
}
