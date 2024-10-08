package X;

import android.content.Context;
import androidx.compose.animation.SizeAnimationModifierElement;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import java.util.Iterator;
import java.util.List;

public abstract class I6T {
    public static final void A00(C286575Wy r11, C47182Drx drx, C62320sa r13, int i) {
        int i2;
        boolean A1U = AnonymousClass7TF.A1U(0, drx, r13);
        r11.ExV(-383562988);
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r11, drx) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0F(r11, r13);
        }
        if ((i2 & 91) != 18 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1514993550, "com.instagram.potato.reply.PotatoReplyLikersFacepile (PotatoReplyBottomSheet.kt:203)");
            }
            Modifier A0B = C287195Zj.A0B(C51966G9m.A0T(Modifier.A00), 20.0f, 0.0f, 0.0f, 5.0f);
            boolean A1S = C51975G9x.A1S(r11, -1416085019, i2);
            Object ECw = r11.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = new C51802G2l((Object) r13, 41);
                r11.FLL(ECw);
            }
            C286565Wx A0H = C51965G9l.A0H(r11, false);
            Modifier A05 = C287635aW.A05(A0B, (C287625aV) null, (String) null, (C62320sa) ECw, A1U);
            AnonymousClass5RD A02 = C287395a4.A02(C287275Zs.A01(5.0f), r11, C287215Zl.A05, 6);
            int A00 = C287425a7.A00(r11);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r11, A05);
            C51973G9u.A0y(r11, A0H);
            C51971G9r.A12(r11, A02, A04);
            0sL r1 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r11, A00)) {
                C51971G9r.A13(r11, r1, A00);
            }
            C51965G9l.A18(r11, A01);
            r11.ExS(417344931);
            List list = drx.A07;
            Iterator it = 00k.A0d(list, 3).iterator();
            while (it.hasNext()) {
                C55084Hbt.A00(r11, DbT.A0k(it).Bh3(), 20, 48);
            }
            C286565Wx.A0L(A0H, false);
            r11.ExS(417349359);
            if (list.size() > 3) {
                AnonymousClass5ZZ.A0r(r11, C51966G9m.A0b(r11), 002.A00('+', DbT.A02(list, 3)), C51966G9m.A0H(r11));
            }
            if (C51971G9r.A1S(r11, A0H, false)) {
                0fL.A00(2042306346);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, r13, drx, i, 37);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0095, code lost:
        if (r4.A02 != X.C243363Yl.NOT_LIKED) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C286575Wy r15, X.C47182Drx r16, X.C62320sa r17, int r18) {
        /*
            r7 = 0
            r4 = r16
            r3 = r17
            X.AnonymousClass7TF.A1H(r4, r3)
            r0 = -889069087(0xffffffffcb01e1e1, float:-8511969.0)
            r5 = r15
            r15.ExV(r0)
            r2 = r18
            r0 = r18 & 14
            if (r0 != 0) goto L_0x00d6
            int r10 = X.G9t.A0O(r15, r4)
            r10 = r10 | r18
        L_0x001b:
            r0 = r18 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L_0x0024
            int r0 = X.G9t.A0F(r15, r3)
            r10 = r10 | r0
        L_0x0024:
            r1 = r10 & 91
            r0 = 18
            if (r1 != r0) goto L_0x003f
            boolean r0 = r15.Bwn()
            if (r0 == 0) goto L_0x003f
            r15.Evl()
        L_0x0033:
            X.5Xd r1 = r5.ASQ()
            if (r1 == 0) goto L_0x003e
            r0 = 38
            X.JGO.A01(r1, r3, r4, r2, r0)
        L_0x003e:
            return
        L_0x003f:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x004d
            r1 = -119192963(0xfffffffff8e5427d, float:-3.7199516E34)
            java.lang.String r0 = "com.instagram.potato.reply.PotatoReplyMedia (PotatoReplyBottomSheet.kt:129)"
            X.0fL.A01(r1, r0)
        L_0x004d:
            java.lang.String r0 = r4.A04
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.DbS.A0V(r0)
            r11 = 0
            X.2DN r6 = X.1zC.A00(r15, r0)
            X.5Qk r8 = androidx.compose.ui.Modifier.A00
            long r0 = X.C51966G9m.A08(r15)
            androidx.compose.ui.Modifier r1 = X.C51966G9m.A0X(r8, r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.Modifier r8 = X.C54739HQw.A00(r1, r0, r7)
            r1 = 1114636288(0x42700000, float:60.0)
            r0 = 1103626240(0x41c80000, float:25.0)
            androidx.compose.ui.Modifier r1 = X.C287195Zj.A09(r8, r0, r1)
            androidx.compose.foundation.layout.FillElement r0 = X.C287205Zk.A01
            androidx.compose.ui.Modifier r13 = r1.Ezh(r0)
            r0 = -904716758(0xffffffffca131e2a, float:-2410378.5)
            java.lang.Object r0 = X.C51967G9n.A0m(r15, r0)
            java.lang.Object r9 = X.AnonymousClass5XT.A00
            java.lang.Object r12 = X.C51972G9s.A0l(r15, r0, r9)
            X.5aT r12 = (X.C287605aT) r12
            X.5Wx r8 = X.C51965G9l.A0H(r15, r7)
            java.lang.Integer r1 = r4.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0097
            X.3Yl r1 = r4.A02
            X.3Yl r0 = X.C243363Yl.NOT_LIKED
            r18 = 1
            if (r1 == r0) goto L_0x0099
        L_0x0097:
            r18 = 0
        L_0x0099:
            r0 = 5
            X.5aV r14 = X.C51965G9l.A0R(r0)
            r0 = -904705283(0xffffffffca134afd, float:-2413247.2)
            r15.ExS(r0)
            boolean r0 = X.C51972G9s.A1M(r10)
            java.lang.Object r1 = r15.ECw()
            if (r0 != 0) goto L_0x00b0
            if (r1 != r9) goto L_0x00ba
        L_0x00b0:
            r0 = 42
            X.G2l r1 = new X.G2l
            r1.<init>((java.lang.Object) r3, (int) r0)
            r15.FLL(r1)
        L_0x00ba:
            X.0sa r16 = X.C51965G9l.A0y(r8, r1, r7)
            X.Isa r17 = X.C58479Isa.A00
            r15 = r11
            androidx.compose.ui.Modifier r0 = X.C287635aW.A01(r11, r12, r13, r14, r15, r16, r17, r18)
            X.AnonymousClass6G3.A04(r5, r0, r6)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0033
            r0 = 1004619219(0x3be145d3, float:0.006874779)
            X.0fL.A00(r0)
            goto L_0x0033
        L_0x00d6:
            r10 = r2
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I6T.A01(X.5Wy, X.Drx, X.0sa, int):void");
    }

    public static final void A02(C286575Wy r14, C47182Drx drx, C62320sa r16, int i) {
        int i2;
        AnonymousClass2DO A00;
        long A0G;
        C47182Drx drx2 = drx;
        C62320sa r3 = r16;
        AnonymousClass7TF.A1H(drx, r3);
        C286575Wy r11 = r14;
        r14.ExV(821322141);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r14, drx) | i;
        } else {
            i2 = i3;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0F(r14, r3);
        }
        if ((i2 & 91) != 18 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1480598140, "com.instagram.potato.reply.PotatoReplySheetLikeButton (PotatoReplyBottomSheet.kt:175)");
            }
            Modifier A04 = C287205Zk.A04(Modifier.A00);
            Object A0m = C51967G9n.A0m(r14, -1501847858);
            Object obj = AnonymousClass5XT.A00;
            C287605aT r8 = (C287605aT) C51972G9s.A0l(r14, A0m, obj);
            C286565Wx A0H = C51965G9l.A0H(r14, false);
            AnonymousClass5aR r7 = new AnonymousClass5aR(400.0f, 400.0f);
            boolean A1O = C51973G9u.A1O(r14, -1501844034, i2);
            Object ECw = r14.ECw();
            if (A1O || ECw == obj) {
                ECw = new C51802G2l((Object) r3, 43);
                r14.FLL(ECw);
            }
            Modifier A02 = C287635aW.A02(r7, r8, A04, C51965G9l.A0y(A0H, ECw, false));
            AnonymousClass5RD A0V = C51968G9o.A0V(r14);
            int A002 = C287425a7.A00(r14);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r14, A02);
            C51973G9u.A0y(r14, A0H);
            C51971G9r.A12(r14, A0V, A042);
            0sL r1 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r14, A002)) {
                C51971G9r.A13(r14, r1, A002);
            }
            C51965G9l.A18(r14, A01);
            if (drx.A02 == C243363Yl.LIKED) {
                r14.ExS(1928476333);
                A00 = C287975bA.A00(r14, R.drawable.instagram_heart_pano_filled_24, 0);
                A0G = AnonymousClass5aQ.A00(r14).A0Q;
            } else {
                r14.ExS(1928687660);
                A00 = C287975bA.A00(r14, R.drawable.instagram_heart_pano_outline_24, 0);
                A0G = C51966G9m.A0G(r14);
            }
            C288165bT.A00(r11, (Modifier) null, A00, 56, 20, A0G);
            if (C51971G9r.A1S(r11, A0H, false)) {
                0fL.A00(-1599447877);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, r3, drx2, i3, 39);
        }
    }

    public static final void A03(C286575Wy r27, C47182Drx drx, C62320sa r29, C62320sa r30, int i) {
        int i2;
        C47182Drx drx2 = drx;
        C62320sa r13 = r29;
        C62320sa r12 = r30;
        boolean A1b = C51973G9u.A1b(drx2, r13, r12);
        C286575Wy r0 = r27;
        r0.ExV(1557566571);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r0, drx2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0F(r0, r13);
        }
        if ((i3 & 896) == 0) {
            i2 |= G9t.A0G(r0, r12);
        }
        if ((i2 & 731) != 146 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1269092462, "com.instagram.potato.reply.PotatoReplyBottomSheetTitle (PotatoReplyBottomSheet.kt:86)");
            }
            Context A0I = C51968G9o.A0I(r0);
            C285245Qk r8 = Modifier.A00;
            Modifier A0B = C287195Zj.A0B(r8, 18.0f, 5.0f, 16.0f, 5.0f);
            AnonymousClass5RD A0S = C51971G9r.A0S(r0, 11.0f);
            int A00 = C287425a7.A00(r0);
            C286565Wx r2 = (C286565Wx) r0;
            AnonymousClass5RM A04 = C286565Wx.A04(r2);
            Modifier A01 = C287435a8.A01(r0, A0B);
            C51973G9u.A0y(r0, r2);
            C51971G9r.A12(r0, A0S, A04);
            0sL r6 = C287485aD.A02;
            if (r2.A0K || !C51972G9s.A1Q(r0, A00)) {
                C51971G9r.A13(r0, r6, A00);
            }
            C51965G9l.A18(r0, A01);
            AnonymousClass6FX r15 = AnonymousClass6FX.A00;
            r0.ExS(1990296056);
            int i4 = i2 & 896;
            boolean A1S = AnonymousClass7TF.A1S(i4, 256);
            Object ECw = r0.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = new C51802G2l((Object) r12, 38);
                r0.FLL(ECw);
            }
            C286575Wy r17 = r0;
            GSL.A01(r17, C287635aW.A05(r8, (C287625aV) null, (String) null, C51965G9l.A0y(r2, ECw, false), A1b), 1zC.A00(r0, DbS.A0V(drx2.A06)), (AnonymousClass2DO) null, 28.0f, 0.0f, 0.0f, 70, 1016, 0, 0, false, false);
            boolean A1R = C51972G9s.A1R(r0, 1990303480, i4, 256);
            Object ECw2 = r0.ECw();
            if (A1R || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new C51802G2l((Object) r12, 39);
                r0.FLL(ECw2);
            }
            Modifier A05 = C287635aW.A05(r8, (C287625aV) null, (String) null, C51965G9l.A0y(r2, ECw2, false), A1b);
            String str = drx2.A05;
            AnonymousClass5ZZ.A0E(r17, A05, C51966G9m.A0h(r0), str, A1b ? 1 : 0, 0, 15352, C51966G9m.A0H(r0));
            AnonymousClass5ZZ.A0r(r0, C51966G9m.A0c(r0), 1G0.A09(AnonymousClass7TF.A0A(A0I), (double) drx2.A00), C51966G9m.A0M(r0));
            C289585dr.A00(r0, r15.A00(r8));
            r0.ExS(1990321142);
            if (drx2.A08) {
                C46519DgM dgM = drx2.A01;
                boolean A1Y = C51974G9v.A1Y(r0, 1990324479, i2);
                Object ECw3 = r0.ECw();
                if (A1Y || ECw3 == AnonymousClass5XT.A00) {
                    ECw3 = new C51802G2l((Object) r13, 40);
                    r0.FLL(ECw3);
                }
                GR2.A00(r0, (Modifier) null, dgM, (GSN) null, C51965G9l.A0y(r2, ECw3, false), 0, 6);
            }
            if (C51971G9r.A1S(r0, r2, false)) {
                0fL.A00(-1455963199);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59135J7r(i3, 5, r12, drx2, r13);
        }
    }

    public static final void A04(C286575Wy r16, C47182Drx drx, C62320sa r18, C62320sa r19, C62320sa r20, C62320sa r21, C62320sa r22, 0sP r23, int i) {
        int i2;
        C47182Drx drx2 = drx;
        0qQ.A0B(drx2, 0);
        C62320sa r9 = r18;
        C62320sa r8 = r19;
        C62320sa r7 = r20;
        DbZ.A0t(1, r9, r8, r7);
        0sP r4 = r23;
        0qQ.A0B(r4, 4);
        C62320sa r6 = r21;
        C62320sa r5 = r22;
        AnonymousClass7TG.A1S(r6, r5);
        C286575Wy r11 = r16;
        r11.ExV(-472986700);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r11, drx2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0F(r11, r9);
        }
        if ((i3 & 896) == 0) {
            i2 |= G9t.A0G(r11, r8);
        }
        if ((i3 & 7168) == 0) {
            i2 |= G9t.A0H(r11, r7);
        }
        if ((57344 & i) == 0) {
            i2 |= G9t.A0I(r11, r4);
        }
        if ((458752 & i) == 0) {
            i2 |= G9t.A0J(r11, r6);
        }
        if ((3670016 & i) == 0) {
            i2 |= G9t.A0K(r11, r5);
        }
        if ((2995931 & i2) != 599186 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(2066816645, "com.instagram.potato.reply.PotatoReplyBottomSheet (PotatoReplyBottomSheet.kt:53)");
            }
            Modifier A0U = C51969G9p.A0U();
            AnonymousClass5RD A0X = C51968G9o.A0X(r11);
            int A00 = C287425a7.A00(r11);
            C286565Wx r1 = (C286565Wx) r11;
            AnonymousClass5RM A04 = C286565Wx.A04(r1);
            Modifier A01 = C287435a8.A01(r11, A0U);
            C51973G9u.A0y(r11, r1);
            C51971G9r.A12(r11, A0X, A04);
            0sL r13 = C287485aD.A02;
            if (r1.A0K || !C51972G9s.A1Q(r11, A00)) {
                C51971G9r.A13(r11, r13, A00);
            }
            C51965G9l.A18(r11, A01);
            int intValue = drx2.A03.intValue();
            if (intValue == 0) {
                r11.ExS(273489724);
                int i4 = i2 & 14;
                int i5 = i2 >> 3;
                A03(r11, drx2, r8, r7, (i5 & 896) | (i5 & 112) | i4);
                A01(r11, drx2, r5, ((i2 >> 15) & 112) | i4);
                A05(r11, drx2, r9, r4, i4 | (i2 & 112) | ((i2 >> 6) & 896));
            } else if (intValue == 1) {
                r11.ExS(273802080);
                int i6 = i2 & 14;
                int i7 = i2 >> 3;
                A03(r11, drx2, r8, r7, (i7 & 896) | (i7 & 112) | i6);
                A01(r11, drx2, r5, ((i2 >> 15) & 112) | i6);
                if (AnonymousClass7TE.A1b(drx2.A07)) {
                    A00(r11, drx2, r6, i6 | ((i2 >> 12) & 112));
                }
            } else {
                throw C51972G9s.A0v(r11, r1, 978651814);
            }
            if (C51971G9r.A1S(r11, r1, false)) {
                0fL.A00(7646851);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            C62320sa r202 = r9;
            C47182Drx drx3 = drx2;
            int i8 = i3;
            ASQ.A06 = new C59205JAj(i8, 4, drx3, r19, r202, r21, r22, r7, r4);
        }
    }

    public static final void A05(C286575Wy r13, C47182Drx drx, C62320sa r15, 0sP r16, int i) {
        int i2;
        C47182Drx drx2 = drx;
        C62320sa r12 = r15;
        0sP r10 = r16;
        C51973G9u.A1E(drx, r15, r10);
        r13.ExV(1468117182);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r13, drx) | i;
        } else {
            i2 = i3;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0F(r13, r15);
        }
        if ((i3 & 896) == 0) {
            i2 |= G9t.A0G(r13, r10);
        }
        if ((i2 & 731) != 146 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1386829792, "com.instagram.potato.reply.PotatoReplySheetFooter (PotatoReplyBottomSheet.kt:157)");
            }
            C285245Qk r6 = Modifier.A00;
            Modifier A0T = C51966G9m.A0T(r6);
            C287245Zp r2 = C287215Zl.A04;
            Modifier A0G = C51967G9n.A0G(C287205Zk.A01(r2, A0T), 10.0f);
            AnonymousClass5RD A00 = C287395a4.A00(C287275Zs.A01(11.0f), r13, r2);
            int A002 = C287425a7.A00(r13);
            C286565Wx r22 = (C286565Wx) r13;
            AnonymousClass5RM A04 = C286565Wx.A04(r22);
            Modifier A01 = C287435a8.A01(r13, A0G);
            C51973G9u.A0y(r13, r22);
            C51971G9r.A12(r13, A00, A04);
            0sL r1 = C287485aD.A02;
            if (r22.A0K || !C51972G9s.A1Q(r13, A002)) {
                C51971G9r.A13(r13, r1, A002);
            }
            C51965G9l.A18(r13, A01);
            AnonymousClass6FX r14 = AnonymousClass6FX.A00;
            r13.ExS(-1124762968);
            if (drx.A09) {
                C56332Hwj.A00(r13, AnonymousClass6FZ.A00(r14.A00(r6)).Ezh(new SizeAnimationModifierElement(new C287965b7(new C289005cr(1 | (1 << 32)), 1.0f, 400.0f), C287215Zl.A0E)), r10, (i2 >> 3) & 112);
                A02(r13, drx, r15, C51965G9l.A01(i2));
            }
            if (C51971G9r.A1S(r13, r22, false)) {
                0fL.A00(141243286);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59135J7r(i3, 6, r10, drx2, r12);
        }
    }
}
