package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.8zF  reason: invalid class name and case insensitive filesystem */
public final class C371858zF extends AnonymousClass82Q {
    public final UserSession A00;
    public final String A01;

    public C371858zF(UserSession userSession, String str) {
        0qQ.A0B(str, 2);
        this.A00 = userSession;
        this.A01 = str;
    }

    public static final 0xa A00(C371858zF r1) {
        UserSession userSession = r1.A00;
        if (userSession != null) {
            return 1Al.A01(userSession).A03(1An.A0a);
        }
        throw new IllegalStateException("Required value was null.");
    }
}
