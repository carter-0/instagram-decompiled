package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.5iG  reason: invalid class name and case insensitive filesystem */
public final class C292025iG extends MetricAffectingSpan {
    public final float A00;

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.A00);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.A00);
    }

    public C292025iG(float f) {
        this.A00 = f;
    }
}
