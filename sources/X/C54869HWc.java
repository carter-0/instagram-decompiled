package X;

import android.content.Context;

/* renamed from: X.HWc  reason: case insensitive filesystem */
public abstract class C54869HWc {
    public static final void A00(C286575Wy r11, AnonymousClass3QO r12, String str, int i, boolean z) {
        int i2;
        String A14;
        String str2;
        String str3 = str;
        0qQ.A0B(str, 1);
        AnonymousClass3QO r5 = r12;
        0qQ.A0B(r12, 2);
        C286575Wy r10 = r11;
        r11.ExV(-1400862943);
        int i3 = i;
        boolean z2 = z;
        if ((i & 14) == 0) {
            i2 = G9t.A0Y(r11, z) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0P(r11, str);
        }
        if ((i & 896) == 0) {
            i2 |= G9t.A0Q(r11, r12);
        }
        if ((i2 & 731) != 146 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(347130377, "com.instagram.comments.mvvm.view.compose.AudienceDisclaimer (AudienceDisclaimer.kt:23)");
            }
            int ordinal = r12.ordinal();
            if (ordinal == 1) {
                r11.ExS(1917171840);
                if (z) {
                    r11.ExS(1308771421);
                    A14 = C288035bG.A00(r11, 2131955318);
                } else {
                    r11.ExS(1308775161);
                    A14 = C51968G9o.A14(r11, str, 2131955319);
                }
                C51965G9l.A1X(r11, false);
            } else if (ordinal == 11) {
                r11.ExS(1917479639);
                C51967G9n.A0v();
                Context A0I = C51968G9o.A0I(r11);
                0qQ.A0B(A0I, 2);
                if (z) {
                    str2 = A0I.getString(2131968852);
                } else {
                    str2 = DbW.A0h(A0I, str, 2131968851);
                }
                0qQ.A07(str2);
            } else {
                r11.ExS(1917657300);
                C51965G9l.A1V(r11);
                throw AnonymousClass7TE.A0w("Unsupported MediaAudience in AudienceDisclaimer");
            }
            C51968G9o.A1N(r11);
            long A0M = C51966G9m.A0M(r11);
            AnonymousClass5ZZ.A0X(r10, C287195Zj.A0B(C51969G9p.A0U(), 32.0f, 8.0f, 32.0f, 0.0f), C51966G9m.A0b(r11), str2, A0M);
            if (0fL.A02()) {
                0fL.A00(1239593301);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59140J7w(r5, str3, i3, 0, z2);
        }
    }
}
