package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class U2Q extends MetricAffectingSpan {
    public final float A00;

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.A00 + textPaint.getTextSkewX());
    }

    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.A00 + textPaint.getTextSkewX());
    }

    public U2Q(float f) {
        this.A00 = f;
    }
}
