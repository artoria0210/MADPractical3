package com.example.madpractical3

import android.database.DataSetObserver
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.SpinnerAdapter
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

abstract class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener,
    SpinnerAdapter {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListener()
        val spinner:Spinner=findViewById(R.id.SpinnerColorSelection)
        spinner.onItemSelectedListener = this
        ArrayAdapter.createFromResource(this,R.array.ColorSelection,android.R.layout.simple_spinner_item)
        also{adapter ->adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter=adapter}
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val selectionTv :TextView =findViewById(R.id.colorSelectedText)
        selectionTv.text = parent?.getItemAtPosition(pos).toString()
    }



    private fun makeColored(view:View)
    {
        when(view.id)
        {
            R.id.box_one_text->view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text->view.setBackgroundColor(Color.GREEN)
            R.id.box_three_text->view.setBackgroundColor(Color.CYAN)
            R.id.box_four_text->view.setBackgroundColor(Color.YELLOW)
            R.id.box_five_text->view.setBackgroundColor(Color.MAGENTA)
            else->view.setBackgroundColor(Color.LTGRAY)

        }

    }
    private fun setListener()
    {
        val boxOneText =findViewById<TextView>(R.id.box_one_text)
        val boxTwoText =findViewById<TextView>(R.id.box_two_text)
        val boxThreeText =findViewById<TextView>(R.id.box_three_text)
        val boxFourText =findViewById<TextView>(R.id.box_four_text)
        val boxFiveText =findViewById<TextView>(R.id.box_five_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableView:List<View> =
        listOf(boxOneText,boxTwoText,boxThreeText,boxFourText,boxFiveText,rootConstraintLayout)
        for (item in clickableView){
            item.setOnClickListener{makeColored(it)}
        }
    }

    override fun registerDataSetObserver(observer: DataSetObserver?) {
        TODO("Not yet implemented")
    }

    override fun unregisterDataSetObserver(observer: DataSetObserver?) {
        TODO("Not yet implemented")
    }

    override fun getCount(): Int {
        TODO("Not yet implemented")
    }

    override fun getItem(position: Int): Any {
        TODO("Not yet implemented")
    }

    override fun getItemId(position: Int): Long {
        TODO("Not yet implemented")
    }

    override fun hasStableIds(): Boolean {
        TODO("Not yet implemented")
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("Not yet implemented")
    }

    override fun getItemViewType(position: Int): Int {
        TODO("Not yet implemented")
    }

    override fun getViewTypeCount(): Int {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("Not yet implemented")
    }

}