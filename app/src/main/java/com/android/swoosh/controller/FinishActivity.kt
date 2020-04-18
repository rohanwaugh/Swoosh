package com.android.swoosh.controller

import android.os.Bundle
import com.android.swoosh.R
import com.android.swoosh.utilities.EXTRA_LEAGUE
import com.android.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val skill = intent.getStringExtra(EXTRA_SKILL)
        val league = intent.getStringExtra(EXTRA_LEAGUE)

        selectedLeaguesText.text = getString(R.string.selected_league_text,league,skill)
    }
}
