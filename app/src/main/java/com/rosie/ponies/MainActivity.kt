package com.rosie.ponies

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.StaggeredGridLayoutManager
import android.util.Log
import android.widget.GridLayout
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ponylist = ArrayList<String>()

        val random = Random()

        fun rand(from: Int, to: Int): Int {
            return random.nextInt(to - from) + from
        }

        fun firstname(x: Int): String =
                when (x) {
                    1 -> "Apple"
                    2 -> "Bubble"
                    3 -> "Caramel"
                    4 -> "Dark"
                    5 -> "Eternal"
                    6 -> "Frozen"
                    7 -> "Golden"
                    8 -> "Harmony"
                    9 -> "Illusion"
                    10 -> "Joyful"
                    11 -> "Kindness"
                    12 -> "Lucky"
                    13 -> "Moonlight"
                    14 -> "Nightshade"
                    15 -> "Ocean"
                    16 -> "Peppermint"
                    17 -> "Queen"
                    18 -> "Rainbow"
                    19 -> "Sparkle"
                    20 -> "Twinkle"
                    21 -> "Umbrella"
                    22 -> "Velvet"
                    23 -> "Waterfall"
                    24 -> "Swift"
                    25 -> "Crimson"
                    26 -> "Silver"
                    27 -> "Last"
                    28 -> "Tiny"
                    29 -> "Ruby"
                    30 -> "Emerald"
                    31 -> "Fluffy"
                    32 -> "Dream"
                    33 -> "Sky"
                    34 -> "Lunar"
                    35 -> "Celestial"
                    36 -> "Magic"
                    37 -> "Morning"
                    38 -> "Mystic"
                    39 -> "Dancing"
                    40 -> "Marble"
                    41 -> "Little"
                    42 -> "Sugar"
                    43 -> "Crystal"
                    44 -> "Dew"
                    45 -> "Misty"
                    46 -> "Cherry"
                    47 -> "Pumpkin"
                    48 -> "Aqua"
                    49 -> "Solar"
                    50 -> "Strawberry"
                    else -> "Twilight"
                }

        fun lastname(x: Int): String =
                when (x) {
                    1 -> "Aura"
                    2 -> "Blanket"
                    3 -> "Chocolate"
                    4 -> "Diamond"
                    5 -> "Eyes"
                    6 -> "Flower"
                    7 -> "Glow"
                    8 -> "Harmony"
                    9 -> "Ice"
                    10 -> "Jewel"
                    11 -> "Kiss"
                    12 -> "Leaf"
                    13 -> "Meadow"
                    14 -> "Nightingale"
                    15 -> "Orchard"
                    16 -> "Petal"
                    17 -> "Quicksilver"
                    18 -> "Revolution"
                    19 -> "Sunset"
                    20 -> "Thunder"
                    21 -> "Umbra"
                    22 -> "Vision"
                    23 -> "Wave"
                    24 -> "Breeze"
                    25 -> "Summer"
                    26 -> "Autumn"
                    27 -> "Winter"
                    28 -> "Spring"
                    29 -> "Cake"
                    30 -> "Cupcake"
                    31 -> "Spice"
                    32 -> "Candy"
                    33 -> "Blossom"
                    34 -> "Light"
                    35 -> "Star"
                    36 -> "Stream"
                    37 -> "Song"
                    38 -> "Dawn"
                    39 -> "Fire"
                    40 -> "Snowflake"
                    41 -> "Rose"
                    42 -> "Breeze"
                    43 -> "Heart"
                    44 -> "Princess"
                    45 -> "Berry"
                    46 -> "Swirl"
                    47 -> "Twirl"
                    48 -> "Shadow"
                    49 -> "Spirit"
                    50 -> "River"
                    else -> "Sparkle"
                }

        for (i in 0..999) {

            var num = rand(1, 50)
            var name1 = firstname(num)
            num = rand(1, 50)
            var name2 = lastname(num)
            ponylist.add(name1+" "+name2)
            Log.d("PonyList", ponylist.last())
         }

        recyclerview.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
       // recyclerview.layoutManager = GridLayoutManager(this, 3)
        recyclerview.adapter = PonyAdaptor(ponylist)

    }


}