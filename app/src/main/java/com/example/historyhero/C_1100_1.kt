package com.example.historyhero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class C_1100_1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c11001)

        val naam = arrayOf(arrayOf("Prithviraja III","RajaRaja CholaII","Jayadeva","Akka Mahadevi","Bhaskaracharya"),
            arrayOf("Pratapurudra Deva","Maharaja Vir Narasingh","Vidyaranya","Bhaskaracharya III","Ramanada"),
            arrayOf("Rana Hammir Singh","Rao Chunda","Harihara","Bukka Raya","Lakshminarasimha Deva"),
            arrayOf("Rana Kumbha","Rao Jodha","Chaitanya Mahaprabhu","Meera Bai","Kabir"),
            arrayOf("Maharana Pratap Singh","Maharana Sangram Singh","Raja Todar Mal","Raja Birbal","Tulsida"),
            arrayOf("Shivaji Maharaj","Rana Chhatrasal","Maharana Raj Singh","Sawai Jai Singh II","Rana Raj Singh"),
            arrayOf("Raja Raghunath Rao","Tipu Sultan","Raja Ram Mohan Roy","Haider Ali","Nawab Siraj-ud-Daula"),
            arrayOf("Swami Vivekananda","Rani Lakshmibai","Sardar Vallabhbhai Patel","Bal Gangadhar Tilak","Subhas Chandra Bose"),
            arrayOf("Bhagat Singh","Sukh Dev","Rajguru","Lal Bahadur Shastri","A.P.J. Abdul Kalam")
        )

        val date = arrayOf(arrayOf("Birth Date : 1166","Birth Date : 1122","Birth Date : 1170","Birth Date : 1130","Birth Date : 1114"),
            arrayOf("Birth Date : 1241","Birth Date : 1238","Birth Date : 1268","Birth Date : 1207","Birth Date : 1299"),
            arrayOf("Birth Date : 1326","Birth Date : 1384","Birth Date : 1333","Birth Date : 1300","Birth Date : 1313"),
            arrayOf("Birth Date : 1433","Birth Date : 1416","Birth Date : 1486","Birth Date : 1498","Birth Date : 1440"),
            arrayOf("Birth Date : 1540","Birth Date : 1509","Birth Date : 1510","Birth Date : 1528","Birth Date : 1532"),
            arrayOf("Birth Date : 1630","Birth Date : 1649","Birth Date : 1653","Birth Date : 1686","Birth Date : 1653"),
            arrayOf("Birth Date : 1769","Birth Date : 1751","Birth Date : 1772","Birth Date : 1720","Birth Date : 1733"),
            arrayOf("Birth Date : 1863","Birth Date : 1828","Birth Date : 1875","Birth Date : 1856","Birth Date : 1867"),
            arrayOf("Birth Date : 1907","Birth Date : 1907","Birth Date : 1908","Birth Date : 1904","Birth Date : 1931")
        )

        val jagah = arrayOf(arrayOf("Rajasthan","Tamil Nadu","Odisha","Kannada","Karnataka"),
            arrayOf("Telangana","Bengal","Karnataka","Maharashtra","Uttar Pradesh"),
            arrayOf("Rajasthan","Rajasthan","Karnatak","Karnatak","Odisha"),
            arrayOf("Rajasthan","Rajasthan","Bengal","Rajasthan","Uttar Pradesh"),
            arrayOf("Rajasthan","Rajasthan","Uttar Pradesh","Madhya Pradesh","Uttar Pradesh"),
            arrayOf("Maharashtra","Uttar Pradesh","Rajasthan","Rajasthan","Rajasthan"),
            arrayOf("Maharashtra","Karnataka","West Bengal","Karnataka","West Bengal"),
            arrayOf("West Bengal","Uttar Pradesh","Gujarat","Maharashtra","Odisha"),
            arrayOf("Punjab","Punjab","Maharashtra","Uttar Pradesh","Tamil Nadu")
        )

        val picture = arrayOf(arrayOf(R.drawable.prithavirajchouhaniii,R.drawable.rajarajachola,R.drawable.jayadeva,R.drawable.akkamahadevi,R.drawable.bhaskaracharya),
            arrayOf(R.drawable.prataparudra,R.drawable.maharajavirnarasingh,R.drawable.vidyaranya,R.drawable.bhaskaracharyaiii,R.drawable.ramanada),
            arrayOf(R.drawable.ranahammir,R.drawable.raochunda,R.drawable.hariharai,R.drawable.bukkarayai,R.drawable.lakshminarasimhadeva),
            arrayOf(R.drawable.ranakumbha,R.drawable.raojodha,R.drawable.chaitanyamahaprabhu,R.drawable.meerabai,R.drawable.kabir),
            arrayOf(R.drawable.maharanapratapsingh,R.drawable.maharanasangramsingh,R.drawable.rajatodarmal,R.drawable.rajabirbal,R.drawable.tulsidas),
            arrayOf(R.drawable.shivajimaharaj,R.drawable.ranachhatrasal,R.drawable.maharanarajsingh,R.drawable.sawaijaisinghii,R.drawable.ranarajsingh),
            arrayOf(R.drawable.rajaraghunathrao,R.drawable.tipusultan,R.drawable.rajarammohanroy,R.drawable.haiderali,R.drawable.nawabsirajuddaula),
            arrayOf(R.drawable.swamivivekananda,R.drawable.ranilakshmibai,R.drawable.sardarvallabhbhaipatel,R.drawable.balgangadhartilak,R.drawable.subhaschandrabose),
            arrayOf(R.drawable.bhagatsingh,R.drawable.sukhdev,R.drawable.sukhdevvvv,R.drawable.lalbahadurshastri,R.drawable.apjabdulkalam)
        )

        val fina = arrayOf(arrayOf("Ascending the throne about 1177, the young Prithviraja inherited a kingdom that stretched from Sthanvishvara (Thanesar; once the capital of the 7th-century ruler Harsha) in the north to Mewar in the south. Within a few years, Prithviraja had personally assumed control of the administration, but, shortly after taking power, he was faced with a rebellion from his cousin, Nagarjuna, who asserted his own claim to the throne. The revolt was brutally crushed, and Prithviraja turned his attention to the nearby kingdom of the Bhadanakas. The Bhadanakas had been a persistent threat to the Chauhan-held region around Delhi, but they were so comprehensively destroyed sometime prior to 1182 that they ceased to be mentioned in subsequent historical records."
        ,"The Chola kingdom during his rule never witnessed major revolts barring a few minor ones. The feudatory Telugu Chola chieftains of Velanadu wanted to lead independent kingdoms and this followed with a series of disasters towards the end of Kulothunga Chola I's reign. The central administration showed signs of weakness with respect to control and effective administration towards the end of Rajaraja's reign. However, he recovered adequate control on regions like Kalinga, Pandya, Vengi, and Chera. He invaded Sri Lanka according to a literary work of his period. Constant conflicts and military occupancy accompanied the rule of Rajaraja and his successor which exhausted the resources of successive Chola emperors."
        ,"The Gita Govinda describes the love of Krishna, the divine cowherd, for Radha, his favourite among the gopis (wives and daughters of the cowherds). The poem presents, in dramatic form, the lovers’ attraction, estrangement, yearning, and final reconciliation through the help of a sakhi (female confidant). The poem, which blends recitative stanzas with 24 short songs, inspired much of the subsequent poetry and painting in the bhakti (devotional) tradition of Krishna and Radha throughout India. Songs from the Gita Govinda continue to be sung in temples, during festivals, and at kirtanas (communal worship through song)."
        ,"Early Life of Akka Mahadevi\n" +
                    "Akka Mahadevi was born in Udutadi (or Udugani) near the ancient city of Banavasi (in Shikaripura taluk Shimoga district of Karnataka). She was born in 1130 and throughout her life she mainly worked for the welfare of women. Some scholars suggest that she was born to a couple named Nirmalshetti and Sumati, who were both devotees of Lord Shiva. She displayed her religious proclivities which she possibly inherited from her parents even when a young child. She was a shining example of beauty and princess of lyrical poetry."
        ,"In Bhāskara II’s mathematical works (written in verse like nearly all Indian mathematical classics), particularly Līlāvatī (“The Beautiful”) and Bījagaṇita (“Seed Counting”), he not only used the decimal system but also compiled problems from Brahmagupta and others. He filled many of the gaps in Brahmagupta’s work, especially in obtaining a general solution to the Pell equation (x2 = 1 + py2) and in giving many particular solutions (e.g., x2 = 1 + 61y2, which has the solution x = 1,766,319,049 and y = 226,153,980; French mathematician Pierre de Fermat proposed this same problem as a challenge to his friend Frenicle de Bessy five centuries later in 1657)."
        ),
        arrayOf("Rudramadevi died in the month of November, 1289 CE., fighting battle against the rebel Kayastha chief Ambadeva. On the death of Rudrama, her grandson Prataparudra, who was adopted by her as son and as heir apparent on the advice of her father Ganapatideva, ascended the throne at the beginning of the year 1280 CE. Prataparudra had to fight battles throughout his reign against either the internal rebels or the external foes."
            ,"The term Langula has been confused for many abrupt derivations about the name of Narasingha Deva I as many interpreters have compared the word with the Odia term Languda meaning tail in different ways. Some interpreters without looking at the living era depictions of the king himself from Konark sun temple, have abruptly narrated that the king was physically disabled which was significantly visible in the form of an extended spinal cord resembling a tail. However, some other interpreters have described that the king used to wear a very long sword which explained this name of his while others have associated the name with the river Vamsadhara which is also locally known as Languli or Languliya without any prevailing evidence."
        ,"From his childhood, Madhava possessed the qualities of patriotism, firmness, practical sense, political awareness and righteousness.  Hence, Madhava during his education developed the idea of establishing a ‘Dharma rajya’ to protect the cultures and traditions of the nation from the atrocities of Islamic invaders.\n" +
                    "\n" +
                    "After the loot and destruction of Srirangam by Malik Kafur, the political conditions in the South turned cruel. The people had become spineless. The Hindus were so fear stricken that they were afraid of protesting against injustice. The rulers were torturing the Hindus and plundering their temples. But there was no united protest anywhere. There was need for a leader who could inspire the people to fight for Dharma. "
        ,"One of Bhaskaracharya III's notable works was the \"Bijaganita,\" a masterpiece in algebra that delved into equations, quadratic, and indeterminate equations. In the field of astronomy, he made valuable contributions to understanding planetary motion and positions. Bhaskaracharya III's work extended beyond mathematical formulations; he was an ardent advocate of applying mathematics to real-world problems, reflecting the practicality of his theories. His brilliance and dedication to the sciences continue to inspire mathematicians and astronomers, leaving an indelible mark on the annals of intellectual history, particularly in Maharashtra."
        ,"Ramananda's teachings emphasized unity and equality, breaking down societal barriers by advocating that spirituality was accessible to all, regardless of caste or gender. He was a proponent of devotion to Lord Rama, and his teachings were instrumental in popularizing this devotion widely. Ramananda is credited with pioneering the use of vernacular languages, like Hindi, for religious discourse, making spiritual teachings accessible to the common people.\n" +
                    "\n" +
                    "He established the Ramanandi Sampradaya, a sect of Hinduism that continues to be a significant spiritual influence in Northern India. Ramananda's teachings and the sect he founded had a profound and lasting impact on the development of Hindu spirituality and society, emphasizing inclusivity, love, and devotion to the divine."
        ),
        arrayOf("During his reign, Rana Hammir Singh successfully expanded the territorial boundaries of Mewar through military campaigns, strengthening the kingdom's position in the region. He undertook several strategic initiatives to fortify the defenses of Mewar, ensuring the security of his subjects and kingdom. Additionally, he was a patron of art and culture, fostering an environment of cultural growth and prosperity within his realm.\n" +
                "\n" +
                "However, Rana Hammir Singh is perhaps most renowned for his legendary defiance against the invading forces of Alauddin Khalji, the ruler of the Delhi Sultanate. Despite facing overwhelming odds, he displayed remarkable courage and resilience, making a lasting mark in the annals of Rajput valor and heroism. His reign remains a vital chapter in the history of Rajasthan, representing the indomitable spirit and pride of the Rajputana."
        ,"During his rule, Rao Chunda focused on strengthening the foundations of his kingdom and expanding its territorial influence. He successfully managed to consolidate the power of the Rathores, solidifying their position in the region. Rao Chunda was also known for his diplomatic skills, which he employed to form alliances and maintain peaceful relations with neighboring states.\n" +
                    "\n" +
                    "Rao Chunda's patronage of the arts contributed to the cultural richness of Rajasthan. Under his rule, there was a flourishing of music, dance, and other forms of artistic expression. The architecture of the period also reflected the cultural grandeur, with several beautiful structures being erected during his reign.\n" +
                    "\n" +
                    "Overall, Rao Chunda's reign is remembered as a time of stability and cultural prosperity in Rajasthan, leaving a lasting impact on the history and heritage of the region."
        ,"Under Harihara I's leadership, the Vijayanagara Empire began to take shape and grow. He and Bukka Raya I championed the cause of Hinduism and worked towards reviving and restoring Hindu traditions and culture, which had been under threat during the preceding centuries. They were known for their military acumen and successfully resisted the invasions and incursions of the Delhi Sultanate and other neighboring powers.\n" +
                    "\n" +
                    "Harihara I's reign was characterized by a blend of strategic expansion and administrative organization. He laid the foundations for an empire that would later reach its zenith under subsequent rulers. The city of Vijayanagara, the capital of the empire, became a flourishing center of art, culture, and trade during this period. Harihara I's legacy as a founder and visionary leader played a crucial role in the development of one of the most significant empires in Indian history."
        ,"Bukka Raya I is remembered for his strategic vision and leadership in consolidating and expanding the Vijayanagara Empire. Together with Harihara I, he laid the foundation of an empire that would grow into a significant power, influencing the socio-political landscape of Southern India. Their reign was characterized by a revival of Hindu culture, patronage of arts, and the establishment of a stable and prosperous realm.\n" +
                    "\n" +
                    "During his rule, Bukka Raya I pursued policies that emphasized the promotion of Hinduism, religious tolerance, and economic growth. He initiated the construction of various temples, contributing to the cultural and architectural splendor of the empire. His commitment to fostering a harmonious and prosperous society helped solidify the foundations of the Vijayanagara Empire, making him an integral figure in the history of Karnataka and South India."
        ,"Lakshminarasimha Deva's reign was marked by cultural, artistic, and architectural advancements. He was a patron of the arts, and his rule witnessed a flourishing of temple architecture and artistic endeavors. He contributed to the construction and renovation of several temples, fostering a rich cultural and religious atmosphere within his kingdom.\n" +
                    "\n" +
                    "One of the most notable contributions during his reign was the Konark Sun Temple, a UNESCO World Heritage Site and an architectural marvel of its time. Although the temple had been started earlier, Lakshminarasimha Deva played a significant role in its completion. This temple, dedicated to the Sun God, stands as a testament to the architectural brilliance and cultural legacy of Odisha during his reign.\n" +
                    "\n" +
                    "Overall, Lakshminarasimha Deva's reign was a period of cultural and architectural prosperity, leaving a lasting impact on the cultural heritage of Odisha and its architectural landscape."
        ),
        arrayOf("During his reign, Rana Kumbha undertook significant efforts to fortify and expand the territory of Mewar. He was a formidable military strategist and successfully defended his kingdom from external threats. The renowned Chittorgarh Fort, a colossal and awe-inspiring citadel, was greatly fortified and expanded under his rule. The fort is a striking example of Rajput architecture and engineering marvels.\n" +
                "\n" +
                "In addition to his military achievements, Rana Kumbha was a passionate patron of arts and learning. He was a prolific builder and supporter of temples, palaces, and other architectural wonders. The most notable among these is the Kumbhalgarh Fort and its magnificent wall, which is one of the longest walls in the world, second only to the Great Wall of China. This fort stands as a testament to his architectural vision and fortification skills.\n"
        ,"During his reign, Rao Jodha faced formidable challenges, including conflicts with neighboring states. He displayed exceptional leadership and strategic skills, enabling him to expand and consolidate the territory of the Rathores. One of his most notable achievements was the establishment of Mehrangarh Fort, an imposing citadel that stands as a symbol of Jodhpur's strength and grandeur. This fort became the seat of the Rathore dynasty and remains one of the largest and most well-preserved forts in India.\n" +
                    "\n" +
                    "Rao Jodha's contributions extend beyond military achievements; he was also an avid patron of art and culture. His reign witnessed the flourishing of traditional arts, crafts, and architecture, adding to the cultural richness of the region. Rao Jodha's legacy is deeply entrenched in the heritage of Rajasthan, and the city of Jodhpur, with its distinctive blue architecture and Mehrangarh Fort, stands as a lasting testament to his enduring impact.\n"
        ,"Chaitanya Mahaprabhu was a devout devotee of Lord Krishna and propagated the chanting of the holy names of Krishna, specifically the Hare Krishna mantra. He emphasized the practice of congregational chanting (sankirtan) and the experience of divine love (prema) through devotion and surrender to Lord Krishna.\n" +
                    "\n" +
                    "He traveled extensively throughout India, particularly in Bengal and Odisha, spreading the practice of congregational chanting and the importance of bhakti yoga. Chaitanya Mahaprabhu's disciples and followers continued his mission, establishing the widespread practice of congregational chanting and the establishment of temples dedicated to Lord Krishna, contributing to the cultural and spiritual fabric of the region. His teachings continue to inspire millions of devotees worldwide, and the International Society for Krishna Consciousness (ISKCON) is one of the prominent organizations that propagate his philosophy and teachings globally."
        ,"Growing up in a Rajput royal family, Meera Bai was exposed to the devotional stories of Lord Krishna from a young age. As she matured, her love and devotion for Lord Krishna grew immensely, and she ultimately became one of the most celebrated devotees of the deity.Meera Bai expressed her spiritual journey and love for Krishna through soul-stirring poetry and hymns, which are deeply emotional and reflective of her intense devotion. She defied societal norms and expectations, choosing to immerse herself in devotion to Krishna rather than conforming to conventional roles. Meera Bai's devotion often transcended the boundaries of conventional religion, emphasizing the universality of divine love.\n" +
                    "\n" +
                    "Her compositions are in the Rajasthani language, making her poetry accessible to the masses. Meera Bai's life was marked by challenges and persecution, yet her unwavering devotion and love for Lord Krishna remained steadfast until her passing. Her legacy endures through her poetry, which continues to inspire and resonate with spiritual seekers and devotees, emphasizing the path of divine love and devotion."
        ,"Through his poetry, Kabir conveyed profound spiritual insights and criticized social inequalities, hypocrisy, and religious dogma. He advocated for a formless and omnipresent divine being that transcends the boundaries of any particular religion or belief system. Kabir's hymns, known as \"bani\" or \"shabad,\" were composed in a language accessible to the common people, enabling them to contemplate and connect with the spiritual message easily.\n" +
                    "\n" +
                    "His legacy continues to influence various cultures and communities, transcending borders and religious divisions. Kabir's poetry remains a source of spiritual guidance and a reminder of the unity and love that are at the heart of all spiritual paths. He is honored and celebrated for his timeless wisdom, compassion, and his ability to inspire seekers on their spiritual journeys."
        ),
        arrayOf("One of the most iconic events associated with Maharana Pratap was the Battle of Haldighati fought in 1576, where he led the Rajput forces against the mighty Mughal army commanded by Akbar's general, Man Singh. Despite being outnumbered, Maharana Pratap's bravery and determination showcased the resilience and valor of the Rajputs.\n" +
                "\n" +
                "His reign was marked by a continuous struggle to regain his ancestral lands and uphold the honor of the Rajputana. Maharana Pratap's unwavering spirit and refusal to submit to external rule made him a symbol of Rajput pride and resistance. Even though he faced numerous challenges and setbacks, his legacy remains a source of inspiration, representing the courage and indomitable will of the Rajput warrior.\n" +
                "\n"
        ,"One of the notable events associated with Rana Sanga was the Battle of Khanwa in 1527, where he fought against the Mughal emperor Babur. Though Rana Sanga's forces were defeated, his determination and valor were acknowledged widely.\n" +
                    "\n" +
                    "Rana Sanga's reign marked a significant period in the Rajputana's history, showcasing resilience, unity, and heroism against external forces. He left a lasting legacy as a symbol of Rajput pride and valor, inspiring generations to come."
        ,"Todar Mal is best known for implementing a systematic revenue and taxation system known as \"Todar Mal's bandobast.\" This revenue reform aimed to streamline the revenue collection process and increase the empire's revenue while ensuring fair treatment of the farmers and the local populace. His efficient revenue system laid the foundation for a more organized and effective administration within the Mughal Empire.\n" +
                    "\n" +
                    "Additionally, Raja Todar Mal played a pivotal role in Akbar's administration by modernizing the treasury, advocating land reforms, and restructuring the military's pay system. His contributions significantly influenced the socio-economic and administrative fabric of the Mughal Empire, leaving a lasting impact on India's history and governance."
        ,"Known for his wit, wisdom, and intellect, Birbal was an exceptional diplomat and a remarkable administrator. His sharp intellect and quick thinking often helped Akbar in making wise decisions. The tales of his cleverness and problem-solving abilities have become legendary, forming the basis of numerous folk tales and fables.\n" +
                    "\n" +
                    "Raja Birbal was a patron of art and culture, contributing significantly to poetry and music during Akbar's reign. He was also a valiant warrior and led the Mughal army in various military campaigns.\n" +
                    "\n" +
                    "His influence in Akbar's court was immense, and he held several important positions, including that of a military general, envoy, and chief advisor. Raja Birbal's legacy is celebrated to this day through folklore, stories, and various adaptations in literature, theatre, and television."
        ,"\"Ramcharitmanas,\" written in Awadhi, a dialect of Hindi, is one of the most revered and widely read scriptures in Hinduism. It narrates the story of Lord Rama, incorporating spiritual and moral teachings. Tulsidas' poetry played a significant role in popularizing the stories of Lord Rama and making them accessible to a broader audience.\n" +
                    "\n" +
                    "In addition to \"Ramcharitmanas,\" Tulsidas composed numerous other works, hymns, and philosophical treatises, all centered around devotion, righteousness, and the teachings of Lord Rama. His influence on the cultural, religious, and literary heritage of India is profound, and his legacy continues to inspire millions of devotees and readers worldwide."
        ),
        arrayOf("Shivaji Maharaj is renowned for pioneering guerrilla warfare tactics known as \"Ganimi Kava,\" which he employed effectively against the mighty Mughal Empire and other adversaries. He emphasized the concept of \"Hindavi Swarajya\" or self-rule for the people of the Indian subcontinent.\n" +
                "\n" +
                "His reign was marked by a fair and just administration, religious tolerance, and a focus on economic prosperity. Shivaji Maharaj is credited with pioneering a navy, reforming the revenue system, and establishing a well-organized administrative structure known as \"Ashta Pradhan,\" comprising eight ministers who assisted in governance.\n" +
                "\n" +
                "He also significantly contributed to Marathi literature and culture. His leadership and vision played a pivotal role in unifying the Maratha people and laying the foundation for a powerful Maratha Empire. Shivaji Maharaj's legacy as a revered leader and a symbol of Maratha pride continues to resonate in Maharashtra and beyond.\n" +
                "\n"
        ,"Rana Chhatrasal displayed exceptional military prowess from a young age. He rebelled against the oppressive Mughal rule and fought to liberate his kingdom from their dominance. He established a semi-autonomous state and made alliances with various regional powers to strengthen his position. His relentless resistance and strategic alliances played a significant role in challenging the might of the Mughal Empire.\n" +
                    "\n" +
                    "One of Rana Chhatrasal's most notable alliances was with the Maratha king Shivaji Maharaj, which helped form a strong front against the Mughals. His valor and resistance against the Mughal forces remain a source of inspiration, and he is celebrated for his contributions to the struggle for freedom and regional autonomy.\n" +
                    "\n" +
                    "Rana Chhatrasal's legacy is celebrated in the Bundelkhand region, and he is remembered as a warrior king who fiercely defended his kingdom and stood up against oppression and foreign rule.\n"
        ,"Maharana Raj Singh I succeeded to the throne of Mewar during a period of intense conflict and power struggles. He faced the daunting task of defending his kingdom against external aggressors, including the Mughal Empire under Aurangzeb. His reign witnessed fierce battles against the Mughals, particularly during the Mewar-Aurangzeb conflict.\n" +
                    "\n" +
                    "One of the most prominent events during his reign was the prolonged Siege of Udaipur, where Maharana Raj Singh I valiantly defended his capital against the forces of Aurangzeb. Despite facing immense odds and a prolonged siege, he displayed exceptional resilience and determination to protect his kingdom.\n" +
                    "\n" +
                    "Maharana Raj Singh I's reign was a crucial chapter in the history of Mewar, characterized by unwavering courage and a deep commitment to preserving the sovereignty and pride of his people. His legacy as a courageous and resilient ruler continues to be celebrated in Rajasthan, and he remains a revered figure in the annals of Rajputana history."
        ,"Sawai Jai Singh II was a visionary leader who had a keen interest in science and astronomy from an early age. He established several astronomical observatories, known as \"Jantar Mantars,\" across North India, including Jaipur, Delhi, Ujjain, Mathura, and Varanasi. These observatories were groundbreaking in their design and were intended for precise astronomical measurements.\n" +
                    "\n" +
                    "His most famous observatory, the Jantar Mantar in Jaipur, is a UNESCO World Heritage Site and houses a collection of architectural astronomical instruments. These instruments were used to accurately measure time, predict eclipses, and track celestial bodies' movements.\n" +
                    "\n" +
                    "In addition to his contributions to astronomy and science, Sawai Jai Singh II was an accomplished urban planner and architect. He founded Jaipur in 1727 and designed it according to the principles of Vastu Shastra and Shilpa Shastra. The city is known for its organized layout, grid-based streets, and distinctive pink sandstone architecture.\n"
        ,"One of the notable battles during his reign was the Battle of Deorai in 1679, where Rana Raj Singh I and his forces faced the Mughal army. Despite being outnumbered, Rana Raj Singh I displayed extraordinary valor and leadership, making a significant impact on the battlefield.\n" +
                    "\n" +
                    "Rana Raj Singh I's reign was a testament to the resilience and indomitable spirit of the Rajputs. His efforts to defend Mewar and uphold its traditions continue to be celebrated, and he is remembered as a courageous and principled ruler in the history of Rajasthan."
        ),
        arrayOf("One of the notable events associated with Raghunath Rao was the First Anglo-Maratha War (1775-1782), where he sought British assistance in his struggle for power within the Maratha Empire. However, this alliance led to the Treaty of Salbai in 1782, which marked a significant defeat for the Marathas.\n" +
                "\n" +
                "Raghunath Rao's life and ambitions were emblematic of the complex political landscape of 18th-century India, where various regional powers vied for control and influence. His actions and their consequences reflect the intricate dynamics of power and diplomacy during that era."
        ,"One of the most significant events associated with Tipu Sultan is the four Anglo-Mysore Wars fought between the British East India Company and the Kingdom of Mysore. These wars were marked by fierce battles and shifting alliances. Tipu Sultan's staunch opposition to British forces made him a symbol of resistance against colonial rule."
        ,"Raja Ram Mohan Roy is often referred to as the \"Father of the Indian Renaissance\" for his efforts to modernize and transform Indian society. He was a fervent advocate for women's rights, the abolition of Sati (the practice of widow burning), and various other social evils prevalent during that era.\n" +
                    "\n" +
                    "In 1828, he founded the Brahmo Samaj, a socio-religious movement that sought to establish a monotheistic form of Hinduism based on reason, rationality, and the worship of one God. He emphasized the importance of reason and criticized idol worship and caste-based discrimination."
        ,"Haider Ali rose from a humble background to become a prominent military commander in the Mysorean army. He displayed exceptional military skills, particularly in guerrilla warfare, and gradually climbed the ranks. Haider Ali's leadership abilities led to his appointment as the de facto ruler of the kingdom of Mysore.\n" +
                    "\n" +
                    "During his rule, Haider Ali implemented significant reforms in various domains, including the military, taxation, and administration. He modernized the army, introducing new tactics and weaponry. He also encouraged trade and agriculture, promoting economic growth in the region."
        ,"Siraj-ud-Daula ascended to the throne in 1756 after the death of his grandfather, Alivardi Khan. His reign was marked by both internal and external challenges. He faced internal conspiracies and external threats from the British East India Company, which sought to expand its influence in the region.\n" +
                    "\n" +
                    "One of the most pivotal events during his rule was the Black Hole of Calcutta incident in 1756, where a group of British prisoners were allegedly confined in a small prison space, resulting in many deaths due to suffocation. This event significantly escalated tensions between the British and Siraj-ud-Daula's forces."
        ),
        arrayOf("Swami Vivekananda was a disciple of the Indian mystic Ramakrishna Paramahansa and played a vital role in the revival of Hinduism and its philosophies during the late 19th century. He addressed the Parliament of the World's Religions in Chicago in 1893, where he spoke about religious tolerance, the universality of spiritual truths, and the importance of peace and harmony among all people.\n" +
                "\n" +
                "Vivekananda emphasized the practical aspects of spirituality and the relevance of ancient Indian philosophies in modern times. He founded the Ramakrishna Mission and the Ramakrishna Math, organizations that propagate his teachings and contribute to education, healthcare, and social welfare."
        ,"Rani Lakshmibai was married to the Maharaja of Jhansi, Raja Gangadhar Rao. After the death of her husband, who had no biological heir, the British East India Company refused to recognize her adopted son as the heir to the throne, triggering tensions and leading to the rebellion.\n" +
                    "\n" +
                    "During the rebellion of 1857, Rani Lakshmibai played a vital role in leading the forces in the Battle of Jhansi and several other conflicts. She displayed exceptional bravery and strategic acumen in her fight against the British forces. Although Jhansi eventually fell to the British, Rani Lakshmibai's courage and sacrifice left an indelible mark on India's struggle for independence."
        ,"Vallabhbhai Patel was a prominent leader during the struggle for independence, working closely with Mahatma Gandhi and the Indian National Congress. He played a pivotal role in various movements against British colonial rule, advocating for non-violent civil disobedience and organizing protests.\n" +
                    "\n" +
                    "After India gained independence in 1947, Sardar Patel was appointed as the Deputy Prime Minister and the first Home Minister of India. He is best known for his efforts to integrate over 500 princely states into the newly independent nation, using diplomacy, negotiation, and, when necessary, firm action."
        ,"Tilak was one of the key leaders of the early phase of the freedom movement, advocating for radical and assertive approaches to challenge British rule. He popularized the slogan \"Swaraj is my birthright, and I shall have it,\" encouraging a sense of national pride and unity among the masses.\n" +
                    "\n" +
                    "He founded the Deccan Education Society in Pune in 1884 to promote education and foster a sense of nationalism. Tilak believed that education was a vital tool for the liberation of the country from British rule."
        ,"Subhas Chandra Bose was deeply influenced by the teachings of Swami Vivekananda and Mahatma Gandhi. He was an influential leader in the Indian National Congress (INC) and later in the Forward Bloc, advocating for complete and immediate independence from British rule.\n" +
                    "\n" +
                    "During World War II, Bose sought assistance from the Axis powers and organized the Indian National Army (INA) to fight alongside the Japanese against British forces in India. He is famously remembered for his rallying cry \"Give me blood, and I shall give you freedom!\" aimed at inspiring the masses to rise against colonial rule."
        ),
        arrayOf("Bhagat Singh was deeply influenced by the sacrifices of his family members and the prevailing political climate of British colonialism. He became actively involved in the fight against British rule from a young age. He was a prominent member of the Hindustan Socialist Republican Association (HSRA), which advocated for complete independence from British rule through revolutionary means.\n" +
                "\n" +
                "One of the most iconic acts associated with Bhagat Singh was his protest against repressive laws, such as the Public Safety Bill and the Trade Disputes Bill, by throwing non-lethal bombs in the Central Legislative Assembly in Delhi on April 8, 1929. He and his associates were arrested and used the trial as a platform to express their revolutionary ideals.\n"+
                "\n"+
                "Despite facing extreme torture and a controversial trial, Bhagat Singh remained steadfast in his commitment to the cause of the nation. He, along with Rajguru and Sukhdev, was sentenced to death and hanged on March 23, 1931, in Lahore Central Jail.\n" +
                "\n" +
                "Bhagat Singh's sacrifice and determination for a free and independent India continue to inspire generations. He is considered a national hero, and his legacy lives on in the hearts of millions, particularly in the state of Punjab and throughout India. His life and struggle are commemorated every year on his birth and death anniversaries."
        ,"Sukhdev Thapar was deeply influenced by the struggle for independence from a young age. He was an active member of the Hindustan Socialist Republican Association (HSRA), which sought to overthrow British rule through revolutionary means. Sukhdev, along with Bhagat Singh and Rajguru, was involved in the planning and execution of protests and actions against the oppressive British regime.\n" +
                    "\n" +
                    "One of the pivotal events linked to Sukhdev Thapar was the assembly bomb throwing incident on April 8, 1929, in the Central Legislative Assembly in Delhi. The objective was to protest repressive laws and policies by making a bold statement within the legislative space.\n"+
                    "\n"+
                    "\n" +
                    "Sukhdev Thapar, along with Bhagat Singh and Rajguru, was arrested and subsequently sentenced to death in the Lahore Conspiracy Case. They were executed on March 23, 1931, in Lahore Central Jail. Their sacrifice ignited a wave of patriotism and further fueled the fight for independence.\n" +
                    "\n" +
                    "Sukhdev Thapar's bravery, sacrifice, and dedication to the cause of India's freedom continue to be honored and remembered, particularly in Punjab and throughout the country. He remains an inspiration for future generations, symbolizing the relentless pursuit of freedom and justice."
        ,"Rajguru was deeply influenced by the struggle for independence and was an active member of the Hindustan Socialist Republican Association (HSRA), a revolutionary organization. He, along with Bhagat Singh and Sukhdev Thapar, became a key figure in the movement against British oppression.\n" +
                    "\n" +
                    "One of the most notable events associated with Rajguru was the assembly bomb throwing incident on April 8, 1929, inside the Central Legislative Assembly in Delhi. This act was a protest against repressive laws and policies imposed by the British, and it marked a significant moment in the fight for independence.\n"+
                    "\n"+
                    "Following the incident, Rajguru, along with Bhagat Singh and Sukhdev, was arrested and later sentenced to death in the Lahore Conspiracy Case. On March 23, 1931, they were executed in Lahore Central Jail, becoming martyrs for the cause of India's freedom.\n" +
                    "\n" +
                    "Rajguru's sacrifice and unwavering commitment to the struggle for independence continue to inspire and evoke pride, particularly in Maharashtra and across the nation. He remains an emblematic figure of bravery and the relentless pursuit of a free and just India."
        ,"Lal Bahadur Shastri's dedication to public service and the nation was evident from a young age. He actively participated in the freedom movement and joined the non-cooperation movement launched by Mahatma Gandhi in 1921. He became a prominent leader in the Indian National Congress and worked tirelessly to improve the lives of ordinary people.\n" +
                    "\n" +
                    "During his tenure as Prime Minister from 1964 to 1966, Shastri advocated for unity and discipline during a crucial period marked by both domestic and international challenges. He led the country during the Indo-Pakistan War of 1965 and coined the slogan \"Jai Jawan, Jai Kisan\" (Hail the Soldier, Hail the Farmer) to boost the morale of the soldiers and encourage agricultural productivity.\n"+
                    "\n"+
                    "Shastri was known for his simplicity, honesty, and dedication to the welfare of the common people. He implemented several significant policies to address the needs of the poor and promote social equality. His sudden demise in Tashkent in 1966 remains a matter of controversy and speculation.\n" +
                    "\n" +
                    "Lal Bahadur Shastri's legacy is celebrated across India, and his birthday, October 2, is observed as \"Shastri Jayanti\" in his honor. He remains a revered figure, particularly in Uttar Pradesh, where his birthplace, Mughalsarai, is now named after him as Shastri Nagar."
        ,"Dr. Kalam made significant contributions to the development of India's ballistic missile technology and nuclear capabilities. He played a crucial role in the Pokhran-II nuclear tests in 1998, which demonstrated India's nuclear capabilities and garnered international recognition.\n" +
                    "\n" +
                    "Apart from his scientific endeavors, A.P.J. Abdul Kalam was deeply committed to education and inspiring the youth. He visited schools and colleges extensively, interacting with students to motivate them towards pursuing science, innovation, and a sense of national pride.\n"+
                    "\n"+
                    "In 2002, Dr. Kalam was elected as the President of India, becoming the first scientist and bachelor to hold the position. During his presidency, he focused on encouraging education, youth development, and the importance of science and technology.\n" +
                    "\n" +
                    "Dr. Kalam's humility, simplicity, and dedication to the nation made him immensely popular among people from all walks of life. He remains an iconic figure, particularly in Tamil Nadu, where he was born, and across India. His teachings and vision for a developed and prosperous India continue to inspire millions, especially the youth."
        )
        )



        val firs = arrayOf(arrayOf("Prithviraja III, also called Prithviraj Chauhan, (born c. 1166—died 1192), Rajput warrior king of the Chauhan (Chahamana) clan of rulers who established the strongest kingdom in Rajasthan. Prithviraja’s defeat in 1192 in the second battle of Taraori (Tarain) at the hands of the Muslim leader Muʿizz al-Dīn Muḥammad ibn Sām (Muḥammad Ghūrī) marked a watershed in medieval history of India."
        ,"Rajaraja II ruled from 1146 AD -1173 AD. He is considered to be one of the weakest kings of the Chola dynasty. However, he succeeded in maintaining the enormous empire of the Cholas which included Madurai, Kongunadu, Thirunelveli, Nellore, Guntur, Vijayawada, Rajahmundry and Kalinga. In addition to this, Northern Sri Lanka was more or less under his control. Rajaraja II proved strong enough to retain control of the eastern Gangavadi province, which was regained from the Hoysalas by his predecessor, the great Vikrama Chola."
        ,"Jayadeva, (flourished 12th century), Indian author of the Sanskrit poem Gita Govinda (“Song of the Cowherd [Krishna]”).\n" +
                    "\n" +
                    "The son of Bhojadeva, a Brahman, he was born in the village of Kenduli Sasan, Orissa (now Odisha), near the city of Puri, and was married to Padmavati. Jayadeva was closely associated with the temple of Jagannatha (Krishna) at Puri, where recitation of his Gita Govinda was regularly performed by the maharis (temple dancers). Jayadeva has been honoured for several centuries at an annual festival at his birthplace, during which his poem is recited."
        ,"Akka Mahadevi was one of the early female poets of the Kannada language and a well-known personality in the Veerashaiva Bhakti movement of the 12th century. Her ‘Vachanas’ in Kannada, in the form of didactic poetry, are considered her greatest contribution to Kannada Bhakti literature. In total she wrote about 430 ‘Vachanas’ which is relatively fewer than that compared to some other saints of her time. Yet the term 'Akka' (elder Sister), which is an honorific given to her by great Veerashaiva saints like Basavanna, Chenna Basavanna, Kinnari Bommayya, Siddharama, Allamaprabhu and Dasimayya, speaks volumes of her contribution to the movement that was underway."
        ,"Bhāskara II, also called Bhāskarācārya or Bhaskara the Learned, (born 1114, Biddur, India—died c. 1185, probably Ujjain), the leading mathematician of the 12th century, who wrote the first work with full and systematic use of the decimal number system.\n" +
                    "\n" +
                    "Bhāskara II was the lineal successor of the noted Indian mathematician Brahmagupta (598–c. 665) as head of an astronomical observatory at Ujjain, the leading mathematical centre of ancient India. The II has been attached to his name to distinguish him from the 7th-century astronomer of the same name."
        ),
        arrayOf("Prataparudra -II succeeded his grandmother Rudramba in A.D.1295 and ruled till A.D.1323. He was the grandson of Rani Rudramadevi, but adapted him as her son on the advise of her father as she was not having her own son. According to the kaifiats found in Rayalaseema Kakatiya Prataparudra was an important ruler. In some records he was mentioned as Prataparudra Maharaja. . He is one of the most important and notable rulers of the Kakatiya dynasty. He was the last ruler of Kakatiya dynasty. Prataparudra-II ( Virarudra ) is one among the three greatest rulers of Kakatiya dynasty rulers. The other two were Prataparudra - I (Rudradeva) and Rudramadevi."
        ,"Gajapati Langula Narasingha Deva I was an Eastern Ganga monarch and a warrior of the Kalinga region who reigned from 1238 CE to 1264 CE.[1][2] He defeated the Muslim forces of Bengal who constantly threatened the Eastern Ganga dynasty's rule over his kingdom of Kalinga from the times of his father Anangabhima Deva III.[3] He was the first king from Kalinga and one of the few rulers in India who took the offensive against the Islamic expansion over India by Turko-Afghan invaders of Eastern India. His father had successfully defended his kingdom against the Turko-Afghan rulers of Bengal and crossed into Rarh, Gauda and Varendra in Bengal chasing the invaders on backfoot. "
        ,"Vidyaranya, known as Madhavacharya in his purvaashrama (life before taking up sanyasa), was born in 1268 CE to Mayannacharya and Srimatidevi. He was eldest of four siblings, which included his two brothers Sayana and Bhoganatha along with his sister Singaladevi. The three brothers completed their earlier education under Shankaranada and then moved to Kanchi to pursue further education under Vidyateertha. During this time began Madhavacharya’s friendship with Venkatanatha (commonly known as Sri Vedanta Desika)."
        ,"Bhaskaracharya III, a luminary in the realm of mathematics and astronomy, graced the intellectual landscape of India during the 13th century, specifically in Maharashtra. Born in 1207, he made significant strides in advancing mathematical knowledge and contributing to the field of astronomy. His comprehensive treatises and insightful works illuminated the intricacies of algebra, calculus, and geometry. Bhaskaracharya III's contributions were both pioneering and foundational, laying the groundwork for further advancements in mathematics."
        ,"Ramananda, a venerated saint and philosopher, made a profound impact on the spiritual and cultural landscape of India during the 13th century, particularly in the region of Uttar Pradesh. Born in 1299, Ramananda played a significant role in shaping the Bhakti movement, a devotional wave within Hinduism that emphasized a personal and loving connection with the divine."
        ),
        arrayOf("Rana Hammir Singh, a notable ruler of the Mewar kingdom in Rajasthan, India, ascended to the throne in 1326. His reign marked a significant era in the history of Mewar, characterized by a resurgence of the kingdom's power and influence. Rana Hammir Singh was a valiant warrior and an astute statesman, known for his military prowess and strategic acumen."
        ,"Rao Chunda, a prominent ruler of the Rathore clan in Rajasthan, India, ascended to power in 1384. His reign was a significant period in the history of Rajasthan, marked by stability, cultural progress, and territorial consolidation. Rao Chunda was a capable leader and a patron of art, culture, and architecture."
        ,"Harihara I, a prominent historical figure, was one of the founding rulers of the Vijayanagara Empire in the Deccan region of India. Born in 1333, Harihara I, alongside his brother Bukka Raya I, played a pivotal role in establishing this mighty empire. Their reigns marked a transformative period in South Indian history."
        ,"Bukka Raya I, a prominent historical figure, was a founding monarch of the Vijayanagara Empire, a significant medieval kingdom in the Deccan region of South India. Born around 1300, Bukka Raya I, along with his brother Harihara I, was instrumental in establishing this empire in the 14th century. Their reigns were pivotal in shaping the course of Deccan history.",
        "Lakshminarasimha Deva, a significant ruler in the history of Odisha, ascended to the throne in 1313, marking an important era in the region's history. He was a monarch of the Eastern Ganga dynasty, which was known for its strong influence and rule over parts of present-day Odisha and Andhra Pradesh."
        ),
        arrayOf("Rana Kumbha, a prominent ruler of the Mewar dynasty in Rajasthan, India, ascended to the throne in 1433. He is remembered as one of the most distinguished and visionary rulers in the history of Rajasthan. Rana Kumbha was not only a valiant warrior but also a passionate patron of art, culture, and architecture, leaving an indelible mark on the legacy of Rajasthan."
        ,"Rao Jodha, a significant historical figure and the founder of the princely state of Jodhpur, ascended to power in 1416. He was the chief of the Rathore clan of Rajputs and played a pivotal role in the history of Rajasthan, specifically in the Marwar region. Rao Jodha is remembered for his military prowess, administrative acumen, and the foundation of Jodhpur, the iconic 'Blue City.'"
        ,"Chaitanya Mahaprabhu, born in 1486 in Nabadwip, Bengal (present-day West Bengal, India), was a highly revered saint, philosopher, and proponent of the Gaudiya Vaishnavism tradition within Hinduism. He is considered a significant figure in the Bhakti movement, particularly in the Eastern regions of India."
        ,"Meera Bai, born in 1498 in Kudki, Rajasthan, was a prominent Hindu mystic, poetess, and devotee of Lord Krishna. She is revered as one of the most significant figures of the Bhakti movement in North India. Meera Bai's life and poetry exemplify a deep, passionate devotion to Lord Krishna and a longing for spiritual union with the divine."
        ,"Kabir, a profound saint and poet, was born around 1440 in what is now known as Uttar Pradesh, India. He is one of the most esteemed figures in the Bhakti movement and Sant Mat, a spiritual tradition emphasizing the importance of a personal connection with the divine.Kabir's teachings emphasized the oneness of God and the unity of all religions. He rejected the rituals and caste system prevalent in society at that time, promoting a simple and direct path to spirituality through devotion and love. His verses often encouraged seekers to seek the divine within and recognize the universal truth."
        ),
        arrayOf("Maharana Pratap Singh, born in 1540, was the 13th Rajput king of Mewar, a region in present-day Rajasthan, India. He is celebrated as a legendary and valiant warrior who fiercely defended his kingdom and people against the Mughal forces, particularly during the reign of Emperor Akbar."
        ,"Maharana Sangram Singh, more popularly known as Rana Sanga, was a prominent ruler of the Rajput state of Mewar in Rajasthan, India. He was born in 1509 and is celebrated as a valiant and skilled warrior, diplomat, and strategist.\n" +
                    "\n" +
                    "Rana Sanga ascended to the throne of Mewar in 1509 and became one of the most powerful Rajput rulers of his time. He is remembered for his efforts to unite the Rajput clans and kingdoms against the foreign invaders, particularly against the expanding Mughal Empire. He forged alliances with other Rajput rulers to present a formidable opposition to the Mughals, aiming to protect the sovereignty and traditions of the Rajput states."
        ,"Raja Todar Mal, born in 1510, was a notable figure during the reign of the Mughal Emperor Akbar. He was an influential statesman, revenue minister, and one of the \"Navaratnas\" (nine gems) in Akbar's court. Though he was born in the present-day Uttar Pradesh region, he played a significant role in the administration of the Mughal Empire, primarily in North India."
        ,"Raja Birbal, also known as Mahesh Das, was one of the Navaratnas (nine gems) in the court of the Mughal Emperor Akbar. He was born in 1528 in the present-day region of Madhya Pradesh, India. Raja Birbal was not only a trusted advisor to Akbar but also a close friend and confidant."
        ,"Tulsidas, a highly revered saint, poet, and philosopher, was born in 1532 in Rajapur, present-day Uttar Pradesh, India. He is best known for his significant contributions to Hindu literature, particularly the epic poem \"Ramcharitmanas,\" an extraordinary retelling of the ancient Indian epic, the Ramayana.\n" +
                    "\n" +
                    "Tulsidas was an ardent devotee of Lord Rama, and his works primarily revolve around the life, teachings, and exploits of Lord Rama. He propagated the Bhakti movement, emphasizing a deep, personal devotion to Lord Rama as a means to attain spiritual liberation."
        ),
        arrayOf("Shivaji Maharaj, a legendary figure and the founder of the Maratha Empire, was born in 1630 in the fortress of Shivneri, Maharashtra, India. He is celebrated as one of the greatest warriors and strategists in Indian history, revered for his remarkable military campaigns, administrative acumen, and dedication to establishing a sovereign Maratha state."
        ,"Rana Chhatrasal, a notable warrior and king, was born in 1649 in the Bundela Rajput clan of North India, in present-day Uttar Pradesh. He is remembered for his valiant efforts against the Mughal Empire and for being a prominent figure in the struggle for independence in the 17th century."
        ,"Maharana Raj Singh I, born in 1653 in the esteemed Mewar dynasty of Rajasthan, India, was the reigning Maharana (king) of Mewar during a critical period in the 17th century. His rule was marked by significant challenges and efforts to safeguard the honor and sovereignty of Mewar."
        ,"Sawai Jai Singh II, born in 1686 in Amber, Rajasthan, was a prominent ruler and scholar known for his contributions to astronomy, mathematics, and architecture. He was the Rajput ruler of the kingdom of Amber, which later became Jaipur, one of the key princely states of Rajputana."
        ,"Rana Raj Singh I, born in 1653, was a prominent ruler from the Rajput clan of Mewar in Rajasthan, India. He ascended to the throne of Mewar at a critical period when the kingdom faced numerous challenges, both internally and externally.\n" +
                    "\n" +
                    "Rana Raj Singh I's reign was marked by conflicts with the Mughal Empire, particularly during the reign of Aurangzeb. Aurangzeb aimed to expand his empire and exert control over Rajputana, including Mewar. Rana Raj Singh I valiantly resisted Aurangzeb's advances and fought to maintain the sovereignty and honor of Mewar."
        ),
        arrayOf("Raja Raghunath Rao, also known as Raghunathrao Ballal, was a prominent statesman and military leader during the 18th century in India. He was born in 1769 in Maharashtra, India. Raghunath Rao was a key figure during a critical period in Indian history, particularly within the context of the Maratha Empire.\n" +
                "\n" +
                "Raghunath Rao was a member of the Peshwa dynasty, a powerful ruling family within the Maratha Empire. He played a significant role in the internal politics and conflicts that characterized the Maratha Empire during his time. His ambition for power and the Peshwa throne led to conflicts and disputes within the empire."
        ,"Tipu Sultan, born in 1751 in Devanahalli (present-day Karnataka, India), was a notable ruler and military leader. He was the eldest son of Sultan Hyder Ali of Mysore and is renowned for his valiant efforts in resisting British colonialism during the late 18th century.\n" +
                    "\n" +
                    "Tipu Sultan succeeded his father as the Sultan of Mysore after Hyder Ali's death in 1782. He is remembered for his military prowess and his determined resistance against British expansionism in South India. He modernized the Mysorean army, introduced various administrative reforms, and fostered economic development within his kingdom."
        ,"Raja Ram Mohan Roy, born on May 22, 1772, in Radhanagar, Bengal Presidency (present-day West Bengal, India), was a prominent socio-religious reformer and the founder of the Brahmo Samaj, a reform movement in Hinduism. He played a pivotal role in advocating for social, educational, and religious reforms during the 19th century in India."
        ,"Haider Ali, born in 1720 in Budikote, Karnataka, India, was a significant military leader and ruler in the kingdom of Mysore. He is best known for his military prowess, administrative reforms, and his role in shaping the destiny of the state of Mysore."
        ,"Nawab Siraj-ud-Daula, born in 1733, was a significant historical figure during the mid-18th century in the Indian subcontinent. He was the Nawab of Bengal, Bihar, and Orissa, ruling over a significant portion of present-day West Bengal, Bangladesh, and parts of Odisha."
        ),
        arrayOf("Swami Vivekananda, born on January 12, 1863, in Calcutta (present-day Kolkata), West Bengal, India, was a prominent Hindu monk, philosopher, and spiritual leader. He was a key figure in the introduction of Indian philosophies of Vedanta and Yoga to the Western world."
        ,"Rani Lakshmibai, born on November 19, 1828, in Varanasi, Uttar Pradesh, India, was a prominent leader in the Indian Rebellion of 1857, also known as the First War of Indian Independence or the Sepoy Mutiny. She was the Queen of the Maratha-ruled state of Jhansi and is remembered as a symbol of resistance against British colonial rule."
        ,"Sardar Vallabhbhai Patel, born on October 31, 1875, in Nadiad, Gujarat, India, was a prominent statesman, barrister, and a key figure in the Indian independence movement. He is widely remembered as the \"Iron Man of India\" for his instrumental role in unifying the princely states and consolidating the nation after independence."
        ,"Bal Gangadhar Tilak, born on July 23, 1856, in Chikhali, Maharashtra, was a prominent freedom fighter, social reformer, and political leader during the Indian independence movement. He was a pivotal figure in the struggle for independence and is remembered for his advocacy of Swaraj (self-rule) and his role in mobilizing the masses."
        ,"Subhas Chandra Bose, born on January 23, 1897, in Cuttack, Odisha, was a prominent freedom fighter, nationalist leader, and a significant figure in the Indian independence movement. He is known for his unyielding efforts to liberate India from British rule and his commitment to using any means necessary to achieve that end."
        ),
        arrayOf("Bhagat Singh, born on September 28, 1907, in Banga, Punjab, was a revolutionary freedom fighter and a symbol of India's struggle for independence. He is remembered for his unyielding patriotism, courage, and sacrifice for the nation."
        ,"Sukhdev Thapar, born on May 15, 1907, in Ludhiana, Punjab, was a prominent freedom fighter and revolutionary during the Indian independence movement. He is remembered for his active involvement in various protests and revolutionary activities against British colonial rule in India."
        ,"Shivaram Hari Rajguru, born on August 24, 1908, in Khed, Maharashtra, was a valiant freedom fighter and a significant revolutionary during the Indian independence movement. He is remembered for his fierce dedication to the cause of India's liberation from British colonial rule."
        ,"Lal Bahadur Shastri, born on October 2, 1904, in Mughalsarai, Uttar Pradesh, was an eminent statesman and the second Prime Minister of independent India. He played a vital role in the country's freedom struggle and the post-independence period, advocating for peace, equality, and social justice."
        ,"A.P.J. Abdul Kalam, born on October 15, 1931, in Rameswaram, Tamil Nadu, was a highly respected scientist, educator, and the 11th President of India. He played a pivotal role in India's defense and space programs and was fondly known as the \"People's President\" for his close connection with the citizens of India."
        )
        )


        val content = intent.getIntExtra("One",0)
        val receive = intent.getIntExtra("Century",0)

            var fin = findViewById<TextView>(R.id.fina)
            fin.text = fina[receive][content]
            var first = findViewById<TextView>(R.id.first)
            first.text = firs[receive][content]
            var image = findViewById<ImageView>(R.id.image)
            var ima = picture[receive][content]
            image.setImageResource(ima)

            var name = findViewById<TextView>(R.id.name)
            name.text = naam[receive][content]

            var birth = findViewById<TextView>(R.id.birth)
            birth.text = date[receive][content]

            var place = findViewById<TextView>(R.id.place)
            place.text = jagah[receive][content]


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