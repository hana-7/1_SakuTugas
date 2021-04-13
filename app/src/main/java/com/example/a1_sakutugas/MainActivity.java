package com.example.a1_sakutugas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonTugasBaru, buttonListTugas, buttonTugasSelesai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTugasBaru = findViewById(R.id.buttonTugasBaru);
        buttonListTugas = findViewById(R.id.buttonListTugas);
        buttonTugasSelesai = findViewById(R.id.buttonTugasSelesai);

//        buttonTugasBaru.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentManager fm = getSupportFragmentManager();
//                FragmentTransaction ft = fm.beginTransaction();
//                ft.replace(R.id.container, new MenuFragment());
//                ft.commit();
//
//            }
//        });

        buttonListTugas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.fragment_list_tugas);
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.container, new ListTugasFragment());
                ft.commit();

            }
        });

//        buttonTugasSelesai.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FragmentManager fm = getSupportFragmentManager();
//                FragmentTransaction ft = fm.beginTransaction();
//                ft.replace(R.id.container, new ListTugasFragment());
//                ft.commit();
//
//            }
//        });
    }
}