package X;

import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;

/* renamed from: X.OhD  reason: case insensitive filesystem */
public final class C71272OhD implements InputFilter {
    public static final C71272OhD A00 = new C71272OhD();

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int i5 = i;
        CharSequence charSequence2 = charSequence;
        int i6 = i;
        while (true) {
            int i7 = i2;
            if (i6 >= i2) {
                return null;
            }
            if (Character.isUpperCase(charSequence.charAt(i6))) {
                char[] cArr = new char[(i2 - i)];
                TextUtils.getChars(charSequence, i, i2, cArr, 0);
                String A12 = DbT.A12(AnonymousClass1Q2.A02(), new String(cArr));
                if (!(charSequence instanceof Spanned)) {
                    return A12;
                }
                SpannableString A0D = C66580MXl.A0D(A12);
                TextUtils.copySpansFrom((Spanned) charSequence2, i5, i7, Object.class, A0D, 0);
                return A0D;
            }
            i6++;
        }
    }
}
