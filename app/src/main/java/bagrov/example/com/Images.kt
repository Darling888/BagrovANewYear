package bagrov.example.com

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_description.*
import kotlinx.android.synthetic.main.activity_images.*

class Images : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_images)
        buttonMainTwo.setOnClickListener {
            val intentMainActivity = Intent(this, MainActivity::class.java)
            startActivity(intentMainActivity)
        }
        val animation = AnimationUtils.loadAnimation(this, bagrov.example.com.R.anim.animation_sani_three)
        imageViewSaniThree.startAnimation(animation)
    }
}
