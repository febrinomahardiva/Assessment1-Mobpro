package org.d3if3034.assessment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.widget.Toast
import org.d3if3034.assessment1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener { Masuk() }
    }

    fun Masuk(){
        val username = binding.username.text.toString()

        // mengecek jika inputan kosong
        if(TextUtils.isEmpty(username)){
            Toast.makeText(this, getString(R.string.inputKosong), Toast.LENGTH_LONG).show()
        }

        val password = binding.password.text.toString()

        if(TextUtils.isEmpty(password)){
            Toast.makeText(this, R.string.inputKosong, Toast.LENGTH_LONG).show()
        }

        val fullname = binding.fullname.text.toString()

        if(TextUtils.isEmpty(fullname)){
            Toast.makeText(this, R.string.inputKosong, Toast.LENGTH_LONG).show()
        }

        if (username.equals("Febrino", ignoreCase = true) && password.equals("123", ignoreCase = true)){
            val intent = Intent(this, WelcomeActivity::class.java)
            intent.putExtra("fullname", fullname)
            startActivity(intent)
            this.finish()
        } else {
            Toast.makeText(this, "Username / Password salah!", Toast.LENGTH_LONG).show()
        }
    }
}