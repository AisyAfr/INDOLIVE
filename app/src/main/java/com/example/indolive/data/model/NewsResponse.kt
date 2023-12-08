package com.example.indolive.data.model

import kotlinx.parcelize.Parcelize
import com.squareup.moshi.JsonClass
import android.os.Parcelable
import com.squareup.moshi.Json

@JsonClass(generateAdapter = true)
@Parcelize
data class NewsResponse(

	@Json(name="data")
	val data: Data,

	@Json(name="success")
	val success: Boolean,

) : Parcelable


@JsonClass(generateAdapter = true)
@Parcelize
data class Data(

	@Json(name="image")
	val image: String,

	@Json(name="link")
	val link: String,

	@Json(name="description")
	val description: String,

	@Json(name="title")
	val title: String,

	@Json(name="posts")
	val posts: List<PostsItem>
) : Parcelable

@JsonClass(generateAdapter = true)
@Parcelize
data class PostsItem(

	@Json(name="thumbnail")
	val thumbnail: String,

	@Json(name="link")
	val link: String,

	@Json(name="description")
	val description: String,

	@Json(name="title")
	val title: String,

	@Json(name="pubDate")
	val pubDate: String
) : Parcelable
