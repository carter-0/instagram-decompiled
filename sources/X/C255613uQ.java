package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3uQ  reason: invalid class name and case insensitive filesystem */
public abstract class C255613uQ {
    public static final boolean A00(UserSession userSession, Integer num, boolean z, boolean z2) {
        int i;
        if (1GE.A00(userSession).A01 != null) {
            Boolean bool = 1GE.A00(userSession).A01;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = 1w8.A00().A01;
        }
        if (z2) {
            return true;
        }
        if ((z || 1w8.A00().A0D == 2) && i > 0) {
            return true;
        }
        return false;
    }
}
