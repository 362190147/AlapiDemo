package top.yumesekai.alapidemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import top.yumesekai.alapidemo.ui.login.LoginActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //startActivity( Intent(this,LoginActivity::class.java)  )
        startActivity( Intent(this,SettingsActivity::class.java)  )
    }
}