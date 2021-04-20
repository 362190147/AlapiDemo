package top.yumesekai.alapi

import com.google.gson.Gson
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class AlApi(){
    val api:Api

    init {
        val client = OkHttpClient.Builder()
                .build()
        var retrofit = Retrofit.Builder()
                .baseUrl("https://v1.alapi.cn/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        api = retrofit.create(Api::class.java);
    }

    companion object{
        val instance by lazy {
            AlApi()
        }
    }
}