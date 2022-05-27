package com.example.drawtriangle_b
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import java.nio.file.Path
import kotlin.io.path.moveTo

class CanvasView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val paint : Paint = Paint()
        val path : Path= Path()
        path.moveTo(1000f,600f)
        path.lineTo(1000f,1400f)
        path.lineTo(200f,1400f)
        canvas?.drawPath(path,paint)
    }

}