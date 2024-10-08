package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HaS  reason: case insensitive filesystem */
public abstract class C54995HaS {
    public static final void A00(UserSession userSession, 1Xj r5, C243373Ym r6) {
        Integer BpM = r5.A0C.BpM();
        if (BpM != null) {
            int intValue = BpM.intValue();
            Integer BpM2 = r5.A0C.BpM();
            if (BpM2 == null || BpM2.intValue() != 0 || r6 != C243373Ym.NOT_SAVED) {
                C51965G9l.A13();
                int i = intValue - 1;
                if (r6 == C243373Ym.SAVED) {
                    i = intValue + 1;
                }
                r5.A0C.Ej9(Integer.valueOf(i));
                r5.AE7(userSession);
            }
        }
    }
}
