package com.gonczor.githubsearcher.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;

import com.gonczor.githubsearcher.R;
import com.gonczor.githubsearcher.models.Repo;
import com.gonczor.githubsearcher.rest.ApiInterface;
import com.gonczor.githubsearcher.rest.Client;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.user_toolbar);
        setSupportActionBar(toolbar);

        String user = "gonczor";

        ApiInterface service = Client.getClient().create(ApiInterface.class);

        Call<List<Repo>> repoCall = service.getRepo(user);

        repoCall.enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                Log.d("MainActivity", "SUCCESS!");
            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {
                Log.d("MainActivity", t.toString());
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        Log.i("onCreateOptionsMenu", "Options");
        return true;
    }
}
