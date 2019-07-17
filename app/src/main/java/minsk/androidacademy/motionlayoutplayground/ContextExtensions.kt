package minsk.androidacademy.motionlayoutplayground

import android.content.Context
import android.util.TypedValue
import androidx.annotation.AttrRes
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

fun Context.resolveThemeColor(@AttrRes attributeId: Int, defaultColor: Int = R.color.colorPrimary): Int {
    val outValue = TypedValue()
    val wasResolved = theme.resolveAttribute(attributeId, outValue, true)

    return if (wasResolved) getCompatColor(outValue.resourceId) else getCompatColor(defaultColor)
}

fun Context.getCompatColor(@ColorRes colorResId: Int): Int {
    return ContextCompat.getColor(this, colorResId)
}