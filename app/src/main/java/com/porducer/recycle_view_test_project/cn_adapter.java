package com.porducer.recycle_view_test_project;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class cn_adapter extends RecyclerView.Adapter<cn_adapter.ViewHolder>  {
    private String[] this_data_set;
    public cn_adapter(String[] data_set) {
        this_data_set = data_set;
    }


    @NonNull
    @Override   //Method to create and tell where is the recycler view to bind
    public cn_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cn_surf_layout, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override   //Method to set information into binded view
    public void onBindViewHolder(@NonNull cn_adapter.ViewHolder viewHolder, int i) {
        viewHolder.getTextView1().setText(this_data_set[i] + " " + i);
    }

    @Override
    public int getItemCount() {
        return this_data_set.length;
    }
    // Class for tell which view in view holder to bind
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView1;


        public ViewHolder(View v) {
            super(v);
            textView1 = (TextView) v.findViewById(R.id.textView_of_recyclerView);
        }

        public TextView getTextView1() {
            return textView1;
        }
    }
}
