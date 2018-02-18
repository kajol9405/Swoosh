package com.example.kajol.swoosh.Controller
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.kajol.swoosh.Model.Player
import com.example.kajol.swoosh.R
import com.example.kajol.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skilled.*


class SkilledActivity : BaseActivity() {

    lateinit var player : Player

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
        setContentView(R.layout.activity_skilled)
        player = intent.getParcelableExtra(EXTRA_PLAYER)

    }

    fun onSkillFinishClicked(view : View){
        if(player.Skill!=""){
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this,"Please Select a skill!", Toast.LENGTH_LONG).show()
        }
    }

    fun ballerSkilledClicked(view : View){
         player.Skill = "baller"
         beginnerSkilledBtn.isChecked = false
    }

    fun beginnerSkilledClicked(view : View){
        player.Skill = "beginner"
        ballerSkilledBtn.isChecked = false
    }
}
