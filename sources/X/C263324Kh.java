package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;

/* renamed from: X.4Kh  reason: invalid class name and case insensitive filesystem */
public abstract class C263324Kh {
    public static final Object A00(Spanned spanned, Class cls) {
        Object[] spans = spanned.getSpans(0, spanned.length(), cls);
        0qQ.A0A(spans);
        if (spans.length == 0) {
            return null;
        }
        return spans[0];
    }

    public static final void A01(Resources resources, Drawable drawable, int i) {
        0qQ.A0B(resources, 0);
        0qQ.A0B(drawable, 1);
        try {
            float dimensionPixelSize = (float) resources.getDimensionPixelSize(i);
            drawable.setBounds(0, 0, (int) dimensionPixelSize, (int) ((dimensionPixelSize / ((float) drawable.getIntrinsicWidth())) * ((float) drawable.getIntrinsicHeight())));
        } catch (Resources.NotFoundException e) {
            0KC.A0C("SpannableUtil", e.getMessage());
        }
    }

    public static final void A02(Drawable drawable, SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        0qQ.A0B(drawable, 2);
        A03(drawable, spannableStringBuilder, AnonymousClass05K.A01, i, i2, i3);
    }

    public static final void A03(Drawable drawable, SpannableStringBuilder spannableStringBuilder, Integer num, int i, int i2, int i3) {
        0qQ.A0B(drawable, 2);
        C2606346l r2 = new C2606346l(drawable);
        r2.A02 = num;
        r2.A00 = i2;
        r2.A01 = i3;
        spannableStringBuilder.insert(i, " ");
        spannableStringBuilder.setSpan(r2, i, i + 1, 33);
    }

    public static final void A04(Spannable spannable, Spanned spanned, Class... clsArr) {
        0qQ.A0B(clsArr, 2);
        int length = spannable.length();
        for (Class A06 : clsArr) {
            for (Object obj : A06(spanned, A06)) {
                int spanStart = spanned.getSpanStart(obj);
                int spanEnd = spanned.getSpanEnd(obj);
                int spanFlags = spanned.getSpanFlags(obj);
                if (spanStart >= 0 && spanEnd >= 0) {
                    spannable.setSpan(obj, Math.min(spanStart, length), Math.min(spanEnd, length), spanFlags);
                }
            }
        }
    }

    public static final void A05(Spannable spannable, Class... clsArr) {
        0qQ.A0B(spannable, 0);
        for (Class spans : clsArr) {
            Object[] spans2 = spannable.getSpans(0, spannable.length(), spans);
            0qQ.A07(spans2);
            for (Object removeSpan : spans2) {
                spannable.removeSpan(removeSpan);
            }
        }
    }

    public static final Object[] A06(Spanned spanned, Class cls) {
        0qQ.A0B(spanned, 0);
        0qQ.A0B(cls, 1);
        Object[] spans = spanned.getSpans(0, spanned.length(), cls);
        0qQ.A07(spans);
        return spans;
    }
}
