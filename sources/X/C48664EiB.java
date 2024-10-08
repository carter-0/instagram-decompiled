package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.EiB  reason: case insensitive filesystem */
public abstract class C48664EiB {
    public static Object A00(AnonymousClass6Tm r6) {
        int A0M = AnonymousClass7TE.A0M(r6.A01());
        int A0M2 = AnonymousClass7TE.A0M(r6.A02());
        Iterator A0s = AnonymousClass7TF.A0s(C308206Td.A0H((Map) r6.A00()));
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            C307546Qn.A01.AT1(A0M, A0M2, DbT.A13(A1J), DbS.A0s(A1J));
        }
        return null;
    }
}
