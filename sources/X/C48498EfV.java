package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.EfV  reason: case insensitive filesystem */
public abstract class C48498EfV {
    public static final Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        String str;
        C276544tV A0O = DbY.A0O(r10);
        Object A02 = r10.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        HashMap A0H = C308206Td.A0H((Map) A02);
        int A04 = DbW.A04(r10.A00(), "null cannot be cast to non-null type kotlin.Number");
        if (C46611Dhr.A0E(A0O)) {
            str = C46611Dhr.A07(A0O);
        } else {
            str = null;
        }
        Context A042 = DbT.A04();
        if (str != null) {
            C359638dF.A04(A042, new C359618dD(C308206Td.A0B(r9)), str, A0H, (long) A04);
        }
        return null;
    }
}
