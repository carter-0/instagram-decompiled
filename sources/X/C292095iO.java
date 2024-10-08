package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.5iO  reason: invalid class name and case insensitive filesystem */
public final class C292095iO extends MetricAffectingSpan {
    public final float A00;

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift += (int) ((float) Math.ceil((double) (textPaint.ascent() * this.A00)));
    }

    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift += (int) ((float) Math.ceil((double) (textPaint.ascent() * this.A00)));
    }

    public C292095iO(float f) {
        this.A00 = f;
    }
}
