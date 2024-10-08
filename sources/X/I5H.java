package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public abstract class I5H {
    public static final GOD A00(Context context, 0eP r7) {
        0qQ.A0B(r7, 1);
        int i = 0;
        int i2 = 1;
        if (AnonymousClass7TE.A04(r7.A01) <= 0nA.A00(context, 158.0f)) {
            i2 = 0;
        }
        Number number = (Number) r7.A00;
        if (number.floatValue() > 0nA.A00(context, 98.0f)) {
            i = 1;
            if (number.floatValue() >= ((float) AnonymousClass0nB.A01(context)) - 0nA.A00(context, 98.0f)) {
                i = 2;
            }
        }
        return (GOD) C51966G9m.A19(C52325GNs.A06.get(i2), i);
    }

    public static final HN1 A01(C52058GDe gDe, int i, boolean z) {
        if (i == 2) {
            return HN1.A09;
        }
        if (i == 3) {
            if (gDe.A0R) {
                return HN1.A07;
            }
            return HN1.A06;
        } else if (i == 4) {
            if (z) {
                return HN1.A0A;
            }
            return HN1.A08;
        } else if (i == 5) {
            return HN1.A05;
        } else {
            return null;
        }
    }

    public static final List A02(GOD god, int i) {
        0qQ.A0B(god, 0);
        double d = god.A00 + ((((double) i) * 1.0471975511965976d) / 2.0d);
        ArrayList A1C = AnonymousClass7TE.A1C();
        int A00 = C70002Hb.A00(1, i * 2, 2);
        if (1 <= A00) {
            int i2 = 1;
            while (true) {
                double d2 = (d - (((double) i2) * 0.5235987755982988d)) % 6.283185307179586d;
                if (!(d2 == 0.0d || Math.signum(d2) == Math.signum(6.283185307179586d))) {
                    d2 += 6.283185307179586d;
                }
                A1C.add(Double.valueOf(d2));
                if (i2 == A00) {
                    break;
                }
                i2 += 2;
            }
        }
        if (god.A01) {
            return 00k.A0Y(A1C);
        }
        return A1C;
    }

    public static final 0eP A03(Context context, 0eP r10, double d, boolean z) {
        0qQ.A0B(r10, 3);
        double cos = Math.cos(d) * 72.0d;
        double sin = 72.0d * Math.sin(d);
        0eP A1L = AnonymousClass7TE.A1L(Double.valueOf((106.0d + cos) - 26.0d), Double.valueOf((50.0d + sin) - 26.0d));
        if (z) {
            return AnonymousClass7TE.A1L(Double.valueOf(((double) AnonymousClass7TE.A04(r10.A00)) + ((double) 0nA.A00(context, (float) cos))), Double.valueOf(((double) AnonymousClass7TE.A04(r10.A01)) - ((double) 0nA.A00(context, (float) sin))));
        }
        return A1L;
    }
}
