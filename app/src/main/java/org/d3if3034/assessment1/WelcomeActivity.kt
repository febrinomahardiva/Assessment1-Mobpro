package org.d3if3034.assessment1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.d3if3034.assessment1.databinding.ActivityWelcomeBinding

class WelcomeActivity: AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //GET INTENT
        val i = this.intent

        //RECEIVE DATA
        val fullname = i.extras!!.getString("fullname")

        binding.tvFullname.text = fullname
    }
}