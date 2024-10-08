package X;

import android.graphics.Paint;
import android.text.TextPaint;

public abstract class VBG {
    public static final TextPaint A00(TextPaint textPaint, float f, int i) {
        TextPaint textPaint2 = new TextPaint(1);
        textPaint2.set(textPaint);
        textPaint2.setStrokeWidth(textPaint.getTextSize() * f);
        textPaint2.setStrokeJoin(Paint.Join.ROUND);
        textPaint2.setColor(i);
        JTO.A1N(textPaint2);
        return textPaint2;
    }
}
