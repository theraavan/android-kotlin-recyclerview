package com.gradlic.recyclerviewbasic.basic

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.gradlic.recyclerviewbasic.R
import com.gradlic.recyclerviewbasic.databinding.FragmentBasicBinding


class BasicFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding: FragmentBasicBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_basic, container, false)

//        var data = mutableListOf<Basic>()
//
//        data.add(Basic("Kotlin", "Most popular and advance language in android world"))
//        data.add(Basic("Kotlin", "It is also popular in backend development world"))
//        data.add(Basic("Java", "It was a love for every developer and still hot in job industry"))
//        data.add(Basic("Java", "Spring boot is developed using java"))
//        data.add(Basic("Kotlin", "You can use kotlin with spring boot"))
//        data.add(Basic("Java", "You can use java too with spring boot"))

        val adapter = BasicAdapter()
        binding.recyclerView.adapter = adapter
        //adapter.data = data
        adapter.notifyDataSetChanged()



        return binding.root
    }
}