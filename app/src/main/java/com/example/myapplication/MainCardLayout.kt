package com.example.myapplication

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainCardLayout(context: Context, attributeSet: AttributeSet) : LinearLayout(context, attributeSet) {

    fun setChevronVisibility(visible: Boolean) {
        val chevron = findViewById<ImageView>(R.id.chevron)
        if(visible)
          chevron.visibility = View.VISIBLE
        else
            chevron.visibility = View.INVISIBLE
    }

    fun setBankIcon(resourceId: Int) {
        val bankIconView = findViewById<ImageView>(R.id.icon)
        bankIconView.setImageResource(resourceId)
    }

    fun setMainText(newText: String) {
        val mainTextView = findViewById<TextView>(R.id.title)
        mainTextView.text = newText
    }

    fun setMainText(newTextResource: Int) {
        val mainTextView = findViewById<TextView>(R.id.title)
        val newText = context.resources.getString(newTextResource)
        mainTextView.text = newText
    }

    fun setChevronIcon(chevronIcon: Int) {
        val bankIconView = findViewById<ImageView>(R.id.chevron)
        bankIconView.setImageResource(chevronIcon)
    }

}