package com.examplem.myrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/2/18.
 * 括号里面跟的一定是Mysimpleradapter.MyViewHolder——泛型
 */

public class Mysimpleradapter extends RecyclerView.Adapter<Mysimpleradapter.MyViewHolder>{

    private LayoutInflater minflater;
    private Context context;
    private List<Mystring_class>  mlist;

    public Mysimpleradapter(Context context, List<Mystring_class> list){
        this.context=context;
        minflater = LayoutInflater.from(context);
        mlist = list;
    }
    @Override
    public int getItemCount() {
        return mlist.size();
    }
    /**
     * 创建viewholder
     */
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view=minflater.inflate(R.layout.inflate_item,parent,false);
        MyViewHolder mviewholder=new MyViewHolder(view);

        return mviewholder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv.setText(mlist.get(position).getWenzi_item());
    }



    class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView tv;
        public MyViewHolder(View view)
        {
            super(view);
            tv = (TextView) view.findViewById(R.id.inflate_textview);
        }
    }

}
