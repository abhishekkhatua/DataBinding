package `in`.co.ngcapp.databinding

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.text.Layout
import android.support.v7.widget.LinearLayoutManager
import android.util.Log


class MainActivity : AppCompatActivity() {


    var recycler_view: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val contentView: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//        val userDataTwi  =  UserData("Abhishek","Khatua")
//        contentView.userData = userDataTwi

        setContentView(R.layout.activity_main)
        var recycler_view: RecyclerView = findViewById(R.id.recycler_view)
        val linearLayoutManager = recycler_view.getLayoutManager() as LinearLayoutManager
        recycler_view.layoutManager = linearLayoutManager
        var getList: ArrayList<User> = getPosts()
        var imageAdapter = ImageAdapter(getList, this@MainActivity)
        recycler_view.setAdapter(imageAdapter)
    }

    private fun getPosts(): ArrayList<User> {
        var arrayList: ArrayList<User>? = null

        for (i in 1..9) {
            val post = User("https://api.androidhive.info/images/nature/$i.jpg")
            Log.i("getImages", post.toString())
            arrayList!!.add(post)
        }

        return arrayList!!
    }
}
