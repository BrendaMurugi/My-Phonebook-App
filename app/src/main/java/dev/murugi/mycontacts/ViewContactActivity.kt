package dev.murugi.mycontacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.squareup.picasso.Picasso
import dev.murugi.mycontacts.databinding.ActivityViewContactBinding

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        val extras = intent.extras
//        val name = extras?.getString("NAME", "")
//        var email = extras?.getString("EMAIL", "")
//        val intent = Intent()
        val name = extras?.getString("NAME", "name")
        val email = extras?.getString("EMAIL","email")
        val location = extras?.getString("LOCATION","location")
        val phone = extras?.getString("PHONE","phone")
        val image = extras?.getString("IMAGE","")

        binding.tvNameOpen.text = name
        binding.tvEmailOpen.text = email
        binding.tvLocationOpen.text = location
        binding.tvPhoneOpen.text = phone



        Picasso.get()
            .load(image)
            .resize(300,300)
            .centerCrop()
            .into(binding.ivContactOpen)




        Toast.makeText(this, " $email", Toast.LENGTH_LONG).show()
    }
}