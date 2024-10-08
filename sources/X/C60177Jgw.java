package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Jgw  reason: case insensitive filesystem */
public final class C60177Jgw extends 2YL {
    public final KWY A00;
    public final AnonymousClass0r6 A01;
    public final 0V2 A02;
    public final 05G A03;
    public final AnonymousClass0Ud A04;
    public final UserSession A05;

    public C60177Jgw(UserSession userSession, KWY kwy) {
        HN3 hn3;
        this.A05 = userSession;
        this.A00 = kwy;
        if (DbU.A02((AnonymousClass3QO) kwy.A03.getValue(), 0) == 1) {
            hn3 = HN3.A06;
        } else {
            hn3 = HN3.A07;
        }
        02z A10 = DbS.A10(new C61063Jw1(hn3, C63112Krf.A00(userSession)));
        this.A03 = A10;
        this.A04 = 10b.A03(A10);
        05D A012 = 10D.A01(AnonymousClass05K.A00, 0, 0);
        this.A02 = A012;
        this.A01 = A012;
    }
}
