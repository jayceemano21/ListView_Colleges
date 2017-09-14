package com.example.jcmano.listview_colleges.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.jcmano.listview_colleges.R;

public class MainActivity extends AppCompatActivity {
    String[] colleges;
    ListView lv_Colleges;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colleges = getResources().getStringArray(R.array.Colleges);
        lv_Colleges = (ListView) findViewById(R.id.lvColleges);
        adapter = new ArrayAdapter<String>(this, R.layout.row_layout, colleges);
        lv_Colleges.setAdapter(adapter);

        lv_Colleges.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String msg = "You clicked" + colleges;
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
