package com.example.productlist;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class product_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        TextView tvProductDetail = findViewById(R.id.tv_product_detail);

        Product product = (Product) getIntent().getSerializableExtra("product");
        if (product != null) {
            String detail = "Title: " + product.getTitle() + "\n\nDescription: " + product.getDescription();
            tvProductDetail.setText(detail);
        }
    }
}
