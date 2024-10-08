package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public abstract class RT8 {
    /* JADX WARNING: type inference failed for: r0v14, types: [X.8fc, java.lang.Object] */
    public static final C3034368u A00(C307896Rx r19, AnonymousClass6Tm r20) {
        AnonymousClass6Tm r1 = r20;
        Object A03 = r1.A03(0);
        0qQ.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C276544tV r7 = (C276544tV) A03;
        Object A02 = r1.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C276544tV r12 = (C276544tV) A02;
        List A0N = r12.A0N(40);
        List A0N2 = r12.A0N(38);
        List A0N3 = r12.A0N(36);
        List<C276544tV> A0N4 = r12.A0N(41);
        ArrayList A1C = AnonymousClass7TE.A1C();
        C277014uI A0A = r12.A0A(43);
        C3034268t r8 = null;
        C307896Rx r6 = r19;
        if (A0A != null) {
            Object A00 = C299275ur.A00(r6, AnonymousClass6Tm.A01, A0A);
            if (A00 instanceof Map) {
                r8 = C306456Mf.A00((Map) A00);
            }
        }
        for (C276544tV r0 : A0N4) {
            String A0K = r0.A0K(36);
            if (A0K != null) {
                String A0D = r0.A0D();
                if (A0D != null) {
                    ? obj = new Object();
                    obj.A00 = A0K;
                    obj.A01 = A0D;
                    A1C.add(obj);
                } else {
                    throw AnonymousClass7TE.A0w("Received null name from props in the payload.Make tree resource references");
                }
            } else {
                throw AnonymousClass7TE.A0w("Received null variable id from props in the payload.Make tree resource references");
            }
        }
        return Q4I.A00(r6, r7, r8, C307476Qg.A07(r6.A03), A0N, A0N2, A0N3, A1C, Collections.emptyList(), Collections.emptyList(), (List) null, (Map) null, (Map) null, false, false);
    }
}
