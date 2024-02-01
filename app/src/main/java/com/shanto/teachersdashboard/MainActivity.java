package com.shanto.teachersdashboard;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.shanto.teachersdashboard.Adapter.ClassListAdapter;
import com.shanto.teachersdashboard.realm.Class_Names;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        Button aten = findViewById(R.id.stList);
        aten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goTo = new Intent(MainActivity.this,Attendance.class);
                startActivity(goTo);
            }
        });

        Button schedule = findViewById(R.id.class_schedule);
        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToNotifier = new Intent(MainActivity.this,Notification.class);
                startActivity(goToNotifier);
            }
        });


        Button abouts = findViewById(R.id.abouts);
        abouts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goToAbout = new Intent(MainActivity.this,About.class);
                startActivity(goToAbout);
            }
        });
    }
}