package X;

import androidx.compose.ui.Modifier;
import java.util.Iterator;

/* renamed from: X.I2b  reason: case insensitive filesystem */
public abstract class C56571I2b {
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C286575Wy r14, X.AnonymousClass5RW r15, java.lang.String r16, java.lang.String r17, X.C62320sa r18, int r19, int r20, int r21, boolean r22) {
        /*
            r5 = r15
            r8 = r17
            r0 = 1345936068(0x50395ac4, float:1.24389335E10)
            r14.ExV(r0)
            r11 = r21
            r0 = r21 & 1
            r9 = r19
            r10 = r20
            if (r0 == 0) goto L_0x00e2
            r0 = r20 | 6
        L_0x0015:
            r1 = r21 & 2
            r7 = r16
            if (r1 == 0) goto L_0x00d7
            r0 = r0 | 48
        L_0x001d:
            r4 = r21 & 4
            if (r4 == 0) goto L_0x00cc
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0023:
            r3 = r21 & 8
            if (r3 == 0) goto L_0x00c1
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0029:
            r1 = r21 & 16
            r13 = r22
            if (r1 == 0) goto L_0x00b6
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0031:
            r2 = r21 & 32
            r1 = 196608(0x30000, float:2.75506E-40)
            r6 = r18
            if (r2 != 0) goto L_0x0041
            r1 = r20 & r1
            if (r1 != 0) goto L_0x0042
            int r1 = X.G9t.A0J(r14, r6)
        L_0x0041:
            r0 = r0 | r1
        L_0x0042:
            r2 = 74899(0x12493, float:1.04956E-40)
            r2 = r2 & r0
            r1 = 74898(0x12492, float:1.04954E-40)
            if (r2 != r1) goto L_0x0063
            boolean r1 = r14.Bwn()
            if (r1 == 0) goto L_0x0063
            r14.Evl()
        L_0x0054:
            X.5Xd r0 = r14.ASQ()
            if (r0 == 0) goto L_0x0062
            r12 = 1
            X.JAn r4 = new X.JAn
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0.A06 = r4
        L_0x0062:
            return
        L_0x0063:
            r16 = 0
            if (r4 == 0) goto L_0x0069
            r8 = r16
        L_0x0069:
            if (r3 != 0) goto L_0x006d
            r16 = r15
        L_0x006d:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x007b
            r2 = -564843660(0xffffffffde552b74, float:-3.84012462E18)
            java.lang.String r1 = "com.instagram.creation.capture.quickcapture.potato.capture.view.compose.AudienceRow (PotatoAudienceSelectorSheet.kt:120)"
            X.0fL.A01(r2, r1)
        L_0x007b:
            androidx.compose.ui.Modifier r15 = X.C51969G9p.A0U()
            X.2DO r17 = X.C51966G9m.A0Y(r14, r0, r9)
            X.IPm r1 = new X.IPm
            r1.<init>(r13, r6)
            int r21 = X.C51965G9l.A03(r0)
            r3 = 57344(0xe000, float:8.0356E-41)
            int r2 = r0 << 6
            r3 = r3 & r2
            r21 = r21 | r3
            r2 = 29360128(0x1c00000, float:7.052966E-38)
            int r0 = r0 << 12
            r0 = r0 & r2
            r21 = r21 | r0
            r22 = 130636(0x1fe4c, float:1.8306E-40)
            r18 = r1
            r19 = r7
            r20 = r8
            X.C52636GaA.A01(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00b3
            r0 = -416514027(0xffffffffe72c8015, float:-8.146097E23)
            X.0fL.A00(r0)
        L_0x00b3:
            r5 = r16
            goto L_0x0054
        L_0x00b6:
            r1 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x0031
            int r1 = X.G9t.A0c(r14, r13)
            r0 = r0 | r1
            goto L_0x0031
        L_0x00c1:
            r1 = r10 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x0029
            int r1 = X.G9t.A0R(r14, r15)
            r0 = r0 | r1
            goto L_0x0029
        L_0x00cc:
            r1 = r10 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0023
            int r1 = X.G9t.A0Q(r14, r8)
            r0 = r0 | r1
            goto L_0x0023
        L_0x00d7:
            r1 = r20 & 48
            if (r1 != 0) goto L_0x001d
            int r1 = X.G9t.A0P(r14, r7)
            r0 = r0 | r1
            goto L_0x001d
        L_0x00e2:
            r0 = r20 & 6
            if (r0 != 0) goto L_0x00ee
            int r0 = X.G9t.A05(r14, r9)
            r0 = r0 | r20
            goto L_0x0015
        L_0x00ee:
            r0 = r10
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56571I2b.A00(X.5Wy, X.5RW, java.lang.String, java.lang.String, X.0sa, int, int, int, boolean):void");
    }

    public static final void A01(C286575Wy r20, HN3 hn3, C62320sa r22, C62320sa r23, 0sP r24, AnonymousClass62P r25, int i, int i2) {
        int i3;
        String A02;
        AnonymousClass5RW A0N;
        AnonymousClass62P r5 = r25;
        0qQ.A0B(r5, 0);
        HN3 hn32 = hn3;
        C62320sa r8 = r22;
        C62320sa r7 = r23;
        AnonymousClass7TG.A0w(1, hn32, r8, r7);
        0sP r6 = r24;
        0qQ.A0B(r6, 5);
        C286575Wy r10 = r20;
        r10.ExV(-963558408);
        int i4 = i2;
        if ((i2 & 6) == 0) {
            i3 = G9t.A0O(r10, r5) | i2;
        } else {
            i3 = i4;
        }
        if ((i2 & 48) == 0) {
            i3 |= G9t.A0P(r10, hn32);
        }
        int i5 = i;
        if ((i4 & 384) == 0) {
            i3 |= G9t.A07(r10, i5);
        }
        if ((i4 & 3072) == 0) {
            i3 |= G9t.A0H(r10, r8);
        }
        if ((i4 & 24576) == 0) {
            i3 |= G9t.A0I(r10, r7);
        }
        if ((196608 & i2) == 0) {
            i3 |= G9t.A0J(r10, r6);
        }
        if ((74899 & i3) != 74898 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1645121752, "com.instagram.creation.capture.quickcapture.potato.capture.view.compose.PotatoAudienceSelectorSheet (PotatoAudienceSelectorSheet.kt:44)");
            }
            C285245Qk r2 = Modifier.A00;
            Modifier A0T = C51966G9m.A0T(r2);
            AnonymousClass5RD A0X = C51968G9o.A0X(r10);
            int A00 = C287425a7.A00(r10);
            C286565Wx r1 = (C286565Wx) r10;
            AnonymousClass5RM A04 = C286565Wx.A04(r1);
            Modifier A01 = C287435a8.A01(r10, A0T);
            C51973G9u.A0y(r10, r1);
            C51971G9r.A12(r10, A0X, A04);
            0sL r11 = C287485aD.A02;
            if (r1.A0K || !C51972G9s.A1Q(r10, A00)) {
                C51971G9r.A13(r10, r11, A00);
            }
            C51965G9l.A18(r10, A01);
            A02(r10, r8, r7, C51965G9l.A02(i3 >> 9));
            G9w.A15(r10, r2, 12.0f);
            Iterator A17 = C51968G9o.A17(r10, r5, 1025488690);
            while (A17.hasNext()) {
                HN3 hn33 = (HN3) A17.next();
                int i6 = hn33.A00;
                String A002 = C288035bG.A00(r10, hn33.A01);
                Integer num = hn33.A03;
                r10.ExS(1025494916);
                if (num == null) {
                    A02 = null;
                } else {
                    A02 = C288035bG.A02(r10, AnonymousClass7TF.A1b(i5), num.intValue(), i5);
                }
                C286565Wx.A0L(r1, false);
                Integer num2 = hn33.A02;
                r10.ExS(1025502736);
                if (num2 == null) {
                    A0N = null;
                } else {
                    A0N = C51965G9l.A0N(C289505di.A00(r10, num2.intValue()));
                }
                C286565Wx.A0L(r1, false);
                boolean A1W = AnonymousClass7TF.A1W(hn33, hn32);
                r10.ExS(-1071021322);
                boolean A1Z = C51965G9l.A1Z(r10, hn33, C51974G9v.A1T(i3));
                Object ECw = r10.ECw();
                if (A1Z || ECw == AnonymousClass5XT.A00) {
                    ECw = new MJ9(34, hn33, r6);
                    r10.FLL(ECw);
                }
                A00(r10, A0N, A002, A02, C51965G9l.A0y(r1, ECw, false), i6, 0, 0, A1W);
            }
            C286565Wx.A0L(r1, false);
            G9w.A15(r10, r2, 14.0f);
            if (C51967G9n.A1R(r10)) {
                0fL.A00(-1777322025);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59195J9z(r7, r8, hn32, r6, r5, i4, i5, 6);
        }
    }

    public static final void A02(C286575Wy r7, C62320sa r8, C62320sa r9, int i) {
        int i2;
        r7.ExV(-1796467880);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r7, r8) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r7, r9);
        }
        if ((i2 & 19) != 18 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1908836553, "com.instagram.creation.capture.quickcapture.potato.capture.view.compose.AudienceSelectorHeader (PotatoAudienceSelectorSheet.kt:79)");
            }
            C285245Qk r5 = Modifier.A00;
            Modifier A04 = C287195Zj.A04(C51966G9m.A0T(r5));
            AnonymousClass5RD A00 = C287395a4.A00(C287275Zs.A04, r7, C287215Zl.A04);
            int A002 = C287425a7.A00(r7);
            C286565Wx r3 = (C286565Wx) r7;
            AnonymousClass5RM A042 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r7, A04);
            C51973G9u.A0y(r7, r3);
            C51971G9r.A12(r7, A00, A042);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r7, A002)) {
                C51971G9r.A13(r7, r1, A002);
            }
            C51965G9l.A18(r7, A01);
            Object A0m = C51967G9n.A0m(r7, -113320621);
            Object obj = AnonymousClass5XT.A00;
            C286565Wx.A0L(r3, false);
            AnonymousClass5ZZ.A06(r7, G9w.A0B((C287605aT) C51972G9s.A0l(r7, A0m, obj), r5, r8), C51966G9m.A0g(r7), C288035bG.A00(r7, 2131954722));
            AnonymousClass5ZZ.A0h(r7, C51965G9l.A0S(r7), C288035bG.A00(r7, 2131969696));
            C286565Wx.A0L(r3, false);
            AnonymousClass5ZZ.A06(r7, G9w.A0B((C287605aT) C51974G9v.A0W(r7, obj, -113304493), r5, r9), C51966G9m.A0g(r7), C288035bG.A00(r7, 2131960992));
            if (C51967G9n.A1R(r7)) {
                0fL.A00(886657823);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JGL(r8, r9, i, 35);
        }
    }
}
