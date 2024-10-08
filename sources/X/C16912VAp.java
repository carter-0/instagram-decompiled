package X;

import java.util.List;

/* renamed from: X.VAp  reason: case insensitive filesystem */
public abstract class C16912VAp {
    public static final C19191WOx A00(C21051XBs xBs, String str) {
        List AYc;
        0qQ.A0B(xBs, 0);
        if (!(xBs instanceof X3U) || (AYc = ((X3U) xBs).AYc()) == null || AYc.isEmpty()) {
            return null;
        }
        C17487VXq vXq = null;
        C17201VMf BOJ = ((X3V) xBs).BOJ();
        String id = xBs.getId();
        if (xBs.CAU() == C16606Uy2.BUTTON) {
            vXq = xBs.C25();
        }
        return new C19191WOx((C17332VRl) null, BOJ, vXq, id, str, AYc);
    }
}
