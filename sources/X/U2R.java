package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class U2R extends MetricAffectingSpan implements C20838X0n {
    public final float A00;

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        float f = this.A00;
        if (!Float.isNaN(f)) {
            textPaint.setLetterSpacing(f);
        }
    }

    public final void updateMeasureState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        float f = this.A00;
        if (!Float.isNaN(f)) {
            textPaint.setLetterSpacing(f);
        }
    }

    public U2R(float f) {
        this.A00 = f;
    }
}
