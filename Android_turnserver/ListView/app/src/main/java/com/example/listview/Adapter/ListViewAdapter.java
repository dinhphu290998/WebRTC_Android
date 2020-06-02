package com.example.listview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listview.Model.Student;
import com.example.listview.R;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter
{

    private Context context;
    private ArrayList<Student> students;
    public ListViewAdapter(Context context,ArrayList<Student> students) {
        this.context = context;
        this.students = students;
    }
    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Object getItem(int position) {
        return students.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView;
        ImageView img;
        TextView textViewName;
        TextView textViewClass;

        if (convertView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.item_listview,parent,false);
            img = itemView.findViewById(R.id.imageProfile);
            textViewName = itemView.findViewById(R.id.tvName);
            textViewClass = itemView.findViewById(R.id.tvClassName);

            Student student = students.get(position);
            if (student != null) {
                img.setImageResource(Integer.parseInt(student.getUrlImage()));
                textViewName.setText(student.getName());
                textViewClass.setText(student.getNameClass());
            }
            return itemView;
        } else {
            return null;
        }
    }
}
