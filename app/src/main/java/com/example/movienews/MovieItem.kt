package com.example.movienews
import com.google.gson.annotations.SerializedName


class MovieItem {
    @SerializedName("original_title")
    var title: String? = null

    @SerializedName("overview")
    var desc: String? = null

    @SerializedName("poster_path")
    var poster: String? = null



}