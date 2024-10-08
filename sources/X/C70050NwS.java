package X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.instagram.common.session.UserSession;

/* renamed from: X.NwS  reason: case insensitive filesystem */
public abstract class C70050NwS {
    public static final CharSequence A00(UserSession userSession, String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        SpannableStringBuilder A0C;
        if (z) {
            A0C = DbS.A0C("");
        } else {
            A0C = DbS.A0C(002.A0C(str, ' '));
            ForegroundColorSpan A0E = C66580MXl.A0E(i);
            int length = str.length();
            A0C.setSpan(A0E, 0, length, 33);
            A0C.setSpan(new StyleSpan(1), 0, length, 33);
        }
        if (str2 == null) {
            return A0C;
        }
        C253003q3 r1 = new C253003q3(DbS.A0C(str2), userSession);
        r1.A02((C253043q7) null);
        r1.A03((C253023q5) null);
        r1.A04 = i2;
        r1.A03 = i3;
        r1.A01 = i4;
        CharSequence concat = TextUtils.concat(new CharSequence[]{A0C, r1.A00()});
        0qQ.A0A(concat);
        return concat;
    }
}
