package com.sylvia.sylviayi_comp304_lab2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity

class PropertyTypeSelectionActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.property_type_selection)

        val checkBoxApartment = findViewById<CheckBox>(R.id.checkBoxApartment)
        val checkBoxDetachedHome = findViewById<CheckBox>(R.id.checkBoxDetachedHome)
        val checkBoxSemiDetachedHome = findViewById<CheckBox>(R.id.checkBoxSemiDetachedHome)
        val checkBoxCondo = findViewById<CheckBox>(R.id.checkBoxCondo)
        val checkBoxTownHouse = findViewById<CheckBox>(R.id.checkBoxTownHouse)
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)

        buttonSubmit.setOnClickListener {
            when {
                checkBoxApartment.isChecked -> navigateToHomeType("Apartment")
                checkBoxDetachedHome.isChecked -> navigateToHomeType("Detached Home")
                checkBoxSemiDetachedHome.isChecked -> navigateToHomeType("Semi-detached Home")
                checkBoxCondo.isChecked -> navigateToHomeType("Condominium Apartment")
                checkBoxTownHouse.isChecked -> navigateToHomeType("Town House")
                else -> return@setOnClickListener
            }
        }
    }

    private fun navigateToHomeType(homeType: String) {
        val intent = when (homeType) {
            "Apartment" -> Intent(this, ApartmentActivity::class.java)
           // "Detached Home" -> Intent(this, DetachedHomeActivity::class.java)
          //  "Semi-detached Home" -> Intent(this, SemiDetachedHomeActivity::class.java)
          //  "Condominium Apartment" -> Intent(this, CondoActivity::class.java)
          //  "Town House" -> Intent(this, TownHouseActivity::class.java)
            else -> throw IllegalArgumentException("Invalid home type")
        }
        startActivity(intent)
    }
}