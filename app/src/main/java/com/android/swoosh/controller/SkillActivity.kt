package com.android.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.android.swoosh.R
import com.android.swoosh.model.Player
import com.android.swoosh.utilities.*
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
        }
    }

    fun beginnerButtonClicked(view: View) {
        ballerSkillButton.isChecked = false
        player.skill = BEGINNER
    }

    fun ballerButtonClicked(view: View) {
        beginnerSkillButton.isChecked = false
        player.skill = BALLER
    }

    fun finishButtonClicked(view: View) {
        if (player.skill.isNotEmpty()) {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(finishIntent)
        } else {
            Toast.makeText(this, getString(R.string.skill_toast_message), Toast.LENGTH_LONG).show()
        }
    }
}
