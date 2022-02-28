package com.woigt.socioapp.data.entity.api

import com.google.gson.annotations.SerializedName
import com.woigt.socioapp.data.entity.Mapper
import com.woigt.socioapp.data.entity.local.Podcast
import java.io.Serializable

data class ApiPodcast(
    @SerializedName("author") var author: String,
    @SerializedName("title") var title: String,
    @SerializedName("url") var url: String,
    @SerializedName("classRoom") var classRoom: String
) : Serializable, Mapper<ApiPodcast, Podcast> {
    constructor() : this("", "", "", "")

    override fun transform(t: ApiPodcast): Podcast {
        return Podcast(
            t.author,
            t.title,
            t.url,
            t.classRoom
        )
    }
}
