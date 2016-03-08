package me.didik.learningkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var personList = arrayListOf<Person>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSubmit.setOnClickListener({
            val nama = etNama.text.toString()
            val gender = etGender.text.toString()
            val person = Person(nama, gender)

            personList.add(person)
            toast(sayHello(nama))
            updateList()
            etNama.setText("")
        })
    }

    //fun sayHello(nama: String) = if (nama.equals("Frieska", true)) "Hello Cinta" else "Hello " + nama

    private fun sayHello(nama: String) = when (nama) {
        "Frieska" -> "Hello My Dear!"
        "Sinka" -> "Hello Dudut!"
        else -> "Hello, $nama"
    }

    private fun updateList() {
        var allPerson = ""
        for (person in personList) allPerson += "${person.name} - ${person.gender} \n"
        tvNama.setText(allPerson)
    }
}
