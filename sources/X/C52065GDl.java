package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GDl  reason: case insensitive filesystem */
public final class C52065GDl extends 2YL {
    public final UserSession A00;
    public final JUB A01;
    public final GK1 A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new MMC(this, 8));
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new MMC(this, 9));
    public final AnonymousClass0Ud A05;
    public final AnonymousClass0Ud A06;
    public final AnonymousClass0Ud A07;
    public final boolean A08;

    public C52065GDl(UserSession userSession, JUB jub, GK1 gk1, boolean z) {
        Integer num;
        02z A022;
        AnonymousClass7TF.A1C(jub, 2, gk1);
        this.A00 = userSession;
        this.A01 = jub;
        this.A02 = gk1;
        this.A08 = z;
        C58027IkK ikK = new C58027IkK(gk1.A02, 1);
        C318136oS A002 = C318116oQ.A00(this);
        AnonymousClass109 r4 = AnonymousClass10A.A01;
        this.A06 = 10b.A02(GJP.A00, A002, ikK, r4);
        this.A05 = gk1.A03;
        UserSession userSession2 = this.A00;
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession2, 36323161194703815L)) {
            num = AnonymousClass05K.A00;
        } else if (182.A06(r3, userSession2, 36323161194572741L)) {
            num = AnonymousClass05K.A0C;
        } else {
            num = AnonymousClass05K.A01;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 2) {
            C58029IkM ikM = new C58029IkM(0, num, this, jub.A02);
            A022 = 10b.A02(new C54349H8v(num), C318116oQ.A00(this), ikM, r4);
        } else {
            A022 = DbS.A10(new C52066GDm(AnonymousClass05K.A01));
        }
        this.A07 = A022;
        if ((AnonymousClass7TF.A1Z(this.A03) || AnonymousClass7TF.A1Z(this.A04)) && !(!jub.A02.getValue().equals(JUC.A00))) {
            AnonymousClass7TE.A1Z(new MG7(jub, (AnonymousClass4D7) null, 40), jub.A01);
        }
    }
}
