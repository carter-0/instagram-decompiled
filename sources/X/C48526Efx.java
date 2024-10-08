package X;

import com.instagram.simplewebview.SimpleWebViewConfig;

/* renamed from: X.Efx  reason: case insensitive filesystem */
public abstract class C48526Efx {
    public static final Object A00(C307896Rx r21, AnonymousClass6Tm r22) {
        C276544tV r1;
        boolean z = false;
        AnonymousClass6Tm r12 = r22;
        String A0h = DbY.A0h(r12, 0);
        C277014uI A0N = DbW.A0N(r12);
        C277014uI A0O = DbW.A0O(r12);
        Object A0p = DbT.A0p(r12, 3);
        if ((A0p instanceof C276544tV) && (r1 = (C276544tV) A0p) != null) {
            z = r1.A0R(35, false);
        }
        C48525Efw.A00(r21, A0N, A0O, new SimpleWebViewConfig((String) null, (String) null, false, z, false, false, false, true, false, false, true, false, false, false, (String) null, A0h));
        return null;
    }
}
