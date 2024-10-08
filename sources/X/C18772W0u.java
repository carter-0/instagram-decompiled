package X;

import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.TypedValue;

/* renamed from: X.W0u  reason: case insensitive filesystem */
public final class C18772W0u {
    public static final C18772W0u A00 = new Object();

    public static final float A00(RectF rectF, Layout layout, Spannable spannable, TextPaint textPaint, float f, float f2, float f3, float f4, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        Object absoluteSizeSpan;
        float f5;
        boolean z4;
        boolean z5;
        float f6 = f;
        while (f <= f2) {
            float f7 = (f + f2) / 2.0f;
            if (z3) {
                absoluteSizeSpan = new RelativeSizeSpan(f7);
            } else {
                absoluteSizeSpan = new AbsoluteSizeSpan(AnonymousClass1GB.A01(f7));
            }
            boolean z6 = false;
            spannable.setSpan(absoluteSizeSpan, i2, i3, 0);
            Layout.Alignment alignment = layout.getAlignment();
            0qQ.A07(alignment);
            int i4 = i;
            int i5 = i4;
            StaticLayout.Builder alignment2 = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, AnonymousClass1GB.A01(rectF.right)).setAlignment(alignment);
            if (i4 == -1) {
                i5 = Integer.MAX_VALUE;
            }
            StaticLayout build = alignment2.setMaxLines(i5).build();
            0qQ.A0A(build);
            int i6 = 0;
            if (build != null) {
                i6 = build.getHeight();
            }
            if (z3) {
                f5 = f3 * f7;
            } else {
                f5 = f7;
            }
            boolean A1U = Dba.A1U((f5 > ((float) build.getWidth()) ? 1 : (f5 == ((float) build.getWidth()) ? 0 : -1)));
            float f8 = (float) i6;
            boolean A1U2 = Dba.A1U((f5 > f8 ? 1 : (f5 == f8 ? 0 : -1)));
            if (z || (((float) build.getWidth()) <= rectF.right && A1U)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z2 || (f8 <= rectF.bottom && A1U2)) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (i <= 0 || build.getLineCount() <= i4) {
                z6 = true;
            }
            if (!z4 || !z5 || !z6) {
                f2 = f7 - f4;
            } else {
                f = f7 + f4;
                f6 = f7;
            }
            spannable.removeSpan(absoluteSizeSpan);
        }
        return f6;
    }

    public static final int A01(C307786Rm r3, String str, int i) {
        try {
            return (int) TypedValue.applyDimension(2, AnonymousClass6Su.A02(str), AnonymousClass7TF.A0E(r3.A00));
        } catch (C258053yO e) {
            1Kn.A00(r3, "ResizeToFitSpanStyle", "Error parsing text size value", e);
            return i;
        }
    }
}
