package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.compose.core.ui.IgClickableTextKt;
import java.util.Iterator;

/* renamed from: X.I6g  reason: case insensitive filesystem */
public abstract class C56651I6g {
    public static final Modifier A00(C286575Wy r3, Modifier modifier) {
        0qQ.A0B(modifier, 0);
        if (C51967G9n.A1U(r3, 900965567)) {
            0fL.A01(356255638, "com.instagram.creator.agent.settings.fragment.clippedShimmer (CreatorAISettingsComposableFragment.kt:513)");
        }
        AnonymousClass5aQ.A02(r3);
        Modifier A00 = C56666I6v.A00(r3, AnonymousClass6FZ.A01(modifier, AnonymousClass5ZM.A02));
        if (0fL.A02()) {
            0fL.A00(-1187453054);
        }
        C51965G9l.A1X(r3, false);
        return A00;
    }

    public static final void A05(C286575Wy r14, C54617HLa hLa, C62320sa r16, 0sP r17, int i, boolean z, boolean z2) {
        int i2;
        C54617HLa hLa2 = hLa;
        0qQ.A0B(hLa, 2);
        C62320sa r4 = r16;
        0sP r1 = r17;
        int A08 = C51970G9q.A08(3, r4, r1);
        C286575Wy r12 = r14;
        r14.ExV(-1717686422);
        int i3 = i;
        boolean z3 = z;
        if ((i & 6) == 0) {
            i2 = G9t.A0Y(r14, z3) | i;
        } else {
            i2 = i3;
        }
        boolean z4 = z2;
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r14, z4);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0Q(r14, hLa);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r14, r4);
        }
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r14, r1);
        }
        if ((i2 & 9363) != 9362 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1724206222, "com.instagram.creator.agent.settings.fragment.AutoReplyToggle (CreatorAISettingsComposableFragment.kt:480)");
            }
            int ordinal = hLa.ordinal();
            if (ordinal == 0) {
                r14.ExS(-1151535289);
                A01(r14, 0);
            } else if (ordinal == 2) {
                r14.ExS(-1151533135);
                HXX.A00(r12, C287195Zj.A0B(C51969G9p.A0U(), 0.0f, 64.0f, 0.0f, 36.0f), r4, ((i2 >> 9) & 14) | 48, A08, 0);
            } else if (ordinal == 1) {
                r14.ExS(-1337609759);
                C52636GaA.A08(r12, (Modifier) null, C287975bA.A00(r14, R.drawable.instagram_rocket_pano_outline_24, 0), new C57125IPo(r1, z4, false), C288035bG.A00(r12, 2131956984), C288035bG.A00(r12, 2131956983), (i2 << 6) & 896, 130762, z3);
            } else {
                throw C51973G9u.A0n(r14, -1151536097);
            }
            if (C51970G9q.A1a(r12, false)) {
                0fL.A00(1397053);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9F(r1, r4, hLa2, i3, 0, z3, z4);
        }
    }

    public static final void A03(C286575Wy r30, ImageUrl imageUrl, String str, int i) {
        int i2;
        ImageUrl imageUrl2 = imageUrl;
        String str2 = str;
        AnonymousClass7TF.A1H(str2, imageUrl2);
        C286575Wy r12 = r30;
        r12.ExV(-1978471065);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r12, str2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r12, imageUrl2);
        }
        if ((i2 & 19) != 18 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(119681419, "com.instagram.creator.agent.settings.fragment.Header (CreatorAISettingsComposableFragment.kt:453)");
            }
            float A01 = C287645aX.A01(r12, R.dimen.ab_test_media_thumbnail_preview_item_width);
            C285245Qk r4 = Modifier.A00;
            Modifier A0T = C51966G9m.A0T(r4);
            AnonymousClass5RD A02 = C291495hO.A02(C287275Zs.A07, r12, C287215Zl.A00, 48);
            int A00 = C287425a7.A00(r12);
            C286565Wx r9 = (C286565Wx) r12;
            AnonymousClass5RM A04 = C286565Wx.A04(r9);
            Modifier A012 = C287435a8.A01(r12, A0T);
            C51973G9u.A0y(r12, r9);
            C51971G9r.A12(r12, A02, A04);
            0sL r5 = C287485aD.A02;
            if (r9.A0K || !C51972G9s.A1Q(r12, A00)) {
                C51971G9r.A13(r12, r5, A00);
            }
            C51965G9l.A18(r12, A012);
            AnonymousClass6G3.A03(r12, C51971G9r.A0Q(r4, A01), C51966G9m.A0o(r12, imageUrl2, i2 >> 3));
            String A14 = C51968G9o.A14(r12, str2, 2131956997);
            long A0H = C51966G9m.A0H(r12);
            AnonymousClass5ZZ.A03(r12, C287195Zj.A0B(r4, 0.0f, 12.0f, 0.0f, 24.0f), C51966G9m.A0d(r12), (C268454dQ) null, (C291715hl) null, (AnonymousClass5ZD) null, A14, (0sP) null, 0, 0, 0, 0, 3120, 48, 14320, A0H, AnonymousClass5Z7.A01(20), AnonymousClass5Z7.A01(25), false);
            if (C51967G9n.A1R(r12)) {
                0fL.A00(-1603387338);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            JGJ.A01(ASQ, imageUrl2, str2, i3, 8);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: X.Gc4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: X.Gc4} */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0134, code lost:
        if (r0 == X.AnonymousClass5XT.A00) goto L_0x0136;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.C286575Wy r25, X.C53386GnI r26, X.C62320sa r27, X.C62320sa r28, X.C62320sa r29, X.0sP r30, X.0sP r31, X.0sP r32, X.0sP r33, int r34, int r35) {
        /*
            r4 = r29
            r5 = r33
            r6 = r28
            r15 = r27
            r17 = r32
            r18 = r31
            r19 = r30
            r7 = 0
            r10 = r26
            X.0qQ.A0B(r10, r7)
            r0 = -376770925(0xffffffffe98aee93, float:-2.09948E25)
            r11 = r25
            r11.ExV(r0)
            r8 = r35
            r0 = r35 & 1
            r9 = r34
            if (r0 == 0) goto L_0x01a7
            r0 = r34 | 6
        L_0x0026:
            r21 = r35 & 2
            if (r21 == 0) goto L_0x019a
            r0 = r0 | 48
        L_0x002c:
            r20 = r35 & 4
            if (r20 == 0) goto L_0x018d
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x0032:
            r16 = r35 & 8
            if (r16 == 0) goto L_0x0180
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0038:
            r14 = r35 & 16
            if (r14 == 0) goto L_0x0175
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x003e:
            r13 = r35 & 32
            r1 = 196608(0x30000, float:2.75506E-40)
            if (r13 != 0) goto L_0x004c
            r1 = r34 & r1
            if (r1 != 0) goto L_0x004d
            int r1 = X.G9t.A0J(r11, r6)
        L_0x004c:
            r0 = r0 | r1
        L_0x004d:
            r12 = r35 & 64
            r1 = 1572864(0x180000, float:2.204052E-39)
            if (r12 != 0) goto L_0x005b
            r1 = r34 & r1
            if (r1 != 0) goto L_0x005c
            int r1 = X.G9t.A0K(r11, r5)
        L_0x005b:
            r0 = r0 | r1
        L_0x005c:
            r2 = r8 & 128(0x80, float:1.794E-43)
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            if (r2 != 0) goto L_0x006a
            r1 = r34 & r1
            if (r1 != 0) goto L_0x006b
            int r1 = X.G9t.A0L(r11, r4)
        L_0x006a:
            r0 = r0 | r1
        L_0x006b:
            r1 = 4793491(0x492493, float:6.717112E-39)
            r3 = r0 & r1
            r1 = 4793490(0x492492, float:6.71711E-39)
            if (r3 != r1) goto L_0x009b
            boolean r1 = r11.Bwn()
            if (r1 == 0) goto L_0x009b
            r11.Evl()
        L_0x007e:
            X.5Xd r1 = r11.ASQ()
            if (r1 == 0) goto L_0x009a
            r7 = 2
            X.JBl r0 = new X.JBl
            r11 = r6
            r12 = r4
            r13 = r15
            r14 = r5
            r15 = r17
            r4 = r0
            r5 = r9
            r6 = r8
            r8 = r19
            r9 = r10
            r10 = r18
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.A06 = r0
        L_0x009a:
            return
        L_0x009b:
            if (r21 == 0) goto L_0x009f
            X.J2j r19 = X.C58998J2j.A00
        L_0x009f:
            if (r20 == 0) goto L_0x00a3
            X.J2k r18 = X.C58999J2k.A00
        L_0x00a3:
            if (r16 == 0) goto L_0x00a7
            X.J2l r17 = X.C59000J2l.A00
        L_0x00a7:
            if (r14 == 0) goto L_0x00ab
            X.Iql r15 = X.C58366Iql.A00
        L_0x00ab:
            if (r13 == 0) goto L_0x00af
            X.Iqm r6 = X.C58367Iqm.A00
        L_0x00af:
            if (r12 == 0) goto L_0x00b3
            X.J2m r5 = X.C59001J2m.A00
        L_0x00b3:
            if (r2 == 0) goto L_0x00b7
            X.Iqn r4 = X.C58368Iqn.A00
        L_0x00b7:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x00c5
            r2 = 236459152(0xe181490, float:1.8745347E-30)
            java.lang.String r1 = "com.instagram.creator.agent.settings.fragment.CreatorAiSettings (CreatorAISettingsComposableFragment.kt:330)"
            X.0fL.A01(r2, r1)
        L_0x00c5:
            java.lang.Object r14 = X.C51965G9l.A0r(r11)
            r1 = 3
            r16 = 0
            androidx.compose.foundation.lazy.LazyListState r3 = X.C305066Gi.A00(r11, r7, r7, r7, r1)
            r1 = -1442035734(0xffffffffaa0c47ea, float:-1.2459448E-13)
            boolean r2 = X.C51967G9n.A1Y(r11, r3, r1)
            java.lang.Object r1 = r11.ECw()
            if (r2 != 0) goto L_0x00e1
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r1 != r2) goto L_0x00ec
        L_0x00e1:
            r12 = 0
            r2 = 39
            X.ImO r1 = new X.ImO
            r1.<init>(r3, r12, r2)
            r11.FLL(r1)
        L_0x00ec:
            X.5Wx r13 = X.C51975G9x.A0E(r11, r1, r10)
            r31 = 0
            r12 = 1103101952(0x41c00000, float:24.0)
            r1 = 0
            X.6Fj r2 = new X.6Fj
            r2.<init>(r1, r1, r1, r12)
            r1 = -1442026265(0xffffffffaa0c6ce7, float:-1.2472281E-13)
            boolean r12 = X.C51967G9n.A1Z(r11, r10, r1)
            boolean r1 = X.C51973G9u.A1K(r0)
            boolean r12 = X.C51968G9o.A1T(r11, r14, r12, r1)
            boolean r1 = X.C51974G9v.A1V(r0)
            r12 = r12 | r1
            boolean r1 = X.C51974G9v.A1W(r0)
            r12 = r12 | r1
            boolean r1 = X.C51973G9u.A1H(r0)
            r12 = r12 | r1
            boolean r1 = X.C51973G9u.A1J(r0)
            r12 = r12 | r1
            boolean r1 = X.C51974G9v.A1T(r0)
            r12 = r12 | r1
            r1 = r0 & 896(0x380, float:1.256E-42)
            r0 = 256(0x100, float:3.59E-43)
            if (r1 != r0) goto L_0x012a
            r16 = 1
        L_0x012a:
            r12 = r12 | r16
            java.lang.Object r0 = r11.ECw()
            if (r12 != 0) goto L_0x0136
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x0154
        L_0x0136:
            X.Gc4 r0 = new X.Gc4
            r20 = r0
            r21 = r10
            r22 = r17
            r23 = r5
            r24 = r18
            r25 = r6
            r26 = r14
            r27 = r4
            r28 = r19
            r29 = r15
            r30 = r7
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r11.FLL(r0)
        L_0x0154:
            X.0sP r32 = X.C51965G9l.A0z(r13, r0)
            r34 = 249(0xf9, float:3.49E-43)
            r33 = 384(0x180, float:5.38E-43)
            r28 = r2
            r29 = r3
            r30 = r11
            r35 = r7
            X.AnonymousClass6HY.A03(r28, r29, r30, r31, r32, r33, r34, r35)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x007e
            r0 = -1327134087(0xffffffffb0e58a79, float:-1.6701299E-9)
            X.0fL.A00(r0)
            goto L_0x007e
        L_0x0175:
            r1 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x003e
            int r1 = X.G9t.A0I(r11, r15)
            r0 = r0 | r1
            goto L_0x003e
        L_0x0180:
            r1 = r9 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x0038
            r1 = r17
            int r1 = X.G9t.A0H(r11, r1)
            r0 = r0 | r1
            goto L_0x0038
        L_0x018d:
            r1 = r9 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0032
            r1 = r18
            int r1 = X.G9t.A0G(r11, r1)
            r0 = r0 | r1
            goto L_0x0032
        L_0x019a:
            r1 = r34 & 48
            if (r1 != 0) goto L_0x002c
            r1 = r19
            int r1 = X.G9t.A0F(r11, r1)
            r0 = r0 | r1
            goto L_0x002c
        L_0x01a7:
            r0 = r34 & 6
            if (r0 != 0) goto L_0x01b3
            int r0 = X.C41848B3p.A01(r11, r10)
            r0 = r0 | r34
            goto L_0x0026
        L_0x01b3:
            r0 = r9
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56651I6g.A06(X.5Wy, X.GnI, X.0sa, X.0sa, X.0sa, X.0sP, X.0sP, X.0sP, X.0sP, int, int):void");
    }

    public static final void A01(C286575Wy r15, int i) {
        C286575Wy r2 = r15;
        r15.ExV(1570635047);
        if (i != 0 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1512419380, "com.instagram.creator.agent.settings.fragment.AutoReplyToggleLoadingShimmer (CreatorAISettingsComposableFragment.kt:500)");
            }
            C285245Qk r6 = Modifier.A00;
            Modifier A0B = C287195Zj.A0B(C51966G9m.A0T(r6), 16.0f, 12.0f, 16.0f, 12.0f);
            AnonymousClass5RD A02 = C287395a4.A02(C287275Zs.A01, r15, C287215Zl.A05, 0);
            int A00 = C287425a7.A00(r15);
            C286565Wx r152 = (C286565Wx) r2;
            AnonymousClass5RM A04 = C286565Wx.A04(r152);
            Modifier A01 = C287435a8.A01(r2, A0B);
            C62320sa r14 = C287485aD.A00;
            C51973G9u.A0z(r2, r152, r14);
            0sL r13 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r2, A02, A04, r13);
            0sL r11 = C287485aD.A02;
            if (r152.A0K || !C51972G9s.A1Q(r2, A00)) {
                C51971G9r.A13(r2, r11, A00);
            }
            0sL A1K = C51966G9m.A1K(r2, A01);
            AnonymousClass6FX r5 = AnonymousClass6FX.A00;
            Modifier A002 = A00(r2, C287205Zk.A04(C287195Zj.A0B(r6, 0.0f, 0.0f, 12.0f, 0.0f)));
            C287245Zp r3 = C287215Zl.A04;
            C287675aa.A02(r2, r5.AB1(r3, A002), 0);
            Modifier A003 = r5.A00(r6);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r2, 0);
            int A004 = C287425a7.A00(r2);
            AnonymousClass5RM A042 = C286565Wx.A04(r152);
            Modifier A012 = C287435a8.A01(r2, A003);
            C51973G9u.A0z(r2, r152, r14);
            C287595aO.A00(r2, A0Z, r13);
            if (C51965G9l.A1Y(r2, r152, A042, A0w) || !C51972G9s.A1Q(r2, A004)) {
                C51971G9r.A13(r2, r11, A004);
            }
            C287595aO.A00(r2, A012, A1K);
            C287675aa.A02(r2, A00(r2, C287205Zk.A07(C287205Zk.A08(r6, 18.0f), 0.3f)), 0);
            C287675aa.A02(r2, A00(r2, C287205Zk.A07(C287205Zk.A08(C287195Zj.A06(r6), 14.0f), 0.9f)), 0);
            C287675aa.A02(r2, A00(r2, C287205Zk.A07(C287205Zk.A08(C287195Zj.A0B(r6, 0.0f, 6.0f, 0.0f, 0.0f), 14.0f), 0.7f)), 0);
            r2.ASN();
            C287675aa.A02(r2, r5.AB1(r3, A00(r2, C287205Zk.A0G(r6, 48.0f, 32.0f))), 0);
            if (C51967G9n.A1R(r2)) {
                0fL.A00(-1561602348);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            JG9.A01(ASQ, i, 37);
        }
    }

    public static final void A02(C286575Wy r29, C53375Gn5 gn5, 0sP r31, int i) {
        int i2;
        C286625Xd ASQ;
        int i3;
        C286575Wy r0 = r29;
        r0.ExV(-982832537);
        int i4 = i;
        C53375Gn5 gn52 = gn5;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r0, gn52) | i;
        } else {
            i2 = i4;
        }
        int i5 = i & 48;
        0sP r32 = r31;
        if (i5 == 0) {
            i2 |= G9t.A0F(r0, r32);
        }
        if ((i2 & 19) != 18 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(90545951, "com.instagram.creator.agent.settings.fragment.ViolatingBanner (CreatorAISettingsComposableFragment.kt:406)");
            }
            if (gn5 == null) {
                if (0fL.A02()) {
                    0fL.A00(1458435984);
                }
                ASQ = r0.ASQ();
                if (ASQ != null) {
                    i3 = 45;
                    JGL.A01(ASQ, r32, gn52, i4, i3);
                }
                return;
            }
            r0.ExS(269453866);
            C303876Bd A0b = C51969G9p.A0b();
            A0b.A09(gn52.A06);
            r0.ExS(269455567);
            Iterator A1H = C51966G9m.A1H(gn52.A01);
            while (A1H.hasNext()) {
                C53274GlM glM = (C53274GlM) A1H.next();
                int i6 = glM.A01;
                int i7 = i6 + glM.A00;
                A0b.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, AnonymousClass5ZD.A03, (C291795ht) null, 65530, C51966G9m.A0D(r0), 0, 0), i6, i7);
                A0b.A0A(glM.A02, glM.A03, i6, i7);
            }
            C286565Wx A0H = C51965G9l.A0H(r0, false);
            C286025Tq A02 = A0b.A02();
            C286565Wx.A0L(A0H, false);
            C285245Qk r9 = Modifier.A00;
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r0, 0);
            int A00 = C287425a7.A00(r0);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r0, r9);
            C62320sa r12 = C287485aD.A00;
            C51973G9u.A0z(r0, A0H, r12);
            0sL r11 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A0Z, A04, r11);
            0sL r10 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r0, A00)) {
                C51971G9r.A13(r0, r10, A00);
            }
            0sL A1K = C51966G9m.A1K(r0, A01);
            C56618I4t.A00(r0);
            Modifier A07 = C287195Zj.A07(r9.Ezh(C287205Zk.A00), 16.0f);
            AnonymousClass5RD A0W = C51968G9o.A0W(r0);
            int A002 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r0, A07);
            C51973G9u.A0z(r0, A0H, r12);
            C287595aO.A00(r0, A0W, r11);
            if (C51965G9l.A1Y(r0, A0H, A042, A0w) || !C51972G9s.A1Q(r0, A002)) {
                C51971G9r.A13(r0, r10, A002);
            }
            C287595aO.A00(r0, A012, A1K);
            C286575Wy r21 = r0;
            C288165bT.A06(r21, C304816Fi.A03(C287205Zk.A0C(C287195Zj.A0B(r9, 0.0f, 12.0f, 16.0f, 12.0f), 44.0f), AnonymousClass5ZN.A00, 0.5f, C51966G9m.A0F(r0)), C287975bA.A00(r0, R.drawable.instagram_warning_pano_outline_24, 0), C288075bK.A06, (String) null, 24624, 0, C51966G9m.A0G(r0));
            boolean A1X = G9t.A1X(r0, gn52, A02, -499961723) | C51972G9s.A1M(i2);
            Object ECw = r0.ECw();
            if (A1X || ECw == AnonymousClass5XT.A00) {
                ECw = J6W.A00(r0, A02, gn52, r32, 34);
            }
            IgClickableTextKt.A05(r0, (Modifier) null, A02, (AnonymousClass5Z4) null, C51965G9l.A0z(A0H, ECw), 114686, 0);
            if (C51971G9r.A1R(r0)) {
                0fL.A00(1165425014);
            }
        } else {
            r0.Evl();
        }
        ASQ = r0.ASQ();
        if (ASQ != null) {
            i3 = 46;
            JGL.A01(ASQ, r32, gn52, i4, i3);
        }
    }

    public static final void A04(C286575Wy r14, C52369GPq gPq, C62320sa r16, C62320sa r17, int i) {
        int i2;
        C286575Wy r13 = r14;
        r14.ExV(1313216877);
        int i3 = i;
        C52369GPq gPq2 = gPq;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r14, gPq) | i;
        } else {
            i2 = i3;
        }
        C62320sa r8 = r16;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r14, r8);
        }
        C62320sa r7 = r17;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r14, r7);
        }
        if ((i2 & 147) != 146 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-832766687, "com.instagram.creator.agent.settings.fragment.ConfirmDeletionDialog (CreatorAISettingsComposableFragment.kt:520)");
            }
            C60340gF r11 = C60340gF.A00;
            boolean A1Z = C51967G9n.A1Z(r14, gPq, 1806748420);
            Object ECw = r14.ECw();
            if (A1Z || ECw == AnonymousClass5XT.A00) {
                ECw = G9w.A0n(r14, gPq, 18);
            }
            C286565Wx r5 = (C286565Wx) r13;
            C286565Wx.A0L(r5, false);
            C286645Xf.A04(r14, r11, (0sL) ECw);
            r14.ExS(1806751365);
            int i4 = i2 & 112;
            boolean z = true;
            boolean A1S = AnonymousClass7TF.A1S(i4, 32);
            Object ECw2 = r14.ECw();
            if (A1S || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = C58706IwF.A00(r14, r8, 21);
            }
            C62320sa A0y = C51965G9l.A0y(r5, ECw2, false);
            String A00 = C288035bG.A00(r14, 2131956978);
            String A002 = C288035bG.A00(r14, 2131956977);
            Integer num = AnonymousClass05K.A0C;
            boolean A1S2 = AnonymousClass7TF.A1S(i2 & 896, 256) | C51967G9n.A1Z(r14, gPq, 1806763077);
            Object ECw3 = r14.ECw();
            if (A1S2 || ECw3 == AnonymousClass5XT.A00) {
                ECw3 = C58689Ivy.A00(r14, r7, gPq, 40);
            }
            C53398GnV A003 = HXM.A00(r14, num, C51965G9l.A0y(r5, ECw3, false), 2131957531, 12);
            Integer num2 = AnonymousClass05K.A00;
            boolean A1Z2 = C51967G9n.A1Z(r13, gPq, 1806772070);
            if (i4 != 32) {
                z = false;
            }
            boolean z2 = A1Z2 | z;
            Object ECw4 = r13.ECw();
            if (z2 || ECw4 == AnonymousClass5XT.A00) {
                ECw4 = C58689Ivy.A00(r13, r8, gPq, 41);
            }
            C56632I5m.A02(r13, A003, HXM.A00(r13, num2, C51965G9l.A0y(r5, ECw4, false), 2131954722, 12), A00, A002, A0y);
            if (0fL.A02()) {
                0fL.A00(1611205538);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = JGN.A01(r8, gPq2, r7, i3, 30);
        }
    }
}
