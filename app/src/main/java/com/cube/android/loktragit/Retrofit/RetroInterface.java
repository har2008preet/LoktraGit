package com.cube.android.loktragit.Retrofit;

import com.cube.android.loktragit.Model.Repo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by abc on 02-05-2017.
 */

public interface RetroInterface {
    @GET("/repos/rails/rails/commits")
    Call<List<Repo>> getCommits();
}
