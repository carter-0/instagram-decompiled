package X;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.instagram.common.session.UserSession;

/* renamed from: X.51l  reason: invalid class name and case insensitive filesystem */
public abstract class C2803651l {
    public static final void A01(SpannableStringBuilder spannableStringBuilder, C2803551k r6, C2803451j r7, AnonymousClass3W1 r8) {
        int length;
        spannableStringBuilder.append(r7.A06);
        String str = r7.A05;
        if (str != null && (length = str.length()) != 0) {
            spannableStringBuilder.append(002.A0D(str, ' '));
            if (0qQ.A0K(r7.A01, true)) {
                int length2 = spannableStringBuilder.length() - length;
                int i = length + length2;
                spannableStringBuilder.setSpan(new StyleSpan(1), length2, i, 33);
                spannableStringBuilder.setSpan(new C52825GdH(r6, r7, r8), length2, i, 33);
            }
        }
    }

    public static final boolean A02(UserSession userSession, C2803451j r5) {
        0qQ.A0B(userSession, 0);
        String str = r5.A06;
        if (str == null || str.length() == 0 || !182.A06(0Tu.A05, userSession, 36318372304001124L)) {
            return false;
        }
        return true;
    }

    public static final void A00(SpannableStringBuilder spannableStringBuilder, C2803551k r5, C2803451j r6, AnonymousClass3W1 r7) {
        int i;
        int length = spannableStringBuilder.length();
        String str = r6.A02;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        spannableStringBuilder.append(str);
        spannableStringBuilder.setSpan(new C52824GdG(r5, r6, r7), length, i + length, 33);
    }
}
