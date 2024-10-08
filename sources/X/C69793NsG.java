package X;

import com.facebook.quicklog.reliability.UserFlowConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.NsG  reason: case insensitive filesystem */
public abstract class C69793NsG {
    public static final Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        1QP A00;
        int A04 = DbW.A04(r10.A01(), "null cannot be cast to non-null type kotlin.Number");
        int A042 = DbW.A04(r10.A02(), "null cannot be cast to non-null type kotlin.Number");
        Object A002 = r10.A00();
        0qQ.A0C(A002, C273654mx.A00(30));
        C276544tV r2 = (C276544tV) A002;
        0lg A0B = C308206Td.A0B(r9);
        if (!(A0B instanceof UserSession) || A0B == null) {
            A00 = C69748NrX.A00();
        } else {
            A00 = AnonymousClass1QO.A00(A0B);
        }
        boolean equals = "cancel".equals(r2.A0D());
        String A0F = r2.A0F();
        if (A0F == null) {
            A0F = "IgBloks";
        }
        UserFlowConfig userFlowConfig = new UserFlowConfig(A0F, equals);
        userFlowConfig.mTtlMs = (long) r2.A03(38, -1);
        A00.flowStart(A00.generateFlowId(A04, A042), userFlowConfig);
        return null;
    }
}
