package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.91V  reason: invalid class name */
public final class AnonymousClass91V extends MetricAffectingSpan implements AnonymousClass6MR {
    public boolean A00;
    public boolean A01;
    public final C358928bh A02;
    public final C358868bb A03;
    public final float A04;
    public final Typeface A05;

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        A00(textPaint);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        A00(textPaint);
    }

    public final void A00(TextPaint textPaint) {
        float f;
        float f2;
        textPaint.setTypeface(this.A05);
        if (this.A01) {
            f = this.A02.A00;
            f2 = 0.0f;
        } else {
            boolean z = this.A00;
            f = this.A02.A00;
            if (z) {
                f2 = this.A04;
            }
            textPaint.setLetterSpacing(f);
        }
        f += f2;
        textPaint.setLetterSpacing(f);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.Abu, java.lang.Object, X.X6W] */
    public final X6W By4() {
        String str = this.A03.A09;
        boolean z = this.A00;
        0qQ.A0B(str, 1);
        ? obj = new Object();
        obj.A00 = str;
        obj.A01 = z;
        return obj;
    }

    public AnonymousClass91V(Context context, C358868bb r4) {
        float f;
        this.A03 = r4;
        C358928bh r1 = r4.A05;
        this.A02 = r1;
        this.A05 = AnonymousClass91U.A01(AnonymousClass0qo.A00(context), r1);
        C360708f1 r0 = r4.A04;
        if (r0 == null || !(r0 instanceof C360848fF)) {
            f = 0.0f;
        } else {
            f = 0.2f;
        }
        this.A04 = f;
    }
}
