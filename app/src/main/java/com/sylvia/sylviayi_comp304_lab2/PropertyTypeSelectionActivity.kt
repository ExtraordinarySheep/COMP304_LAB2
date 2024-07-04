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
                checkBoxApartment.isChecked -> navigateToHomeType(ApartmentActivity::class.java)
                checkBoxDetachedHome.isChecked -> navigateToHomeType(DetachedHomeActivity::class.java)
                checkBoxSemiDetachedHome.isChecked -> navigateToHomeType(SemiDetachedHomeActivity::class.java)
                checkBoxCondo.isChecked -> navigateToHomeType(CondoActivity::class.java)
                checkBoxTownHouse.isChecked -> navigateToHomeType(TownhouseActivity::class.java)
                else -> return@setOnClickListener
            }
        }
    }

    private fun navigateToHomeType(activityClass: Class<*>) {
        val intent = Intent(this, activityClass)
        startActivity(intent)
    }
}