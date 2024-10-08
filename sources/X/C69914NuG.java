package X;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* renamed from: X.NuG  reason: case insensitive filesystem */
public abstract class C69914NuG {
    public static final CharSequence A00(Context context, String str, String str2, boolean z) {
        int A08;
        AnonymousClass7TG.A1O(str, str2);
        if (!z || (A08 = 00l.A08(str, str2, 0, false)) == -1) {
            return str;
        }
        boolean A02 = 0mk.A02(context);
        SpannableStringBuilder A0C = DbS.A0C(str);
        if (!A02) {
            A08 += str2.length();
        }
        C244273av.A04(context, A0C, A08);
        return A0C;
    }
}
