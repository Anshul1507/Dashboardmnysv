package com.example.dashboard_mny_sv;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> mAmount = new ArrayList<>();
    private ArrayList<String> mDate = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(Context context, ArrayList<String> mAmount, ArrayList<String> mDate) {
        this.mAmount = mAmount;
        this.mDate = mDate;
        this.mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.payment_history, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder( ViewHolder viewHolder, int i) {
        viewHolder.amountSpent.setText(mAmount.get(i));
        viewHolder.date.setText(mDate.get(i));
    }

    @Override
    public int getItemCount() {
        return mAmount.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        //ImageView appIcon;
        TextView amountSpent;
        TextView date;
        RelativeLayout parentLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            //appIcon = itemView.findViewById(R.id.app_icon);
            amountSpent = itemView.findViewById(R.id.amount);
            date = itemView.findViewById(R.id.date);
            parentLayout = itemView.findViewById(R.id.parent_layout);

        }
    }

}
