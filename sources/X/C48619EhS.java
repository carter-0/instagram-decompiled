package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EhS  reason: case insensitive filesystem */
public abstract class C48619EhS {
    public static final Object A00(C307896Rx r3, AnonymousClass6Tm r4) {
        C307786Rm A0L = Dbb.A0L(r4);
        Object A02 = r4.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type com.instagram.common.bloks.BloksParseResult");
        String A0D = C9812Rha.A00(A0L, r3, ((C3034368u) A02).A02).A0D();
        UserSession A0B = C308206Td.A0B(r3);
        if (!(A0B instanceof UserSession) || A0D == null) {
            return null;
        }
        F8I.A01(C308206Td.A04(r3), A0B, A0D).A04();
        return null;
    }
}
