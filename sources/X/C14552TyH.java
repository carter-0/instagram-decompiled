package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.TyH  reason: case insensitive filesystem */
public final class C14552TyH extends MetricAffectingSpan {
    public final float A00;
    public final float A01;

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.A01 / (textPaint.getTextSize() / this.A00));
    }

    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.A01 / (textPaint.getTextSize() / this.A00));
    }

    public C14552TyH(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }
}
