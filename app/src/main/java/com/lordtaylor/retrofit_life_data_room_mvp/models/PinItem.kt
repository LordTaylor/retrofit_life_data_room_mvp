package com.lordtaylor.retrofit_life_data_room_mvp.models

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity

@Entity
data class PinItem (var id:Int,var title:String,var web:String, var descr:String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(title)
        parcel.writeString(web)
        parcel.writeString(descr)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PinItem> {
        override fun createFromParcel(parcel: Parcel): PinItem {
            return PinItem(parcel)
        }

        override fun newArray(size: Int): Array<PinItem?> {
            return arrayOfNulls(size)
        }
    }
}