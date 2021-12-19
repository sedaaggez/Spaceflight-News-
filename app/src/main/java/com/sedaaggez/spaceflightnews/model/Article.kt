package com.sedaaggez.spaceflightnews.model

data class Article(
    var id: Int?,
    var title: String?,
    var url: String?,
    var imageUrl: String?,
    var newsSite: String?,
    var summary: String?,
    var publishedAt: String?,
    var updatedAt: String?,
    var featured: Boolean?,
    var launches: List<Launch>,
    var events: List<String>
)
