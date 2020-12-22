package com.nadhotel.activities;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.nadhotel.R;
import com.nadhotel.model.ModelHotel;

public class DetailHotelActivity extends AppCompatActivity  {

    Toolbar tbDetailHotel;
    TextView txtNameHotel, txtAddressHotel, txtPhoneHotel;
    String NameHotel, AddressHotel, PhoneHotel;
    ModelHotel modelHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hotel);

        tbDetailHotel = findViewById(R.id.tbDetailHotel);
        tbDetailHotel.setTitle("Detail Hotel");
        setSupportActionBar(tbDetailHotel);
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        modelHotel = (ModelHotel) getIntent().getSerializableExtra("detailHotel");
        if (modelHotel != null) {

            //get String
            NameHotel = modelHotel.getTxtNamaHotel();
            AddressHotel = modelHotel.getTxtAlamatHotel();
            PhoneHotel = modelHotel.getTxtNoTelp();

            //set Id
            txtNameHotel = findViewById(R.id.tvNamaHotel);
            txtAddressHotel = findViewById(R.id.tvAddressHotel);
            txtPhoneHotel = findViewById(R.id.tvPhoneHotel);

            //show String to Text
            txtNameHotel.setText(NameHotel);
            txtAddressHotel.setText(AddressHotel);
            txtPhoneHotel.setText(PhoneHotel);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
