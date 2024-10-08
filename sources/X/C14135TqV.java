package X;

import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.TqV  reason: case insensitive filesystem */
public abstract class C14135TqV {
    public static final Rect A00(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        Rect rect;
        Class<MetricAffectingSpan> cls = MetricAffectingSpan.class;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i - 1, i2, cls) != i2) {
                rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i < i2) {
                    int nextSpanTransition = spanned.nextSpanTransition(i, i2, cls);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i, nextSpanTransition, cls);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        C16752V4l.A00(textPaint2, rect2, charSequence, i, nextSpanTransition);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i, nextSpanTransition, rect2);
                    }
                    rect.right += rect2.width();
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i = nextSpanTransition;
                }
                return rect;
            }
        }
        rect = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            C16752V4l.A00(textPaint, rect, charSequence, i, i2);
            return rect;
        }
        textPaint.getTextBounds(charSequence.toString(), i, i2, rect);
        return rect;
    }
}
