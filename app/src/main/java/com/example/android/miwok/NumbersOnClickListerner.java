package com.example.android.miwok;
import android.view.View;
import android.widget.Toast;

/**
 * Created by DELL STORE on 2/11/2017.
 * unused class presently
 */

public class NumbersOnClickListerner implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), "open the list of numbers", Toast.LENGTH_SHORT).show();

    }
}
