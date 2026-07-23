package wtf.devil.demo.track.domain

import kotlin.time.Duration

data class Track(
    val id: String,
    val title: String,
    val authors: List<String>,
    val trackUrl: String,
    val imageUrl: String?,
    val duration: Duration,
)
