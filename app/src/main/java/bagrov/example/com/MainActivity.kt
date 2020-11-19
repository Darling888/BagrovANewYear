package bagrov.example.com

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_description.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonNewYear.setOnClickListener {
            val intentImage = Intent(this, Images::class.java)
            startActivity(intentImage)

        }
        buttonAboutNewYear.setOnClickListener {
            val intentAbout = Intent(this, Description::class.java)
            startActivity(intentAbout)
        }
        buttonWHAT.setOnClickListener {
            val toast = Toast.makeText(applicationContext, R.string.textTrap, Toast.LENGTH_LONG)
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
            val toastContainer = toast.view as LinearLayout
            val trapImage = ImageView(this)
            trapImage.setImageResource(R.drawable.trap_image)
            toastContainer.addView(trapImage, 0)
            toastContainer.setBackgroundColor(Color.TRANSPARENT)
            toast.show()
        }
        val animation = AnimationUtils.loadAnimation(this, bagrov.example.com.R.anim.animation_sani_two)
        imageViewSaniTwo.startAnimation(animation)


    }
}
