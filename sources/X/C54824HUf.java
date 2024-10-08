package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HUf  reason: case insensitive filesystem */
public abstract class C54824HUf {
    public static final void A00(C286575Wy r27, Modifier modifier, I4B i4b, C62320sa r30, C62320sa r31, 0sP r32, 0sP r33, 0sP r34, 0sL r35, int i) {
        int i2;
        I4B i4b2 = i4b;
        0qQ.A0B(i4b2, 0);
        C62320sa r25 = r30;
        C62320sa r24 = r31;
        0sP r10 = r32;
        DbZ.A0t(1, r25, r10, r24);
        0sP r23 = r33;
        0qQ.A0B(r23, 4);
        Modifier modifier2 = modifier;
        0sP r22 = r34;
        0sL r9 = r35;
        0sP r1 = r22;
        C51974G9v.A1N(r1, modifier2, r9);
        C286575Wy r12 = r27;
        r12.ExV(-498761527);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r12, i4b2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r12, r25);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r12, r10);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r12, r24);
        }
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r12, r23);
        }
        if ((196608 & i) == 0) {
            i2 |= G9t.A0J(r12, r1);
        }
        if ((1572864 & i) == 0) {
            i2 |= G9t.A0U(r12, modifier2);
        }
        if ((12582912 & i) == 0) {
            i2 |= G9t.A0L(r12, r9);
        }
        if ((4793491 & i2) != 4793490 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1099225782, "com.instagram.barcelona.feed.mediaviewer.ui.DismissableMediaBox (DismissableMediaBox.kt:26)");
            }
            C55595HkF hkF = i4b2.A07;
            boolean z = !C51971G9r.A1X(i4b2.A06);
            boolean A1H = C51973G9u.A1H(i2) | C51973G9u.A1P(r12, -1185804499, i2);
            Object ECw = r12.ECw();
            if (A1H || ECw == AnonymousClass5XT.A00) {
                ECw = C59103J6l.A00(r12, r25, r10, 38);
            }
            C286565Wx A0H = C51965G9l.A0H(r12, false);
            AnonymousClass7TF.A1C(hkF, 1, ECw);
            Modifier A00 = C304916Fs.A00(modifier2, Boolean.valueOf(z), new C59674JTf((Object) hkF, z, ECw, (AnonymousClass4D7) null, 2));
            LAC lac = i4b2.A08;
            r12.ExS(-1185797213);
            int i4 = i2 & 14;
            boolean A1S = AnonymousClass7TF.A1S(i4, 4);
            Object ECw2 = r12.ECw();
            if (A1S || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = C58713IwM.A01(r12, i4b2, 1);
            }
            C62320sa A0y = C51965G9l.A0y(A0H, ECw2, false);
            0qQ.A0B(A00, 0);
            0qQ.A0B(lac, 1);
            0qQ.A0B(A0y, 2);
            Modifier A02 = C287435a8.A02(A00, C287655aY.A00, new JGR(lac, A0y));
            boolean A1R = C51972G9s.A1R(r12, -1185792493, i4, 4);
            Object ECw3 = r12.ECw();
            if (A1R || ECw3 == AnonymousClass5XT.A00) {
                ECw3 = C59099J6h.A00(r12, i4b2, 28);
            }
            C286565Wx.A0L(A0H, false);
            0qQ.A0B(A02, 0);
            0qQ.A0B(ECw3, 1);
            Modifier A002 = C304916Fs.A00(A02, C60340gF.A00, new C59703JUk(ECw3, (Object) r22, (Object) r23, (Object) r24, (AnonymousClass4D7) null, 16));
            boolean A1R2 = C51972G9s.A1R(r12, -1185783728, i4, 4);
            Object ECw4 = r12.ECw();
            if (A1R2 || ECw4 == AnonymousClass5XT.A00) {
                ECw4 = new IGL(i4b2, 0);
                r12.FLL(ECw4);
            }
            C286565Wx.A0L(A0H, false);
            int A003 = C287425a7.A00(r12);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r12, A002);
            int i5 = ((((i2 >> 21) & 14) << 6) & 896) | 6;
            C51973G9u.A0z(r12, A0H, C287485aD.A00);
            C51971G9r.A12(r12, ECw4, A04);
            0sL r13 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r12, A003)) {
                C51971G9r.A13(r12, r13, A003);
            }
            C51965G9l.A18(r12, A01);
            C51972G9s.A11(r12, r9, i5 >> 6);
            if (0fL.A02()) {
                0fL.A00(744173197);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JBG(r9, modifier2, i4b2, r24, r23, r22, r10, r25, i3, 1);
        }
    }
}
