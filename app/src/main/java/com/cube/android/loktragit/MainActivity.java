package com.cube.android.loktragit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.cube.android.loktragit.Adapter.RepoAdapter;
import com.cube.android.loktragit.Model.Repo;
import com.cube.android.loktragit.Retrofit.RetroClient;
import com.cube.android.loktragit.Retrofit.RetroInterface;
import com.paginate.Paginate;
import com.paginate.recycler.LoadingListItemCreator;

import java.util.List;

import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager mLayoutManager;
    List<Repo> repos = null;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        fetchData();
    }

    private void fetchData() {
        RetroInterface retroInterface = RetroClient.getClient().create(RetroInterface.class);

        retrofit2.Call<List<Repo>> call = retroInterface.getCommits();
        call.enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(retrofit2.Call<List<Repo>> call, Response<List<Repo>> response) {
                if (response.isSuccessful()){
                    progressBar.setVisibility(View.GONE);
                    repos = response.body();
                    recyclerView.setLayoutManager(mLayoutManager);
                    recyclerView.setItemAnimator(new DefaultItemAnimator());
                    adapter = new RepoAdapter(repos,getApplicationContext());
                    recyclerView.setAdapter(adapter);
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(retrofit2.Call<List<Repo>> call, Throwable t) {

            }
        });
    }
}
