package com.usergithub.api.api

import com.usergithub.api.data.model.DetailUserResponse
import com.usergithub.api.data.model.User
import com.usergithub.api.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {

    @GET("search/users")
    //@Headers("Authorization: d461904b46815767bec8aaa5ce994a992001ca42")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    //@Headers("Authorization: d461904b46815767bec8aaa5ce994a992001ca42")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    //@Headers("Authorization: d461904b46815767bec8aaa5ce994a992001ca42")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    //@Headers("Authorization: d461904b46815767bec8aaa5ce994a992001ca42")


    fun getFollowing(
        @Path("username") username : String
    ): Call<ArrayList<User>>

}