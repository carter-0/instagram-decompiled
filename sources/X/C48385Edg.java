package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Edg  reason: case insensitive filesystem */
public abstract class C48385Edg {
    public static final Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        HashMap A0E;
        String str = (String) DbW.A0f(r10);
        List list = r10.A00;
        Map map = (Map) list.get(1);
        C277014uI A0R = DbV.A0R(list, 2);
        C277014uI A0R2 = DbV.A0R(list, 3);
        if (map == null) {
            1Kn.A02("BKBloksActionBloksAsyncLoadV2Impl", 002.A0R("params map should not be null when loading: ", str));
        }
        if (A0R == null) {
            1Kn.A02("BKBloksActionBloksAsyncLoadV2Impl", 002.A0R("onSuccess expression should not be null when loading: ", str));
        }
        if (A0R2 == null) {
            1Kn.A02("BKBloksActionBloksAsyncLoadV2Impl", 002.A0R("onFailure expression should not be null when loading: ", str));
        }
        C307896Rx r5 = r9;
        C229382nI A06 = C308206Td.A06(r9);
        AnonymousClass4D6 A0C = C308206Td.A0C(r9);
        0lg A0B = C308206Td.A0B(r9);
        if (map != null) {
            A0E = C308206Td.A0H(map);
        } else {
            A0E = 0Yt.A0E();
        }
        C360678ey A062 = C359988do.A06(A0B, str, A0E);
        A062.A00(new E87(A06, r5, A0R, A0R2, str));
        A0C.schedule(A062);
        return null;
    }
}
