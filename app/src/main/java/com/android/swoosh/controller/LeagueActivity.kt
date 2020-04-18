package com.android.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.android.swoosh.*
import com.android.swoosh.model.Player
import com.android.swoosh.utilities.*
import kotlinx.android.synthetic.main.activity_league.*


class LeagueActivity : BaseActivity() {

    lateinit var player:Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
        player = Player()
    }

    fun menToggleButtonClicked(view: View) {
        womentoggleBtn.isChecked = false
        coedtoggleBtn.isChecked = false
        player.league = MEN
    }

    fun womenToggleButtonClicked(view: View) {
        mentoggleBtn.isChecked = false
        coedtoggleBtn.isChecked = false
        player.league = WOMEN
    }

    fun coedToggleButtonClicked(view: View) {
        mentoggleBtn.isChecked = false
        womentoggleBtn.isChecked = false
        player.league = COED
    }

    fun launchSkillActivity(view: View) {
        if (player.league.isNotEmpty()) {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_PLAYER,player)
            startActivity(skillIntent)
        }else{
            Toast.makeText(this,getString(R.string.league_toast_message),Toast.LENGTH_LONG).show()
        }
    }


}