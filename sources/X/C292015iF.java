package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.5iF  reason: invalid class name and case insensitive filesystem */
public final class C292015iF extends MetricAffectingSpan {
    public final float A00;

    public C292015iF(float f) {
        this.A00 = f;
    }

    public final void updateDrawState(TextPaint textPaint) {
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize != 0.0f) {
            textPaint.setLetterSpacing(this.A00 / textSize);
        }
    }

    public final void updateMeasureState(TextPaint textPaint) {
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize != 0.0f) {
            textPaint.setLetterSpacing(this.A00 / textSize);
        }
    }
}
