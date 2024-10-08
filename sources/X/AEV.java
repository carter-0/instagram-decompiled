package X;

import android.graphics.Rect;
import java.util.List;

public abstract class AEV {
    public static final void A00(C310416b1 r6, B3f b3f) {
        C378669Qs r2 = (C378669Qs) b3f;
        r2.A0H = r6;
        r2.A0G = r6.A0A;
        r2.A0K = r6.A0Q;
        r2.A0a = r6.A0P;
        r2.A0Z = r6.A0O;
        r2.A0M = r6.A0G;
        r2.A0P = r6.A0R;
        r2.A0R = r6.A0K;
        r2.A0S = r6.A0L;
        r2.A0Q = r6.A0J;
        r2.A0T = r6.A0M;
        r2.A0U = r6.A0H;
        r2.A0F = r6.A0D;
        r2.A0Y = r6.A0I;
        r2.A0b = r6.A0S;
        float f = r6.A01;
        if (f != -1.0f) {
            r2.A06 = f;
            r2.EjE(r2.A04 * 1.0f);
        }
        float f2 = r6.A00;
        if (f2 != -1.0f) {
            r2.A05 = f2;
            r2.EjE(r2.A04 * 1.0f);
        }
        List list = r6.A0E;
        if (list != null) {
            b3f.EeI(AnonymousClass7TG.A00(list, 0));
            b3f.EeJ(AnonymousClass7TG.A00(list, 1));
        }
        float f3 = r6.A04;
        if (f3 != -1.0f) {
            r2.A07 = f3;
            r2.EjE(f3);
        }
        float f4 = r6.A03;
        if (f4 != -1.0f) {
            b3f.Ej2(f4);
        }
        int i = r6.A05;
        if (i != r2.A08) {
            r2.A08 = i;
        }
    }

    public static final void A01(C369458un r1, B3f b3f) {
        if (b3f != null) {
            b3f.EjE(r1.A06);
            b3f.EeI(r1.A01);
            b3f.EeJ(r1.A02);
            b3f.Ej2(r1.A05);
        }
    }

    public static final void A02(B3f b3f, float f, float f2) {
        if (b3f != null) {
            Rect A0X = AnonymousClass7TE.A0X(((C378669Qs) b3f).A0B);
            b3f.EeI(f - A0X.exactCenterX());
            b3f.EeJ(f2 - A0X.exactCenterY());
        }
    }
}
