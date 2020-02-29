package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inflater = LayoutInflater.from(activity_main_view.context)

        addHardCodedCard(inflater)

        addSimpleCustom(inflater, R.drawable.bank_icon, "This card should have a chevron", R.drawable.chevron, true)
        addSimpleCustom(inflater, R.drawable.bank_icon, "This card shouldn't have a chevron and it has a very long text to show that the chevron space is preserved.", R.drawable.chevron, false)

    }

    private fun addSimpleCustom(inflater: LayoutInflater, icon: Int, mainText: String, chevron:Int, withChevron: Boolean) {
        val customLayout = inflater.inflate(R.layout.simplecustom_entrycard, null)
        activity_main_view.addView(customLayout)

        val cardView =
            customLayout.findViewById<MainCardLayout>(R.id.simplecustom_cardview)
        cardView.setChevronVisibility(withChevron)
        cardView.setMainText(mainText)
        cardView.setBankIcon(icon)
    }

    private fun addHardCodedCard(inflater: LayoutInflater) {
        val hardCoded = inflater.inflate(R.layout.hardcoded_entrycard, null)
        activity_main_view.addView(hardCoded)
    }

}
