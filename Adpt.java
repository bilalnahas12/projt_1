package com.example.adpt_ex3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adpt extends BaseAdapter {
   private List<Pays> pays;
   private LayoutInflater inflater;
   public Adpt(Context context, List<Pays> p){
       inflater=LayoutInflater.from(context);
       pays=p;
   }

    @Override
    public int getCount() {
        return pays.size();
    }

    @Override
    public Object getItem(int i) {
        return pays.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View vie, ViewGroup viewGroup) {
       View v= vie;
               if (v==null){
                   v=inflater.inflate(R.layout.module_view,null);
               }
               TextView tv=v.findViewById(R.id.textView);
               TextView text=v.findViewById(R.id.textView2);
        ImageView image=v.findViewById(R.id.imageView);
        Pays p=pays.get(i);
        tv.setText(p.getMonnaie());
        text.setText(p.getCode_iso());
        image.setImageResource(p.getName());

        return v;
    }
}
