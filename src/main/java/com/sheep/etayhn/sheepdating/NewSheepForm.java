package com.sheep.etayhn.sheepdating;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;


public class NewSheepForm extends ActionBarActivity implements TextWatcher, View.OnClickListener {

    private EditText et_sheep_name;
    private EditText et_sheep_age;
    private RadioGroup rg_color;
    private Button b_insert;
    private Button b_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_sheep_form);

        et_sheep_name = (EditText) findViewById(R.id.et_sheep_name);
        et_sheep_name.addTextChangedListener(this);

        et_sheep_age = (EditText) findViewById(R.id.et_sheep_age);
        et_sheep_age.addTextChangedListener(this);

        rg_color = (RadioGroup) findViewById(R.id.rg_sheep_color);

        b_insert = (Button) findViewById(R.id.b_insert);
        b_insert.setOnClickListener(this);

        b_view = (Button) findViewById(R.id.b_view);
        b_view.setOnClickListener(this);
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_new_sheep_form, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    private void enableOrDisableInsertButton() {

        String name = et_sheep_name.getText().toString().trim();

        int age = 0;
        try {
            age = Integer.parseInt(et_sheep_age.getText().toString());
        } catch (NumberFormatException e) {}

        Log.d("MY_TAG", "name: " + name + ", age: " + age);

        boolean desiredState = age > 0 && !name.isEmpty();
        b_insert.setEnabled(desiredState);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        enableOrDisableInsertButton();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.b_insert) {

        } else if (v.getId() == R.id.b_view) {

        }
    }
}
