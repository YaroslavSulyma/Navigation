package com.example.navigation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_home, container, false)
        v!!.findViewById<Button>(R.id.btnSend).setOnClickListener {
            val text = etSend.text.toString()
            findNavController().navigate(R.id.actionToChild, Bundle().apply { putString("Text", text) })
        }
        return v
    }
}
