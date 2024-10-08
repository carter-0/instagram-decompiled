package X;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* renamed from: X.4b1  reason: invalid class name and case insensitive filesystem */
public final class C267134b1 implements Spannable {
    public Spannable A00;
    public boolean A01;

    public final char charAt(int i) {
        return this.A00.charAt(i);
    }

    public final IntStream chars() {
        return this.A00.chars();
    }

    public final IntStream codePoints() {
        return this.A00.codePoints();
    }

    public final int getSpanEnd(Object obj) {
        return this.A00.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        return this.A00.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        return this.A00.getSpanStart(obj);
    }

    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.A00.getSpans(i, i2, cls);
    }

    public final int length() {
        return this.A00.length();
    }

    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.A00.nextSpanTransition(i, i2, cls);
    }

    public final void removeSpan(Object obj) {
        Spannable spannable = this.A00;
        if (!this.A01 && (spannable instanceof PrecomputedText)) {
            SpannableString spannableString = new SpannableString(spannable);
            this.A00 = spannableString;
            spannable = spannableString;
        }
        this.A01 = true;
        spannable.removeSpan(obj);
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        Spannable spannable = this.A00;
        if (!this.A01 && (spannable instanceof PrecomputedText)) {
            SpannableString spannableString = new SpannableString(spannable);
            this.A00 = spannableString;
            spannable = spannableString;
        }
        this.A01 = true;
        spannable.setSpan(obj, i, i2, i3);
    }

    public final CharSequence subSequence(int i, int i2) {
        return this.A00.subSequence(i, i2);
    }

    public final String toString() {
        return this.A00.toString();
    }
}
