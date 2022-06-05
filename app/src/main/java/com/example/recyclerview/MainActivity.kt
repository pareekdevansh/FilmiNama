package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dialogues: List<Dialogue> = listOf(
            Dialogue(
                "Don ka intezaar toh baarah mulko ki police kar rahi hai, but Don ko pakadna mushkil hi nahi, namumkin hai",
                "Don"
            ),
            Dialogue(
                "Crime Master Gogo naam hai mera, aankhen nikal ke gotiyan khelta hun main",
                "Andaaz Apna Apna"
            ),
            Dialogue(
                "Kaun kambakth hai jo bardasht karne ke liye peeta hai. Main toh peeta hoon ke bas saans le sakoon",
                "Devdas"
            ),
            Dialogue(
                "Dosti ka ek usool hai, madam: no sorry, no thank you",
                "Maine Pyar Kia"
            ),
            Dialogue(" Jo nahin ho sakhta....wahi toh karna hai ", "Chak De India"),
            Dialogue(
                "\"College di gate de is taraf hum life ko nachaate hain...te duji taraf life humko nachaati hai",
                "Rang De Basanti"
            ),
            Dialogue(
                "School ke bahar jab zindagi imtihaan leti hai ... toh subject wise nahi leti",
                "Hichki"
            ),
            Dialogue(
                "Babuji ne kaha gaon chhod do ... sab ne kaha Paro ko chhod do ... Paro ne kaha sharab chhod do ... aaj tumne keh diya haweli chhod do ... ek din aayega jab woh kahega, duniya hi chhod do…",
                "Devdas"
            ),
            Dialogue(
                "Aapke paon dekhe, bahut haseen hai. Inhe zameen par mat utariyega, maile ho jayenge",
                "Pakeezah"
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = DialogueAdapter(dialogues)

    }
}