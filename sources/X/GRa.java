package X;

import android.graphics.Color;

public abstract class GRa {
    public static final AnonymousClass5RW A00(C286575Wy r5, String str) {
        C286565Wx A0R;
        long j;
        if (C51967G9n.A1U(r5, 1670646125)) {
            0fL.A01(2016208652, "com.instagram.newsfeed.compose.ui.IconColorUtil.parseColorString (IconColorUtil.kt:40)");
        }
        AnonymousClass5RW r1 = null;
        if (str != null) {
            r5.ExS(1274904418);
            if (00l.A0Z(str, '#')) {
                j = ((long) Color.parseColor(str)) << 32;
            } else {
                C54655HMm hMm = (C54655HMm) C54655HMm.A01.get(str);
                if (hMm != null) {
                    if (C51967G9n.A1U(r5, 1008458183)) {
                        0fL.A01(1770197335, "com.instagram.newsfeed.compose.ui.SemanticColor.color (IconColorUtil.kt:20)");
                    }
                    C55062HbX hbX = C55062HbX.$redex_init_class;
                    int ordinal = hMm.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            j = C51967G9n.A0a(r5, 926648116).A0J;
                        } else if (ordinal == 2) {
                            j = C51967G9n.A0a(r5, 926650043).A0S;
                        } else if (ordinal == 3) {
                            j = C51967G9n.A0a(r5, 926651923).A0n;
                        } else if (ordinal == 4) {
                            A0R = C51970G9q.A0R(r5, 926653037);
                            j = AnonymousClass5RW.A09;
                        } else {
                            throw C51973G9u.A0n(r5, 926645698);
                        }
                        A0R = C51965G9l.A0H(r5, false);
                    } else {
                        A0R = C51970G9q.A0R(r5, 926646637);
                        j = AnonymousClass5RW.A01;
                    }
                    if (0fL.A02()) {
                        0fL.A00(-603825353);
                    }
                    C286565Wx.A0L(A0R, false);
                }
                C51965G9l.A1X(r5, false);
            }
            r1 = C51965G9l.A0N(j);
            C51965G9l.A1X(r5, false);
        }
        if (0fL.A02()) {
            0fL.A00(-1549553204);
        }
        C51965G9l.A1V(r5);
        return r1;
    }
}
