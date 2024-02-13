package com.example.movienews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
//import com.codepath.bestsellerlistapp.R.id

class MovieItemsRecyclerViewAdapter(
        private val movies: List<MovieItem>,
        private val mListener: OnListFragmentInteractionListener?
    )
        : RecyclerView.Adapter<MovieItemsRecyclerViewAdapter.MovieViewHolder>()
    {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.movie_item, parent, false)
            return MovieViewHolder(view)
        }

        inner class MovieViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
            var mItem: MovieItem? = null
            val mTitle: TextView = mView.findViewById<View>() as TextView
            val mMovieDescription: TextView = mView.findViewById<View>() as TextView
            val mMovieImage: ImageView = mView.findViewById<View>() as ImageView

            override fun toString(): String {
                return mTitle.toString() + " '" + mMovieDescription.text + "'"
            }
        }





    }



