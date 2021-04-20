package top.yumesekai.alapi

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import top.yumesekai.alapi.data.AlHttp
import top.yumesekai.alapi.data.Content

interface Api {
    /**
     * 舔狗日记
     */
    @FormUrlEncoded
    @POST("https://v1.alapi.cn/api/dog")
    suspend fun getDogDiary(@Field("token") token:String, @Field("format") format:String ="json"): AlHttp<Content>

    /**
     * 一言
     */
    @FormUrlEncoded
    @POST("https://v1.alapi.cn/api/hitokoto")
    suspend fun getHitokoto(@Field("token") token:String, @Field("format") format:String ="json"): AlHttp<Content>
}