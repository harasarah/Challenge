package com.example.sarah.challenge.network;

import com.example.sarah.challenge.model.ItemsList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetItemsDataService {
    @GET("repositories")
    Call<ItemsList> getItemsData(@Query("q") String q ,@Query("sort") String sort ,@Query("order") String order);
}


