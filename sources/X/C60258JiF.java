package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.JiF  reason: case insensitive filesystem */
public final class C60258JiF extends 2YL {
    public final 2Fk A00;
    public final 2Fk A01;
    public final 2Fk A02;
    public final AnonymousClass2Fj A03;
    public final UserSession A04;
    public final C64368Lak A05;
    public final KTX A06;
    public final 05G A07;
    public final AnonymousClass0Ud A08;
    public final AnonymousClass2Fj A09;
    public final AnonymousClass2Fj A0A;
    public final C65627Lx4 A0B;
    public final 1Av A0C;
    public final C62320sa A0D;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
        if (X.C363558jv.A00(r3.A04) == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C60258JiF(com.instagram.common.session.UserSession r4, X.C64368Lak r5, X.KTX r6, X.1Av r7, X.C62320sa r8) {
        /*
            r3 = this;
            r2 = 1
            X.0qQ.A0B(r4, r2)
            X.C51974G9v.A1M(r7, r6, r5)
            r0 = 5
            X.0qQ.A0B(r8, r0)
            r3.<init>()
            r3.A04 = r4
            r3.A0C = r7
            r3.A06 = r6
            r3.A05 = r5
            r3.A0D = r8
            com.instagram.common.session.UserSession r0 = r5.A02
            boolean r0 = X.AnonymousClass8PU.A07(r0)
            if (r0 == 0) goto L_0x0029
            com.instagram.common.session.UserSession r0 = r3.A04
            boolean r0 = X.C363558jv.A00(r0)
            r1 = 1
            if (r0 != 0) goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            X.3Q2 r0 = r6.A02
            r0.A5T = r1
            X.MW0 r0 = r6.A01
            r0.EkA(r1)
            r0 = 31
            X.MPA r0 = X.MPA.A00(r3, r0)
            r5.A00 = r0
            r1 = 2
            X.Lx4 r0 = new X.Lx4
            r0.<init>(r3, r1)
            r3.A0B = r0
            X.2Fj r0 = X.JTO.A0K()
            r3.A03 = r0
            r3.A02 = r0
            X.2Fj r0 = X.JTO.A0K()
            r3.A09 = r0
            r3.A00 = r0
            X.2Fj r0 = X.JTO.A0K()
            r3.A0A = r0
            r3.A01 = r0
            X.02z r0 = X.C51970G9q.A10(r2)
            r3.A07 = r0
            r3.A08 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60258JiF.<init>(com.instagram.common.session.UserSession, X.Lak, X.KTX, X.1Av, X.0sa):void");
    }

    public final void A00() {
        KTX ktx = this.A06;
        AnonymousClass3Q2 r6 = ktx.A02;
        C64368Lak lak = this.A05;
        C65627Lx4 lx4 = this.A0B;
        AnonymousClass7TG.A1N(r6, lx4);
        C48153EZv.A05.A03(lak.A01, lak.A02, r6, lx4, (Boolean) null, (C62320sa) null);
        boolean z = r6.A5T;
        r6.A5T = z;
        ktx.A01.EkA(z);
    }

    public final void A01() {
        AnonymousClass2Fj r5;
        int i;
        C63721L4f l4f;
        String str;
        int i2;
        UserSession userSession = this.A05.A02;
        if (AnonymousClass8PU.A07(userSession)) {
            r5 = this.A09;
            str = C363388je.A00(userSession).A00(C64368Lak.A03).A04;
            C363558jv.A00(this.A04);
            i2 = 32;
        } else {
            UserSession userSession2 = this.A04;
            if (C363038ix.A01(userSession2)) {
                User A0j = DbT.A0j(userSession2);
                String BaE = A0j.A03.BaE();
                boolean z = false;
                if (((BaE == null || BaE.length() == 0) && A0j.A1x()) || A0j.A1N()) {
                    z = true;
                }
                r5 = this.A09;
                if (z) {
                    i = 33;
                } else {
                    str = C363388je.A00(userSession).A00(C64368Lak.A03).A04;
                    C363558jv.A00(userSession2);
                    i2 = 34;
                }
            } else {
                r5 = this.A09;
                i = 35;
            }
            l4f = new C63721L4f((String) null, MPA.A00(this, i));
            r5.A0B(l4f);
        }
        MPA A002 = MPA.A00(this, i2);
        0qQ.A0B(str, 1);
        l4f = new C63721L4f(str, A002);
        r5.A0B(l4f);
    }
}
