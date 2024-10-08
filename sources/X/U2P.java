package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

public final class U2P extends MetricAffectingSpan {
    public final String A00;

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.A00);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.A00);
    }

    public U2P(String str) {
        this.A00 = str;
    }
}
