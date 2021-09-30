package au.edu.swin.sdmd.w07_booklist

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Book(val title: String, val rating: Float, val icon: Int): Parcelable {
}