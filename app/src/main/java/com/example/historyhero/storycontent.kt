package com.example.historyhero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class storycontent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_storycontent)

        val pic = arrayOf(R.drawable.first,R.drawable.second,R.drawable.third,R.drawable.forth,R.drawable.fifth)

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
        val con = arrayOf("As a young boy, Prem Bihari used to watch his grandfather write. Every now and then his grandfather would dip the nib into the bottle to draw ink, and the little boy would be fascinated to see letters taking shape on the paper.\n" +
                "\n" +
                "Prem Bihari had lost his father when he was quite young and was brought up by his grandfather, Ram Prasad Saxena. One day, his grandfather presented him with a set of penholders, nibs, and inkbottle. Under the watchful eyes of the old man, who was himself an expert calligrapher, Prem Bihari started crafting letters on paper. He took care not to make spelling mistakes, as he hated striking off letters and not even a little drop of ink would he spill! Teaching him the secret of handcrafting artistic letters, his grandfather would say, “What you hold in your hand is not just a pen, it is an artist’s brush. An artist creates images using his brush. You breathe life into letters with your nib. Such should be your dedication that as your nib touches the paper, letters should bloom like flowers…”\n"+
                "\n"+
                "When he grew up, Prem Bihari Narayan Saxena chose the art he loved as his life’s vocation. He earned fame as an expert calligrapher of his time, like his grandfather before him. While he was admired for his artistic handwriting, little did he dream that he was going to have a hand in the writing of a historic document: the Constitution of free India. \n" +
                "\n"+
                "The exercise of making a constitution for India by her own citizens had begun even before the country emerged independent. The Constituent Assembly, consisting of people’s representatives, met for the first time on 9 December 1946, in the Constitution Hall which is now known as the Central Hall of Parliament House. Two hundred and seven representatives, including nine women, were present.   The Drafting Committee of constitution experts, headed by Dr. B. R. Ambedkar, worked day and night to prepare the Constitution. Jurist B. N. Rau who was appointed as the constitutional adviser travelled to the US, Canada, Ireland and UK, where he held discussions with scholars, judges and authorities of legislative law. In early 1948, he prepared the original draft of the Constitution, which was later debated and revised by the drafting committee, steered throughout by Dr. B. R. Ambedkar. The draft Constitution was discussed by the Constituent Assembly, under the chairmanship of Babu Rajendra Prasad. It took nearly three years to complete the discussion. After several sittings, finally the Constituent Assembly adopted the Constitution of India, which came into force on 26 January 1950; we celebrate this day as Republic Day.\n"+
                "\n"+
                "The opening page of our Constitution begins with these famous words, “We the people of India …” and concludes with, “… in our constituent assembly, this twenty sixth day of November 1949, do hereby adopt, enact, and give to ourselves this constitution.”\n" +
                "\n" +
                "The Constitution of India is not a lifeless book of dry rules and regulations. It is book which reflects the dreams and aspirations of every Indian. Cold prints would not capture the heartbeat of those men and women who dreamt of an India of equality, prosperity and justice for all. No wonder, Pandit Jawaharlal Nehru, the first prime minister of the country, decided against getting the constitution typeset. He picked up the phone and asked for Prem Bihari Narayan Saxena.\n"+
                "\n"+
                "Prem Bhihari was elated when Panditji told him that he had been chosen to write the Constitution of India in his own hand. Panditji gave him a room in the house of Parliament to set up his calligraphy studio. Bundles of parchment sheets were neatly arranged. Over 400 penholders with nib number 303b were kept ready. The nibs were brought from England and Czechoslovakia.\n"+
                "Before Prem Bihari began the work, President Rajendra Prasad took Prem Bihari to Santiniketan to meet artist Nandalal Bose. Prem Bihari discussed with Bose how the pages would be laid out, where the text would appear, and where Bose would place illustrations and decorations to add beauty to the precious book which the nation was eagerly waiting for.\n" +
                "\n" +
                "It is Nandalal Bose and his students who adorned the pages of the Constitution with artwork representing the history, geography and culture of India: the seals of the Indus Valley Civilisation feature in it; episodes from the Ramayana and Mahabharata, and from the lives of Gautama Buddha and Mahavira; Emperor Ashoka and his propagation of Buddhism; of King Vikramaditya; Emperor Akbar; Queen Lakshmibai of Jhansi; Tipu Sultan; of Mahatma Gandhi leading the Independence Movement; of Subhas Chandra Bose. These were painted with great thought, matching them to the content on the pages.\n"+
                "On the parchment pages, Prem Bihari inscribed the Constitution in the beautiful italic style of calligraphy, with its delicate loops and gracefully curled quotation marks and parentheses.  Not one word is out of place, nor is one blotch of ink to be found anywhere. The aesthetically slanting letters, the borders covered with decorative designs, and headed by historical illustrations, will make you salute those who created this work of art.\n" +
                "\n" +
                "It took Prem Bihari six months to finish writing the Constitution. When Panditji had asked how much he should be paid for his labour, Prem Bihari had just smiled and said it was a labour of love and no payment was expected. But Panditji had agreed to Prem Bihari’s one request that his name would be inscribed at the bottom of every page, and that the very last leaf would also carry the name of his grandfather who taught him calligraphy.\n"+
                "The Indian Constitution is a 251-page bound volume, measuring 22 inches in length and 16 inches in width, weighing 3 kilos and 650 grams. It is housed today in a case in the Library of India’s Parliament House in New Delhi. The nitrogen-filled case in which a temperature of 20°C (+/- 2°C) and a humidity level of  30% (+/- 5%) is maintained, protects it from decay.\n\n\n"
        ,"It was the 1940s. India’s Freedom Struggle was at its peak. Young Indians especially were getting impatient. They wanted to be rid of the British rule as soon as possible.\n" +
                    "\n" +
                    "A band of youngsters in Gohpur, Assam, had formed the Mrityu Bahini, a group determined to lay down their lives for the nation.\n" +
                    "\n" +
                    "On August 8, 1942, the youngsters were excited. Mahatma Gandhi was expected to announce an action plan at Gowalia Tank in far-off Mumbai. It would take a day or two for news to reach them.\n" +
                    "\n" +
                    "\n" +
                    "However, the very next day they heard that Gandhiji and several other leaders had been arrested by the police. The Indian National Congress, which was spearheading the freedom movement, was banned. So were all public gatherings.\n" +
                    "\n" +
                    "Mahatma Gandhi’s message\n" +
                    "“But what did the Mahatma say? What does he want us to do?” asked Mukunda Kakati, an activist of the Mrityu Bahini. They had no clue as the government had ordered newspapers not to carry reports of Gandhiji’s speech.\n" +
                    "\n" +
                    "Fortunately, those who attended the meeting, had noted what Gandhiji had said. They made several copies of his speech and secretly sent it to all parts of the country. One such copy reached Gohpur. A young lad came running, clutching a piece of paper.\n" +
                    "\n" +
                    "\n" +
                    "Kanaklata Barua, another activist of the group, snatched the crumpled paper, and read out, as her comrades listened with rapt attention. \n" +
                    "\n" +
                    "The note said that Gandhiji had asked the British to Quit India, and then given his countrymen a simple message. “This is the mantra Mahatma has given us,” announced Kanaklata, “He wants us to carry it on our hearts. The mantra is: Do or Die. We shall either free India or die in the attempt. We shall not live to see the continuation of our slavery.”\n" +
                    "\n" +
                    "\n" +
                    "Mukunda Kakoti shouted. “We are free. We don’t need anyone to give us freedom. We give freedom unto ourselves. We are free.”\n" +
                    "\n" +
                    "Kanaklata added, “The British will no longer order us. We refuse to accept them as our Masters.”\n" +
                    "\n" +
                    "\n" +
                    "The youngsters clinched their fist. There was fire in their eyes. They said resolutely, in one voice, “Yes. We shall free India. If we have to pay with our lives, so be it.”\n" +
                    "\n" +
                    "A youngster chipped in, “If we are free, why do we see the British flag flying in Gohpur?”\n" +
                    "\n" +
                    "“Let’s set it right. We shall fly our national flag, the Tricolour, in its place,” said Kanaklata.\n" +
                    "\n" +
                    "A daring plan\n" +
                    "On 20 September 1942, the Bahini decided to hoist the national flag at the local police station.\n" +
                    "\n" +
                    "In the morning, a band of young freedom fighters took out a procession, shouting, ‘Vande Mataram,’ and ‘Mahatma Gandhi Ki Jai’. The group was led by Kanaklata and they made their way to the police station.\n" +
                    "\n" +
                    "\n" +
                    "The procession was soon stopped by the police. Ignoring them, Kanaklata walked on. “One more step, and I’ll shoot,” warned a police official.\n" +
                    "\n" +
                    "Kanaklata responded by shouting, “Vande Mataram.” Her comrades joined her in chanting the freedom mantra, “Karo ya maro (Do or die)”.\n" +
                    "\n" +
                    "The police shot at Kanaklata. Even as she fell, Kanaklata held the national flag high.\n" +
                    "\n" +
                    "As Kanaklata’s grip weakened, the national flag slid from her hand. Mukunda Kakati rushed forward and took the flag from her. He stepped towards the police station. The police fired at Mukunda.\n" +
                    "\n" +
                    "\n" +
                    "As Mukunda fell, a group of young freedom fighters took the flag to the top of the building and hoisted the national flag.\n" +
                    "\n" +
                    "Even as Kanaklata and Mukunda Kakati closed their eyes, never to open them again, they smiled watching the Tricolour flying high.  \n" +
                    "\n" +
                    "India’s golden moment had arrived. Freedom was not far off.\n\n\n"
        ,"Jui was excited. It was her 11th birthday. Her parents were taking her to the fort.Jui lived with her parents in a village at the foot of a hill in the Sahyadri mountain range. The hill was called Rairi. There was an old fort on top of the hill. Shivaji Maharaj made it his capital and gave it a new name – Raigad.\n" +
                    "\n" +
                    "“Are you sure, Jui, you can climb the hill?” asked her mother anxiously.\n" +
                    "\n" +
                    "\n" +
                    "“Don’t you worry,” said Jui’s father, “If she feels tired, I can carry her on my shoulders, just like old times.”\n" +
                    "\n" +
                    "“No Baba,” protested Jui. “I’m 11. I’m a strong girl. I’ll climb the fort myself.”\n" +
                    "\n" +
                    "They left home early in the morning. They wanted to reach the fort before it got hotter. It was a long climb. They had to rest now and then.\n" +
                    "\n" +
                    "\n" +
                    "“Why did Shivaji Maharaj choose this place as his capital?” Jui asked, “He could have built a fort in our village.”\n" +
                    "\n" +
                    "“Jui, it is safer on the hill. No army can climb this hill, without being spotted by the brave Marathas soldiers,” said her father.\n" +
                    "\n" +
                    "“Oh, yes. The hills protect our Maharaj,” said Jui.\n" +
                    "\n" +
                    "By then they reached the Maha Darwaja, the main gate.\n" +
                    "\n" +
                    "“Is this gate kept open all the time?” Jui asked.\n" +
                    "\n" +
                    "“No Jui. It is closed at sunset and is opened only at dawn,” said her father.\n" +
                    "\n" +
                    "Jui noticed that her mother shivered a bit. Her father put his arm round her.\n" +
                    "\n" +
                    "\n" +
                    "By now Jui was hungry. They sat under a tree and opened the food packet. Mother served poha, batata-vada and alu-vadi.\n" +
                    "\n" +
                    "“I’m full,” announced Jui.\n" +
                    "\n" +
                    "The family decided to take a walk around the fort. It was a long and leisurely walk.\n" +
                    "\n" +
                    "A dog ran towards them as they neared the fort’s back. Jui and her parents didn’t know how to react. Then they heard a shout, “Waghya!”\n" +
                    "\n" +
                    "The dog slowed down. Jui patted the dog as it wagged its tail.\n" +
                    "\n" +
                    "\n" +
                    "Then the dog’s master appeared. It was Shivaji Maharaj himself!\n" +
                    "\n" +
                    "Waghya, which means tiger, was his pet dog.\n" +
                    "\n" +
                    "Seeing Shivaji Maharaj, Jui’s parents bowed, touching the ground three times, with their hands. Jui did the same. Though she had not seen Shivaji Maharaj before, Jui rightly guessed this was the Great Maratha she adored.\n" +
                    "\n" +
                    "Shivaji Maharaj smiled at them, “Hira tai. I’m seeing you after so many years!”\n" +
                    "\n" +
                    "Jui was surprised that Shivaji Maharaj knew his mother.\n" +
                    "\n" +
                    "\n" +
                    "Jui’s mother bowed to Maharaj and said. “Maharaj this is my husband. And this…”\n" +
                    "\n" +
                    "“…is your daughter!” Maharaj said completing Hira’s sentence.\n" +
                    "\n" +
                    "With a faraway look, Maharaj said softly, “How old is she? Let me guess, 11 years?”\n" +
                    "\n" +
                    "Jui could not control her excitement. “Yes, today is my 11th birthday.”\n" +
                    "\n" +
                    "Shivaji Maharaj took her hand. “What’s your name?”\n" +
                    "\n" +
                    "Jui told Maharaj her name.\n" +
                    "\n" +
                    "“Jui, since today’s your birthday, I want to give you a gift. Tell me, what do you like best?”\n" +
                    "\n" +
                    "“Stories!” said Jui.\n" +
                    "\n" +
                    "“Alright, I’ll tell you a story for your birthday. Come, let’s all sit down.”\n" +
                    "\n" +
                    "Hira and her family sat around Shivaji Maharaj to listen to the story\n" +
                    "They found a cozy place under a tree. Somebody brought a chair for Shivaji Maharaj. Maharaj waved it away and sat on a rock, with Jui seated next to him. Waghya wagged his tail, settling next to Jui. Others sat around Shivaji Maharaj.\n" +
                    "\n" +
                    "Shivaji Maharaj tells Jui a story\n" +
                    "“Long ago, a milkmaid used to come to our fort every morning to sell milk. She would return to her village before the Maha Darwaja was closed for the day in the evening.\n" +
                    "\n" +
                    "One day, she got delayed in the fort. When she reached the Maha Darwaja, it was already closed. The milkmaid pleaded with our guards to open the gate. But the guards had strict orders to keep the gates closed in the evening. They could be thrown open only in the morning.\n" +
                    "\n" +
                    "\n" +
                    "The guards advised the stranded milkmaid to spend the night in the fort and return to her village in the morning.  She pleaded with them. Her baby was waiting for her back home. The baby would go hungry the whole night if she didn’t return. The baby wouldn’t sleep without hearing a lullaby.\n" +
                    "\n" +
                    "The guards sympathised with the milkmaid, but they could not help her. They had to follow the order.\n" +
                    "\n" +
                    "\n" +
                    "The milkmaid walked away. The guards thought she had found shelter somewhere in the fort.”\n" +
                    "\n" +
                    "Jui noticed from the corner of her eyes that her mother’s head was bowed. Her eyes were fixed on the ground. Jui wanted to make sure she was feeling alright. But the story was so interesting, she turned her attention to it once more.\n" +
                    "\n" +
                    "Shivaji Maharaj continued the story, “The next morning the guards opened the Maha Darwaja. To their shock, they found the milkmaid waiting outside. Last night, she had pleaded to be let out. And here she was standing outside the fort in the morning!\n" +
                    "\n" +
                    "\n" +
                    "‘How did you get out of the fort in the night?’ the Chief of Guards asked the milkmaid.\n" +
                    "\n" +
                    "‘I went down the hills,’ she replied.\n" +
                    "\n" +
                    "Hira the milkmaid climbed down the steep hill\n" +
                    "The guards refused to believe her. ‘There’s only one way in and out of the fort – through the Maha Darwaja. There’s no other way to leave the fort without us knowing about it.’\n" +
                    "\n" +
                    "Then one of the guards added slowly, ‘Unless you found a secret passage to get out of the fort. That’s it. You must have found a secret passage. Show it to us!’\n" +
                    "\n" +
                    "The milkmaid said she didn’t know of any secret passage. The guards reported the matter to me. They also brought the milkmaid before me.”\n" +
                    "\n" +
                    "Shivaji Maharaj paused. Jui hardly noticed that her mother’s eyes had welled up.\n" +
                    "\n" +
                    "Shivaji Maharaj continued with the story:\n" +
                    "\n" +
                    "“I realised the milkmaid was telling the truth. She was also frightened. At the same time, she had me worried. If someone had found a way out of the fort without being seen by our guards, someone could also enter the fort the same way. That meant Raigad was not as safe as I thought it was.”\n" +
                    "\n" +
                    "Jui nodded her head in agreement. “So what did you do, Maharaj?” she asked.\n" +
                    "\n" +
                    "“I asked the milkmaid to show me where she got out of the fort. She agreed and led me to this very spot where we are now sitting.”\n" +
                    "\n" +
                    "There was a hushed silence.\n" +
                    "\n" +
                    "Maharaj continued, “This is the steepest side of the hill. Nobody could climb up from this side to enter the fort. At least, that’s what we all thought. So, we had left this side without the protective wall.\n" +
                    "\n" +
                    "The milkmaid told us she climbed down from this spot. She even showed the milk pots she had left behind in the bushes. I went close to the spot and looked down. It was so steep I could not believe anyone would dare to go down using that way.\n" +
                    "\n" +
                    "I turned to the milkmaid and said to her. ‘Go down the hill in front of me. Then I’ll believe you.’\n" +
                    "\n" +
                    "The milkmaid stepped forward. My heart leapt. ‘Would she really go down?’\n" +
                    "\n" +
                    "She looked down and then she stepped back. I could see fear all over her face. ‘I cannot do it, Maharaj! I cannot!’ she shouted.\n" +
                    "\n" +
                    "‘But you just said you climbed down last night!’ I pointed out.\n" +
                    "\n" +
                    "‘I don’t know how I did it, Maharaj,’ she cried. ‘I had only one thought – my little girl is hungry. if I don’t get back to feed her milk, she will suffer the whole night. I had to reach home. So I went down. Now, I cannot.’”\n" +
                    "\n" +
                    "Jui’s mother shed a drop of tear which, went unnoticed as everybody were looking at Shivaji Maharaj.\n" +
                    "\n" +
                    "“I believed her. My heart told me a mother would not lie. I asked her to deliver all the milk at my home and go back to her child,” said Shivaji Maharaj. “Then I got this wall built here and also built a watch tower. Do you know what this watch tower is called, Jui?” asked Shivaji Maharaj.\n" +
                    "\n" +
                    "As she shook her head to say ‘No,’ Shivaji Maharaj said, “It is named after that milkmaid. This is the Hira Kani Watch Tower.”\n" +
                    "\n" +
                    "“Hira Kani!” Jui exclaimed. “That’s my mother!”\n" +
                    "\n" +
                    "“Yes, Jui,” said Shivaji Maharaj.” That night, eleven years ago, this brave mother went down this steep hill so that she could be with her child – with you!”\n" +
                    "\n" +
                    "“Aai!” Jui screamed as she turned to her mother, who gathered her in an embrace, tears running down her cheeks.\n" +
                    "\n" +
                    "Shivaji Maharaj smiled. \n" +
                    "\n" +
                    "Waghya waged his tail in joy.\n" +
                    "\n" +
                    "NOTE: Hira Buruz stands to this day at the Raigadh fort. While the event leading to the construction of this watch tower is historical, the frame work of the story where Shivaji Maharaj narrates the story to Hira’s daughter is imagined by the author, to\n" +
                    "bring out how caring Shivaji Maharaj was.\n\n\n "
        ,"Hakka and Bukka were brothers and warriors. The brothers wanted to build their own kingdom where people could live without fear. They collected a band of young men and trained them in warfare. They lived in a forest hideout on the banks of the river Tungabhadra in South India.\n" +
                    "\n" +
                    "One day, the brothers were out on a hunt. Ferocious dogs accompanied them. They crossed the river and rode on. A couple of frightened rabbits ran out of the bushes. The dogs gave them chase with the two brothers closely behind on their horses.\n" +
                    "\n" +
                    "It was a long chase. The rabbits were running for their life. The dogs were catching up. Suddenly, in a swift move, the rabbits turned and faced the dogs. Taken aback by the show of defiance, the barking dogs stepped back. Hakka called back the dogs. As the dogs turned back, the rabbits walked away.\n" +
                    "\n" +
                    "Hakka looked around. They were on the other side of the Tungabhadra. It was a rocky land. The sun was blazing in the sky.\n" +
                    "\n" +
                    "“Strange! I’ve never seen rabbits challenging dogs before!” said Bukka.\n" +
                    "\n" +
                    "\n" +
                    "“That’s the quality of this land,” said a quiet voice, “Even rabbits give fight.”\n" +
                    "\n" +
                    "Startled to hear a stranger speak, the two brothers turned.\n" +
                    "\n" +
                    "They saw a holy man walking towards them. He was a picture of peace. At the same time, his eyes were blazing bright.\n" +
                    "\n" +
                    "\n" +
                    "The brothers fell at his feet.\n" +
                    "\n" +
                    "“You must be Vidyaranya, the famous sage of Sringeri,” said Hakka.\n" +
                    "\n" +
                    "“And you are the brothers struggling to build a kingdom – Hakka and Bukka,” said the saint with a smile.\n" +
                    "\n" +
                    "\n" +
                    "The brothers had heard that Vidyaranya was doing penance on the banks of the Tungabhadra. Nobody knew his exact whereabouts. And here he was, giving them his blessings!\n" +
                    "\n" +
                    "“There are hundreds of kingdoms. Tell me, in what way will your kingdom be different?” asked Vidyaranya.\n" +
                    "\n" +
                    "\n" +
                    "“Our kingdom will have a strong foundation,” said Hakka, speaking slowly, weighing every word. “Foundation of Dharma – truth and justice.”\n" +
                    "\n" +
                    "Vidyaranya smiled, “I’m glad you said it. Truth and justice. Peace and prosperity. You will build an empire that will stand for the victory for truth and justice. Call it Vijayanagara. Build your capital at the very place which knows no fear,where even rabbits are courageous!”\n" +
                    "\n" +
                    "The brothers bowed.\n" +
                    "\n" +
                    "Soon Vijayanagara emerged as a powerful empire on the banks of the Tungabhadra, with Hampi as its capital.\n" +
                    "\n" +
                    "Note: Vijayanagara was founded in CE 1336. Its most celebrated ruler was Sri Krishna Deva Raya (CE 1509 to 1529). The city of Hampi is in ruins today, and is listed as a UNESCO WORLD HERITAGE SITE.\n\n\n "
        ,"King Paurava, also known as Porus, ruled the region between the rivers Jhelum and Chenab in North India. One day a messenger arrived in his court. He had a fair skin and spoke a foreign language. His message was simple: Submit to King Alexander or be ready for war.\n" +
                    "\n" +
                    "Porus had heard of Alexander, King of Macedonia, near far away Greece. He was a great warrior who had conquered large parts of Egypt and even defeated the mighty Persian Empire. Paurava’s spies had warned the court of Alexander’s march towards their borders. Many kings along the way had meekly submitted to Alexander without a fight. But King Porus had other ideas.\n" +
                    "\n" +
                    "\n" +
                    "“Tell your king that we will meet him in the battlefield,” he said with quiet confidence.\n" +
                    "\n" +
                    "Alexander’s response was swift. He marched to the banks of the Jhelum. The river was full and swift due to heavy rains. There was only one spot in the river which was shallow enough for a crossing. Porus set up his camp at this spot.\n" +
                    "\n" +
                    "\n" +
                    "Alexander was wary of taking on Porus from the front. While the Macedonian army had won many battles, they had never faced war elephants in a battle before. Porus had many such elephants in his army.\n" +
                    "\n" +
                    "“We must take him by surprise,” Alexander said to his generals. “Find me another spot to cross the river.”\n" +
                    "\n" +
                    "\n" +
                    "The generals came back with news of another spot up river. One night, under the cover of darkness, Alexander led a small section of his army to the other spot. He crossed over to the other side without opposition.\n" +
                    "\n" +
                    "\n" +
                    "As soon as he got wind of Alexander’s move, Porus sent part of his army to fight off the attackers. But the Macedonian warriors defeated them and mounted an attack on Porus’ main army.\n" +
                    "\n" +
                    "Meanwhile, the remaining part of Alexander’s army crossed over the river. Thus encircled, Porus, who stood 7 feet tall, sat atop his mighty elephant, and encouraged his soldiers to fight. The battle grew fierce and the Macedonians gained an upper hand.\n" +
                    "\n" +
                    "\n" +
                    "But Porus refused to give up even as his men panicked. He continued to fight like a man possessed, facing spears thrown at him from all sides. He was struck with spears all over the body. Exhausted as he collapsed, his elephant bent its knee and brought Porus to the ground. It then gently pulled the spears from his body, even as Geeks surrounded the wounded king.\n" +
                    "\n" +
                    "Porus was brought to Alexander. The Greek conqueror looked at Porus with amazement. He had not met any other warrior like Porus before.\n" +
                    "\n" +
                    "“How do you wished to be treated?” Alexander asked Porus.\n" +
                    "\n" +
                    "“Like a king,” said Porus.\n" +
                    "\n" +
                    "“What do you mean?” asked Alexander.\n" +
                    "\n" +
                    "“When I said, ‘Like a King’, everything was said,” Porus replied.\n" +
                    "\n" +
                    "Alexander got up, walked up to Porus and shook his hand warmly.\n" +
                    "\n" +
                    "\n" +
                    "At last the Macedonian world conqueror had found his match in the Indian king.\n" +
                    "\n" +
                    "Based on ‘Plutarch’s Lives’\n\n\n"
        )
        val content = findViewById<TextView>(R.id.content)
        val image = findViewById<ImageView>(R.id.image)

        val receive = intent.getIntExtra("Content",0)
        content.text = con[receive]
        val n = pic[receive]
        image.setImageResource(n)
    }
}