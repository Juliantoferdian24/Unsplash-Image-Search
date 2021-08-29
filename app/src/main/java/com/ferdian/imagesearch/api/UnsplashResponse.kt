package com.ferdian.imagesearch.api

import com.ferdian.imagesearch.data.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)
