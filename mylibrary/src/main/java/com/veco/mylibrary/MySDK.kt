package com.veco.mylibrary

import androidx.annotation.Keep

/**
 * Created by Dharmesh on 23-11-2022.
 *
 *
 */
@Keep
object MySDK {
    fun mySDKCall(name : String) : String = "Yes, you are awesome $name"
}