package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NsD  reason: case insensitive filesystem */
public abstract class C69790NsD {
    public static final Object A00(C307896Rx r6, AnonymousClass6Tm r7) {
        1QP A00;
        int A04 = DbW.A04(r7.A01(), "null cannot be cast to non-null type kotlin.Number");
        int A042 = DbW.A04(r7.A02(), "null cannot be cast to non-null type kotlin.Number");
        0lg A0B = C308206Td.A0B(r6);
        if (!(A0B instanceof UserSession) || A0B == null) {
            A00 = C69748NrX.A00();
        } else {
            A00 = AnonymousClass1QO.A00(A0B);
        }
        A00.flowEndSuccess(A00.generateFlowId(A04, A042));
        return null;
    }
}
