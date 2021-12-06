package com.example.bankyx;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters

    GridView monthly,subs,cards;
    FloatingActionButton addTransaction;
    ImageButton notification;
    ImageView user;
    TabLayout tabLayout;
    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            iniciarComponentes();
            startActivity(new Intent(getActivity(),GraphActivity.class));

            addTransaction.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Dialog dialog = new Dialog(getActivity());
                    final Dialog mBottomSheetDialog = new Dialog(getActivity(), R.style.MaterialDialogSheet);
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
                    startActivity(new Intent(getActivity(),NotificationsActivity.class));
                }
            });
            user.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(getActivity(),ProfileActivity.class));
                }
            });
            monthly.setAdapter(new MontlyAdapter(getActivity(),R.layout.card_monthlbudget));
            cards.setAdapter(new MontlyAdapter(getActivity(),R.layout.credit_card));
            subs.setAdapter(new MontlyAdapter(getActivity(),R.layout.card_monthlbudget));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
    private void iniciarComponentes() {
        monthly = getActivity().findViewById(R.id.gridviewbufget);
        subs = getActivity().findViewById(R.id.gridviewsubscriptions);
        cards = getActivity().findViewById(R.id.gridviewcard);
        addTransaction = getActivity().findViewById(R.id.add_transaction);
        notification = getActivity().findViewById(R.id.btn_notification);
        user = getActivity().findViewById(R.id.userimage);
        tabLayout = getActivity().findViewById(R.id.tabLayout);
}}