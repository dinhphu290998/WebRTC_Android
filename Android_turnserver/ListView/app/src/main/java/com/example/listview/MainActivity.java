package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.listview.Adapter.ListViewAdapter;
import com.example.listview.Model.Student;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ListViewAdapter listViewAdapter;
    private ArrayList<Student> students;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        students = new ArrayList<Student>();
        students.add(new Student(String.valueOf(R.drawable.ic_launcher_background),"Heleleeelleell","243424324"));

        listView = findViewById(R.id.idListView);
        listViewAdapter = new ListViewAdapter(this,students);

        listView.setAdapter(listViewAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, ""+position, Toast.LENGTH_LONG).show();
            }
        });
    }
}
