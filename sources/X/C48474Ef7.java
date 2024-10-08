package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ef7  reason: case insensitive filesystem */
public abstract class C48474Ef7 {
    public static final C60340gF A00(C307896Rx r7, AnonymousClass6Tm r8) {
        UserSession A0W = DbX.A0W(r7);
        Object A01 = r8.A01();
        String A0p = DbS.A0p(A01);
        String A0k = DbW.A0k(r8, A0p);
        String A0j = DbW.A0j(r8, A0p);
        C309516Yo A0M = DbS.A0M(C308206Td.A04(r7), A0W);
        1a1 A02 = C46447Df9.A02();
        C46474Dfc A012 = C46548Dgp.A01(A0W, (String) A01, A0k, A0j);
        A012.A0C = A0j;
        C46474Dfc.A03(A0M, A0W, A02, A012);
        return C60340gF.A00;
    }
}
