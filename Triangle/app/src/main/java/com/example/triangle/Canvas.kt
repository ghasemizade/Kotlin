package com.example.triangle

import android.content.Context
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import java.nio.file.Path
import java.nio.file.Paths
import kotlin.io.path.Path

class Canvas @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    val paint : Paint = Paint()
    val path : Path = Path()
    path.moveTo(500f, 100f)
    path.lineTo(1000f, 1400f)
    path.lineTo(50f, 1400f)

    canvas?.drawPath(Path, paint)

}