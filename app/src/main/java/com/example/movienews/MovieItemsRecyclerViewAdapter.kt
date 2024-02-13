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
            val mTitle: TextView = mView.findViewById<View>(R.id.movie_title) as TextView
            val mMovieDescription: TextView = mView.findViewById<View>(R.id.movie_description) as TextView
            val mMovieImage: ImageView = mView.findViewById<View>(R.id.movie_image) as ImageView

            override fun toString(): String {
                return mTitle.toString() + " '" + mMovieDescription.text + "'"
            }
        }

        override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
            val movie = movies[position]

            holder.mItem = movie
            holder.mTitle.text = movie.title
            holder.mMovieDescription.text = movie.desc

            Glide.with(holder.mView)
                .load(movie.poster)
                .centerInside()
                .into(holder.mMovieImage)

            holder.mView.setOnClickListener {
                holder.mItem?.let { movie ->
                    mListener?.onItemClick(movie)
                }
            }
        }

        override fun getItemCount(): Int {
            return movies.size
        }





    }



