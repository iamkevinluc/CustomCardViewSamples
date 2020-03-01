package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inflater = LayoutInflater.from(activity_main_view.context)

        addHardCodedCard(inflater)

        addSimpleCustom(
            inflater, R.drawable.bank_icon, R.string.custom_card_title,
            R.drawable.chevron, true
        )

        addSimpleCustom(
            inflater, R.drawable.bank_icon, "This card should have a chevron",
            R.drawable.chevron, true
        )
        addSimpleCustom(
            inflater,
            R.drawable.bank_icon,
            "This card shouldn't have a chevron and it has a very long text to show that the chevron space is preserved.",
            R.drawable.chevron,
            false
        )

        addSimpleCustom(
            inflater,
            R.drawable.bank_icon,
            "This card should have a chevron and it has a very long text to show that the chevron space is preserved.",
            R.drawable.chevron,
            true
        )
        addSimpleCustom(inflater,
            R.drawable.bank_icon,
            "This card has a listener that will show a toast: Click Me.",
            R.drawable.chevron,
            true,
            View.OnClickListener {
                val toast = Toast.makeText(it.context, "CardView clicked", Toast.LENGTH_LONG)
                toast.show()
            })

    }

    private fun addSimpleCustom(
        inflater: LayoutInflater,
        icon: Int,
        mainTextResource: Int,
        chevronIcon: Int,
        withChevron: Boolean,
        onClickListener: View.OnClickListener? = null
    ) {
        val customLayout = inflater.inflate(R.layout.simplecustom_entrycard, null)
        activity_main_view.addView(customLayout)

        val cardView =
            customLayout.findViewById<MainCardLayout>(R.id.cardview)
        cardView.setChevronVisibility(withChevron)
        cardView.setMainText(mainTextResource)
        cardView.setBankIcon(icon)
        cardView.setChevronIcon(chevronIcon)
        cardView.setOnClickListener(onClickListener)
    }

    private fun addSimpleCustom(
        inflater: LayoutInflater,
        icon: Int,
        mainText: String,
        chevronIcon: Int,
        withChevron: Boolean,
        onClickListener: View.OnClickListener? = null
    ) {
        val customLayout = inflater.inflate(R.layout.simplecustom_entrycard, null)
        activity_main_view.addView(customLayout)

        val cardView =
            customLayout.findViewById<MainCardLayout>(R.id.cardview)
        cardView.setChevronVisibility(withChevron)
        cardView.setMainText(mainText)
        cardView.setBankIcon(icon)
        cardView.setChevronIcon(chevronIcon)
        cardView.setOnClickListener(onClickListener)
    }

    private fun addHardCodedCard(inflater: LayoutInflater) {
        val hardCoded = inflater.inflate(R.layout.hardcoded_entrycard, null)
        activity_main_view.addView(hardCoded)
    }

}
