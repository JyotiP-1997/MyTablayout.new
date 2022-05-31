package com.view.mytablayout.view.adapter

import android.icu.lang.UCharacter.GraphemeClusterBreak.V
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.adapter.FragmentViewHolder
import com.bumptech.glide.Glide
import com.view.mytablayout.R
import com.view.mytablayout.model.BannersItem
import com.view.mytablayout.view.activity.MainActivity
import com.view.mytablayout.view.fragment.BlankFragment1
import com.view.mytablayout.view.fragment.BlankFragment2
import com.view.mytablayout.view.fragment.BlankFragment3
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.fragment_blank1.view.*
import kotlin.coroutines.coroutineContext
/*
class VPAdapter(val activity: FragmentActivity, lifecycle: Lifecycle, baner_list: ArrayList<BannersItem> ):
    FragmentStateAdapter(FragmentActivity()) {

    var image: String? = null
    private var baner_list: ArrayList<BannersItem>? = baner_list


    override fun getItemCount(): Int {
        return baner_list!!.size
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {

            0 -> {
                BlankFragment1()
            }
            1 -> {
                BlankFragment2()
            }
            2 -> {
                BlankFragment3()
            }
            else -> {
                Fragment()
            }
        }

    }
}
//    override fun onBindViewHolder(holder: FragmentViewHolder,position: Int){
//
//        Log.e("abc", baner_list?.get(position)?.bannerImage + "")
//        image = baner_list?.get(position)?.bannerImage
//
//        if (image !== null){
//
//            activity?.let {
//                Glide.with(it)
//                    .load(image)
//                    .into(holder.itemView.findViewById(R.id.view_pg))
//            }
//        }
//        else  {
//
//            holder.itemView.img_list.setImageResource(R.drawable.apple)
//
//        }
//
//
//
//
//    }
//    }*/



