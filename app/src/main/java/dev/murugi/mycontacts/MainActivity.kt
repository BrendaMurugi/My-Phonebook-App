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
        var contact1 = Contacts("Bree","0798881101","bree@gmail.com","616 Korongo Road","https://media-exp1.licdn.com/dms/image/C5603AQEjwy8-ySHcTg/profile-displayphoto-shrink_800_800/0/1647261196977?e=1663804800&v=beta&t=Syq_0xxYCSTH9ClBq4MoSzKVrjIRkbTIhvoladW5wC0")
        var contact2 = Contacts("Chekko","0798881101","bree@gmail.com","616 Korongo Road","https://media-exp1.licdn.com/dms/image/C4D03AQE0dR-QbJ7xkw/profile-displayphoto-shrink_800_800/0/1657015572510?e=1663804800&v=beta&t=Xn4eQTxEuF4EFJlC67SOf0uhjk8esKaWZf-D96423_w")
        var contact3 = Contacts("Ewii","0798881101","bree@gmail.com","616 Korongo Road","https://media-exp1.licdn.com/dms/image/C4D03AQFd01X-vSmZCg/profile-displayphoto-shrink_200_200/0/1654516070312?e=1663804800&v=beta&t=t-z95TgDKqXtyd1uowEtTwDue_Po4QV0MzTldIu-ECQ")
        var contact4 = Contacts("Nakimuli","0798881101","bree@gmail.com","616 Korongo Road","https://media-exp1.licdn.com/dms/image/C4D03AQEt6zmUwr7obA/profile-displayphoto-shrink_200_200/0/1657292484131?e=1663804800&v=beta&t=8izR-HYH-7UX-E8ry4azxoimoCkGOYZ3Lmw6uTaqGu4")
        var contact5 = Contacts("Nancy","0798881101","bree@gmail.com","616 Korongo Road","https://media-exp1.licdn.com/dms/image/C4D03AQHaMIMkOoDovQ/profile-displayphoto-shrink_200_200/0/1652822092006?e=1663804800&v=beta&t=2K4R4nwM2SY3YEu9unRhGJNDY2_OguAhggRkzT_RF7A")
        var contact6 = Contacts("Akuotss","0798881101","bree@gmail.com","616 Korongo Road","https://media-exp1.licdn.com/dms/image/C4D03AQE0zsXxpWeNig/profile-displayphoto-shrink_200_200/0/1648655837008?e=1663804800&v=beta&t=5vjNS1Z3UjkuRo3SSBP9B7lJEXEQkySo4dtp-WBQb3k")
        var contact7 = Contacts("Effence","0798881101","bree@gmail.com","616 Korongo Road","https://media-exp1.licdn.com/dms/image/C4D03AQHBtikM65_Eng/profile-displayphoto-shrink_200_200/0/1657017453380?e=1663804800&v=beta&t=xFM_0CY0SL9v8AdqIDpEDDbV8vVOipl-YIzQ5LwheTU")
        var contact8 = Contacts("Waceke","0798881101","bree@gmail.com","616 Korongo Road","https://media-exp1.licdn.com/dms/image/C4D03AQF3rHJz7MA7jA/profile-displayphoto-shrink_200_200/0/1655703391037?e=1663804800&v=beta&t=c7PbHMSJMJwg1VuUUUGvMvoG1rdScFdVc37CLcw7dTI")
        var contact9 = Contacts("Munde","0798881101","bree@gmail.com","616 Korongo Road","https://media-exp1.licdn.com/dms/image/C4D03AQFxRQjzBnL_4A/profile-displayphoto-shrink_200_200/0/1657016388727?e=1663804800&v=beta&t=1fX020RWr0ZJwbMuScAfHhd4aTqKaz0nx4qBrdjlwT8")
        var contact10 = Contacts("Mima","0798881101","bree@gmail.com","616 Korongo Road","https://media-exp1.licdn.com/dms/image/C4D03AQHIEnZm4yPUZQ/profile-displayphoto-shrink_200_200/0/1657694896004?e=1663804800&v=beta&t=x2JNGlbPvWCw2roEQN2qFZk5JQrt2bWF6wdfUb6btRs")
        var contactsList = listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10)
        var contactsadapter = ContactsRvAdapter(contactsList)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactsadapter
    }

}