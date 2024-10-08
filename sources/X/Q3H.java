package X;

import java.util.concurrent.TimeUnit;

public abstract class Q3H {
    public static final Object A00(C307896Rx r10, AnonymousClass6Tm r11) {
        int A04 = DbW.A04(r11.A01(), "null cannot be cast to non-null type kotlin.Number");
        int A042 = DbW.A04(r11.A02(), "null cannot be cast to non-null type kotlin.Number");
        Object A00 = r11.A00();
        DbS.A1Y(A00);
        String str = (String) A00;
        Object A03 = r11.A03(3);
        0qQ.A0C(A03, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C276544tV r2 = (C276544tV) A03;
        C277014uI A08 = r2.A08();
        String A0D = r2.A0D();
        if (A08 != null) {
            Object A002 = C299275ur.A00(r10, AnonymousClass6Tm.A01, A08);
            if (A002 == null) {
                1Kn.A02(C273654mx.A00(467), "Evaluation of BKBloksDataQplMarkerPointParamsConstants.TIMESTAMP returned null");
            } else if (A002 instanceof Number) {
                long A0R = AnonymousClass7TE.A0R(A002);
                if (A0R > 0) {
                    02m.A0p.markerPoint(A04, A042, str, A0D, A0R, TimeUnit.MILLISECONDS);
                    return null;
                }
            }
            return null;
        }
        02m r0 = 02m.A0p;
        if (A0D != null) {
            r0.markerPoint(A04, str, A0D);
            return null;
        }
        r0.markerPoint(A04, A042, str);
        return null;
    }
}
