package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6gw  reason: invalid class name and case insensitive filesystem */
public abstract class C313746gw {
    public static final C313756gx A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (C313756gx) userSession.A01(C313756gx.class, new AnonymousClass9L0(userSession, 22));
    }

    public static final String A01(Integer num) {
        if (num == null) {
            return "instagram";
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return "broadcast";
        }
        if (intValue == 2) {
            return "subscriber_broadcast";
        }
        return "instagram";
    }
}
