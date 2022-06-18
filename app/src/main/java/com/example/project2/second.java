package com.example.project2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class second extends AppCompatActivity {

    Button btnmember,btnboard;
    androidx.appcompat.widget.Toolbar toolbar;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondmain);

        btnmember=(Button)findViewById(R.id.btnmember);
        btnboard=(Button)findViewById(R.id.btnboard);
        toolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.second_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnmember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(getApplicationContext(),member.class);
                startActivity(intent5);
                return;
            }

        });
        //이 부분때문에 게시판 안넘어가짐
//        btnboard.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent5 = new Intent(getApplicationContext(),board.class);
//                startActivity(intent5);
//                return;
//            }
//
//        });

        BottomNavigationView bottomNavigationView= findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.tab1:
                        Toast.makeText(getApplicationContext(), "친구 목록 선택", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(getApplicationContext(),tab1.class);
                        startActivity(intent);
                        return true;
                    case R.id.tab2:
                        Toast.makeText(getApplicationContext(), "채팅창 선택", Toast.LENGTH_LONG).show();
                        Intent intent2 = new Intent(getApplicationContext(),tab2.class);
                        startActivity(intent2);
                        return true;
                    case R.id.tab3:
                        Toast.makeText(getApplicationContext(), "공지사항 선택", Toast.LENGTH_LONG).show();
                        Intent intent3 = new Intent(getApplicationContext(),tab3.class);
                        startActivity(intent3);
                        return true;
                    case R.id.tab4:
                        Toast.makeText(getApplicationContext(), "내 정보 선택", Toast.LENGTH_LONG).show();
                        Intent intent4 = new Intent(getApplicationContext(),tab4.class);
                        startActivity(intent4);
                        return true;
                }
                return false;
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                Intent intent = new Intent(second.this,MainActivity.class);
                startActivity(intent);
                return true;

        }
        return super.onOptionsItemSelected(item);

    }


}