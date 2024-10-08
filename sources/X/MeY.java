package X;

import com.instagram.common.session.UserSession;

public final class MeY {
    public int A00;
    public 2EM A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final 1wn A05 = C71932OtG.A00(this, 26);
    public final UserSession A06;
    public final 05G A07;
    public final AnonymousClass0Ud A08;
    public final boolean A09;
    public final boolean A0A;

    public MeY(UserSession userSession, 2EM r3, boolean z, boolean z2) {
        0qQ.A0B(userSession, 1);
        this.A06 = userSession;
        this.A09 = z;
        this.A0A = z2;
        this.A01 = r3;
        02z A012 = 106.A01(A00(this));
        this.A07 = A012;
        this.A08 = 10b.A03(A012);
    }

    public static final MeZ A00(MeY meY) {
        boolean A022;
        0eE r0 = AnonymousClass0t1.A01;
        UserSession userSession = meY.A06;
        String A0n = DbU.A0n(userSession, r0);
        boolean z = meY.A09;
        2EM r3 = meY.A01;
        boolean z2 = meY.A0A;
        boolean z3 = meY.A03;
        int i = meY.A00;
        int A002 = C46336Dce.A00(userSession);
        if (AnonymousClass3EM.A01()) {
            A022 = AnonymousClass7TF.A1R(A002);
        } else {
            A022 = AnonymousClass3H7.A02(userSession);
        }
        return new MeZ(r3, A0n, i, z, z2, z3, A022, meY.A02, meY.A04);
    }

    public static void A01(MeY meY) {
        meY.A07.Epw(A00(meY));
    }
}
