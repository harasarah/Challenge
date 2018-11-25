package com.example.sarah.challenge;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ItemsList {
    @SerializedName("ItemsList")
    private ArrayList<Items> itemsList;

    public ArrayList<Items> getItemsArrayList() {
        return itemsList;
    }

    public void setItemsArrayList(ArrayList<Items> itemsArrayList) {
        this.itemsList = itemsArrayList;
    }
}
