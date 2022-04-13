package net.malkowscy.model

import kotlinx.serialization.Serializable

@Serializable
data class Message(val timestamp: String, val text: String)