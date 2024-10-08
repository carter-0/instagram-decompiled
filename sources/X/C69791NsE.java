package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NsE  reason: case insensitive filesystem */
public abstract class C69791NsE {
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        1QP A00;
        int A04 = DbW.A04(r9.A01(), "null cannot be cast to non-null type kotlin.Number");
        int A042 = DbW.A04(r9.A02(), "null cannot be cast to non-null type kotlin.Number");
        Object A002 = r9.A00();
        0qQ.A0C(A002, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A002;
        String str2 = (String) DbT.A0q(r9, "null cannot be cast to non-null type kotlin.String", 3);
        0lg A0B = C308206Td.A0B(r8);
        if (!(A0B instanceof UserSession) || A0B == null) {
            A00 = C69748NrX.A00();
        } else {
            A00 = AnonymousClass1QO.A00(A0B);
        }
        A00.flowMarkError(A00.generateFlowId(A04, A042), str, str2);
        return null;
    }
}
