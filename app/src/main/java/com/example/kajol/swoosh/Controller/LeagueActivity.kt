package com.example.kajol.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.example.kajol.swoosh.Model.Player
import com.example.kajol.swoosh.Utilities.EXTRA_LEAGUE
import com.example.kajol.swoosh.R
import com.example.kajol.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player= Player("","")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState!=null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun nextLeagueClicked(view: View) {


        if(player.league!=""){
            val skilledActivity = Intent(this, SkilledActivity::class.java)
            skilledActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(skilledActivity)
        }else{
            Toast.makeText(this,"Please Select a League!",Toast.LENGTH_LONG).show()
        }

    }

    fun womenLeagueClicked(view: View) {
        menLeaguebtn.isChecked = false
        oncoedLeaguebtn.isChecked = false

        player.league ="women"

    }

    fun menLeagueClicked(view: View) {

        womenLeaguebtn.isChecked = false
        oncoedLeaguebtn.isChecked = false

        player.league ="men"
    }

    fun onCoedLeagueClicked(view: View) {

        womenLeaguebtn.isChecked = false
        menLeaguebtn.isChecked = false

        player.league ="coed"
    }
}
