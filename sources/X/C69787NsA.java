package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.NsA  reason: case insensitive filesystem */
public abstract class C69787NsA {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        1QP A00;
        String valueOf;
        int A04 = DbW.A04(r8.A01(), "null cannot be cast to non-null type kotlin.Number");
        int A042 = DbW.A04(r8.A02(), "null cannot be cast to non-null type kotlin.Number");
        Object A002 = r8.A00();
        0qQ.A0C(A002, Pxd.A00(2));
        Map map = (Map) A002;
        0lg A0B = C308206Td.A0B(r7);
        if (!(A0B instanceof UserSession) || A0B == null) {
            A00 = C69748NrX.A00();
        } else {
            A00 = AnonymousClass1QO.A00(A0B);
        }
        if (map != null) {
            long generateFlowId = A00.generateFlowId(A04, A042);
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                Object value = A1J.getValue();
                if (value instanceof Number) {
                    A00.flowAnnotate(generateFlowId, DbT.A13(A1J), C66582MXn.A08(A1J));
                } else {
                    boolean z = value instanceof Boolean;
                    String A13 = DbT.A13(A1J);
                    Object value2 = A1J.getValue();
                    if (z) {
                        A00.flowAnnotate(generateFlowId, A13, AnonymousClass7TE.A1a(value2));
                    } else {
                        if (value2 instanceof Number) {
                            valueOf = value2.toString();
                        } else {
                            valueOf = String.valueOf(value2);
                        }
                        A00.flowAnnotate(generateFlowId, A13, valueOf);
                    }
                }
            }
        }
        return null;
    }
}
