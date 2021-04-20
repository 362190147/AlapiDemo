package top.yumesekai.alapi.data
import com.google.gson.annotations.SerializedName

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

data class Content(
    @SerializedName("content")
    val content: String
)