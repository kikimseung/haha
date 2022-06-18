package com.example.project2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class tab1 extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friends);

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