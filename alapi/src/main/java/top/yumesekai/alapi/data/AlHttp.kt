package top.yumesekai.alapi.data
import com.google.gson.annotations.SerializedName
import sun.util.resources.cldr.es.CalendarData_es_PY

/**
 * Aiapi 公用部分
 */
data class AlHttp<T>(
    @SerializedName("code")
    val code: Int,
    @SerializedName("data")
    val `data`: T,
    @SerializedName("log_id")
    val logId: Long,
    @SerializedName("msg")
    val msg: String,
    @SerializedName("time")
    val time: Int
)

/**
 * 舔狗日记，毒鸡汤 data
 */
data class Content(
    @SerializedName("content")
    val content: String
)

/**
 * 一言 data
 */
data class Hitokoto(
    val id:Int,
    val hitokoto:String,
    val type:String,
    val creator:String,
    val from:String //出处
)

/**
 * 名人名言
 */
data class MingYan(val content: String,val author:String, val typeid:Int)