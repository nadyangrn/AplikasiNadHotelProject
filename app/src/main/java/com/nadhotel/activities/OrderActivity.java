package com.nadhotel.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nadhotel.R;

public class OrderActivity extends AppCompatActivity {
    Toolbar tbOrderHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        tbOrderHotel = findViewById(R.id.tbDetailHotel);
        tbOrderHotel.setTitle("Reservasi Hotel");
        setSupportActionBar(tbOrderHotel);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
    }

}