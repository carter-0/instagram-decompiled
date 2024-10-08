package X;

import java.util.Map;

/* renamed from: X.EiK  reason: case insensitive filesystem */
public abstract class C48673EiK {
    public static final Object A00(C307896Rx r4, AnonymousClass6Tm r5) {
        0lg A0R = DbW.A0R(r4);
        String A0g = DbY.A0g(r5);
        Object A02 = r5.A02();
        0qQ.A0C(A02, Pxd.A00(2));
        String A11 = DbT.A11("setting_type", (Map) A02);
        if (!A0g.equals("permissions_requested") || A11 == null || A11.length() == 0) {
            return null;
        }
        AnonymousClass1Nd.A00(A0R).A00(new FWR(A11));
        return null;
    }
}
