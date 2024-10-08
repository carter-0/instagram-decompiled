package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.EiC  reason: case insensitive filesystem */
public abstract class C48665EiC {
    public static final Object A00(AnonymousClass6Tm r5) {
        String A0g = DbY.A0g(r5);
        int A04 = DbW.A04(r5.A02(), "null cannot be cast to non-null type kotlin.Number");
        int hashCode = A0g.hashCode();
        if (hashCode != -1867169789) {
            if (hashCode != -1367724422) {
                if (hashCode != -1086574198 || !A0g.equals("failure")) {
                    return null;
                }
                C307546Qn.A01.AT3(719983200, A04);
                return null;
            } else if (!A0g.equals("cancel")) {
                return null;
            } else {
                02m.A0p.markerEnd(719983200, A04, 4);
                return null;
            }
        } else if (!A0g.equals(RealtimeConstants.SEND_SUCCESS)) {
            return null;
        } else {
            C307546Qn.A01.AT4(719983200, A04);
            return null;
        }
    }
}
