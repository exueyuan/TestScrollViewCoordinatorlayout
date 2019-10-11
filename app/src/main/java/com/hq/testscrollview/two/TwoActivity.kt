package com.hq.testscrollview.two

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import com.hq.testscrollview.R
import com.hq.testscrollview.main.FourFragment
import com.hq.testscrollview.main.OneFragment
import com.hq.testscrollview.main.ThreeFragment
import com.hq.testscrollview.main.TwoFragment
import java.util.ArrayList

class TwoActivity : AppCompatActivity() {


    private var tabLayout: TabLayout? = null
    private var viewPager: ViewPager? = null
    private var mPageAdapter: FragmentPagerAdapter? = null

    private val titleList = ArrayList<String>()
    private val fragmentList = ArrayList<Fragment>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        initData()
        initView()
    }

    private fun initData() {
        titleList.clear()
        titleList.add("标签一")
        titleList.add("标签二")
        titleList.add("标签三")

        fragmentList.clear()
        fragmentList.add(FourFragment())
        fragmentList.add(TwoFragment())
        fragmentList.add(ThreeFragment())

        mPageAdapter = object : FragmentPagerAdapter(supportFragmentManager) {
            override fun getItem(i: Int): Fragment {
                return fragmentList[i]
            }

            override fun getPageTitle(position: Int): CharSequence? {
                return titleList[position]
            }

            override fun getCount(): Int {
                return titleList.size
            }
        }
    }

    private fun initView() {
        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)
        viewPager?.adapter = mPageAdapter
        tabLayout?.setupWithViewPager(viewPager)
    }
}