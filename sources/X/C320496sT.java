package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6sT  reason: invalid class name and case insensitive filesystem */
public final class C320496sT {
    public final C320506sU A00;
    public final 2el A01;
    public final AnonymousClass32R A02;
    public final String A03;
    public final UserSession A04;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.32Q, java.lang.Object] */
    public C320496sT(C320506sU r3, UserSession userSession, 2el r5, AnonymousClass4DU r6, String str) {
        0qQ.A0B(userSession, 3);
        this.A01 = r5;
        this.A04 = userSession;
        this.A03 = str;
        this.A00 = r3;
        this.A02 = new AnonymousClass32R(userSession, r6, new Object());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C320496sT(UserSession userSession, 2el r8, AnonymousClass4DU r9, String str) {
        this((C320506sU) null, userSession, r8, r9, str);
        0qQ.A0B(r8, 1);
        0qQ.A0B(r9, 2);
        0qQ.A0B(userSession, 3);
    }
}
