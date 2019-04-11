package com.example.eva2_2_contactos;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {
    Intent inCont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickCont(View v) {
        String sUri = "content://contacts/people";
        inCont = new Intent(Intent.ACTION_VIEW, Uri.parse(sUri));
        startActivity(inCont);
    }

    public void onClickVerCont(View v) {
        String sUri = ContactsContract.Contacts.CONTENT_URI + "/3";
        inCont = new Intent(Intent.ACTION_EDIT, Uri.parse(sUri));
        startActivity(inCont);
    }
}
