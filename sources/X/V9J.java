package X;

import com.facebook.quicklog.reliability.UserFlowConfig;

public abstract class V9J {
    public static final Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        int A04 = DbW.A04(r7.A01(), "null cannot be cast to non-null type kotlin.Number");
        int A042 = DbW.A04(r7.A02(), "null cannot be cast to non-null type kotlin.Number");
        Object A00 = r7.A00();
        DbS.A1Y(A00);
        boolean A01 = Q0A.A01(r7.A03(3));
        1QP A002 = AnonymousClass1QO.A00(DbW.A0R(r6));
        A002.flowStartIfNotOngoing(A002.generateFlowId(A04, A042), new UserFlowConfig((String) A00, A01));
        return null;
    }
}
