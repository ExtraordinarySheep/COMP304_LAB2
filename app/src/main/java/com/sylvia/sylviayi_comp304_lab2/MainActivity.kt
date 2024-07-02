package com.sylvia.sylviayi_comp304_lab2


import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val enterButton = findViewById<Button>(R.id.button)
        enterButton.setOnClickListener {
            val intent = Intent(this, PropertyTypeSelectionActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.home_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.apartment -> showHomes("Apartment")
            R.id.detached_home -> showHomes("Detached Home")
            R.id.semi_detached_home -> showHomes("Semi-detached Home")
            R.id.condominium_apartment -> showHomes("Condominium Apartment")
            R.id.town_house -> showHomes("Town House")
            else -> return super.onOptionsItemSelected(item)
        }
        return true
    }

    private fun showHomes(homeType: String) {
        Toast.makeText(this, "Selected: $homeType", Toast.LENGTH_LONG).show()
    }

}
