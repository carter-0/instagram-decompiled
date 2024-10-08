package X;

import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.StyleSpan;

/* renamed from: X.OaZ  reason: case insensitive filesystem */
public final class C71056OaZ {
    public static final C71056OaZ A00 = new Object();

    public static final C278324wh A00(AnonymousClass9JK r7, int i) {
        Integer num;
        int i2 = i;
        int A05 = i + DbX.A05(r7.A05);
        boolean A1Z = C51972G9s.A1Z((Boolean) r7.A01);
        String str = r7.A03;
        if (str == null) {
            str = "#999999";
        }
        String str2 = r7.A02;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = r7.A04;
        if (str3 != null) {
            num = AnonymousClass5H9.A00(str3);
        } else {
            num = null;
        }
        return new C278324wh(num, str, str2, i2, A05, A1Z);
    }

    public static final void A01(SpannableString spannableString, C278324wh r5, int i, boolean z, boolean z2) {
        if (r5.A05) {
            spannableString.setSpan(new StyleSpan(1), r5.A01, r5.A00, 33);
        }
        if (!z2) {
            if (!z) {
                i = Color.parseColor(r5.A04);
            }
            spannableString.setSpan(C66580MXl.A0E(i), r5.A01, r5.A00, 33);
        }
    }
}
