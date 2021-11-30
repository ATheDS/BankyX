package com.example.bankyx;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity {
    GridView monthly,subs,cards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        iniciarComponentes();
        Dialog dialog = new Dialog(this);
        final Dialog mBottomSheetDialog = new Dialog(this, R.style.MaterialDialogSheet);
        mBottomSheetDialog.setContentView(R.layout.popup_addtransaction); // your custom view.
        mBottomSheetDialog.setCancelable(true);
        mBottomSheetDialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        mBottomSheetDialog.getWindow().setGravity(Gravity.BOTTOM);
        mBottomSheetDialog.show();

    }

    private void iniciarComponentes() {
    monthly = findViewById(R.id.gridviewbufget);
    subs = findViewById(R.id.gridviewsubscriptions);
    cards = findViewById(R.id.gridviewcard);

    }
}