package `in`.co.ngcapp.databinding

import `in`.co.ngcapp.databinding.databinding.ActivityMainBinding
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.text.Layout

class MainActivity : AppCompatActivity() {


    var recycler_view:RecyclerView ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val contentView: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val userDataTwi  =  UserData("Abhishek","Khatua")
        contentView.userData = userDataTwi
    }

}
