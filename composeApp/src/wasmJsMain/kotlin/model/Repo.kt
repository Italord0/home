package model

import kotlinx.serialization.Serializable


@Serializable
data class Repo(
    val id: Int,
    val name: String
)