package com.blogsetyaaji.retrofithttplibrary.Rest;

import com.blogsetyaaji.retrofithttplibrary.Model.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by AJISETYA on 8/26/2016.
 */
public interface ApiInterface {
    @GET("movie/top_rated")
    Call<MovieResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<MovieResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}
