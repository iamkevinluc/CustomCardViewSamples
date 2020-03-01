package com.example.myapplication

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView

class MainCardLayout(context: Context, attributeSet: AttributeSet) : CardView(context, attributeSet) {

    fun setChevronVisibility(visible: Boolean) {
        val chevron = findViewById<ImageView>(R.id.chevron)
        if(visible)
          chevron.visibility = View.VISIBLE
        else
            chevron.visibility = View.INVISIBLE
    }

    fun setBankIcon(resourceId: Int) {
        val bankIconView = getChildAt(0) as ImageView
        bankIconView.setImageResource(resourceId)
    }

    fun setMainText(newText: String) {
        val mainTextView = getChildAt(1) as TextView
        mainTextView.text = newText
    }

    fun setMainText(newTextResource: Int) {
        val mainTextView = getChildAt(1) as TextView
        val newText = context.resources.getString(newTextResource)
        mainTextView.text = newText
    }

    fun setChevronIcon(chevronIcon: Int) {
        val bankIconView = getChildAt(2) as ImageView
        bankIconView.setImageResource(chevronIcon)
    }

}