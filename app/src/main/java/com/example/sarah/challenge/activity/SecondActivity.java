package com.example.sarah.challenge.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sarah.challenge.R;
import com.example.sarah.challenge.adapter.ItemsAdapter;
import com.example.sarah.challenge.model.Items;
import com.example.sarah.challenge.model.ItemsList;
import com.example.sarah.challenge.network.GetItemsDataService;
import com.example.sarah.challenge.network.RetrofitInstance;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class SecondActivity extends AppCompatActivity {
        private ItemsAdapter adapter;
        private RecyclerView recyclerView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);

            /*Create handle for the RetrofitInstance interface*/
            GetItemsDataService service = RetrofitInstance.getRetrofitInstance().create(GetItemsDataService.class);

            /*Call the method with parameter in the interface to get the repo data*/
            Call<ItemsList> call = service.getItemsData("search","stars","desc");

            /*Log the URL called*/
            Log.wtf("URL Called", call.request().url() + "");

            call.enqueue(new Callback<ItemsList>() {
                @Override
                public void onResponse(Call<ItemsList> call, Response<ItemsList> response) {
                    generateItemsList(response.body().getItemsArrayList());
                }

                @Override
                public void onFailure(Call<ItemsList> call, Throwable t) {
                    Toast.makeText(SecondActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
                }
            });
        }

        /*Method to generate List of repos using RecyclerView with custom adapter*/
        private void generateItemsList(ArrayList<Items> ItmDataList) {
            recyclerView = (RecyclerView) findViewById(R.id.listView);

            adapter = new ItemsAdapter(ItmDataList);

            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(SecondActivity.this);

            recyclerView.setLayoutManager(layoutManager);

            recyclerView.setAdapter(adapter);
        }
    }