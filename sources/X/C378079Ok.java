package X;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.9Ok  reason: invalid class name and case insensitive filesystem */
public final class C378079Ok extends MetricAffectingSpan {
    public final Typeface A00;

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTypeface(this.A00);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTypeface(this.A00);
    }

    public C378079Ok(Typeface typeface) {
        this.A00 = typeface;
    }
}
