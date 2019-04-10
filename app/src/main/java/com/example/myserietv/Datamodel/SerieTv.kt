package com.example.myserietv.Datamodel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SerieTv (var titolo: String,var genere: String,var data: Int) : Parcelable