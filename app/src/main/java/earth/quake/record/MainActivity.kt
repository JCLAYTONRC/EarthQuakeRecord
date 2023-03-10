package earth.quake.record

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val screenSplash = installSplashScreen()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        screenSplash.setKeepOnScreenCondition {true}
        val intent = Intent(this, CreateUserActivity::class.java)
        startActivity(intent)
        finish()
    }
}