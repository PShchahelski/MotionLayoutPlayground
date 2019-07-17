package minsk.androidacademy.motionlayoutplayground

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import androidx.annotation.AttrRes
import androidx.annotation.Keep
import androidx.appcompat.widget.Toolbar
import androidx.core.content.res.use
import androidx.core.graphics.drawable.DrawableCompat

class TintingToolbar @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.toolbarStyle
) : Toolbar(context, attrs, defStyleAttr) {


    init {
        navigationIcon = navigationIcon?.mutate()
        overflowIcon = overflowIcon?.mutate()
    }

    @get:Keep
    @set:Keep
    var iconTint: Int = context.resolveThemeColor(R.attr.colorControlNormal)
        set(value) {
            if (value != field) {
                navigationIcon?.apply { DrawableCompat.setTint(this, value) }
                overflowIcon?.apply { DrawableCompat.setTint(this, value) }
            }

            field = value
        }
}