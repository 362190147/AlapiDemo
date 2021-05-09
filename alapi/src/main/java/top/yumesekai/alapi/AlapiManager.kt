package top.yumesekai.alapi

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.IOException

/**
 *
 */
class AlapiManager( var token:String){
    val api: AlApi
    init {
        val builder = OkHttpClient.Builder()
        //统一添加token
        builder.interceptors().add(Interceptor { chain ->
            val original: Request = chain.request()
            // Request customization: add request headers
            val requestBuilder: Request.Builder = original.newBuilder()
                    .addHeader("token", token)
            val request: Request = requestBuilder.build()
            chain.proceed(request)
        })
        var retrofit = Retrofit.Builder()
                .baseUrl("https://v1.alapi.cn/")
                .client(builder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        api = retrofit.create(AlApi::class.java);
    }

    companion object{
        val instance by lazy {
            AlapiManager( "MXIusDFLSd7F4evvlTTY")
        }
    }
}