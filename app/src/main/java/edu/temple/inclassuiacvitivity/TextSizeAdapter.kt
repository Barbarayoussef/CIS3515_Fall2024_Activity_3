package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Spinner
import android.widget.TextView

class TextSizeAdapter(_context: Context, _numbers: Array<Int>) : BaseAdapter() {

    private val context=_context
    private val numbers =_numbers

    override fun getCount() = numbers.size


    override fun getItem(position: Int)= numbers[position]


    override fun getItemId(position: Int) = position.toLong()


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textview= TextView(context)
        textview.text=numbers[position].toString()
        textview.textSize= 22f
        textview.setPadding(5,10,0,10)
        return textview
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        return super.getDropDownView(position, convertView, parent)
    }

}