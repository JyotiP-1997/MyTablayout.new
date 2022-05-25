package com.view.mytablayout.view.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.view.mytablayout.model.BannersItem
import com.view.mytablayout.view.fragment.BlankFragment1
import com.view.mytablayout.view.fragment.BlankFragment2
import com.view.mytablayout.view.fragment.BlankFragment3

class VpAdapter(val manager: FragmentManager, lifecycle: Lifecycle, baner_list: ArrayList<BannersItem> ):
    FragmentStateAdapter(FragmentActivity()){

    var image: String? = null
    private var baner_list: ArrayList<BannersItem>? = baner_list


    override fun getItemCount(): Int
    {
        return baner_list!!.size
    }

    override fun createFragment(position: Int): Fragment
    {
        return when(position)
        {

            0 ->
            {
                BlankFragment1()
            }
            1 ->
            {
                BlankFragment2()
            }
            2 ->
            {
                BlankFragment3()
            }
            else ->{
                Fragment()
            }
    }

    }

}