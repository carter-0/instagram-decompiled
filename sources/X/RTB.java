package X;

import android.content.Context;
import java.util.List;
import java.util.Map;

public abstract class RTB {
    public static final Object A00(C307896Rx r18, AnonymousClass6Tm r19) {
        boolean z = true;
        AnonymousClass6Tm r1 = r19;
        Object A02 = r1.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A02;
        String A0p = DbX.A0p(r1, "null cannot be cast to non-null type kotlin.String");
        String A0n = Pxg.A0n(r1, 3);
        Object A03 = r1.A03(4);
        0qQ.A0C(A03, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        List list = (List) A03;
        Object A032 = r1.A03(5);
        0qQ.A0C(A032, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        Map map = (Map) A032;
        List list2 = (List) DbT.A0q(r1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>", 6);
        String A0n2 = Pxg.A0n(r1, 7);
        String A0n3 = Pxg.A0n(r1, 8);
        String A0n4 = Pxg.A0n(r1, 9);
        C277014uI A0P = DbW.A0P(r1, 11);
        C277014uI A0P2 = DbW.A0P(r1, 12);
        C307896Rx r7 = r18;
        C307786Rm r0 = r7.A03;
        0qQ.A0A(r0);
        Context context = r0.A00;
        C12471Sv3 sv3 = new C12471Sv3(r7, A0P, A0P2, 1);
        if (A0n == "VERIFY_FACTOR") {
            z = false;
        }
        List list3 = list;
        C11395SRo.A02(context, sv3, Boolean.valueOf(z), str, A0n, A0p, A0n3, A0n4, A0n2, list3, list2, map);
        return null;
    }
}
