package X;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import java.util.Locale;

/* renamed from: X.Hal  reason: case insensitive filesystem */
public abstract class C55014Hal {
    public static final SpannableStringBuilder A00(String str, String str2) {
        Locale locale = Locale.ROOT;
        int A0G = C51971G9r.A0G(DbT.A12(locale, str), DbT.A12(locale, str2));
        SpannableStringBuilder A0C = DbS.A0C(str);
        if (A0G != -1) {
            A0C.setSpan(new StyleSpan(1), A0G, C51966G9m.A05(str2, A0G), 33);
        }
        return A0C;
    }
}
