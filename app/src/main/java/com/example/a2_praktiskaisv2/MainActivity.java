package com.example.a2_praktiskaisv2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToSecond(View v) {
        Intent myIntent = new Intent(this, MainActivity2.class);
        startActivity(myIntent);
        Log.d("My", "Go to 2nd");
    }

    public void openDialog(View v) {

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        String[] NameArr = new String[]{"Roberts Bišs", "Bernhards Bergholds", "Kristaps Kārlis Cīrulis"};
        final List<String> NameList = Arrays.asList(NameArr);

        builder.setTitle(R.string.dialog_title);

        builder.setMultiChoiceItems(NameArr, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialoginterface, int which, boolean isChecked) {
                String currentItem = NameList.get(which);
                if(isChecked) {
                    Toast.makeText(MainActivity.this, currentItem+" is checked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, currentItem+" is unchecked", Toast.LENGTH_SHORT).show();
                }


            }


        });
        builder.setNegativeButton(R.string.close, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Toast.makeText(MainActivity.this, "You closed dialog", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNeutralButton(R.string.ok, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Toast.makeText(MainActivity.this, "You clicked OK", Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
        Log.d("My", "Dialog opened");
    }
}