package com.example.dashboard_mny_sv;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class HomeFragment extends Fragment {
    private final ArrayList<String> mAmount = new ArrayList<>();
    private final ArrayList<String> mDate = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.home_fragment, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);

        mAmount.add("Amount spent : Rs. 659.20");
        mDate.add("On March 31st, 2019");
        mAmount.add("Amount spent : Rs. 2645.90");
        mDate.add("On March 29th, 2019");
        mAmount.add("Amount spent : Rs. 500.00");
        mDate.add("On March 29th, 2019");
        mAmount.add("Amount spent : Rs. 100.50");
        mDate.add("On March 29th, 2019");
        mAmount.add("Amount spent : Rs. 29.20");
        mDate.add("On March 28th, 2019");
        mAmount.add("Amount spent : Rs. 5902.68");
        mDate.add("On March 28th, 2019");
         RecyclerViewAdapter adapter = new RecyclerViewAdapter(HomeFragment.this.getActivity(),mAmount,mDate);
        final LinearLayoutManager lm = new LinearLayoutManager(HomeFragment.this.getActivity());

        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(adapter);
    }
}
