
package com.examplem.myrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

import static android.support.v7.widget.DividerItemDecoration.*;

public class MainActivity extends AppCompatActivity {

     RecyclerView  recyclerView;
     List<Mystring_class> mdatas;   //集合存放的实体类
     Mysimpleradapter madapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initdatas();
    }

    private void initdatas() {
        mdatas = new ArrayList();
        mdatas.add(new Mystring_class("A"+""));
        mdatas.add(new Mystring_class("B"+""));
        mdatas.add(new Mystring_class("C"+""));
        mdatas.add(new Mystring_class("D"+""));
        mdatas.add(new Mystring_class("E"+""));
        mdatas.add(new Mystring_class("F"+""));
        mdatas.add(new Mystring_class("G"+""));
        mdatas.add(new Mystring_class("H"+""));
        mdatas.add(new Mystring_class("I"+""));
        mdatas.add(new Mystring_class("J"+""));
        mdatas.add(new Mystring_class("K"+""));
        mdatas.add(new Mystring_class("A"+""));
        mdatas.add(new Mystring_class("B"+""));
        mdatas.add(new Mystring_class("C"+""));
        mdatas.add(new Mystring_class("D"+""));
        mdatas.add(new Mystring_class("E"+""));
        mdatas.add(new Mystring_class("F"+""));
        mdatas.add(new Mystring_class("G"+""));
        mdatas.add(new Mystring_class("H"+""));
        mdatas.add(new Mystring_class("I"+""));
        mdatas.add(new Mystring_class("J"+""));
        mdatas.add(new Mystring_class("K"+""));
        mdatas.add(new Mystring_class("A"+""));
        mdatas.add(new Mystring_class("B"+""));
        mdatas.add(new Mystring_class("C"+""));
        mdatas.add(new Mystring_class("D"+""));
        mdatas.add(new Mystring_class("E"+""));
        mdatas.add(new Mystring_class("F"+""));
        mdatas.add(new Mystring_class("G"+""));
        mdatas.add(new Mystring_class("H"+""));
        mdatas.add(new Mystring_class("I"+""));
        mdatas.add(new Mystring_class("J"+""));
        mdatas.add(new Mystring_class("K"+""));
        mdatas.add(new Mystring_class("A"+""));
        mdatas.add(new Mystring_class("B"+""));
        mdatas.add(new Mystring_class("C"+""));
        mdatas.add(new Mystring_class("D"+""));
        mdatas.add(new Mystring_class("E"+""));
        mdatas.add(new Mystring_class("F"+""));
        mdatas.add(new Mystring_class("G"+""));
        mdatas.add(new Mystring_class("H"+""));
        mdatas.add(new Mystring_class("I"+""));
        mdatas.add(new Mystring_class("J"+""));
        mdatas.add(new Mystring_class("K"+""));
        mdatas.add(new Mystring_class("A"+""));
        mdatas.add(new Mystring_class("B"+""));
        mdatas.add(new Mystring_class("C"+""));
        mdatas.add(new Mystring_class("D"+""));
        mdatas.add(new Mystring_class("E"+""));
        mdatas.add(new Mystring_class("F"+""));
        mdatas.add(new Mystring_class("G"+""));
        mdatas.add(new Mystring_class("H"+""));
        mdatas.add(new Mystring_class("I"+""));
        mdatas.add(new Mystring_class("J"+""));
        mdatas.add(new Mystring_class("K"+""));
        mdatas.add(new Mystring_class("A"+""));
        mdatas.add(new Mystring_class("B"+""));
        mdatas.add(new Mystring_class("C"+""));
        mdatas.add(new Mystring_class("D"+""));
        mdatas.add(new Mystring_class("E"+""));
        mdatas.add(new Mystring_class("F"+""));
        mdatas.add(new Mystring_class("G"+""));
        mdatas.add(new Mystring_class("H"+""));
        mdatas.add(new Mystring_class("I"+""));
        mdatas.add(new Mystring_class("J"+""));
        mdatas.add(new Mystring_class("K"+""));
        mdatas.add(new Mystring_class("A"+""));
        mdatas.add(new Mystring_class("B"+""));
        mdatas.add(new Mystring_class("C"+""));
        mdatas.add(new Mystring_class("D"+""));
        mdatas.add(new Mystring_class("E"+""));
        mdatas.add(new Mystring_class("F"+""));
        mdatas.add(new Mystring_class("G"+""));
        mdatas.add(new Mystring_class("H"+""));
        mdatas.add(new Mystring_class("I"+""));
        mdatas.add(new Mystring_class("J"+""));
        mdatas.add(new Mystring_class("K"+""));
        mdatas.add(new Mystring_class("A"+""));
        mdatas.add(new Mystring_class("B"+""));
        mdatas.add(new Mystring_class("C"+""));
        mdatas.add(new Mystring_class("D"+""));
        mdatas.add(new Mystring_class("E"+""));
        mdatas.add(new Mystring_class("F"+""));
        mdatas.add(new Mystring_class("G"+""));
        mdatas.add(new Mystring_class("H"+""));
        mdatas.add(new Mystring_class("I"+""));
        mdatas.add(new Mystring_class("J"+""));
        madapter = new Mysimpleradapter(this, mdatas);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview_main);
        recyclerView.setLayoutManager(new GridLayoutManager(this,4));//每行的个数


        recyclerView.addItemDecoration(new MyDividerItemDecoration(this,VERTICAL));
        recyclerView.addItemDecoration(new MyDividerItemDecoration(this,HORIZONTAL));
        recyclerView.setAdapter(madapter);
    }


}
