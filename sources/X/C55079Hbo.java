package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.Hbo  reason: case insensitive filesystem */
public abstract class C55079Hbo {
    public static final void A00(C286575Wy r25, Modifier modifier, C55647Hl6 hl6, 0sJ r28, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        0sJ r2 = r28;
        C55647Hl6 hl62 = hl6;
        AnonymousClass7TF.A1B(hl62, 0, r2);
        C286575Wy r13 = r25;
        r13.ExV(-930822888);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r13, hl62) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r13, modifier2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0G(r13, r2);
        }
        if ((i3 & 147) != 146 || !r13.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1983678779, "com.instagram.opal.impl.ui.OpalTabPager (OpalTabPager_1_7.kt:26)");
            }
            GZF gzf = hl62.A00;
            C52617GZq.A00(C52616GZp.A00(C51965G9l.A0F(Float.valueOf(1.0f), 1.0f, 400.0f), gzf, r13, 3072, 22), (C304716Ex) null, (C304836Fk) null, gzf, (JNT) null, r13, C287215Zl.A05, modifier2, (AnonymousClass5WO) null, J4E.A00, AnonymousClass5PI.A01(r13, new C52637GaB(19, (Object) hl62, (Object) r2), 704004406), 0.0f, 0, (i3 & 112) | 102236160, 3078, 6716, true, false);
            if (0fL.A02()) {
                0fL.A00(-853128597);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i5, i4, 33, modifier2, r2, hl62);
        }
    }
}
