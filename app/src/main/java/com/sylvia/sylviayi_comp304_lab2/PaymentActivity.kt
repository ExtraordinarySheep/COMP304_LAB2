package com.sylvia.sylviayi_comp304_lab2

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.payment)

        val radioGroupPayment = findViewById<RadioGroup>(R.id.radioGroupPayment)
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)

        buttonSubmit.setOnClickListener {
            val selectedPaymentId = radioGroupPayment.checkedRadioButtonId
            if (selectedPaymentId != -1) {
                val selectedPayment = findViewById<RadioButton>(selectedPaymentId).text.toString()
                Toast.makeText(this, "Selected Payment Method: $selectedPayment", Toast.LENGTH_LONG).show()

                if (selectedPayment == "Credit Card" || selectedPayment == "Debit Card") {
                    val intent = Intent(this, CardInfoActivity::class.java)
                    intent.putExtra("paymentMethod", selectedPayment)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Payment Successful", Toast.LENGTH_LONG).show()
                }
            } else {
                Toast.makeText(this, "Please select a payment method", Toast.LENGTH_SHORT).show()
            }
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.home_menu, menu)
        return true
    }
}
