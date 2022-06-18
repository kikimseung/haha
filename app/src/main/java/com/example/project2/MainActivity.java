package com.example.project2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment1 fragment1 = new Fragment1();
                transaction.replace(R.id.framelayout,fragment1);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment2 fragment2 = new Fragment2();
                transaction.replace(R.id.framelayout,fragment2);
                transaction.addToBackStack(null);
                transaction.commit();

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment3 fragment3 = new Fragment3();
                transaction.replace(R.id.framelayout,fragment3);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                Fragment4 fragment4 = new Fragment4();
                transaction.replace(R.id.framelayout,fragment4);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
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
}