package com.example.adpt_ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView mListView;
    List<Pays> pays;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pays= new ArrayList<>();
        pays.add(new Pays(R.drawable.drap,"Pound","PP"));
        pays.add(new Pays(R.drawable.download,"Afghani","AFN"));
        pays.add(new Pays(R.drawable.oip,"Riyal saoudien","SAR"));
        mListView=findViewById(R.id.lv);
        Adpt a=new Adpt(this,pays);
        mListView.setAdapter(a);

    }
}