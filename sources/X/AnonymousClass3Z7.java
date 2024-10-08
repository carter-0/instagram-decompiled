package X;

import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3Z7  reason: invalid class name */
public abstract class AnonymousClass3Z7 {
    public static final SpannableStringBuilder A00(UserSession userSession, 1Xj r4) {
        String str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!r4.CcK() || !C231122qu.A0V(userSession, r4)) {
            User A2A = r4.A2A(userSession);
            if (A2A != null) {
                str = A2A.getUsername();
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            str = C231122qu.A08(userSession, r4);
            if (str == null) {
                throw new IllegalStateException("Required value was null.");
            }
        }
        spannableStringBuilder.append(str);
        return spannableStringBuilder;
    }
}
