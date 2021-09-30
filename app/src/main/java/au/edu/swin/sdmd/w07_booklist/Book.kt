package au.edu.swin.sdmd.w07_booklist

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Book(val title: String, val rating: Double, val icon: Int): Parcelable {
}