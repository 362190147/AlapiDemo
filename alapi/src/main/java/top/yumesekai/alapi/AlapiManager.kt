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
class AlapiManager(){
    val api: AlApi
    init {
        val client = OkHttpClient.Builder()
            //统一添加token
            .addInterceptor(Interceptor { chain ->
                val original: Request = chain.request()
                // Request customization: add request headers
                val requestBuilder: Request.Builder = original.newBuilder()
                    .addHeader("token", token)
                val request: Request = requestBuilder.build()
                chain.proceed(request)
            })
            .build()

        var retrofit = Retrofit.Builder()
                .baseUrl("https://v1.alapi.cn/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        api = retrofit.create(AlApi::class.java);
    }

    companion object{
        private var token = ""
        fun init(token:String){
            this.token = token;
        }
        val instance by lazy {
            AlapiManager()
        }
    }
}