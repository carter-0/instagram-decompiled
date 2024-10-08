package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2pn  reason: invalid class name and case insensitive filesystem */
public final class C230542pn implements C230552po {
    public final C232872ua A00;

    public final C232872ua AXB() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.2uc, java.lang.Object] */
    public C230542pn(UserSession userSession, AnonymousClass4DU r10) {
        0Tu r2 = 0Tu.A05;
        UserSession userSession2 = userSession;
        boolean A06 = 182.A06(r2, userSession, 36311998572594006L);
        boolean A062 = 182.A06(r2, userSession, 36311998572921691L);
        boolean A063 = 182.A06(r2, userSession, 36311998572725080L);
        boolean A064 = 182.A06(r2, userSession, 36311998572987228L);
        if (A06 || A062 || A063 || A064) {
            this.A00 = new C232872ua(userSession, new Object(), new C52497GUz(userSession2, A06, A062, A063, A064), r10);
        }
    }
}
