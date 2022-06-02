package com.krillinator.android_studio_lab_2

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

private var Button.onItemClickListener: AdapterView.OnItemClickListener
    get() {}
    set() {}

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var emailInformaion = findViewById.Text<EditText>(R.id.editTextTextEmailAddress)
        var passwordInformation = findViewById<EditText>(R.id.editTextTextPassword)

        var getUserInfo = findViewById<Button>(R.id.BtnLogin)

        getUserInfo.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id -> // value of item that is clicked
                val itemValue = {emailInformaion}

                // Toast the values
                Toast.makeText(applicationContext,"Position :$position\nItem Value : $itemValue", Toast.LENGTH_LONG).show()
            }
        fun View(emailInformaion: Context?, passwordInformation: EditText?): Context? {
return emailInformaion
        }

        fun setContentView(view: Context?) {
            TODO("Not yet implemented")
        }
        getUserInfo.setOnClickListener( View.OnClickListener(){
            @Override
           fun onClick(){
                setContentView(View(emailInformaion,passwordInformation))
           }
        })
        println("Loaded LoginActivity")


        /* TODO - Add missing LOGIN button to activity_login.xml */
        /* TODO - Input type should be: Password and Email types. (check XML)   */
        /* TODO - .apply to send user information from input field BACK to MainActivity */
    }
}