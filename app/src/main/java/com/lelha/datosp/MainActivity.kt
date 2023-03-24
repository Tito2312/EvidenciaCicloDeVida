package com.lelha.datosp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var name: EditText? = null
    var phone: EditText? = null
    var Email: EditText? = null
    var document: EditText? = null
    var age: EditText? = null
    var address: EditText? = null
    var information: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.name)
        phone = findViewById(R.id.phone)
        Email = findViewById(R.id.email)
        document = findViewById(R.id.document)
        age = findViewById(R.id.age)
        address = findViewById(R.id.address)

        val button= findViewById<Button>(R.id.button)
        button.setOnClickListener{onClick()}
    }

    private fun onClick() {
        information = findViewById(R.id.information)

        var fact =""
        fact+="${name!!.text}\n"
        fact+="${phone!!.text}\n"
        fact+="${Email!!.text}\n"
        fact+="${document!!.text}\n"
        fact+="${address!!.text}\n"

        var age1 =age!!.text.toString().toInt()

        if (age1 >= 0 && age1<= 14){
            fact+= "Es Infante, tiene ${age1} años de edad"
        }else if(age1 >= 15 && age1<= 17){
            fact+= "Es Adolecente, tiene ${age1} años de edad"
        }else if(age1 >= 18 && age1<= 64){
            fact+= "Es Adulto, tiene ${age1} años de edad"
        }else if(age1 >= 65 ){
            fact+= "Es Adulto Mayor, tiene ${age1} años de edad"
        }else{
            fact+="Edad no valida"
        }

        information!!.text =fact

        Toast.makeText(this,"${fact}", Toast.LENGTH_LONG).show()
    }
}