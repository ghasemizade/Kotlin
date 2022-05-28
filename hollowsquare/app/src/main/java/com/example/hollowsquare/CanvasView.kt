package com.example.hollowsquare

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import android.util.AttributeSet
import android.view.View

class CanvasView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        val paint: Paint = Paint()

        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 5f
        canvas?.drawRect(Rect(400,400,600,600),paint)
    }
}