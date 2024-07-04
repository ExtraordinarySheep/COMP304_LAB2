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
            R.id.apartment -> navigateTo(ApartmentActivity::class.java)
            R.id.detached_home -> navigateTo(DetachedHomeActivity::class.java)
            R.id.semi_detached_home -> navigateTo(SemiDetachedHomeActivity::class.java)
            R.id.condominium_apartment -> navigateTo(CondoActivity::class.java)
            R.id.town_house -> navigateTo(TownhouseActivity::class.java)
            R.id.checkout -> navigateTo(CheckoutActivity::class.java)
            R.id.homepage -> navigateTo(MainActivity::class.java)
            else -> return super.onOptionsItemSelected(item)
        }
        return true
    }

    private fun navigateTo(activityClass: Class<*>) {
        val intent = Intent(this, activityClass)
        startActivity(intent)
    }
}
