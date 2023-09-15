package com.example.historyhero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class C_1100_1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c11001)
        val receive = intent.getStringExtra("One")
        if (receive == "1"){
            var fina = findViewById<TextView>(R.id.fina)
            fina.text = "Shivaji was descended from a line of prominent nobles. India at that time was under Muslim rule: the Mughals in the north and the Muslim sultans of Bijapur and Golconda in the south. All three ruled by right of conquest, with no pretense that they had any obligations toward those who they ruled. Shivaji, whose ancestral estates were situated in the Deccan, in the realm of the Bijapur sultans, found the Muslim oppression and religious persecution of the Hindus so intolerable that, by the time he was 16, he convinced himself that he was the divinely appointed instrument of the cause of Hindu freedom—a conviction that was to sustain him throughout his life."

            var first = findViewById<TextView>(R.id.first)
            first.text = "Shivaji, also spelled Śivaji, (born February 19, 1630, or April 1627, Shivner, Poona [now Pune], India—died April 3, 1680, Rajgarh), founder of the Maratha kingdom of India. The kingdom’s security was based on religious toleration and on the functional integration of the Brahmans, Marathas, and Prabhus."

            var image = findViewById<ImageView>(R.id.image)
            image.setImageResource(R.drawable.home_history)

            var name = findViewById<TextView>(R.id.name)
            name.text = "Chhatrapati Shivaji Maharaj"

            var birth = findViewById<TextView>(R.id.birth)
            birth.text = "Birth : 29-05-2004"

            var place = findViewById<TextView>(R.id.place)
            place.text = "Maharashtra"
        }
        else if (receive == "2"){
            var fina = findViewById<TextView>(R.id.fina)
            fina.text = ""
        }


    }
}