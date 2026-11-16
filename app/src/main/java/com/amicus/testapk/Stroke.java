package com.amicus.testapk;

import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by sizik on 16.11.2026.
 */
public class Stroke {
    Path path;
    Paint paint;

    public Stroke(int color,float strokeWidth) {
        path = new Path();
        paint = new Paint();
        paint.setColor(color);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(strokeWidth);
        paint.setAntiAlias(true);
    }
}
