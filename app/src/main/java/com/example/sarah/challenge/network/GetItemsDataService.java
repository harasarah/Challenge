package com.example.sarah.challenge.network;

import com.example.sarah.challenge.model.ItemsList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetItemsDataService {
    @GET("https://api.github.com/search/repositories?q=created:%3E2017-10-22&sort=stars&order=desc")
    Call<ItemsList> getItemsData(@Query("page") int page );
}
