package X;

import android.text.Editable;
import android.text.Spannable;
import android.text.TextWatcher;

/* renamed from: X.6UI  reason: invalid class name */
public final class AnonymousClass6UI implements TextWatcher {
    public final C2364933y A00;

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            int i4 = i + i2;
            AnonymousClass5BA[] r8 = (AnonymousClass5BA[]) spannable.getSpans(i, i4, AnonymousClass5BA.class);
            int length = r8.length;
            if (length != 0) {
                int i5 = i;
                int i6 = i4;
                int i7 = 0;
                do {
                    AnonymousClass5BA r1 = r8[i7];
                    int spanStart = spannable.getSpanStart(r1);
                    if (spanStart >= 0 && spanStart < i5) {
                        i5 = spanStart;
                    }
                    i6 = Math.max(i6, spannable.getSpanEnd(r1));
                    spannable.removeSpan(r1);
                    i7++;
                } while (i7 < length);
                if (i5 < i) {
                    int i8 = i - i5;
                    C2364933y r12 = this.A00;
                    if (r12 != null) {
                        r12.A8J(spannable, -1, i5, i8);
                    }
                }
                if (i4 < i6) {
                    int i9 = i6 - i4;
                    C2364933y r13 = this.A00;
                    if (r13 != null) {
                        r13.A8J(spannable, -1, i4, i9);
                    }
                }
            }
            if (i2 != 0) {
                for (U2X removeSpan : (U2X[]) spannable.getSpans(i, i4, U2X.class)) {
                    spannable.removeSpan(removeSpan);
                }
            }
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C2364933y r1;
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            if (i3 >= 1 && (r1 = this.A00) != null) {
                r1.A8J(spannable, -1, i, i3);
            }
        }
    }

    public AnonymousClass6UI(C2364933y r1) {
        this.A00 = r1;
    }

    public AnonymousClass6UI() {
    }
}
