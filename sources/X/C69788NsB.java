package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;

/* renamed from: X.NsB  reason: case insensitive filesystem */
public abstract class C69788NsB {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        1QP A00;
        int A04 = DbW.A04(r8.A01(), "null cannot be cast to non-null type kotlin.Number");
        int A042 = DbW.A04(r8.A02(), "null cannot be cast to non-null type kotlin.Number");
        String A0t = DbU.A0t(r8.A00, 2);
        if (A0t == null) {
            A0t = CancelReason.USER_CANCELLED;
        }
        0lg A0B = C308206Td.A0B(r7);
        if (!(A0B instanceof UserSession) || A0B == null) {
            A00 = C69748NrX.A00();
        } else {
            A00 = AnonymousClass1QO.A00(A0B);
        }
        A00.flowEndCancel(A00.generateFlowId(A04, A042), A0t);
        return null;
    }
}
