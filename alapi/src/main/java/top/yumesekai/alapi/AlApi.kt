package top.yumesekai.alapi

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import top.yumesekai.alapi.data.*

/**
 * 接口文档https://www.alapi.net/
 */
interface AlApi {
    /**
     * 舔狗日记
     */
    @FormUrlEncoded
    @POST("https://v1.alapi.cn/api/dog")
    suspend fun getDogDiary(@Field("format") format:String ="json"): AlHttp<Content>


    /**
     * 一言
     */
    @FormUrlEncoded
    @POST("https://v1.alapi.cn/api/hitokoto")
    suspend fun getHitokoto( @Field("type") type:String ="json",@Field("format") format:String ="json"): AlHttp<Hitokoto>

    /**
     * 土味情话
     */
    @FormUrlEncoded
    @POST("https://v2.alapi.cn/api/qinghua")
    suspend fun getQinghua( @Field("format") format:String ="json"): AlHttp<Content>


    /**
     * 毒鸡汤
     */
    @FormUrlEncoded
    @POST("https://v2.alapi.cn/api/soul")
    suspend fun getSoul(@Field("format") format:String ="json"): AlHttp<Content>

    /**
     * typeid
     * 1——爱情 2——道德 3——青春 4——愿望 5——集体 6——理想 7——志向
     * 8——人才 9——谦虚 10——人格 11——天才 12——青年 13——社会
     * 14——国家 15——财富 16——智慧 17——修养 18——工作 19——妇女
     * 20——儿童 21——思想 22——理智 23——学习 24——科学 25——信仰
     * 26——诚信 27——读书 28——成败 29——奉献 30——劳动 31——节约
     * 32——教育 33——企业 34——事业 35——时间 36——勤奋 37——民族
     * 38——真理 39——友谊 40——自由 41——心理 42——心灵 43——人生 44——幸福 45——团结
     */
    @FormUrlEncoded
    @POST("https://v1.alapi.cn/api/hitokoto")
    suspend fun getMingYan(@Field("type") type:String ="json",@Field("format") format:String ="json"): AlHttp<MingYan>

}