package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Dkx  reason: case insensitive filesystem */
public final class C46770Dkx extends 2YL {
    public final UserSession A00;
    public final C54434HDi A01;
    public final String A02;
    public final String A03;
    public final AnonymousClass0r6 A04;
    public final 0V2 A05;
    public final 05G A06;
    public final AnonymousClass0Ud A07;

    public C46770Dkx(UserSession userSession, C54434HDi hDi, String str, String str2) {
        C54434HDi hDi2 = hDi;
        0qQ.A0B(hDi2, 1);
        this.A01 = hDi2;
        this.A00 = userSession;
        this.A03 = str;
        this.A02 = str2;
        Integer num = AnonymousClass05K.A00;
        02z A10 = DbS.A10(new C47182Drx(C46519DgM.FOLLOW, C243363Yl.NOT_LIKED, num, "", "", "", 0sn.A00, 0, true, true));
        this.A06 = A10;
        this.A07 = 10b.A03(A10);
        05D A012 = 10D.A01(num, 0, 0);
        this.A05 = A012;
        this.A04 = A012;
        C318136oS A002 = C318116oQ.A00(this);
        1Eo.A03(num, 19B.A00, new C51646Fy5(this, (AnonymousClass4D7) null, 43), A002);
    }

    public final void A00(G57 g57) {
        C318136oS A002;
        int i;
        String A2n;
        if (g57 instanceof C50649FgA) {
            A002 = C318116oQ.A00(this);
            i = 37;
        } else if (g57 instanceof IWG) {
            C54434HDi hDi = this.A01;
            1Xj A0U = DbV.A0U(hDi.A01, this.A02);
            if (A0U != null && (A2n = A0U.A2n()) != null) {
                hDi.A01(A2n, new G4S(this, 10), false);
                return;
            }
            return;
        } else if (g57 instanceof C50648Fg9) {
            A002 = C318116oQ.A00(this);
            i = 36;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        C51647Fy6.A02(this, A002, i);
    }
}
