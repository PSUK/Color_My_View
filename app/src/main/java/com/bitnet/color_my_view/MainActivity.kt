package com.bitnet.color_my_view

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
  // lateinit  var oneBoxtext: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
  //      oneBoxtext = findViewById(R.id.box_one_text)
  //      oneBoxtext.setOnClickListener { it.setBackgroundColor(Color.CYAN) }
        //box_one_text.setOnClickListener { it.setBackgroundColor(Color.RED) }

        setListeners()

    }

    private fun setListeners(){

        val clickableViews: List<View> = listOf(box_one_text,box_two_text,box_three_text,box_four_text,box_five_text,
            red_button,yellow_button,green_button)
        clickableViews.forEach { it -> it.setOnClickListener { makeColored(it) }
            //box_one_text.setOnClickListener { it.setBackgroundColor(Color.RED) }
    }
}


    fun makeColored(view: View) {
      when (view.id) {

        // Boxes using Color class colors for background
        R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)

        R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

        // Boxes using Android color resources for background
        R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
        R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
        R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

          // Boxes using custom colors for background
          R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
          R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
          R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)

        else -> view.setBackgroundColor(Color.LTGRAY)


          //some comment

          // and some more
          //even more
// added one more
          // next comment

//dd

     }
}




}
