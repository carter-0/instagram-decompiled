package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* renamed from: X.Hvu  reason: case insensitive filesystem */
public abstract class C56286Hvu {
    public static final void A00(C286575Wy r16, C53399GnW gnW, String str, C62320sa r19, 0sP r20, 0sP r21, int i) {
        int i2;
        C286575Wy r12 = r16;
        r12.ExV(-1195824134);
        int i3 = i;
        C53399GnW gnW2 = gnW;
        if ((i & 48) == 0) {
            i2 = G9t.A0P(r12, gnW2) | i;
        } else {
            i2 = i3;
        }
        0sP r4 = r20;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r12, r4);
        }
        C62320sa r5 = r19;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r12, r5);
        }
        0sP r3 = r21;
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r12, r3);
        }
        if ((i2 & 9361) != 9360 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(2034632737, "com.instagram.creator.agent.settings.keyword.KeywordLinkScreen (KeywordResponsesListFragment.kt:140)");
            }
            LazyListState A00 = C305066Gi.A00(r12, 0, 0, 0, 3);
            r12.ExS(1981688739);
            boolean z = true;
            boolean A1S = AnonymousClass7TF.A1S(i2 & 7168, C249703kE.FLAG_MOVED);
            Object ECw = r12.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = C58706IwF.A00(r12, r5, 38);
            }
            C286565Wx A0H = C51965G9l.A0H(r12, false);
            C52381GQg.A00(A00, r12, (C62320sa) ECw);
            C304826Fj r10 = new C304826Fj(0.0f, 0.0f, 0.0f, 16.0f);
            boolean A1Y = C51974G9v.A1Y(r12, 1981695720, i2) | C51973G9u.A1I(i2);
            if ((i2 & 57344) != 16384) {
                z = false;
            }
            boolean z2 = A1Y | z;
            Object ECw2 = r12.ECw();
            if (z2 || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = J6W.A00(r12, r4, r3, gnW2, 35);
            }
            AnonymousClass6HY.A03(r10, A00, r12, (Modifier) null, C51965G9l.A0z(A0H, ECw2), 12583296, 121, true);
            if (0fL.A02()) {
                0fL.A00(1222336918);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            C62320sa r7 = r5;
            C53399GnW gnW3 = gnW2;
            0sP r6 = r3;
            ASQ.A06 = new J9P(r6, r7, gnW3, r4, str, i3, 3);
        }
    }

    public static final void A01(C286575Wy r8, QP8 qp8, 0sP r10, 0sP r11, int i) {
        int i2;
        C286575Wy r2 = r8;
        r8.ExV(-1142473146);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r8, qp8) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r8, r10);
        }
        if ((i & 384) == 0) {
            i2 |= G9t.A0G(r8, r11);
        }
        if ((i2 & 147) != 146 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(2044629244, "com.instagram.creator.agent.settings.keyword.KeywordLinkRow (KeywordResponsesListFragment.kt:222)");
            }
            HZO.A00(r2, (Alignment) null, (Modifier) null, JG2.A00(r8, qp8, r11, 1, 1537006395), JG2.A00(r8, qp8, r10, 2, -565447108), 3456, 3);
            if (0fL.A02()) {
                0fL.A00(-364015652);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = JGN.A01(r11, qp8, r10, i, 31);
        }
    }
}
