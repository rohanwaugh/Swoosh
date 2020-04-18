package com.android.swoosh.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Player(var skill: String = "", var league: String = "") : Parcelable