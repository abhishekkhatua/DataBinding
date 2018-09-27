package `in`.co.ngcapp.databinding

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.LinearLayoutManager


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        setContentView(R.layout.activity_main)
        //here calling the method getPost to get the data
        val getList: ArrayList<User> = getPosts()

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        val linearHorizontal = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
        recyclerView.layoutManager = linearHorizontal
        val imageAdapter = ImageAdapter(getList, this@MainActivity)
        recyclerView.adapter = imageAdapter
    }

    private fun getPosts(): ArrayList<User> {
        val arrayList: ArrayList<User>? = ArrayList()
        for (i in 1..9) {
            val post = User("https://api.androidhive.info/images/nature/$i.jpg")
            arrayList!!.add(post)
        }
        return arrayList!!
    }
}
