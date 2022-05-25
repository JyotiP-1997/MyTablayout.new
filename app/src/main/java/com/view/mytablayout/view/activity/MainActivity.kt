package com.view.mytablayout.view.activity

import android.os.Bundle
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.view.mytablayout.R
import com.view.mytablayout.model.BannerResponse
import com.view.mytablayout.model.BannersItem
import com.view.mytablayout.view.adapter.VPAdapter
import com.view.mytablayout.viewmodel.BannerViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

    private var VP_adapter: VPAdapter? = null
    lateinit var tabLayout: TabLayout
    lateinit var viewPager2: ViewPager2
    var mstoreId: String? = null

    private var baner_list: ArrayList<BannersItem> = ArrayList()
    private var viewModel: BannerViewModel? = null


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

    }

    private fun initView()
    {
        tabLayout = findViewById(R.id.tb_layout)
        viewPager2 = findViewById(R.id.view_pg)

        viewPager2.adapter = VP_adapter

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            when(position)  {

                0->{
                    tab.icon
                }
                1 ->{
                    tab.icon
                }
               3 -> {
                   tab.icon

               }
            }
        }

        viewModel = ViewModelProviders.of(this).get(BannerViewModel::class.java)

        getBanner()
    }

    private fun getBanner()
    {

        viewModel?.getbanner(mstoreId.toString())?.observe(
            this,

            object : Observer<BannerResponse>            {
                override fun onChanged(@Nullable bannerResponse: BannerResponse?)                {

                    baner_list = bannerResponse  as ArrayList<BannersItem>

                    VpAdapter()
                }
            })
    }

         fun VpAdapter()   {

          view_pg?.adapter = VPAdapter(supportFragmentManager, lifecycle, baner_list)



             }

         }

