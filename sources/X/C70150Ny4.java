package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ny4  reason: case insensitive filesystem */
public abstract class C70150Ny4 {
    public static final void A00(UserSession userSession, String str, String str2) {
        C72185Oxu oxu = (C72185Oxu) userSession.A01(C72185Oxu.class, C73813PkC.A00);
        synchronized (oxu) {
            oxu.A00.add(002.A0T(str, str2, '.'));
        }
    }
}
