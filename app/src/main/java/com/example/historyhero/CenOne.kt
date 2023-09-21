package com.example.historyhero

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView

class CenOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cen_one)

        val century = arrayOf("1100 CENTURY","1200 CENTURY","1300 CENTURY","1400 CENTURY","1500 CENTURY","1600 CENTURY","1700 CENTURY","1800 CENTURY","1900 CENTURY")

        val name = arrayOf(arrayOf("Prithviraja III","RajaRaja CholaII","Jayadeva","Akka Mahadevi","Bhaskaracharya"),
            arrayOf("Pratapurudra Deva","Maharaja Vir Narasingh","Vidyaranya","Bhaskaracharya III","Ramanada"),
            arrayOf("Rana Hammir Singh","Rao Chunda","Harihara","Bukka Raya","Lakshminarasimha Deva"),
            arrayOf("Rana Kumbha","Rao Jodha","Chaitanya Mahaprabhu","Meera Bai","Kabir"),
            arrayOf("Maharana Pratap Singh","Maharana Sangram Singh","Raja Todar Mal","Raja Birbal","Tulsida"),
            arrayOf("Shivaji Maharaj","Rana Chhatrasal","Maharana Raj Singh","Sawai Jai Singh II","Rana Raj Singh"),
            arrayOf("Raja Raghunath Rao","Tipu Sultan","Raja Ram Mohan Roy","Haider Ali","Nawab Siraj-ud-Daula"),
            arrayOf("Swami Vivekananda","Rani Lakshmibai","Sardar Vallabhbhai Patel","Bal Gangadhar Tilak","Subhas Chandra Bose"),
            arrayOf("Bhagat Singh","Sukh Dev","Rajguru","Lal Bahadur Shastri","A.P.J. Abdul Kalam")
        )

        val birth = arrayOf(arrayOf("Birth Date : 1166","Birth Date : 1122","Birth Date : 1170","Birth Date : 1130","Birth Date : 1114"),
                    arrayOf("Birth Date : 1241","Birth Date : 1238","Birth Date : 1268","Birth Date : 1207","Birth Date : 1299"),
            arrayOf("Birth Date : 1326","Birth Date : 1384","Birth Date : 1333","Birth Date : 1300","Birth Date : 1313"),
            arrayOf("Birth Date : 1433","Birth Date : 1416","Birth Date : 1486","Birth Date : 1498","Birth Date : 1440"),
            arrayOf("Birth Date : 1540","Birth Date : 1509","Birth Date : 1510","Birth Date : 1528","Birth Date : 1532"),
            arrayOf("Birth Date : 1630","Birth Date : 1649","Birth Date : 1653","Birth Date : 1686","Birth Date : 1653"),
            arrayOf("Birth Date : 1769","Birth Date : 1751","Birth Date : 1772","Birth Date : 1720","Birth Date : 1733"),
            arrayOf("Birth Date : 1863","Birth Date : 1828","Birth Date : 1875","Birth Date : 1856","Birth Date : 1867"),
            arrayOf("Birth Date : 1907","Birth Date : 1907","Birth Date : 1908","Birth Date : 1904","Birth Date : 1931")
        )

        val place = arrayOf(arrayOf("Rajasthan","Tamil Nadu","Odisha","Kannada","Karnataka"),
            arrayOf("Telangana","Bengal","Karnataka","Maharashtra","Uttar Pradesh"),
            arrayOf("Rajasthan","Rajasthan","Karnatak","Karnatak","Odisha"),
            arrayOf("Rajasthan","Rajasthan","Bengal","Rajasthan","Uttar Pradesh"),
            arrayOf("Rajasthan","Rajasthan","Uttar Pradesh","Madhya Pradesh","Uttar Pradesh"),
            arrayOf("Maharashtra","Uttar Pradesh","Rajasthan","Rajasthan","Rajasthan"),
            arrayOf("Maharashtra","Karnataka","West Bengal","Karnataka","West Bengal"),
            arrayOf("West Bengal","Uttar Pradesh","Gujarat","Maharashtra","Odisha"),
            arrayOf("Punjab","Punjab","Maharashtra","Uttar Pradesh","Tamil Nadu")
        )

        val image = arrayOf(arrayOf(R.drawable.prithavirajchouhaniii,R.drawable.rajarajachola,R.drawable.jayadeva,R.drawable.akkamahadevi,R.drawable.bhaskaracharya),
        arrayOf(R.drawable.prataparudra,R.drawable.maharajavirnarasingh,R.drawable.vidyaranya,R.drawable.bhaskaracharyaiii,R.drawable.ramanada),
            arrayOf(R.drawable.ranahammir,R.drawable.raochunda,R.drawable.hariharai,R.drawable.bukkarayai,R.drawable.lakshminarasimhadeva),
            arrayOf(R.drawable.ranakumbha,R.drawable.raojodha,R.drawable.chaitanyamahaprabhu,R.drawable.meerabai,R.drawable.kabir),
            arrayOf(R.drawable.maharanapratapsingh,R.drawable.maharanasangramsingh,R.drawable.rajatodarmal,R.drawable.rajabirbal,R.drawable.tulsidas),
            arrayOf(R.drawable.shivajimaharaj,R.drawable.ranachhatrasal,R.drawable.maharanarajsingh,R.drawable.sawaijaisinghii,R.drawable.ranarajsingh),
            arrayOf(R.drawable.rajaraghunathrao,R.drawable.tipusultan,R.drawable.rajarammohanroy,R.drawable.haiderali,R.drawable.nawabsirajuddaula),
            arrayOf(R.drawable.swamivivekananda,R.drawable.ranilakshmibai,R.drawable.sardarvallabhbhaipatel,R.drawable.balgangadhartilak,R.drawable.subhaschandrabose),
            arrayOf(R.drawable.bhagatsingh,R.drawable.sukhdev,R.drawable.sukhdevvvv,R.drawable.lalbahadurshastri,R.drawable.apjabdulkalam)
        )

        val receive = intent.getIntExtra("Century",0)

            var cen = findViewById<TextView>(R.id.centuryNumber)
            cen.text = century[receive]

            var image1 = findViewById<ImageView>(R.id.heroimage1)
            var imagesrc1= image[receive][0]
            image1.setImageResource(imagesrc1)

            var name1 = findViewById<TextView>(R.id.heroname1)
            name1.text = name[receive][0]


            var birth1 = findViewById<TextView>(R.id.herodate1)
            birth1.text = birth[receive][0]

            var place1 = findViewById<TextView>(R.id.heroplace1)
            place1.text = place[receive][0]

            var image2 = findViewById<ImageView>(R.id.heroimage2)
            var imagesrc2= image[receive][1]
            image2.setImageResource(imagesrc2)

            var name2 = findViewById<TextView>(R.id.heroname2)
            name2.text = name[receive][1]

            var birth2 = findViewById<TextView>(R.id.herodate2)
            birth2.text = birth[receive][1]

            var place2 = findViewById<TextView>(R.id.heroplace2)
            place2.text = place[receive][1]

            var image3 = findViewById<ImageView>(R.id.heroimage3)
            var imagesrc3= image[receive][2]
            image3.setImageResource(imagesrc3)

            var name3 = findViewById<TextView>(R.id.heroname3)
            name3.text = name[receive][2]

            var birth3 = findViewById<TextView>(R.id.herodate3)
            birth3.text = birth[receive][2]

            var place3 = findViewById<TextView>(R.id.heroplace3)
            place3.text = place[receive][2]

            var image4 = findViewById<ImageView>(R.id.heroimage4)
            var imagesrc4= image[receive][3]
            image4.setImageResource(imagesrc4)

            var name4 = findViewById<TextView>(R.id.heroname4)
            name4.text = name[receive][3]

            var birth4 = findViewById<TextView>(R.id.herodate4)
            birth4.text = birth[receive][3]

            var place4 = findViewById<TextView>(R.id.heroplace4)
            place4.text = place[receive][3]

            var image5 = findViewById<ImageView>(R.id.heroimage5)
            var imagesrc5= image[receive][4]
            image5.setImageResource(imagesrc5)

            var name5 = findViewById<TextView>(R.id.heroname5)
            name5.text = name[receive][4]

            var birth5 = findViewById<TextView>(R.id.herodate5)
            birth5.text = birth[receive][4]

            var place5 = findViewById<TextView>(R.id.heroplace5)
            place5.text = place[receive][4]


        var enter1 = findViewById<CardView>(R.id.enter1)
        enter1.setOnClickListener(){
            val intent = Intent(this,C_1100_1::class.java)
            val value = 0
            intent.putExtra("One",value)
            intent.putExtra("Century",receive)
            startActivity(intent)
        }
        var enter2 = findViewById<CardView>(R.id.enter2)
        enter2.setOnClickListener(){
            val intent = Intent(this,C_1100_1::class.java)
            val value = 1
            intent.putExtra("One",value)
            intent.putExtra("Century",receive)
            startActivity(intent)
        }
        var enter3 = findViewById<CardView>(R.id.enter3)
        enter3.setOnClickListener(){
            val intent = Intent(this,C_1100_1::class.java)
            val value = 2
            intent.putExtra("One",value)
            intent.putExtra("Century",receive)
            startActivity(intent)
        }
        var enter4 = findViewById<CardView>(R.id.enter4)
        enter4.setOnClickListener(){
            val intent = Intent(this,C_1100_1::class.java)
            val value = 3
            intent.putExtra("One",value)
            intent.putExtra("Century",receive)
            startActivity(intent)
        }
        var enter5 = findViewById<CardView>(R.id.enter5)
        enter5.setOnClickListener(){
            val intent = Intent(this,C_1100_1::class.java)
            val value = 4
            intent.putExtra("One",value)
            intent.putExtra("Century",receive)
            startActivity(intent)
        }
        val hel = findViewById<ImageView>(R.id.helpl)
        val home = findViewById<ImageView>(R.id.homel)
        val feed = findViewById<ImageView>(R.id.feedbackl)
        hel.setOnClickListener(){
            val intent = Intent(this,help::class.java)
            startActivity(intent)
        }
        home.setOnClickListener(){
            val intent = Intent(this,Home::class.java)
            startActivity(intent)
        }
        feed.setOnClickListener(){
            val intent = Intent(this,feedback::class.java)
            startActivity(intent)
        }
    }
}