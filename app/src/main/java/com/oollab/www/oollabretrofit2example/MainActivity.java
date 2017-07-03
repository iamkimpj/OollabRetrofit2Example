package com.oollab.www.oollabretrofit2example;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.oollab.www.oollabretrofit2example.Http.Conn;
import com.oollab.www.oollabretrofit2example.Http.Schema.TestSchema;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Call<TestSchema> call = Conn.ready().api().connTest();
        call.enqueue(new Callback<TestSchema>() {
            @Override
            public void onResponse(Call<TestSchema> call, Response<TestSchema> response) {
                if (response.isSuccessful()) {

                    TestSchema test = response.body();

                    test.test();
                } else {
                    Log.d("test","failed to get respose");
                }
            }

            @Override
            public void onFailure(Call<TestSchema> call, Throwable t) {
                Log.d("test","failed to connect");
            }

        });



        super.onCreate(savedInstanceState);

    }



}
