package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EeR  reason: case insensitive filesystem */
public abstract class C48432EeR {
    public static final Object A00(C307896Rx r5, AnonymousClass6Tm r6) {
        boolean A01 = Q0A.A01(DbW.A0e(r6));
        Object A02 = r6.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.Number");
        long A0R = AnonymousClass7TE.A0R(A02);
        C307786Rm r0 = r5.A03;
        if (r0 != null) {
            UserSession A0V = DbU.A0V(r5);
            DbS.A1Z(A0V);
            UserSession userSession = A0V;
            if (A01) {
                C49955FGk.A04(userSession, A0R);
                return null;
            }
            C49955FGk.A01(r0.A00, userSession, A0R);
            return null;
        }
        throw AnonymousClass7TE.A0y();
    }
}
