package com.android.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*


class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun menToggleButtonClicked(view: View) {
        womentoggleBtn.isChecked = false
        coedtoggleBtn.isChecked = false
        selectedLeague = MEN
    }

    fun womenToggleButtonClicked(view: View) {
        mentoggleBtn.isChecked = false
        coedtoggleBtn.isChecked = false
        selectedLeague = WOMEN
    }

    fun coedToggleButtonClicked(view: View) {
        mentoggleBtn.isChecked = false
        womentoggleBtn.isChecked = false
        selectedLeague = COED
    }

    fun launchSkillActivity(view: View) {
        if (selectedLeague.isNotEmpty()) {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_LEAGUE,selectedLeague)
            startActivity(skillIntent)
        }else{
            Toast.makeText(this,getString(R.string.toast_message),Toast.LENGTH_LONG).show()
        }
    }


}