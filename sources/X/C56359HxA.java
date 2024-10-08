package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HxA  reason: case insensitive filesystem */
public abstract class C56359HxA {
    public static final void A01(C286575Wy r15, Modifier modifier, C55956HqK hqK, String str, 0sL r19, int i, int i2, int i3) {
        int i4;
        int i5 = i;
        String str2 = str;
        Modifier modifier2 = modifier;
        C55956HqK hqK2 = hqK;
        0sL r12 = r19;
        int A08 = C51970G9q.A08(0, hqK2, r12);
        C286575Wy r4 = r15;
        r15.ExV(-1219393280);
        int i6 = i3;
        int i7 = i2;
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = G9t.A0O(r4, hqK2) | i2;
        } else {
            i4 = i7;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= G9t.A0P(r4, modifier2);
        }
        int i9 = i3 & 4;
        if (i9 != 0) {
            i4 |= 384;
        } else if ((i7 & 384) == 0) {
            i4 |= G9t.A0Q(r4, str2);
        }
        int i10 = i3 & 8;
        if (i10 != 0) {
            i4 |= 3072;
        } else if ((i7 & 3072) == 0) {
            i4 |= G9t.A08(r4, i5);
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i7 & 24576) == 0) {
            i4 |= G9t.A0I(r4, r12);
        }
        if ((i4 & 9363) != 9362 || !r4.Bwn()) {
            if (i8 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i9 != 0) {
                str2 = null;
            }
            if (i10 != 0) {
                i5 = 0;
            }
            if (0fL.A02()) {
                0fL.A01(728340745, "com.instagram.wonderwall.ui.compose.components.video.WallMediaPlayerContainer (WallMediaPlayerContainer.kt:33)");
            }
            r4.ExS(1308576028);
            int i11 = i4 & 14;
            boolean A1S = AnonymousClass7TF.A1S(i11, A08);
            Object ECw = r4.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = C59098J6g.A01(hqK2, 1);
                r4.FLL(ECw);
            }
            C286565Wx A0H = C51965G9l.A0H(r4, false);
            C286645Xf.A03(r4, hqK2, (0sP) ECw);
            boolean A1R = C51972G9s.A1R(r4, 1308579243, i11, A08) | AnonymousClass7TF.A1S(i4 & 896, 256) | C51973G9u.A1J(i4);
            Object ECw2 = r4.ECw();
            if (A1R || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new C52425GSd(hqK2, str2, i5, A08);
                r4.FLL(ECw2);
            }
            Modifier A0E = C51973G9u.A0E(A0H, modifier2, ECw2);
            AnonymousClass5RD A0a = C51966G9m.A0a(true);
            int A00 = C287425a7.A00(r4);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r4, A0E);
            C51973G9u.A0y(r4, A0H);
            C51971G9r.A12(r4, A0a, A04);
            0sL r2 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r4, A00)) {
                C51971G9r.A13(r4, r2, A00);
            }
            C51965G9l.A18(r4, A01);
            C51972G9s.A11(r4, r12, i4 >> 12);
            if (0fL.A02()) {
                0fL.A00(-1373918721);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JA6(hqK2, modifier2, r12, str2, i5, i7, i6, 1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if ((r6 & 6) == 4) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C55956HqK A00(X.C286575Wy r4, java.lang.Object r5, int r6) {
        /*
            r0 = -934245618(0xffffffffc8508b0e, float:-213548.22)
            boolean r0 = X.C51967G9n.A1U(r4, r0)
            if (r0 == 0) goto L_0x0011
            r1 = -1262896334(0xffffffffb4b9bb32, float:-3.4595138E-7)
            java.lang.String r0 = "com.instagram.wonderwall.ui.compose.components.video.rememberMediaPlayerContainerState (WallMediaPlayerContainer.kt:48)"
            X.0fL.A01(r1, r0)
        L_0x0011:
            X.4bM r0 = X.C56462Hyu.A00
            java.lang.Object r3 = r4.AJO(r0)
            X.Hoq r3 = (X.C55869Hoq) r3
            r0 = -1871395721(0xffffffff9074c477, float:-4.8271866E-29)
            r4.ExS(r0)
            r0 = r6 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L_0x002c
            boolean r0 = r4.AGu(r5)
            if (r0 != 0) goto L_0x0031
        L_0x002c:
            r1 = r6 & 6
            r0 = 0
            if (r1 != r2) goto L_0x0032
        L_0x0031:
            r0 = 1
        L_0x0032:
            boolean r0 = X.C51965G9l.A1Z(r4, r3, r0)
            java.lang.Object r1 = r4.ECw()
            if (r0 != 0) goto L_0x0040
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x0048
        L_0x0040:
            X.HqK r1 = new X.HqK
            r1.<init>(r3)
            r4.FLL(r1)
        L_0x0048:
            X.HqK r1 = (X.C55956HqK) r1
            X.5Wx r4 = (X.C286565Wx) r4
            boolean r0 = X.C51967G9n.A1a(r4)
            if (r0 == 0) goto L_0x0058
            r0 = 1774149604(0x69bf5fe4, float:2.8919708E25)
            X.0fL.A00(r0)
        L_0x0058:
            X.C286565Wx.A0I(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56359HxA.A00(X.5Wy, java.lang.Object, int):X.HqK");
    }
}
