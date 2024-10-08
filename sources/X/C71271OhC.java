package X;

import android.content.Context;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;

/* renamed from: X.OhC  reason: case insensitive filesystem */
public abstract class C71271OhC implements InputFilter {
    public final Context A00;

    public abstract String A00();

    public abstract String A01(char c);

    public abstract boolean A03(char c);

    public void A02(String str) {
        C59689JTv.A09(this.A00, str);
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int i5 = i;
        int i6 = i2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence, i, i2);
        int i7 = 0;
        if (charSequence instanceof Spanned) {
            TextUtils.copySpansFrom((Spanned) charSequence, i5, i6, Object.class, spannableStringBuilder, 0);
        }
        boolean z = false;
        for (int i8 = 0; i8 < i2 - i; i8++) {
            char charAt = charSequence.charAt(i8 + i);
            if (!A03(charAt)) {
                int i9 = i8 + i7;
                String A01 = A01(charAt);
                spannableStringBuilder.replace(i9, i9 + 1, A01);
                i7 += A01.length() - 1;
                if (!z) {
                    z = false;
                    if (!TextUtils.isEmpty(A01)) {
                    }
                }
                z = true;
            }
        }
        if (z) {
            A02(A00());
        }
        return spannableStringBuilder;
    }

    public C71271OhC(Context context) {
        this.A00 = context;
    }
}
