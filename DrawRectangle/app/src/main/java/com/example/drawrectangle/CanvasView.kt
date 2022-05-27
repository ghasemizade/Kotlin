package com.example.drawrectangle
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

        val paint : Paint = Paint()

        //canvas?.drawLine(0f, 0f,700f,1000f,paint)
        //canvas?.drawRect(100f,100f,100f,100f,paint)
        //canvas?.drawCircle(540f,850f,50f,paint)
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 5f
        canvas?.drawRect(,paint)

    }

}