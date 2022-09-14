package com.example.useriinputandcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //initialize the checkboxes
    CheckBox rock, pop, hipPop, country, edm;
    String toastMessage = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rock = findViewById(R.id.rock);
        pop = findViewById(R.id.pop);
        hipPop = findViewById(R.id.hip_pop);
        country = findViewById(R.id.country);
        edm = findViewById(R.id.Electronic);

//        this.startToast(findViewById(R.id.toast_btn));
    }

    //add comment + changes
    public void startToast(View view) {
        Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show();
    }

    public void checkBox(View view) {
        boolean checkedBox = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.rock:
                if (checkedBox) {
                    toastMessage += " " + rock.getText().toString() + " and";
                    break;
                }
            case R.id.pop:
                if (checkedBox) {
                    toastMessage += " " + pop.getText().toString() + " and";
                    break;
                }
            case R.id.hip_pop:
                if (checkedBox) {
                    toastMessage += " " + hipPop.getText().toString() + " and";
                    break;
                }
            case R.id.country:
                if (checkedBox) {
                    toastMessage += " " + country.getText().toString() + " and";
                    break;
                }
            case R.id.Electronic:
                if (checkedBox) {
                    toastMessage += " " + edm.getText().toString() + " and";
                    break;
                }
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }
    }
}