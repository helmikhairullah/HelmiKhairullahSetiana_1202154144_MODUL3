package com.example.helmikhairullah.helmikhairullahsetiana_1202154144_modul3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.SpinnerAdapter;

/**
 * Created by Helmi Khairullah on 24/02/2018.
 */

public class Splashscreen extends HelmiKhairullahSetiana_1202154144_Modul3{

    private static int maju_awal = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        new Handler().postDelayed(new Runnable() {

            public void run() {
                Intent a = new Intent(Splashscreen.this, HelmiKhairullahSetiana_1202154144_Modul3.class);
                startActivity(a);
            }
        }, maju_awal);
    }
}
