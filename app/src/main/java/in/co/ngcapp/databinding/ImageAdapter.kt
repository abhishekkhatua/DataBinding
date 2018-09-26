package `in`.co.ngcapp.databinding

import `in`.co.ngcapp.databinding.databinding.ImageAdapterBinding
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class ImageAdapter(var userList:ArrayList<UserData>) : RecyclerView.Adapter<ImageAdapter.Clickevents>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageAdapter.Clickevents {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding : ImageAdapterBinding = DataBindingUtil.inflate(layoutInflater, R.layout.image_adapter, parent, false)        return  Clickevents(v)

        return  Clickevents(binding)
    }

    override fun getItemCount(): Int {
       return userList.size
    }

    override fun onBindViewHolder(holder: ImageAdapter.Clickevents, position: Int) {
        holder.getData(userList[position])
    }

    class Clickevents(var view:ImageAdapterBinding) : RecyclerView.ViewHolder(view.root)  {

        fun getData(userList:UserData){

        }
    }

}