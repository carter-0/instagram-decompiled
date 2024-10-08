package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ggk  reason: case insensitive filesystem */
public final class C52993Ggk extends 2YL {
    public final AnonymousClass0eM A00;
    public final 05G A01;
    public final AnonymousClass0Ud A02;
    public final UserSession A03;

    public C52993Ggk(UserSession userSession, String str, String str2, String str3, String str4, int i, boolean z, boolean z2) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        02z A10 = DbS.A10(new C53371Gmv(str, str2, str3, str4, i, z, z2));
        this.A01 = A10;
        this.A02 = A10;
        HDv hDv = new HDv(userSession);
        0t0 A012 = AnonymousClass0eN.A01(C58690Ivz.A00(hDv, new AnonymousClass8ZA(hDv.A00), 40));
        this.A00 = A012;
        05G r1 = ((C54430HDc) A012.getValue()).A01;
        do {
        } while (!C51975G9x.A1a(r1.getValue(), r1, i, z));
        C58099ImL.A01(this, C318116oQ.A00(this), 24);
    }
}
