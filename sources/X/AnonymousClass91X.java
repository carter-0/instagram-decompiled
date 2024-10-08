package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.91X  reason: invalid class name */
public final class AnonymousClass91X extends MetricAffectingSpan implements AnonymousClass6MR {
    public float A00;

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        textPaint.setLinearText(true);
        textPaint.setSubpixelText(true);
        textPaint.setTextSize(this.A00);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        textPaint.setLinearText(true);
        textPaint.setSubpixelText(true);
        textPaint.setTextSize(this.A00);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.X6W, X.WUd] */
    public final X6W By4() {
        float f = this.A00;
        ? obj = new Object();
        obj.A00 = f;
        return obj;
    }
}
