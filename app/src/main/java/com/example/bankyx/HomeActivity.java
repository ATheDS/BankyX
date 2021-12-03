package com.example.bankyx;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeActivity extends AppCompatActivity {
    GridView monthly,subs,cards;
    FloatingActionButton addTransaction;
    ImageButton notification;
    ImageView user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        iniciarComponentes();

        addTransaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(HomeActivity.this);
                final Dialog mBottomSheetDialog = new Dialog(HomeActivity.this, R.style.MaterialDialogSheet);
                mBottomSheetDialog.setContentView(R.layout.popup_addtransaction); // your custom view.
                mBottomSheetDialog.setCancelable(true);
                mBottomSheetDialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                mBottomSheetDialog.getWindow().setGravity(Gravity.BOTTOM);
                mBottomSheetDialog.show();

            }
        });
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,NotificationsActivity.class));
            }
        });
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,ProfileActivity.class));
            }
        });
    monthly.setAdapter(new MontlyAdapter(this,R.layout.card_monthlbudget));
    cards.setAdapter(new MontlyAdapter(this,R.layout.credit_card));
    subs.setAdapter(new MontlyAdapter(this,R.layout.card_monthlbudget));

    }

    private void iniciarComponentes() {
    monthly = findViewById(R.id.gridviewbufget);
    subs = findViewById(R.id.gridviewsubscriptions);
    cards = findViewById(R.id.gridviewcard);
    addTransaction = findViewById(R.id.add_transaction);
    notification = findViewById(R.id.btn_notification);
    user = findViewById(R.id.userimage);

    }
}