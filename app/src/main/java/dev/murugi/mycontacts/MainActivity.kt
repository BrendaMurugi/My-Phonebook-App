package dev.murugi.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.murugi.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }

    fun displayContacts(){
        var contact1 = Contacts("Bree","0798881101","bree@gmail.com","616 Korongo Road"," com/images?q=tbn:ANd9GcQLbtiD gW_GCpr3M-9A&usqp=CAU")
        var contact2 = Contacts("Chekko","0798881101","bree@gmail.com","616 Korongo Road","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQS5ke_V04uFigWDPB25eXzrktFoB7qM5lglw&usqp=CAU")
        var contact3 = Contacts("Ewii","0798881101","bree@gmail.com","616 Korongo Road","https://images.unsplash.com/photo-1583994009785-37ec30bf9342?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTh8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact4 = Contacts("Nakimuli","0798881101","bree@gmail.com","616 Korongo Road","https://images.unsplash.com/photo-1523450001312-faa4e2e37f0f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTZ8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact5 = Contacts("Nancy","0798881101","bree@gmail.com","616 Korongo Road","https://images.unsplash.com/photo-1589156280159-27698a70f29e?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contact6 = Contacts("Akuotss","0798881101","bree@gmail.com","616 Korongo Road","https://images.unsplash.com/photo-1627897495484-229b29feb0d5?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contact7 = Contacts("Effence","0798881101","bree@gmail.com","616 Korongo Road","https://images.unsplash.com/photo-1543807535-eceef0bc6599?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NHx8YmxhY2slMjBwZW9wbGV8ZW58MHx8MHx8&auto=format&fit=crop&w=500&q=60")
        var contact8 = Contacts("Waceke","0798881101","bree@gmail.com","616 Korongo Road","https://images.unsplash.com/photo-1572224384995-f9529873f379?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTJ8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact9 = Contacts("Munde","0798881101","bree@gmail.com","616 Korongo Road","https://images.unsplash.com/photo-1614251056798-0a63eda2bb25?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTV8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contact10 = Contacts("Mima","0798881101","bree@gmail.com","616 Korongo Road","https://images.unsplash.com/photo-1529245019870-59b249281fd3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fGJsYWNrJTIwcGVvcGxlfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
        var contactsList = listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10)
        var contactsadapter = ContactsRvAdapter(contactsList)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactsadapter
    }

}