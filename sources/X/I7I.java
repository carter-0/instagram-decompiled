package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;

public abstract class I7I {
    public static final void A06(C286575Wy r19, 0sP r20, int i) {
        int i2;
        0sP r13 = r20;
        0qQ.A0B(r13, 0);
        C286575Wy r11 = r19;
        r11.ExV(1387946747);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r11, r13) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-567035723, "com.instagram.creation.genai.contextualbackground.ui.MoreMenuButton (ContextualBackgroundScreen.kt:342)");
            }
            Object A0m = C51967G9n.A0m(r11, -123217073);
            Object obj = AnonymousClass5XT.A00;
            C284945Oz r4 = (C284945Oz) C51974G9v.A0Z(r11, A0m, obj, false);
            C286565Wx A0H = C51965G9l.A0H(r11, false);
            C285245Qk r7 = Modifier.A00;
            Modifier A0F = C51975G9x.A0F(r11, C287195Zj.A05(r7));
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A00 = C287425a7.A00(r11);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r11, A0F);
            C51973G9u.A0y(r11, A0H);
            C51971G9r.A12(r11, A0a, A04);
            0sL r1 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r11, A00)) {
                C51971G9r.A13(r11, r1, A00);
            }
            C51965G9l.A18(r11, A01);
            AnonymousClass2DO A002 = C287975bA.A00(r11, R.drawable.instagram_more_horizontal_pano_outline_24, 0);
            String A003 = C288035bG.A00(r11, 2131966723);
            Modifier A07 = C287195Zj.A07(r7, 12.0f);
            Object A0m2 = C51967G9n.A0m(r11, 1168351818);
            if (A0m2 == obj) {
                A0m2 = new C58678Ivn(r4, 4);
                r11.FLL(A0m2);
            }
            C288165bT.A08(r11, G9w.A0C(r11, A0H, A07, A0m2), A002, A003, C51965G9l.A09(r11));
            boolean A1W = C51971G9r.A1W(r4);
            Object A0m3 = C51967G9n.A0m(r11, 1168357739);
            if (A0m3 == obj) {
                A0m3 = new C58678Ivn(r4, 5);
                r11.FLL(A0m3);
            }
            HY0.A00(r11, C51965G9l.A0y(A0H, A0m3, false), r13, ((i2 << 6) & 896) | 3120, 0, C54759HRr.A00(-10.0f, -10.0f), A1W);
            if (C51967G9n.A1R(r11)) {
                0fL.A00(-1800493378);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, r13, i3, 40);
        }
    }

    public static final void A08(C62320sa r6, C286575Wy r7, int i) {
        int i2;
        0qQ.A0B(r6, 0);
        r7.ExV(227612447);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r7, r6) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1582039105, "com.instagram.creation.genai.contextualbackground.ui.ClearButton (ContextualBackgroundScreen.kt:302)");
            }
            Alignment alignment = C287215Zl.A09;
            Modifier A09 = C287195Zj.A09(C51975G9x.A0F(r7, C287205Zk.A08(C287195Zj.A05(Modifier.A00), 48.0f)), 24.0f, 0.0f);
            boolean A1N = C51973G9u.A1N(r7, 151722604, i2);
            Object ECw = r7.ECw();
            if (A1N || ECw == AnonymousClass5XT.A00) {
                ECw = C58678Ivn.A00(r7, r6, 1);
            }
            C286565Wx r4 = (C286565Wx) r7;
            Modifier A0D = G9w.A0D(r7, r4, A09, (C62320sa) ECw);
            AnonymousClass5RD A00 = C287675aa.A00(alignment, false);
            int A002 = C287425a7.A00(r7);
            AnonymousClass5RM A04 = C286565Wx.A04(r4);
            Modifier A01 = C287435a8.A01(r7, A0D);
            C51973G9u.A0y(r7, r4);
            C51971G9r.A12(r7, A00, A04);
            0sL r1 = C287485aD.A02;
            if (r4.A0K || !C51972G9s.A1Q(r7, A002)) {
                C51971G9r.A13(r7, r1, A002);
            }
            C51965G9l.A18(r7, A01);
            if (C51975G9x.A1V(r7, C288035bG.A00(r7, 2131964133), C51966G9m.A0I(r7))) {
                0fL.A00(1572362923);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, r6, i, 39);
        }
    }

    public static final void A09(C62320sa r12, C286575Wy r13, int i) {
        int i2;
        0qQ.A0B(r12, 0);
        C286575Wy r6 = r13;
        r13.ExV(-1688629212);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r13, r12) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1371087599, "com.instagram.creation.genai.contextualbackground.ui.RetryButton (ContextualBackgroundScreen.kt:287)");
            }
            AnonymousClass2DO A00 = C287975bA.A00(r13, R.drawable.instagram_arrow_cw_pano_outline_24, 0);
            String A002 = C288035bG.A00(r13, 2131965787);
            C285245Qk r3 = Modifier.A00;
            Modifier A07 = C287195Zj.A07(C51975G9x.A0F(r13, C287195Zj.A05(r3)), 12.0f);
            r13.ExS(-855458681);
            boolean A1R = C51968G9o.A1R(i2);
            Object ECw = r13.ECw();
            if (A1R || ECw == AnonymousClass5XT.A00) {
                ECw = new C58678Ivn(r12, 6);
                r13.FLL(ECw);
            }
            C51965G9l.A1X(r13, false);
            C288165bT.A08(r6, A07.Ezh(C288235ba.A04(r13, r3, (C62320sa) ECw)), A00, A002, C51965G9l.A09(r13));
            if (0fL.A02()) {
                0fL.A00(-1736387648);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, r12, i, 42);
        }
    }

    public static final void A0A(C62320sa r6, C286575Wy r7, int i) {
        int i2;
        0qQ.A0B(r6, 0);
        r7.ExV(2048805795);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r7, r6) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(969262503, "com.instagram.creation.genai.contextualbackground.ui.RetryUploadButton (ContextualBackgroundScreen.kt:322)");
            }
            Alignment alignment = C287215Zl.A09;
            Modifier A09 = C287195Zj.A09(C51975G9x.A0F(r7, C287205Zk.A08(C287195Zj.A05(Modifier.A00), 48.0f)), 24.0f, 0.0f);
            boolean A1N = C51973G9u.A1N(r7, -1440874034, i2);
            Object ECw = r7.ECw();
            if (A1N || ECw == AnonymousClass5XT.A00) {
                ECw = C58678Ivn.A00(r7, r6, 7);
            }
            C286565Wx r4 = (C286565Wx) r7;
            Modifier A0D = G9w.A0D(r7, r4, A09, (C62320sa) ECw);
            AnonymousClass5RD A00 = C287675aa.A00(alignment, false);
            int A002 = C287425a7.A00(r7);
            AnonymousClass5RM A04 = C286565Wx.A04(r4);
            Modifier A01 = C287435a8.A01(r7, A0D);
            C51973G9u.A0y(r7, r4);
            C51971G9r.A12(r7, A00, A04);
            0sL r1 = C287485aD.A02;
            if (r4.A0K || !C51972G9s.A1Q(r7, A002)) {
                C51971G9r.A13(r7, r1, A002);
            }
            C51965G9l.A18(r7, A01);
            if (C51975G9x.A1V(r7, C288035bG.A00(r7, 2131972371), C51966G9m.A0I(r7))) {
                0fL.A00(2045737361);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, r6, i, 43);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C286575Wy r20, X.C61050Jvo r21, X.C62320sa r22, X.C62320sa r23, X.C62320sa r24, X.C62320sa r25, X.0sP r26, X.0sP r27, X.0sP r28, int r29, int r30, boolean r31) {
        /*
            r1 = r28
            r2 = r27
            r3 = r26
            r16 = r25
            r17 = r24
            r18 = r23
            r19 = r22
            r4 = 0
            r7 = r21
            X.0qQ.A0B(r7, r4)
            r0 = 797955390(0x2f8fd53e, float:2.6163066E-10)
            r8 = r20
            r8.ExV(r0)
            r5 = r30
            r0 = r30 & 1
            r6 = r29
            if (r0 == 0) goto L_0x01d2
            r9 = r29 | 6
        L_0x0026:
            r21 = r30 & 2
            if (r21 == 0) goto L_0x01c5
            r9 = r9 | 48
        L_0x002c:
            r20 = r30 & 4
            if (r20 == 0) goto L_0x01b8
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x0032:
            r15 = r30 & 8
            if (r15 == 0) goto L_0x01ab
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x0038:
            r14 = r30 & 16
            if (r14 == 0) goto L_0x019e
            r9 = r9 | 24576(0x6000, float:3.4438E-41)
        L_0x003e:
            r13 = r30 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r13 != 0) goto L_0x004c
            r0 = r29 & r0
            if (r0 != 0) goto L_0x004d
            int r0 = X.G9t.A0J(r8, r3)
        L_0x004c:
            r9 = r9 | r0
        L_0x004d:
            r10 = r30 & 64
            r0 = 1572864(0x180000, float:2.204052E-39)
            r30 = r31
            if (r10 != 0) goto L_0x005f
            r0 = r29 & r0
            if (r0 != 0) goto L_0x0060
            r0 = r30
            int r0 = X.G9t.A0e(r8, r0)
        L_0x005f:
            r9 = r9 | r0
        L_0x0060:
            r10 = r5 & 128(0x80, float:1.794E-43)
            r0 = 12582912(0xc00000, float:1.7632415E-38)
            if (r10 != 0) goto L_0x006e
            r0 = r29 & r0
            if (r0 != 0) goto L_0x006f
            int r0 = X.G9t.A0L(r8, r2)
        L_0x006e:
            r9 = r9 | r0
        L_0x006f:
            r11 = r5 & 256(0x100, float:3.59E-43)
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            if (r11 != 0) goto L_0x007d
            r0 = r29 & r0
            if (r0 != 0) goto L_0x007e
            int r0 = X.G9t.A0M(r8, r1)
        L_0x007d:
            r9 = r9 | r0
        L_0x007e:
            r0 = 38347923(0x2492493, float:1.4777644E-37)
            r12 = r9 & r0
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            if (r12 != r0) goto L_0x00b2
            boolean r0 = r8.Bwn()
            if (r0 == 0) goto L_0x00b2
            r8.Evl()
        L_0x0091:
            X.5Xd r4 = r8.ASQ()
            if (r4 == 0) goto L_0x00b1
            r22 = 1
            X.JCB r0 = new X.JCB
            r20 = r6
            r21 = r5
            r23 = r30
            r11 = r0
            r12 = r16
            r13 = r7
            r14 = r2
            r15 = r17
            r16 = r3
            r17 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r4.A06 = r0
        L_0x00b1:
            return
        L_0x00b2:
            if (r21 == 0) goto L_0x00b6
            X.IqN r19 = X.C58342IqN.A00
        L_0x00b6:
            if (r20 == 0) goto L_0x00ba
            X.IqO r18 = X.C58343IqO.A00
        L_0x00ba:
            if (r15 == 0) goto L_0x00be
            X.IqP r17 = X.C58344IqP.A00
        L_0x00be:
            if (r14 == 0) goto L_0x00c2
            X.IqQ r16 = X.C58345IqQ.A00
        L_0x00c2:
            if (r13 == 0) goto L_0x00c6
            X.J26 r3 = X.J26.A00
        L_0x00c6:
            if (r10 == 0) goto L_0x00ca
            X.J27 r2 = X.J27.A00
        L_0x00ca:
            if (r11 == 0) goto L_0x00ce
            X.J28 r1 = X.J28.A00
        L_0x00ce:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00dc
            r10 = -1676939488(0xffffffff9c0bef20, float:-4.6300304E-22)
            java.lang.String r0 = "com.instagram.creation.genai.contextualbackground.ui.ContextualBackgroundScreen (ContextualBackgroundScreen.kt:73)"
            X.0fL.A01(r10, r0)
        L_0x00dc:
            r0 = -1899558796(0xffffffff8ec70874, float:-4.9065428E-30)
            java.lang.Object r10 = X.C51967G9n.A0m(r8, r0)
            java.lang.Object r13 = X.AnonymousClass5XT.A00
            r0 = 0
            java.lang.Object r11 = X.C51974G9v.A0Z(r8, r10, r13, r4)
            X.5Oz r11 = (X.C284945Oz) r11
            X.5Wx r15 = X.C51965G9l.A0H(r8, r4)
            java.lang.Object r10 = r7.A05
            r20 = r10
            X.5Qk r14 = androidx.compose.ui.Modifier.A00
            X.0gF r12 = X.C60340gF.A00
            r10 = -1899553794(0xffffffff8ec71bfe, float:-4.9084243E-30)
            java.lang.Object r10 = X.C51967G9n.A0m(r8, r10)
            if (r10 != r13) goto L_0x0109
            X.MHN r10 = new X.MHN
            r10.<init>(r11, r0)
            r8.FLL(r10)
        L_0x0109:
            androidx.compose.ui.Modifier r13 = X.C51969G9p.A0W(r15, r14, r10, r12, r4)
            X.5RD r12 = X.C51966G9m.A0a(r4)
            int r14 = X.C287425a7.A00(r8)
            X.5RM r10 = X.C286565Wx.A04(r15)
            androidx.compose.ui.Modifier r13 = X.C287435a8.A01(r8, r13)
            X.C51973G9u.A0y(r8, r15)
            X.C51971G9r.A12(r8, r12, r10)
            X.0sL r12 = X.C287485aD.A02
            boolean r10 = r15.A0K
            if (r10 != 0) goto L_0x012f
            boolean r10 = X.C51972G9s.A1Q(r8, r14)
            if (r10 != 0) goto L_0x0132
        L_0x012f:
            X.C51971G9r.A13(r8, r12, r14)
        L_0x0132:
            X.C51965G9l.A18(r8, r13)
            X.0sL r21 = X.C55389Hgv.A00
            r12 = 623017981(0x25227ffd, float:1.4094624E-16)
            r23 = 3
            X.J9J r10 = new X.J9J
            r22 = r10
            r24 = r1
            r25 = r7
            r26 = r18
            r27 = r11
            r28 = r20
            r29 = r19
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            X.5PJ r22 = X.AnonymousClass5PI.A01(r8, r10, r12)
            r12 = 1035924188(0x3dbef2dc, float:0.093236655)
            X.J8X r10 = new X.J8X
            r23 = r10
            r24 = r4
            r25 = r3
            r26 = r7
            r27 = r16
            r28 = r17
            r29 = r11
            r23.<init>(r24, r25, r26, r27, r28, r29)
            X.5PJ r23 = X.AnonymousClass5PI.A01(r8, r10, r12)
            r12 = 1448830395(0x565b65bb, float:6.0307494E13)
            r10 = 13
            X.JG3 r10 = X.JG3.A00(r11, r7, r2, r10)
            X.5PJ r24 = X.AnonymousClass5PI.A01(r8, r10, r12)
            r10 = 224688(0x36db0, float:3.14855E-40)
            int r9 = r9 >> 18
            r26 = r9 & 14
            r26 = r26 | r10
            r27 = 64
            r20 = r8
            r25 = r0
            r28 = r30
            r29 = r4
            X.HY5.A00(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r0 = X.C51967G9n.A1R(r8)
            if (r0 == 0) goto L_0x0091
            r0 = -642030665(0xffffffffd9bb63b7, float:-6.5931823E15)
            X.0fL.A00(r0)
            goto L_0x0091
        L_0x019e:
            r0 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x003e
            r0 = r16
            int r0 = X.G9t.A0I(r8, r0)
            r9 = r9 | r0
            goto L_0x003e
        L_0x01ab:
            r0 = r6 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0038
            r0 = r17
            int r0 = X.G9t.A0H(r8, r0)
            r9 = r9 | r0
            goto L_0x0038
        L_0x01b8:
            r0 = r6 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0032
            r0 = r18
            int r0 = X.G9t.A0G(r8, r0)
            r9 = r9 | r0
            goto L_0x0032
        L_0x01c5:
            r0 = r29 & 48
            if (r0 != 0) goto L_0x002c
            r0 = r19
            int r0 = X.G9t.A0F(r8, r0)
            r9 = r9 | r0
            goto L_0x002c
        L_0x01d2:
            r0 = r29 & 6
            if (r0 != 0) goto L_0x01de
            int r9 = X.C41848B3p.A01(r8, r7)
            r9 = r9 | r29
            goto L_0x0026
        L_0x01de:
            r9 = r6
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I7I.A03(X.5Wy, X.Jvo, X.0sa, X.0sa, X.0sa, X.0sa, X.0sP, X.0sP, X.0sP, int, int, boolean):void");
    }

    public static final void A00(Bitmap bitmap, C286575Wy r15, int i) {
        int i2;
        C286575Wy r7 = r15;
        r15.ExV(-2028980090);
        int i3 = i;
        Bitmap bitmap2 = bitmap;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r15, bitmap) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-914687204, "com.instagram.creation.genai.contextualbackground.ui.PhotoStickerInContextualBackground (ContextualBackgroundScreen.kt:214)");
            }
            if (bitmap != null) {
                Modifier A0O = C51968G9o.A0O();
                AnonymousClass5RD A00 = C287675aa.A00(C287215Zl.A09, false);
                int A002 = C287425a7.A00(r15);
                C286565Wx r5 = (C286565Wx) r7;
                AnonymousClass5RM A04 = C286565Wx.A04(r5);
                Modifier A01 = C287435a8.A01(r15, A0O);
                C51973G9u.A0y(r15, r5);
                C51971G9r.A12(r15, A00, A04);
                0sL r1 = C287485aD.A02;
                if (r5.A0K || !C51972G9s.A1Q(r15, A002)) {
                    C51971G9r.A13(r15, r1, A002);
                }
                C51965G9l.A18(r15, A01);
                AnonymousClass6G3.A00(r7, (Alignment) null, (Modifier) null, (C288195bW) null, new AnonymousClass6GC(new C3018360g(bitmap)), C288075bK.A00, (String) null, 0.0f, 24624, 108);
                r7.ASN();
            }
            if (0fL.A02()) {
                0fL.A00(-167777930);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, bitmap2, i3, 41);
        }
    }

    public static final void A01(C286575Wy r5, C61050Jvo jvo, int i, boolean z) {
        int i2;
        r5.ExV(-1956036910);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r5, jvo) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r5, z);
        }
        if ((i2 & 19) != 18 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-768648906, "com.instagram.creation.genai.contextualbackground.ui.OriginalImage (ContextualBackgroundScreen.kt:166)");
            }
            Bitmap bitmap = (Bitmap) jvo.A03;
            if (bitmap != null) {
                AnonymousClass6GC r4 = new AnonymousClass6GC(new C3018360g(bitmap));
                C285245Qk r0 = Modifier.A00;
                Modifier A0U = C51966G9m.A0U(r0);
                Modifier modifier = r0;
                if (z) {
                    modifier = HRG.A00(r0, C55299HfS.A00, 20.0f, 20.0f);
                }
                AnonymousClass6G3.A08(r5, A0U.Ezh(modifier), r4, C288075bK.A00);
            }
            if (0fL.A02()) {
                0fL.A00(-145333254);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            JGI.A01(ASQ, jvo, i, 6, z);
        }
    }

    public static final void A02(C286575Wy r10, C61050Jvo jvo, C62320sa r12, C62320sa r13, int i) {
        int i2;
        C286575Wy r3 = r10;
        r10.ExV(-1124463052);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r10, r12) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r10, jvo);
        }
        if ((i & 384) == 0) {
            i2 |= G9t.A0G(r10, r13);
        }
        if ((i2 & 147) != 146 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(272584201, "com.instagram.creation.genai.contextualbackground.ui.HeaderContent (ContextualBackgroundScreen.kt:182)");
            }
            C54917HXz.A00(r3, (C287245Zp) null, (Modifier) null, AnonymousClass5PI.A01(r10, new C59112J6u(r12, 48), -1847689142), C55389Hgv.A01, JG1.A00(r10, r13, jvo, 38, 1974042504), 438, 24);
            if (0fL.A02()) {
                0fL.A00(-1847783336);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            ASQ.A06 = JGN.A01(jvo, r12, r13, i, 23);
        }
    }

    public static final void A04(C286575Wy r23, C61050Jvo jvo, C62320sa r25, C62320sa r26, 0sP r27, int i) {
        int i2;
        C286575Wy r14 = r23;
        r14.ExV(70151765);
        int i3 = i;
        C61050Jvo jvo2 = jvo;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r14, jvo2) | i;
        } else {
            i2 = i3;
        }
        C62320sa r4 = r25;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r14, r4);
        }
        C62320sa r10 = r26;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r14, r10);
        }
        0sP r9 = r27;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r14, r9);
        }
        if ((i2 & 1171) != 1170 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1603871412, "com.instagram.creation.genai.contextualbackground.ui.FooterContent (ContextualBackgroundScreen.kt:232)");
            }
            int A0M = AnonymousClass7TE.A0M(jvo2.A02);
            if (A0M == 0) {
                r14.ExS(1954038039);
                C287245Zp r5 = C287215Zl.A04;
                C285245Qk r7 = Modifier.A00;
                Modifier A0F = G9w.A0F(r7);
                AnonymousClass5RD A0Q = C51965G9l.A0Q(r14, r5);
                int A00 = C287425a7.A00(r14);
                C286565Wx r13 = (C286565Wx) r14;
                AnonymousClass5RM A04 = C286565Wx.A04(r13);
                Modifier A01 = C287435a8.A01(r14, A0F);
                C51973G9u.A0y(r14, r13);
                C51971G9r.A12(r14, A0Q, A04);
                0sL r6 = C287485aD.A02;
                if (r13.A0K || !C51972G9s.A1Q(r14, A00)) {
                    C51971G9r.A13(r14, r6, A00);
                }
                C51965G9l.A18(r14, A01);
                C286575Wy r16 = r14;
                C288165bT.A00(r16, C287195Zj.A07(C287205Zk.A0C(r7, 20.0f), 4.0f), C287975bA.A00(r14, R.drawable.gen_ai_assets_metaaicontextheader, 0), 3456, 18, AnonymousClass5RW.A08);
                Resources A0B = C51975G9x.A0B(r14);
                0qQ.A07(A0B);
                AnonymousClass5ZZ.A00(r14, (Modifier) null, HY7.A00(A0B, new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, AnonymousClass5ZD.A01, (C291795ht) null, 65530, G9w.A05(r14), 0, 0), new C53380GnA[]{new C53380GnA(2131966344, "", "", 2)}, 2131966343), C51966G9m.A0c(r14), 3, 1, 2, 0, 54, 21370, AnonymousClass5aQ.A00(r14).A0u);
                r14.ASN();
            } else if (A0M == 2) {
                r14.ExS(1955101308);
                A0A(r4, r14, (i2 >> 3) & 14);
            } else if (A0M == 1) {
                r14.ExS(1955195393);
                HYN.A00(r14, (Modifier) null, AnonymousClass5PI.A01(r14, new C59112J6u(r4, 47), -2109377857), JG1.A00(r14, r10, jvo2, 36, 2051006750), JG1.A00(r14, r9, jvo2, 37, 1916424061), 0.0f, 28032, 3);
            } else {
                throw C51973G9u.A0n(r14, 2141242303);
            }
            if (C51970G9q.A1a(r14, false)) {
                0fL.A00(1657715261);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG7(jvo2, r4, r10, r9, i3, 8);
        }
    }

    public static final void A05(C286575Wy r12, IQK iqk, 0sP r14, int i) {
        int i2;
        C286575Wy r6 = r12;
        r12.ExV(-901731633);
        IQK iqk2 = iqk;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r12, iqk) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r12, r14);
        }
        if ((i2 & 19) != 18 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1631667903, "com.instagram.creation.genai.contextualbackground.ui.SelectedImage (ContextualBackgroundScreen.kt:160)");
            }
            r12.ExS(1172797899);
            boolean z = true;
            boolean A1S = AnonymousClass7TF.A1S(i2 & 112, 32);
            int i3 = i2 & 14;
            if (i3 != 4) {
                z = false;
            }
            boolean z2 = A1S | z;
            Object ECw = r6.ECw();
            if (z2 || ECw == AnonymousClass5XT.A00) {
                ECw = new MGX(r14, iqk, (AnonymousClass4D7) null, 6);
                r6.FLL(ECw);
            }
            C51972G9s.A10(r6, ECw, iqk);
            C56572I2c.A00(r6, (Alignment) null, (Modifier) null, (C288095bM) null, iqk2, (String) null, i3, 30);
            if (0fL.A02()) {
                0fL.A00(-1081866078);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            JGL.A01(ASQ, iqk2, r14, i, 40);
        }
    }

    public static final void A07(C286575Wy r11, 0sK r12, int i, boolean z) {
        int i2;
        C286575Wy r5 = r11;
        r11.ExV(786936289);
        boolean z2 = z;
        if ((i & 6) == 0) {
            i2 = G9t.A0Y(r5, z) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r5, r12);
        }
        if ((i2 & 19) != 18 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-679462851, "com.instagram.creation.genai.contextualbackground.ui.FadeAnimatedVisibility (ContextualBackgroundScreen.kt:152)");
            }
            C56663I6s.A07(I74.A00(C51972G9s.A0K((Object) null), 0.0f), I74.A04(C51972G9s.A0K((Object) null), 0.0f), r5, (Modifier) null, (String) null, AnonymousClass5PI.A01(r5, JJQ.A00(r12, 46), 1661674681), (i2 & 14) | 200064, 18, z2);
            if (0fL.A02()) {
                0fL.A00(476424093);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            JGI.A01(ASQ, r12, i, 5, z);
        }
    }
}
