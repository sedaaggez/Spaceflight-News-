package com.sedaaggez.spaceflightnews.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sedaaggez.spaceflightnews.R
import com.sedaaggez.spaceflightnews.model.Article
import kotlinx.android.synthetic.main.item_space_flight_news.view.*

class NewsAdapter (val articleList: ArrayList<Article>): RecyclerView.Adapter<NewsAdapter.NewsAdapterViewHolder>() {


    class NewsAdapterViewHolder(var view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsAdapterViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_space_flight_news, parent, false)
        return NewsAdapterViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsAdapterViewHolder, position: Int) {
        holder.view.textViewTitle.text = articleList[position].title
    }

    override fun getItemCount(): Int {
        return articleList.size
    }

    fun updateCharacterList(newArticleList: List<Article>) {
        articleList.clear()
        articleList.addAll(newArticleList)
        notifyDataSetChanged()
    }
}