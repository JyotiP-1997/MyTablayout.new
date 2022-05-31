package com.view.mytablayout.view.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.view.mytablayout.model.BannerResponse
import com.view.mytablayout.model.BannersItem

class V_Pager_Adapter(private val manager: FragmentManager, var bannerList: List<BannersItem>
    ) :  PagerAdapter() {

        override fun getCount(): Int {
            return bannerList.size
        }

        override fun isViewFromObject(
            view: View,
            `object`: Any
        ): Boolean {
            return view === `object`
        }

        private fun loadFragment(fragment: Fragment?, containerId: Int
        ) {
            if (fragment != null) {
                manager.beginTransaction().replace(containerId, fragment).commit()
            }
        }

        override fun instantiateItem(container: ViewGroup, position: Int): Any {
            val vp = container as ViewPager
//            vp.addView(bannerList[position])
            return bannerList[position]
        }

        override fun destroyItem(
            container: ViewGroup,
            position: Int,
            `object`: Any
        ) {
            val vp = container as ViewPager
            val view = `object` as RecyclerView
            vp.removeView(view)
        }

    }

