package com.rosie.ponies

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
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
                    else -> "Sparkle"
                }

        for (i in 0..19) {

            var num = rand(1, 23)
            var name1 = firstname(num)
            num = rand(1, 23)
            var name2 = lastname(num)
            ponylist.add(name1+" "+name2)
            Log.d("PonyList", ponylist.last())
         }

        recyclerview.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        recyclerview.adapter = PonyAdaptor(ponylist)

    }


}