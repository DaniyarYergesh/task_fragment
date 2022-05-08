package com.example.homework_136

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment

private const val ARG_COUNTER = "counter"

class MainFragment2 : Fragment(R.layout.fragment_main2){

    companion object {
        fun newInstance(Title :String, News:String, Author:String): MainFragment2 {
            val args = Bundle()
            val user: User = User(Title,News, Author)
            args.putSerializable(ARG_COUNTER, user)

            val fragment = MainFragment2()
            fragment.arguments = args

            return fragment
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val myTitle = arguments?.getSerializable(ARG_COUNTER) as User
        val title = view.findViewById<TextView>(R.id.title)
        title.text = myTitle.Title

        val myNews = arguments?.getSerializable(ARG_COUNTER) as User
        val news = view.findViewById<TextView>(R.id.news)
        news.text = myTitle.News

        val myAuthor = arguments?.getSerializable(ARG_COUNTER) as User
        val author = view.findViewById<TextView>(R.id.author)
        author.text = myTitle.Author


    }
}
