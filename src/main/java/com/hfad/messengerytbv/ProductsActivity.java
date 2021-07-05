package com.hfad.messengerytbv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductsActivity extends AppCompatActivity {

    public static final String ProductNo = "productno";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        int productno = (Integer) getIntent().getExtras().get(ProductNo);
        Products product = Products.allproducts[productno];

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(product.getImageResourceId());
        photo.setContentDescription(product.getDescription());

        TextView name = (TextView) findViewById(R.id.name);
        name.setText(product.getName());

        TextView description = (TextView) findViewById(R.id.description);
        description.setText(product.getDescription());

        TextView bulletPoints = (TextView) findViewById(R.id.bulletPoints);
        bulletPoints.setText(product.getBullet());


    }
}