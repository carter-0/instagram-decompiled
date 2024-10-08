package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GNx  reason: case insensitive filesystem */
public final class C52330GNx implements C250603lj {
    public final 1Bk A00;
    public final C229312nB A01;
    public final AnonymousClass2pP A02;
    public final C52331GNy A03;

    public final void ATF(AnonymousClass30Y r8, C252093oY r9) {
        Integer num;
        boolean A1U = AnonymousClass7TF.A1U(0, r8, r9);
        AnonymousClass2pP r5 = this.A02;
        String str = r8.A05;
        C254213s7 A002 = r5.A00(str);
        String A0R = 002.A0R(str, "_vpvd_impression");
        int A0A = C51968G9o.A0A(r8, r9);
        if (A0A == 0 || A0A == A1U) {
            A002.A03(r8, r9);
            return;
        }
        A002.A04(r9);
        C229312nB r6 = this.A01;
        if (!r6.A00.A0F(A0R)) {
            num = AnonymousClass05K.A00;
        } else if (r6.A03(A0R, 0)) {
            num = AnonymousClass05K.A01;
        } else {
            return;
        }
        r5.A01(new C57469IbD(this.A03, num), A002, r8.A03, r8.A04);
        r6.A02(A0R);
    }

    public C52330GNx(AnonymousClass0iw r5, UserSession userSession, 1Xj r7) {
        C52331GNy gNy = new C52331GNy(r5, userSession, r7);
        AnonymousClass2pP A0f = C51972G9s.A0f(userSession);
        1Bk A0b = C51972G9s.A0b(userSession);
        C229312nB A002 = C229312nB.A00(A0b);
        this.A02 = A0f;
        this.A03 = gNy;
        this.A00 = A0b;
        this.A01 = A002;
    }
}
