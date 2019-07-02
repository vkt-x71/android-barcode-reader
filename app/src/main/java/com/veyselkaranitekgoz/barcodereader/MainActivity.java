package com.veyselkaranitekgoz.barcodereader;

import android.content.Intent;
import android.os.strictmode.IntentReceiverLeakedViolation;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            Intent intn = new Intent(this,ScanActivity.class);
            startActivity(intn);
        }
        catch (Exception ex) {
            Toast.makeText(this, "hata : " + ex.getMessage(), Toast.LENGTH_LONG).show();
        }

    }
}
