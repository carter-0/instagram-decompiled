package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7qF  reason: invalid class name and case insensitive filesystem */
public final class C343457qF {
    public static C344227rW A00;

    public static synchronized C344227rW A00(UserSession userSession) {
        C344227rW r1;
        synchronized (C343457qF.class) {
            r1 = A00;
            if (r1 == null) {
                r1 = new C344227rW(new C343947r4(userSession));
                A00 = r1;
            }
        }
        return r1;
    }
}
