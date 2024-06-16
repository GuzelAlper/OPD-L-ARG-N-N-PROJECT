package com.example.myfitnessapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class DayTip(
    val day: Int,
    @StringRes val summary: Int,
    @StringRes val detail: Int,
    @DrawableRes val imageResourceId: Int
)
