package com.example.maulidevelopers.app;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.List;

/**
 * Created by Akash on 14/06/14.
 */
public class ProjectListAdapter extends ArrayAdapter {


    Context context;
    int resource;
    String[] list;

    public ProjectListAdapter(Context context, int resource, String[] list) {
        super(context, resource, list);
        this.list = list;
        this.context = context;
        this.list = list;

    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_row,parent,false);
            TextView textView1 = (TextView) convertView.findViewById(R.id.textView1);
            //TextView textView2 = (TextView) rowView.findViewById(R.id.textView2);
            textView1.setText(list[position]);
        }
        return convertView;
    }
}
