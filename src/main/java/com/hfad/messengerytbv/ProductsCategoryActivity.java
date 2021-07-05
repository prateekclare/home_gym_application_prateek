package com.hfad.messengerytbv;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ProductsCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listDrinks = getListView();

        ArrayAdapter<Products> listAdapter = new ArrayAdapter<Products>(
            this, android.R.layout.simple_list_item_1, Products.allproducts);
        listDrinks.setAdapter(listAdapter); }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        Intent intent = new Intent(ProductsCategoryActivity.this, ProductsActivity.class);
        intent.putExtra(ProductsActivity.ProductNo, (int) id);

        startActivity(intent);

    }
}
