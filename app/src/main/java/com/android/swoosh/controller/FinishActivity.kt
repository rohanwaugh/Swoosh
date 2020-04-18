package com.android.swoosh.controller

import android.os.Bundle
import com.android.swoosh.R
import com.android.swoosh.model.Player
import com.android.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        selectedLeaguesText.text =
            getString(R.string.selected_league_text, player?.league, player?.skill)
    }
}
