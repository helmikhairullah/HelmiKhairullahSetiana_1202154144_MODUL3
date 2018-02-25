package com.example.helmikhairullah.helmikhairullahsetiana_1202154144_modul3;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Helmi Khairullah on 25/02/2018.
 */
public class masuk extends AppCompatActivity {
    EditText username;
    EditText password;
    String tugas1, tugas2;


    //mendeklarasikan fungsi button agar bisa di klik ketika ada username dan password

    public void loginfirst(View view){

        username = (EditText) findViewById(R.id.textUsername);
        password = (EditText) findViewById(R.id.textPassword);
        tugas1 = username.getText().toString();
        tugas2 = password.getText().toString();

        //kondisi ketika memasukkan suatu hasil dari username dan password
        if ((tugas1.contains("EAD"))&&((tugas2.contains("MOBILE")))){
            Toast.makeText(this, "kamu berhasil login", Toast.LENGTH_SHORT ).show();
           //Intent masuk = new Intent(HelmiKhairullahSetiana_1202154144_Modul3.this, merk.class);
            //startActivity(masuk);
        }

        // konsidi ketika username dan password tidak di isi
        else if ((tugas1.matches("")||tugas2.matches(""))){
            Toast.makeText(this, "username dan password tidak boleh kosong", Toast.LENGTH_SHORT).show();
        }

        //ketika username dan password salah
        else {
            Toast.makeText(this, "username dan password yang anda masukkan salah",Toast.LENGTH_SHORT).show();
        }

    }
}


