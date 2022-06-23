package com.e.mobilestore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MyAdapter extends BaseAdapter
{
  Context con;
  Integer[] img;
  String[] name,price;
  LayoutInflater li;

    public MyAdapter(Context con, Integer[] img, String[] name, String[] price) {
        this.con = con;
        this.img = img;
        this.name = name;
        this.price = price;
        li=LayoutInflater.from(con);
    }

    public int getCount() {
        return img.length;
    }

    public Object getItem(int i) {
        return img;
    }

    public long getItemId(int i) {
        return i;
    }
 ImageView civ;
    TextView chead,cprice;
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v=li.inflate(R.layout.clist,null);
        civ=v.findViewById(R.id.civ);
        chead=v.findViewById(R.id.chead);
        cprice=v.findViewById(R.id.cprice);
        civ.setImageResource(img[i]);
        chead.setText(name[i]);
        cprice.setText(price[i]);
        civ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(con, ""+name[i], Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }
}
