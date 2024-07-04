package com.sylvia.sylviayi_comp304_lab2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CheckoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.checkout)

        val radioGroupHomes = findViewById<RadioGroup>(R.id.radioGroupHomes)
        val buttonProceed = findViewById<Button>(R.id.buttonProceed)

        buttonProceed.setOnClickListener {
            val selectedHomeId = radioGroupHomes.checkedRadioButtonId
            if (selectedHomeId != -1) {
                val selectedHome = findViewById<RadioButton>(selectedHomeId).text.toString()
                Toast.makeText(this, "Selected: $selectedHome", Toast.LENGTH_LONG).show()

                val intent = Intent(this, PaymentActivity::class.java)
                intent.putExtra("selectedHome", selectedHome)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Please select a home", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
