package X;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.TzO  reason: case insensitive filesystem */
public final class C14617TzO extends MetricAffectingSpan {
    public final Typeface A00;

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        textPaint.setTypeface(this.A00);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        textPaint.setTypeface(this.A00);
    }

    public C14617TzO(Typeface typeface) {
        this.A00 = typeface;
    }
}
