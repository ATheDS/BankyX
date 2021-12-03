package com.example.bankyx;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MontlyAdapter extends BaseAdapter {
    Context context;
    int layout;
    public MontlyAdapter(Context context,int layout){
        this.layout = layout;
        this.context = context;

    }


    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(layout,viewGroup,false);
        return view;
    }
}