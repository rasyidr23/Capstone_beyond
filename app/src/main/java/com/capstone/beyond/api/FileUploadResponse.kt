package com.capstone.beyond.api

import com.google.gson.annotations.SerializedName

data class FileUploadResponse(
    @SerializedName("message")
    var message: String? = null,
    @SerializedName("data")
    var data: Data = Data()
)

data class Data(
    @SerializedName("id")
    var id: String? = null,
    @SerializedName("result")
    var result: String? = null,
    @SerializedName("score")
    var score: Double? = null,
    @SerializedName("createdAt")
    var createdAt: String? = null
)