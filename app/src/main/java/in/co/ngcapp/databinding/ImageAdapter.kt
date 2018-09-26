package `in`.co.ngcapp.databinding

import `in`.co.ngcapp.databinding.R.id.thumbnail
import `in`.co.ngcapp.databinding.databinding.ImageAdapterBinding
import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ImageAdapter(var userList:ArrayList<User>,var mContext:Context) : RecyclerView.Adapter<ImageAdapter.Clickevents>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageAdapter.Clickevents {
        val layoutInflater = LayoutInflater.from(parent.context)
        var binding : ImageAdapterBinding = DataBindingUtil.inflate(layoutInflater, R.layout.image_adapter, parent, false)

        return  Clickevents(binding)
    }

    override fun getItemCount(): Int {
       return userList.size
    }

    override fun onBindViewHolder(holder: ImageAdapter.Clickevents, position: Int) {
        holder.getData(userList[position])
    }

    class Clickevents(var imageBinding:ImageAdapterBinding) : RecyclerView.ViewHolder(imageBinding.root)  {

        fun getData(userList:User){

            imageBinding.(userList.imagesUrl)

        }
    }

}