package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6oJ  reason: invalid class name and case insensitive filesystem */
public final class C318056oJ {
    public final UserSession A00;
    public final 26t A01;
    public final C318066oK A02;

    public final void A00(boolean z, String str) {
        0qQ.A0B(str, 1);
        0xY AR4 = this.A01.A00.AR4();
        AR4.E5T(002.A0R("KEY_FORCE_CACHE_REQUEST", str), z);
        AR4.apply();
    }

    public /* synthetic */ C318056oJ(UserSession userSession) {
        26t A002 = 26G.A00(userSession);
        C318066oK r1 = new C318066oK(userSession);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(A002, 2);
        this.A00 = userSession;
        this.A01 = A002;
        this.A02 = r1;
    }
}
