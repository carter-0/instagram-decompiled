package X;

import android.graphics.Rect;
import android.text.TextPaint;

/* renamed from: X.VgD  reason: case insensitive filesystem */
public final class C17800VgD {
    public final Rect A00 = new Rect();
    public final TextPaint A01;

    public final float A00(String str, float f) {
        0qQ.A0B(str, 0);
        TextPaint textPaint = this.A01;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(f);
        float measureText = textPaint.measureText(str);
        textPaint.setTextSize(textSize);
        return measureText;
    }

    public C17800VgD(TextPaint textPaint) {
        this.A01 = textPaint;
    }
}
