package com.example.sarah.challenge.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.sarah.challenge.model.Items;
import com.example.sarah.challenge.R;
import java.util.ArrayList;



public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder> {

    private ArrayList<Items> dataList;

    public ItemsAdapter(ArrayList<Items> dataList) {
        this.dataList = dataList;
    }

    @Override
    public ItemsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.custom_layout, parent, false);
        return new ItemsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemsViewHolder holder, int position) {
        holder.repo.setText(dataList.get(position).getName());
        holder.description.setText(dataList.get(position).getDescription());
        holder.username.setText(dataList.get(position).getLogin());
        holder.stars.setText(dataList.get(position).getStargazers_count());

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    class ItemsViewHolder extends RecyclerView.ViewHolder {

        TextView repo, description, stars, username ;

        ItemsViewHolder(View itemView) {
            super(itemView);
            repo = (TextView) itemView.findViewById(R.id.textView_repo_name);
            description = (TextView) itemView.findViewById(R.id.textView_description);
            stars = (TextView) itemView.findViewById(R.id.textView_stars);
            username = (TextView) itemView.findViewById(R.id.textView_username);

        }
    }
}