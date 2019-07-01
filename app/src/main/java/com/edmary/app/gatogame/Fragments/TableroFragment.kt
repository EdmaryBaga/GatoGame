package com.edmary.app.gatogame.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.edmary.app.gatogame.R
import kotlinx.android.synthetic.main.activity_main.view.*

class TableroFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val v = inflater.inflate(R.layout.tablero_ui, container)

        return v
    }
}