package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.Edk  reason: case insensitive filesystem */
public abstract class C48389Edk {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        Map A0E;
        Object A01 = r8.A01();
        0qQ.A0C(A01, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C276544tV r4 = (C276544tV) A01;
        Object A02 = r8.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        Map map = (Map) A02;
        List list = r8.A00;
        C276544tV r1 = (C276544tV) list.get(2);
        List list2 = (List) list.get(3);
        C307896Rx r3 = r7;
        C307786Rm A00 = C276734to.A00(r7, r8, 4);
        if (r1 != null) {
            A0E = C46611Dhr.A0B(r7, r1, 35);
        } else {
            A0E = 0Yt.A0E();
        }
        FH9.A0D(C308206Td.A06(r3), A00, r3, r4, list2, map, A0E);
        return null;
    }
}
