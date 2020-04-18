package com.android.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.android.swoosh.utilities.EXTRA_LEAGUE
import com.android.swoosh.R
import com.android.swoosh.utilities.BALLER
import com.android.swoosh.utilities.BEGINNER
import com.android.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league:String? = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun beginnerButtonClicked(view: View){
        ballerSkillButton.isChecked = false
        skill = BEGINNER
    }

    fun ballerButtonClicked(view: View){
        beginnerSkillButton.isChecked = false
        skill = BALLER
    }

    fun finishButtonClicked(view: View){
        if(skill.isNotEmpty()) {
            val finishIntent = Intent(this, FinishActivity::class.java)
            finishIntent.putExtra(EXTRA_SKILL, skill)
            finishIntent.putExtra(EXTRA_LEAGUE,league)
            startActivity(finishIntent)
        }else{
            Toast.makeText(this,getString(R.string.skill_toast_message),Toast.LENGTH_LONG).show()
        }
    }
}
