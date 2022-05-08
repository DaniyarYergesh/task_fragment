package com.example.homework_136

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class MainFragment : Fragment(R.layout.fragment_main){

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val first_title = view.findViewById<TextView>(R.id.first_title)
        first_title.text = getString(R.string.title1)
        val second_title = view.findViewById<TextView>(R.id.second_title)
        second_title.text = getString(R.string.title2)
        val third_title = view.findViewById<TextView>(R.id.third_title)
        third_title.text = getString(R.string.title3)
        val fourth_title = view.findViewById<TextView>(R.id.fourth_title)
        fourth_title.text = getString(R.string.title4)
        val fifth_title = view.findViewById<TextView>(R.id.fifth_title)
        fifth_title.text = getString(R.string.title5)
        val sixth_title = view.findViewById<TextView>(R.id.sixth_title)
        sixth_title.text = getString(R.string.title6)

        first_title.setOnClickListener {
                parentFragmentManager
                    .beginTransaction()
                    .add(
                        R.id.fragmentContainer,
                        MainFragment2.newInstance(
                            getString(R.string.title1),
                            getString(R.string.news1),
                            "India "
                        ),
                        "MainFragment2"
                    )
                    .addToBackStack(null)
                    .commit()
            }
        second_title.setOnClickListener { parentFragmentManager
            .beginTransaction()
            .replace(
                R.id.fragmentContainer,
                MainFragment2.newInstance(getString(R.string.title2), getString(R.string.news2), "Sports "),
                "MainFragment2"
            )
            .addToBackStack(null)
            .commit() }

        third_title.setOnClickListener { parentFragmentManager
            .beginTransaction()
            .add(
                R.id.fragmentContainer,
                MainFragment2.newInstance(getString(R.string.title3), getString(R.string.news3), "Sports"),
                "MainFragment2"
            )
            .addToBackStack(null)
            .commit() }

        fourth_title.setOnClickListener { parentFragmentManager
            .beginTransaction()
            .add(
                R.id.fragmentContainer,
                MainFragment2.newInstance(getString(R.string.title4), getString(R.string.news4), "Entertainment"),
                "MainFragment2"
            )
            .addToBackStack(null)
            .commit() }

        fifth_title.setOnClickListener { parentFragmentManager
            .beginTransaction()
            .add(
                R.id.fragmentContainer,
                MainFragment2.newInstance(getString(R.string.title5), getString(R.string.news5), "Entertainment"),
                "MainFragment2"
            )
            .addToBackStack(null)
            .commit() }

        sixth_title.setOnClickListener { parentFragmentManager
            .beginTransaction()
            .add(
                R.id.fragmentContainer,
                MainFragment2.newInstance(getString(R.string.title6), getString(R.string.news6), "Sports "),
                "MainFragment2"
            )
            .addToBackStack(null)
            .commit() }
    }
}