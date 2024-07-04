package com.sylvia.sylviayi_comp304_lab2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class CardInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.card_info)

        val editTextName = findViewById<EditText>(R.id.editTextName)
        val editTextCardNumber = findViewById<EditText>(R.id.editTextCardNumber)
        val editTextFavoriteSport = findViewById<EditText>(R.id.editTextFavoriteSport)
        val editTextFavoriteTeam = findViewById<EditText>(R.id.editTextFavoriteTeam)
        val editTextFavoriteFood = findViewById<EditText>(R.id.editTextFavoriteFood)
        val buttonSubmitCardInfo = findViewById<Button>(R.id.buttonSubmitCardInfo)

        buttonSubmitCardInfo.setOnClickListener {
            val name = editTextName.text.toString()
            val cardNumber = editTextCardNumber.text.toString()
            val favoriteSport = editTextFavoriteSport.text.toString()
            val favoriteTeam = editTextFavoriteTeam.text.toString()
            val favoriteFood = editTextFavoriteFood.text.toString()

            if (name.isNotEmpty() && cardNumber.isNotEmpty() && favoriteSport.isNotEmpty() &&
                favoriteTeam.isNotEmpty() && favoriteFood.isNotEmpty()) {
                Toast.makeText(this, "Card Info Submitted Successfully", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Please fill in all the fields", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
