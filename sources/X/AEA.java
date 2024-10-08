package X;

import android.graphics.Rect;

public abstract class AEA {
    public static final int A00(int i) {
        int i2 = 0;
        if (i != 0) {
            i2 = 1;
            if (1 != i) {
                throw AnonymousClass7TE.A15(002.A0O("Could not convert camera facing from optic: ", i));
            }
        }
        return i2;
    }

    public static final C39669A4j A01(C363858kS r4) {
        Object A03 = r4.A03(C363858kS.A0L);
        0qQ.A07(A03);
        ((Number) A03).intValue();
        Object A032 = r4.A03(C363858kS.A0K);
        0qQ.A07(A032);
        A00(AnonymousClass7TE.A0M(A032));
        r4.A04(C363858kS.A0T);
        r4.A04(C363858kS.A0Z);
        r4.A04(C363858kS.A0O);
        r4.A04(C363858kS.A0V);
        r4.A04(C363858kS.A0P);
        C39669A4j a4j = new C39669A4j((Rect) r4.A03(C363858kS.A0M), (Rect) r4.A03(C363858kS.A0N));
        r4.A04(C363858kS.A0R);
        return a4j;
    }

    public static final A9S A02(C21986Xoh xoh) {
        if (xoh == null) {
            return null;
        }
        int intValue = xoh.A00(C21986Xoh.A0L).intValue();
        int intValue2 = xoh.A00(C21986Xoh.A0K).intValue();
        String str = (String) xoh.A01(C21986Xoh.A0S);
        String str2 = (String) xoh.A01(C21986Xoh.A0U);
        int intValue3 = xoh.A00(C21986Xoh.A0M).intValue();
        int A00 = A00(xoh.A00(C21986Xoh.A0J).intValue());
        Object A01 = xoh.A01(C21986Xoh.A0T);
        if (A01 != null) {
            if (AnonymousClass7TE.A1a(A01)) {
                Object A012 = xoh.A01(C21986Xoh.A0N);
                if (A012 != null) {
                    ((Number) A012).intValue();
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            Object A013 = xoh.A01(C21986Xoh.A0Z);
            if (A013 != null) {
                ((Number) A013).intValue();
                return new A9S(str, str2, intValue, intValue2, intValue3, A00);
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
