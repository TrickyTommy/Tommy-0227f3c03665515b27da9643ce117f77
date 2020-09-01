package com.example.androidtest;



import retrofit2.http.GET;
import retrofit2.Call;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("register.php")
    Call<User> performRegistration(@Query("username") String username, @Query("password") String password);

    @GET("login.php")
    Call<User> performUserLogin(@Query("username") String username, @Query("password") String password);
}
