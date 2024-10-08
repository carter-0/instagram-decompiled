package X;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: X.Mrz  reason: case insensitive filesystem */
public final class C67668Mrz extends InputFilter.LengthFilter {
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        Spanned spanned2 = spanned;
        AnonymousClass7TF.A1C(charSequence, 0, spanned);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        int length = charSequence.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = charSequence.charAt(i5);
            if (charAt != '/') {
                A1A.append(charAt);
            }
        }
        return super.filter(A1A, i, i2, spanned2, i3, i4);
    }
}
