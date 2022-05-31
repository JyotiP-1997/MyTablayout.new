package com.view.mytablayout.view.activity

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.FrameLayout
import android.widget.LinearLayout
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.view.mytablayout.R
import com.view.mytablayout.model.BannerResponse
import com.view.mytablayout.model.BannersItem

import com.view.mytablayout.view.adapter.V_Pager_Adapter
import com.view.mytablayout.view.fragment.BlankFragment1
import com.view.mytablayout.viewmodel.BannerViewModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_blank1.*
import kotlinx.android.synthetic.main.fragment_blank2.*
import kotlinx.android.synthetic.main.fragment_blank3.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var VP_adapter: V_Pager_Adapter? = null
    lateinit var tabLayout: TabLayout
    lateinit var viewPager2: ViewPager2
    var mstoreId: String? = null
    private var baner_list: ArrayList<BannersItem> = ArrayList()
    private var viewModel: BannerViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

    }

    private fun initView() {
        tabLayout = findViewById(R.id.tb_layout)
        viewPager2 = findViewById(R.id.view_pg)

        // viewPager2.adapter = V_Pager_Adapter

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            when (position) {

                0 -> {
                    tab.icon
                }
                1 -> {
                    tab.icon
                }
                3 -> {
                    tab.icon

                }
            }
        }



//        val fragList: MutableList<Fragment> =
//            java.util.ArrayList()
//        fragList.add(HomeFragment())
//        fragList.add(Categories_fragment())
//        fragList.add(Location_fragment())




        viewModel = ViewModelProviders.of(this).get(BannerViewModel::class.java)

        getBanner()
    }

    private fun getBanner() {

        viewModel?.getbanner(mstoreId.toString())?.observe(
            this,

            object : Observer<BannerResponse> {
                override fun onChanged(@Nullable bannerResponse: BannerResponse?) {

                    Log.e("msg1", bannerResponse?.message.toString())
                    baner_list = bannerResponse?.data?.banners as ArrayList<BannersItem>

                    setBannerAdapter()
                }
            })
    }

    private fun setBannerAdapter() {

        val flList: MutableList<BannersItem> = java.util.ArrayList()


        VP_adapter = V_Pager_Adapter(supportFragmentManager, baner_list)
        view_pg.setOffscreenPageLimit(3)


        view_pg?.adapter as V_Pager_Adapter

            }

        override fun onClick(v: View?) {

            when (v?.id) {

                R.id.iv_bACK -> {
                    onBackPressed()
                }
            }
        }

        override fun onBackPressed() {
            super.onBackPressed()
            finish()
        }
    }




