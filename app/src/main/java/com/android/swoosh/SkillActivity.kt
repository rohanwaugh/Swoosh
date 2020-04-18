package com.android.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SkillActivity : BaseActivity() {

    var selectedLeague:String? = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        selectedLeague = intent.getStringExtra(EXTRA_LEAGUE)
    }
}
