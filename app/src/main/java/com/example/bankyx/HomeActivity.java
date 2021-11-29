package com.example.bankyx;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class HomeActivity extends AppCompatActivity {
    GridView monthly,subs,cards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        iniciarComponentes();
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.card_monthlbudget);
        dialog.show();

    }

    private void iniciarComponentes() {
    monthly = findViewById(R.id.gridviewbufget);
    subs = findViewById(R.id.gridviewsubscriptions);
    cards = findViewById(R.id.gridviewcard);

    }
}