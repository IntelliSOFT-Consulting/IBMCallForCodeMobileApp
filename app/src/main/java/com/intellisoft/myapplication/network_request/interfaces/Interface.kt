package com.intellisoft.myapplication.network_request.interfaces

import com.intellisoft.myapplication.data_class.ApiResponse
import com.intellisoft.myapplication.data_class.DbBardRequest
import com.intellisoft.myapplication.data_class.DbBardResponse
import com.intellisoft.myapplication.data_class.DbLLM
import com.intellisoft.myapplication.data_class.DbLLMResponse
import com.intellisoft.myapplication.data_class.DbMessagesData
import com.intellisoft.myapplication.data_class.DbProfile
import com.intellisoft.myapplication.data_class.DbSignIn
import com.intellisoft.myapplication.data_class.DbSignUp
import com.intellisoft.myapplication.data_class.DbSignUpResponse
import com.intellisoft.myapplication.data_class.DbUpdateMetadata
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*


interface Interface {


    @POST("api/authentication/register")
    suspend fun signUpUser(@Body dbSignUp: DbSignUp):
            Response<DbSignUpResponse>

    @POST("api/authentication/login")
    suspend fun signInUser(
        @Header("Authorization") token: String, // Add this line to pass the Bearer Token
        @Body dbSignIn: DbSignIn):
            Response<DbSignUpResponse>

    @POST("api/authentication/updateProfile")
    suspend fun updateUserData(
        @Header("Authorization") token: String, // Add this line to pass the Bearer Token
        @Body dbProfile: DbProfile
    ): Response<Any>

    @POST("api/authentication/reset")
    suspend fun resetPassword(
        @Header("Authorization") token: String, // Add this line to pass the Bearer Token
        @Field("username") username: String,
        @Field("password") password: String
    ): Response<Any>


    @PUT("api/llm/updateMetaData/{phoneNumber}")
    suspend fun updateMetaData(
        @Header("Authorization") token: String, // Add this line to pass the Bearer Token
        @Body dbUpdateMetadata: DbUpdateMetadata,
        @Path("phoneNumber") phoneNumber: String,
    ): Response<Any>


    @POST("ibm/watson/invoke")
    suspend fun requestLLMChat(
        @Body dbLLM: DbMessagesData
    ): Response<ApiResponse>

    @POST("api/llm/askGoogle")
    suspend fun requestLLMChatBard(
        @Header("Authorization") token: String, // Add this line to pass the Bearer Token
        @Body dbBardRequest: DbBardRequest
    ): Response<DbBardResponse>



}