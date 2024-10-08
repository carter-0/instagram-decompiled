package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.NwO  reason: case insensitive filesystem */
public abstract class C70046NwO {
    public static final int A00(UserSession userSession, AnonymousClass7SD r7) {
        C272964li r0 = r7.A0N;
        Integer num = r0.A00;
        Integer num2 = r0.A01;
        boolean COV = C329737Ka.A01(userSession, r7, true).COV(userSession, r7);
        if (num != null) {
            if (COV && num2 == null) {
                return 86400;
            }
            C71103Och och = C71103Och.A00;
            C242373Tu r2 = r7.A0H;
            int intValue = num.intValue();
            Integer num3 = null;
            if (COV) {
                num3 = num2;
            }
            if (och.A03(userSession, r2, num3, intValue)) {
                if (!COV || num2 == null) {
                    return intValue;
                }
                return num2.intValue();
            }
        }
        if (!COV) {
            return C308556Us.A00(userSession, r7.A0H);
        }
        return 86400;
    }
}
