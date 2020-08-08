package com.cdac.qrcodescanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
    }

    private void initComponents(){
        findViewById(R.id.buttonScanBarcode).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
                startActivity(new Intent(this,ScannerBarcodeActivity.class));

    }
}