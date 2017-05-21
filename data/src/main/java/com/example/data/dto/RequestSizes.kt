package com.example.data.dto

import com.google.gson.annotations.SerializedName

/**
 * Data class that hold the different sizes of images
 */
data class RequestSizes (

        @SerializedName("sizes")
        val sizes: Sizes,
        @SerializedName("stat")
        val status: Status,
        @SerializedName("code")
        val code: Int

)