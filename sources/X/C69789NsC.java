package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NsC  reason: case insensitive filesystem */
public abstract class C69789NsC {
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        1QP A00;
        int A04 = DbW.A04(r9.A01(), "null cannot be cast to non-null type kotlin.Number");
        int A042 = DbW.A04(r9.A02(), "null cannot be cast to non-null type kotlin.Number");
        Object A002 = r9.A00();
        DbS.A1Y(A002);
        String str = (String) A002;
        String A0t = DbU.A0t(r9.A00, 3);
        0lg A0B = C308206Td.A0B(r8);
        if (!(A0B instanceof UserSession) || A0B == null) {
            A00 = C69748NrX.A00();
        } else {
            A00 = AnonymousClass1QO.A00(A0B);
        }
        A00.flowEndFail(A00.generateFlowId(A04, A042), str, A0t);
        return null;
    }
}
