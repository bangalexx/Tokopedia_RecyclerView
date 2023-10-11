package com.bangalexx.tokopediarecyclerview.ui.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.bangalexx.tokopediarecyclerview.R

class adapter (activity: FragmentActivity) : FragmentStateAdapter(activity){

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> FragmentAdapter.newInstance(R.drawable.iklan1, "")
            1 -> FragmentAdapter.newInstance(R.drawable.iklan2, "")
            2 -> FragmentAdapter.newInstance(R.drawable.iklan3, "")
            else ->{
                FragmentAdapter.newInstance(
                    1, ""
                )
            }
        }
    }

}