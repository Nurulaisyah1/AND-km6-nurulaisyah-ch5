package com.foodapps.data.model
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import java.util.UUID


@Parcelize
data class Menu(
    @SerializedName("nama") var name: String,
    @SerializedName("image_url") var imgUrl: String = "",
    @SerializedName("harga") var price: Double,
    @SerializedName("detail") var detail: String,
    @SerializedName("alamat_resto") var address: String,
    var id: String = UUID.randomUUID().toString()
) : Parcelable {

    companion object {
        const val EXTRA_MENU = "EXTRA_MENU"
    }
}