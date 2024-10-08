package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;

/* renamed from: X.Ku8  reason: case insensitive filesystem */
public abstract class C63263Ku8 {
    public static final CharSequence A00(Context context, String str, String str2, String str3) {
        SpannableStringBuilder A0E = C51965G9l.A0E();
        if (str3 == null) {
            int i = 2131976646;
            if (0mp.A0G(str2, "SALE")) {
                i = 2131976668;
            }
            str3 = AnonymousClass7TE.A16(context, i);
        }
        if (str == null) {
            return str3;
        }
        A0E.append(str3);
        A0E.setSpan(new StyleSpan(1), 0, A0E.length(), 17);
        return A0E;
    }
}
