package X;

import android.graphics.drawable.Drawable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

public abstract class I4n {
    public static final void A02(Drawable drawable, C286575Wy r31, Modifier modifier, C53317Gm3 gm3, 0sP r34, 0sL r35, int i, int i2) {
        int i3;
        String str;
        Modifier modifier2 = modifier;
        C286575Wy r0 = r31;
        r0.ExV(758247923);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r0, modifier2) | i;
        } else {
            i3 = i6;
        }
        C53317Gm3 gm32 = gm3;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r0, gm32);
        }
        Drawable drawable2 = drawable;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i6 & 384) == 0) {
            i3 |= G9t.A0G(r0, drawable2);
        }
        int i7 = i2 & 8;
        0sL r37 = r35;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i6 & 3072) == 0) {
            i3 |= G9t.A0H(r0, r37);
        }
        0sP r33 = r34;
        if ((i4 & 16) != 0) {
            i3 |= 24576;
        } else if ((i6 & 24576) == 0) {
            i3 |= G9t.A0I(r0, r33);
        }
        if ((i3 & 9363) != 9362 || !r0.Bwn()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(985514303, "com.instagram.archive.updateshub.UserReelItem (UpdatesHub.kt:266)");
            }
            Object A0m = C51967G9n.A0m(r0, 1701733051);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = G9t.A0o(r0, (Object) null);
            }
            C286565Wx r5 = (C286565Wx) r0;
            C286565Wx.A0L(r5, false);
            0rm A11 = C51965G9l.A11();
            String str2 = gm32.A08;
            String str3 = str2;
            if (str2 == null) {
                str2 = "";
            }
            A11.A00 = G9w.A0h(r0, str2, 2131976082);
            r0.ExS(1701739738);
            int i8 = gm32.A01;
            if (i8 > 0) {
                A11.A00 = 002.A0g(C304346Dc.A01(r0, AnonymousClass7TF.A1b(i8), 2131976089), ", ", (String) A11.A00);
            }
            C286565Wx.A0L(r5, false);
            Modifier A08 = C287205Zk.A08(C287205Zk.A0D(modifier2, 171.0f), 247.0f);
            String A00 = C304346Dc.A00(r0, 2131976091);
            C287625aV A0R = C51965G9l.A0R(0);
            boolean A1Q = C51973G9u.A1Q(r0, 1701757754, i3) | C51973G9u.A1H(i3);
            Object ECw = r0.ECw();
            if (A1Q || ECw == obj) {
                ECw = C58696Iw5.A00(r0, A0m, gm32, r37, 36);
            }
            C286575Wy r16 = r0;
            Modifier A0P = C51968G9o.A0P(AnonymousClass5R5.A00(C52638GaC.A00(r16, A08, A0R, A00, (C62320sa) null, C51965G9l.A0y(r5, ECw, false), 0.95f, 0.0f, 0.0f, 0.0f, 157, false), new C59099J6h(A11, 6), false), 16.0f);
            Object A0m2 = C51967G9n.A0m(r0, 1701766399);
            if (A0m2 == obj) {
                A0m2 = C59099J6h.A01(r0, A0m, 7);
            }
            Modifier A0E = C51973G9u.A0E(r5, A0P, A0m2);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A002 = C287425a7.A00(r0);
            AnonymousClass5RM A04 = C286565Wx.A04(r5);
            Modifier A01 = C287435a8.A01(r0, A0E);
            C51973G9u.A0y(r0, r5);
            C51971G9r.A12(r0, A0a, A04);
            0sL r4 = C287485aD.A02;
            if (r5.A0K || !C51972G9s.A1Q(r0, A002)) {
                C51971G9r.A13(r0, r4, A002);
            }
            C51965G9l.A18(r0, A01);
            C289515dj r8 = C289515dj.A00;
            ImageUrl imageUrl = gm32.A02;
            if (imageUrl != null) {
                str = imageUrl.getUrl();
            } else {
                str = null;
            }
            r0.ExS(-1723380341);
            if (str != null) {
                C285245Qk r7 = Modifier.A00;
                AnonymousClass6G3.A00(r16, (Alignment) null, r8.CmS(r7), (C288195bW) null, C51975G9x.A0W(r0, str), C288075bK.A03, (String) null, 0.0f, 1597488, 40);
                r0.ExS(-1723371987);
                if (i8 == 0) {
                    C51969G9p.A14(r0, r8.CmS(r7), AnonymousClass5aQ.A00(r0).A09);
                }
                C286565Wx.A0L(r5, false);
                C287675aa.A02(r0, C304766Fd.A00(C287205Zk.A06(C51966G9m.A0T(r7), 0.25f), C304786Ff.A00.A03(G9t.A1D(C51965G9l.A0N(C285595Rx.A02(AnonymousClass5RX.A0K[(int) (AnonymousClass5RV.A00 & 63)], AnonymousClass5RW.A03(AnonymousClass5RV.A00), AnonymousClass5RW.A02(AnonymousClass5RV.A00), AnonymousClass5RW.A01(AnonymousClass5RV.A00), 0.4f)), AnonymousClass5RW.A07)), AnonymousClass5S0.A00), 0);
                C287675aa.A02(r0, C304816Fi.A03(r8.CmS(r7), AnonymousClass5ZN.A01(16.0f), 1.0f, C51966G9m.A0B(r0)), 0);
                if (gm32.A0A) {
                    Modifier A0G = C287205Zk.A0G(C51965G9l.A0L(r8, r7), 32.0f, 32.0f);
                    0qQ.A0B(drawable2, 0);
                    if (C51967G9n.A1U(r0, 677272873)) {
                        0fL.A01(-1512066086, "com.instagram.compose.ui.loading.SpinnerImageStyle.Companion.largeBold (SpinnerImage.kt:78)");
                    }
                    C52424GSc gSc = new C52424GSc(C287995bC.A00(drawable2, r0));
                    if (0fL.A02()) {
                        0fL.A00(-1324087786);
                    }
                    C286565Wx.A0L(r5, false);
                    GQD.A02(r16, A0G, gSc, 64, 0, C51966G9m.A0E(r0));
                }
            }
            C286565Wx.A0L(r5, false);
            A03(r0, gm32.A03, gm32.A07, str3, r33, i8, (i3 << 3) & 458752, gm32.A09);
            if (C51967G9n.A1R(r0)) {
                0fL.A00(1409331511);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59195J9z(r33, r37, drawable2, modifier2, gm32, i6, i4, 3);
        }
    }

    public static final void A03(C286575Wy r26, ImageUrl imageUrl, String str, String str2, 0sP r30, int i, int i2, boolean z) {
        int i3;
        long j;
        C286575Wy r0 = r26;
        r0.ExV(-239045448);
        int i4 = i2;
        int i5 = i2 & 6;
        String str3 = str;
        if (i5 == 0) {
            i3 = G9t.A0O(r0, str3) | i4;
        } else {
            i3 = i4;
        }
        String str4 = str2;
        if ((i4 & 48) == 0) {
            i3 |= G9t.A0P(r0, str4);
        }
        boolean z2 = z;
        if ((i4 & 384) == 0) {
            i3 |= G9t.A0a(r0, z2);
        }
        ImageUrl imageUrl2 = imageUrl;
        if ((i4 & 3072) == 0) {
            i3 |= G9t.A0R(r0, imageUrl2);
        }
        int i6 = i;
        if ((i4 & 24576) == 0) {
            i3 |= G9t.A09(r0, i6);
        }
        0sP r31 = r30;
        if ((196608 & i4) == 0) {
            i3 |= G9t.A0J(r0, r31);
        }
        if ((74899 & i3) != 74898 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1570602459, "com.instagram.archive.updateshub.UserRowHeaderItem (UpdatesHub.kt:346)");
            }
            C285245Qk r2 = Modifier.A00;
            boolean z3 = true;
            Modifier A0G = G9w.A0G(C51966G9m.A0T(r2));
            String A00 = C304346Dc.A00(r0, 2131976090);
            Object A0m = C51967G9n.A0m(r0, -2034527640);
            Object obj = AnonymousClass5XT.A00;
            C287605aT r13 = (C287605aT) C51972G9s.A0l(r0, A0m, obj);
            C286565Wx A0H = C51965G9l.A0H(r0, false);
            C287625aV A0R = C51965G9l.A0R(0);
            boolean A1N = C51973G9u.A1N(r0, -2034525783, i3) | C51972G9s.A1P(458752, i3, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
            Object ECw = r0.ECw();
            if (A1N || ECw == obj) {
                ECw = new C73670Phj(str3, r31, 42);
                r0.FLL(ECw);
            }
            Modifier A002 = AnonymousClass5R5.A00(C287635aW.A00((C287095Yz) null, r13, A0G, A0R, A00, C51965G9l.A0y(A0H, ECw, false), true), C58938J0b.A00, true);
            r0.ExS(-2034520628);
            if ((i3 & 112) != 32) {
                z3 = false;
            }
            Object ECw2 = r0.ECw();
            if (z3 || ECw2 == obj) {
                ECw2 = new MYK(str4, 15);
                r0.FLL(ECw2);
            }
            Modifier A0G2 = C51975G9x.A0G(A0H, A002, ECw2);
            C287245Zp r19 = C287215Zl.A04;
            C287295Zu r18 = C287275Zs.A01;
            AnonymousClass5RD A02 = C287395a4.A02(r18, r0, r19, 48);
            int A003 = C287425a7.A00(r0);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r0, A0G2);
            C62320sa r9 = C287485aD.A00;
            C51973G9u.A0z(r0, A0H, r9);
            0sL r8 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A02, A04, r8);
            0sL r7 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r0, A003)) {
                C51971G9r.A13(r0, r7, A003);
            }
            0sL A1K = C51966G9m.A1K(r0, A01);
            r0.ExS(161989803);
            if (imageUrl != null) {
                GRY.A02(r0, C287195Zj.A0B(r2, 0.0f, 0.0f, 5.0f, 0.0f), C51966G9m.A0o(r0, imageUrl2, i3 >> 9), new GS6(28.0f, 28.0f, 2.0f, 1.0f), 432);
            }
            C286565Wx.A0L(A0H, false);
            AnonymousClass5RD A0L = G9w.A0L(C287275Zs.A02, r0);
            int A004 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r0, r2);
            C51973G9u.A0z(r0, A0H, r9);
            C287595aO.A00(r0, A0L, r8);
            if (C51965G9l.A1Y(r0, A0H, A042, A0w) || !C51972G9s.A1Q(r0, A004)) {
                C51971G9r.A13(r0, r7, A004);
            }
            C287595aO.A00(r0, A012, A1K);
            r0.ExS(-171430879);
            if (str2 != null) {
                C286575Wy r24 = r0;
                String str5 = str4;
                AnonymousClass5ZZ.A0L(r24, G9w.A0I(r2, 5.0f), C51966G9m.A0h(r0), str5, C51965G9l.A03(i3), G9w.A05(r0));
            }
            C286565Wx.A0L(A0H, false);
            r0.ExS(-171419974);
            if (i6 > 0) {
                AnonymousClass5RD A022 = C287395a4.A02(r18, r0, r19, 48);
                int A005 = C287425a7.A00(r0);
                AnonymousClass5RM A043 = C286565Wx.A04(A0H);
                Modifier A013 = C287435a8.A01(r0, r2);
                C51973G9u.A0z(r0, A0H, r9);
                C287595aO.A00(r0, A022, r8);
                if (C51965G9l.A1Y(r0, A0H, A043, A0w) || !C51972G9s.A1Q(r0, A005)) {
                    C51971G9r.A13(r0, r7, A005);
                }
                C287595aO.A00(r0, A013, A1K);
                AnonymousClass2DO A006 = C287975bA.A00(r0, R.drawable.blue_dot_medium, 0);
                Modifier A0C = C287205Zk.A0C(r2, 8.0f);
                if (z) {
                    j = C51967G9n.A0a(r0, -1961706612).A0P;
                } else {
                    j = C51967G9n.A0a(r0, -1961704921).A0b;
                }
                C286565Wx.A0L(A0H, false);
                C288165bT.A03(r0, A0C, A006, j);
                String valueOf = String.valueOf(i6);
                long A05 = G9w.A05(r0);
                C286575Wy r72 = r0;
                AnonymousClass5ZZ.A0W(r72, C287195Zj.A0B(r2, 5.0f, 0.0f, 5.0f, 0.0f), C51966G9m.A0c(r0), valueOf, A05);
                r0.ASN();
            }
            if (C51973G9u.A1R(r0, A0H)) {
                0fL.A00(1160664336);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JAA(imageUrl2, r31, str3, str4, i6, i4, 0, z2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0168, code lost:
        if (r33.isEmpty() != false) goto L_0x016a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.graphics.drawable.Drawable r51, X.C286575Wy r52, androidx.compose.ui.Modifier r53, X.C59479JLd r54, X.C53309Glv r55, X.C52397GQw r56, X.C62320sa r57, X.C62320sa r58, X.0sP r59, X.0sP r60, X.0sP r61, X.0sL r62, X.0sL r63, X.0sL r64, X.0sL r65, X.AnonymousClass62P r66, X.AnonymousClass62P r67, float r68, int r69, int r70, int r71, boolean r72, boolean r73, boolean r74) {
        /*
            r17 = r53
            r0 = 4
            r6 = r56
            X.0qQ.A0B(r6, r0)
            r3 = 5
            r50 = r54
            r34 = r67
            r33 = r66
            r2 = r33
            r1 = r34
            r0 = r50
            X.C51973G9u.A0s(r3, r0, r2, r1)
            r1 = 9
            r43 = r62
            r0 = r43
            X.0qQ.A0B(r0, r1)
            r8 = 10
            r42 = r63
            r0 = r42
            X.0qQ.A0B(r0, r8)
            r2 = 11
            r46 = r59
            r45 = r60
            r1 = r46
            r0 = r45
            X.DbW.A1P(r1, r2, r0)
            r3 = 13
            r47 = r58
            r48 = r57
            r31 = r64
            r2 = r48
            r1 = r47
            r0 = r31
            X.C51973G9u.A0v(r3, r2, r1, r0)
            r1 = 17
            r32 = r65
            r0 = r32
            X.0qQ.A0B(r0, r1)
            r1 = 19
            r0 = r51
            X.0qQ.A0B(r0, r1)
            r0 = 1488299686(0x58b5a6a6, float:1.59781883E15)
            r2 = r52
            r2.ExV(r0)
            r3 = r71
            r16 = r71 & 1
            r5 = r69
            if (r16 == 0) goto L_0x03b8
            r0 = r69 | 6
        L_0x006a:
            r1 = r71 & 2
            r15 = 32
            r18 = r72
            if (r1 == 0) goto L_0x03ab
            r0 = r0 | 48
        L_0x0074:
            r1 = r71 & 4
            r14 = 256(0x100, float:3.59E-43)
            r39 = r73
            if (r1 == 0) goto L_0x039e
            r0 = r0 | 384(0x180, float:5.38E-43)
        L_0x007e:
            r1 = r71 & 8
            r41 = r68
            if (r1 == 0) goto L_0x0391
            r0 = r0 | 3072(0xc00, float:4.305E-42)
        L_0x0086:
            r1 = r71 & 16
            if (r1 == 0) goto L_0x0386
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x008c:
            r1 = r71 & 32
            r13 = 196608(0x30000, float:2.75506E-40)
            if (r1 == 0) goto L_0x0379
            r0 = r0 | r13
        L_0x0093:
            r1 = r71 & 64
            r12 = 1572864(0x180000, float:2.204052E-39)
            r49 = r55
            if (r1 == 0) goto L_0x036c
            r0 = r0 | r12
        L_0x009c:
            r1 = r3 & 128(0x80, float:1.794E-43)
            r11 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 == 0) goto L_0x035f
            r0 = r0 | r11
        L_0x00a3:
            r1 = r3 & 256(0x100, float:3.59E-43)
            r10 = 100663296(0x6000000, float:2.4074124E-35)
            if (r1 == 0) goto L_0x0352
            r0 = r0 | r10
        L_0x00aa:
            r1 = r3 & 512(0x200, float:7.175E-43)
            r9 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == 0) goto L_0x0345
            r0 = r0 | r9
        L_0x00b1:
            r1 = r3 & 1024(0x400, float:1.435E-42)
            r4 = r70
            if (r1 == 0) goto L_0x0334
            r1 = r70 | 6
        L_0x00b9:
            r7 = r3 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x0323
            r1 = r1 | 48
        L_0x00bf:
            r7 = r3 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x0312
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x00c5:
            r7 = r3 & 8192(0x2000, float:1.14794E-41)
            if (r7 == 0) goto L_0x0305
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x00cb:
            r7 = r3 & 16384(0x4000, float:2.2959E-41)
            r44 = r61
            if (r7 == 0) goto L_0x02f8
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x00d3:
            r7 = 32768(0x8000, float:4.5918E-41)
            r7 = r71 & r7
            if (r7 == 0) goto L_0x02eb
            r1 = r1 | r13
        L_0x00db:
            r7 = 65536(0x10000, float:9.18355E-41)
            r7 = r71 & r7
            if (r7 == 0) goto L_0x02de
            r1 = r1 | r12
        L_0x00e2:
            r7 = 131072(0x20000, float:1.83671E-40)
            r7 = r71 & r7
            if (r7 == 0) goto L_0x02d1
            r1 = r1 | r11
        L_0x00e9:
            r7 = 262144(0x40000, float:3.67342E-40)
            r7 = r71 & r7
            r40 = r74
            if (r7 == 0) goto L_0x02c4
            r1 = r1 | r10
        L_0x00f2:
            r7 = 524288(0x80000, float:7.34684E-40)
            r7 = r71 & r7
            if (r7 == 0) goto L_0x02b7
            r1 = r1 | r9
        L_0x00f9:
            r10 = 306783379(0x12492493, float:6.34695E-28)
            r9 = r0 & r10
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r7) goto L_0x014c
            r10 = r10 & r1
            if (r10 != r7) goto L_0x014c
            boolean r7 = r2.Bwn()
            if (r7 == 0) goto L_0x014c
            r2.Evl()
        L_0x010f:
            X.5Xd r1 = r2.ASQ()
            if (r1 == 0) goto L_0x014b
            X.JDh r0 = new X.JDh
            r19 = r6
            r20 = r48
            r21 = r47
            r22 = r46
            r23 = r45
            r24 = r44
            r25 = r43
            r26 = r42
            r27 = r31
            r28 = r32
            r29 = r33
            r30 = r34
            r31 = r41
            r32 = r5
            r33 = r4
            r34 = r3
            r35 = r18
            r36 = r39
            r37 = r40
            r14 = r0
            r15 = r51
            r16 = r17
            r17 = r50
            r18 = r49
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r1.A06 = r0
        L_0x014b:
            return
        L_0x014c:
            if (r16 == 0) goto L_0x0150
            X.5Qk r17 = androidx.compose.ui.Modifier.A00
        L_0x0150:
            boolean r7 = X.0fL.A02()
            if (r7 == 0) goto L_0x015e
            r9 = 1330253797(0x4f4a0fe5, float:3.3900393E9)
            java.lang.String r7 = "com.instagram.archive.updateshub.UpdatesHub (UpdatesHub.kt:103)"
            X.0fL.A01(r9, r7)
        L_0x015e:
            if (r72 == 0) goto L_0x016a
            boolean r9 = r33.isEmpty()
            r16 = 1
            r7 = r41
            if (r9 == 0) goto L_0x016d
        L_0x016a:
            r16 = 0
            r7 = 0
        L_0x016d:
            r10 = 0
            r22 = 384(0x180, float:5.38E-43)
            X.4gU r7 = X.I69.A01(r10, r2, r7, r8)
            X.4cd r8 = X.C51968G9o.A0Y(r2)
            float r7 = X.C51968G9o.A01(r7)
            float r9 = r8.F06(r7)
            androidx.compose.ui.Alignment r7 = X.C287215Zl.A0E
            r15 = 0
            X.5RD r13 = X.C287675aa.A00(r7, r15)
            int r12 = X.C287425a7.A00(r2)
            r7 = r2
            X.5Wx r7 = (X.C286565Wx) r7
            X.5RM r11 = X.C286565Wx.A04(r7)
            r8 = r17
            androidx.compose.ui.Modifier r8 = X.C287435a8.A01(r2, r8)
            X.C51973G9u.A0y(r2, r7)
            X.C51971G9r.A12(r2, r13, r11)
            X.0sL r13 = X.C287485aD.A02
            boolean r11 = r7.A0K
            if (r11 != 0) goto L_0x01aa
            boolean r11 = X.C51972G9s.A1Q(r2, r12)
            if (r11 != 0) goto L_0x01ad
        L_0x01aa:
            X.C51971G9r.A13(r2, r13, r12)
        L_0x01ad:
            X.C51965G9l.A18(r2, r8)
            X.5dj r13 = X.C289515dj.A00
            if (r16 == 0) goto L_0x026e
            r8 = 1913939111(0x721464a7, float:2.9392296E30)
            X.5Qk r11 = X.C51965G9l.A0K(r2, r8)
            androidx.compose.ui.Alignment r8 = X.C287215Zl.A0C
            androidx.compose.ui.Modifier r12 = r13.AAz(r8, r11)
            r8 = 16384(0x4000, float:2.2959E-41)
            r11 = r41
            androidx.compose.ui.Modifier r20 = X.C287205Zk.A0C(r12, r11)
            long r24 = X.C51966G9m.A0K(r2)
            r21 = 1073741824(0x40000000, float:2.0)
            r19 = r2
            r23 = r15
            X.C52390GQp.A02(r19, r20, r21, r22, r23, r24)
        L_0x01d6:
            X.C286565Wx.A0L(r7, r15)
            r2.ASN()
            androidx.compose.ui.Modifier r12 = X.C51968G9o.A0O()
            r38 = 0
            X.GRU r11 = X.GRV.A02(r2)
            androidx.compose.ui.Modifier r10 = X.C51970G9q.A0V(r12, r11, r10)
            androidx.compose.ui.Modifier r11 = X.C52383GQi.A00(r10, r6)
            r10 = 1294750073(0x4d2c5179, float:1.80688784E8)
            r2.ExS(r10)
            r10 = 57344(0xe000, float:8.0356E-41)
            boolean r8 = X.C51972G9s.A1P(r10, r0, r8)
            boolean r10 = X.C51966G9m.A1S(r2, r9, r8)
            java.lang.Object r8 = r2.ECw()
            if (r10 != 0) goto L_0x0209
            java.lang.Object r10 = X.AnonymousClass5XT.A00
            if (r8 != r10) goto L_0x0212
        L_0x0209:
            r10 = 3
            X.Iwg r8 = new X.Iwg
            r8.<init>(r6, r9, r10)
            r2.FLL(r8)
        L_0x0212:
            androidx.compose.ui.Modifier r7 = X.C51973G9u.A0D(r7, r11, r8)
            androidx.compose.ui.Modifier r21 = X.G9t.A0p(r2, r7)
            if (r72 == 0) goto L_0x0220
            if (r16 != 0) goto L_0x0220
            r38 = 1
        L_0x0220:
            int r7 = r0 >> 12
            r8 = r7 & 112(0x70, float:1.57E-43)
            int r7 = r0 << 3
            r7 = r7 & 7168(0x1c00, float:1.0045E-41)
            r8 = r8 | r7
            int r0 = r0 >> 6
            int r8 = X.C51974G9v.A00(r0, r8)
            r7 = 234881024(0xe000000, float:1.5777218E-30)
            int r0 = r1 << 24
            int r35 = X.C51972G9s.A06(r7, r0, r8)
            int r7 = r1 >> 6
            r1 = r7 & 14
            r0 = r7 & 112(0x70, float:1.57E-43)
            int r0 = X.C51974G9v.A01(r1, r0, r7)
            int r36 = X.C51973G9u.A02(r7, r0)
            r19 = r51
            r20 = r2
            r22 = r50
            r23 = r49
            r24 = r48
            r25 = r47
            r26 = r46
            r27 = r45
            r28 = r44
            r29 = r43
            r30 = r42
            r37 = r15
            A01(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x010f
            r0 = 1259615177(0x4b1433c9, float:9712585.0)
            X.0fL.A00(r0)
            goto L_0x010f
        L_0x026e:
            r8 = 16384(0x4000, float:2.2959E-41)
            X.4gU r11 = r6.A06
            r19 = r11
            float r11 = X.C51971G9r.A03(r19)
            float r12 = r6.A01
            float r11 = r11 / r12
            r23 = 0
            int r11 = (r11 > r23 ? 1 : (r11 == r23 ? 0 : -1))
            if (r11 <= 0) goto L_0x02af
            r11 = 1914167519(0x7217e0df, float:3.0082617E30)
            X.5Qk r14 = X.C51965G9l.A0K(r2, r11)
            androidx.compose.ui.Alignment r11 = X.C287215Zl.A0C
            androidx.compose.ui.Modifier r13 = r13.AAz(r11, r14)
            r11 = r41
            androidx.compose.ui.Modifier r20 = X.C287205Zk.A0C(r13, r11)
            float r21 = X.C51971G9r.A03(r19)
            float r21 = r21 / r12
            long r26 = X.C51966G9m.A0K(r2)
            r22 = 1073741824(0x40000000, float:2.0)
            r28 = 0
            r24 = 196608(0x30000, float:2.75506E-40)
            r25 = 88
            r19 = r2
            r30 = r15
            X.C52390GQp.A01(r19, r20, r21, r22, r23, r24, r25, r26, r28, r30)
            goto L_0x01d6
        L_0x02af:
            r11 = 1914393354(0x721b530a, float:3.076516E30)
            r2.ExS(r11)
            goto L_0x01d6
        L_0x02b7:
            r7 = r70 & r9
            if (r7 != 0) goto L_0x00f9
            r7 = r51
            int r7 = X.G9t.A0N(r2, r7)
            r1 = r1 | r7
            goto L_0x00f9
        L_0x02c4:
            r7 = r70 & r10
            if (r7 != 0) goto L_0x00f2
            r7 = r40
            int r7 = X.G9t.A0g(r2, r7)
            r1 = r1 | r7
            goto L_0x00f2
        L_0x02d1:
            r7 = r70 & r11
            if (r7 != 0) goto L_0x00e9
            r7 = r32
            int r7 = X.G9t.A0L(r2, r7)
            r1 = r1 | r7
            goto L_0x00e9
        L_0x02de:
            r7 = r70 & r12
            if (r7 != 0) goto L_0x00e2
            r7 = r31
            int r7 = X.G9t.A0K(r2, r7)
            r1 = r1 | r7
            goto L_0x00e2
        L_0x02eb:
            r7 = r70 & r13
            if (r7 != 0) goto L_0x00db
            r7 = r47
            int r7 = X.G9t.A0J(r2, r7)
            r1 = r1 | r7
            goto L_0x00db
        L_0x02f8:
            r7 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x00d3
            r7 = r44
            int r7 = X.G9t.A0I(r2, r7)
            r1 = r1 | r7
            goto L_0x00d3
        L_0x0305:
            r7 = r4 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x00cb
            r7 = r48
            int r7 = X.C51971G9r.A09(r2, r7)
            r1 = r1 | r7
            goto L_0x00cb
        L_0x0312:
            r7 = r4 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x00c5
            r7 = r45
            boolean r7 = r2.AGw(r7)
            if (r7 != 0) goto L_0x0320
            r14 = 128(0x80, float:1.794E-43)
        L_0x0320:
            r1 = r1 | r14
            goto L_0x00c5
        L_0x0323:
            r7 = r70 & 48
            if (r7 != 0) goto L_0x00bf
            r7 = r46
            boolean r7 = r2.AGw(r7)
            if (r7 != 0) goto L_0x0331
            r15 = 16
        L_0x0331:
            r1 = r1 | r15
            goto L_0x00bf
        L_0x0334:
            r1 = r70 & 6
            if (r1 != 0) goto L_0x0342
            r1 = r42
            int r1 = X.C51971G9r.A08(r2, r1)
            r1 = r70 | r1
            goto L_0x00b9
        L_0x0342:
            r1 = r4
            goto L_0x00b9
        L_0x0345:
            r1 = r69 & r9
            if (r1 != 0) goto L_0x00b1
            r1 = r43
            int r1 = X.G9t.A0N(r2, r1)
            r0 = r0 | r1
            goto L_0x00b1
        L_0x0352:
            r1 = r69 & r10
            if (r1 != 0) goto L_0x00aa
            r1 = r34
            int r1 = X.G9t.A0M(r2, r1)
            r0 = r0 | r1
            goto L_0x00aa
        L_0x035f:
            r1 = r69 & r11
            if (r1 != 0) goto L_0x00a3
            r1 = r33
            int r1 = X.G9t.A0V(r2, r1)
            r0 = r0 | r1
            goto L_0x00a3
        L_0x036c:
            r1 = r69 & r12
            if (r1 != 0) goto L_0x009c
            r1 = r49
            int r1 = X.G9t.A0U(r2, r1)
            r0 = r0 | r1
            goto L_0x009c
        L_0x0379:
            r1 = r69 & r13
            if (r1 != 0) goto L_0x0093
            r1 = r50
            int r1 = X.G9t.A0J(r2, r1)
            r0 = r0 | r1
            goto L_0x0093
        L_0x0386:
            r1 = r5 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x008c
            int r1 = X.G9t.A0S(r2, r6)
            r0 = r0 | r1
            goto L_0x008c
        L_0x0391:
            r1 = r5 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x0086
            r1 = r41
            int r1 = X.G9t.A02(r2, r1)
            r0 = r0 | r1
            goto L_0x0086
        L_0x039e:
            r1 = r5 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x007e
            r1 = r39
            int r1 = X.G9t.A0a(r2, r1)
            r0 = r0 | r1
            goto L_0x007e
        L_0x03ab:
            r1 = r69 & 48
            if (r1 != 0) goto L_0x0074
            r1 = r18
            int r1 = X.G9t.A0Z(r2, r1)
            r0 = r0 | r1
            goto L_0x0074
        L_0x03b8:
            r0 = r69 & 6
            if (r0 != 0) goto L_0x03c6
            r0 = r17
            int r0 = X.G9t.A0O(r2, r0)
            r0 = r69 | r0
            goto L_0x006a
        L_0x03c6:
            r0 = r5
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I4n.A00(android.graphics.drawable.Drawable, X.5Wy, androidx.compose.ui.Modifier, X.JLd, X.Glv, X.GQw, X.0sa, X.0sa, X.0sP, X.0sP, X.0sP, X.0sL, X.0sL, X.0sL, X.0sL, X.62P, X.62P, float, int, int, int, boolean, boolean, boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v86, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v87, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v109, resolved type: X.IyJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: X.IyJ} */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01bd, code lost:
        if (r0 == X.AnonymousClass5XT.A00) goto L_0x01bf;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x023f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.graphics.drawable.Drawable r50, X.C286575Wy r51, androidx.compose.ui.Modifier r52, X.C59479JLd r53, X.C53309Glv r54, X.C62320sa r55, X.C62320sa r56, X.0sP r57, X.0sP r58, X.0sP r59, X.0sL r60, X.0sL r61, X.0sL r62, X.0sL r63, X.AnonymousClass62P r64, X.AnonymousClass62P r65, int r66, int r67, int r68, boolean r69, boolean r70, boolean r71) {
        /*
            r14 = r52
            r0 = 1877664286(0x6feae21e, float:1.453857E29)
            r9 = r51
            r9.ExV(r0)
            r6 = r68
            r17 = r68 & 1
            r8 = r66
            if (r17 == 0) goto L_0x02f7
            r10 = r66 | 6
        L_0x0014:
            r0 = r68 & 2
            r49 = r53
            if (r0 == 0) goto L_0x02ea
            r10 = r10 | 48
        L_0x001c:
            r0 = r68 & 4
            r16 = 128(0x80, float:1.794E-43)
            r30 = r69
            if (r0 == 0) goto L_0x02dd
            r10 = r10 | 384(0x180, float:5.38E-43)
        L_0x0026:
            r0 = r68 & 8
            r13 = 1024(0x400, float:1.435E-42)
            r45 = r70
            if (r0 == 0) goto L_0x02d0
            r10 = r10 | 3072(0xc00, float:4.305E-42)
        L_0x0030:
            r0 = r68 & 16
            r12 = 8192(0x2000, float:1.14794E-41)
            r48 = r54
            if (r0 == 0) goto L_0x02c3
            r10 = r10 | 24576(0x6000, float:3.4438E-41)
        L_0x003a:
            r0 = r68 & 32
            r11 = 65536(0x10000, float:9.18355E-41)
            r4 = 196608(0x30000, float:2.75506E-40)
            r28 = r64
            if (r0 == 0) goto L_0x02b6
            r10 = r10 | r4
        L_0x0045:
            r0 = r68 & 64
            r3 = 1572864(0x180000, float:2.204052E-39)
            r15 = r65
            if (r0 == 0) goto L_0x02ab
            r10 = r10 | r3
        L_0x004e:
            r0 = r6 & 128(0x80, float:1.794E-43)
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r27 = r60
            if (r0 == 0) goto L_0x029e
            r10 = r10 | r2
        L_0x0057:
            r1 = r6 & 256(0x100, float:3.59E-43)
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r25 = r61
            if (r1 != 0) goto L_0x0069
            r0 = r0 & r66
            if (r0 != 0) goto L_0x006a
            r0 = r25
            int r0 = X.G9t.A0M(r9, r0)
        L_0x0069:
            r10 = r10 | r0
        L_0x006a:
            r1 = r6 & 512(0x200, float:7.175E-43)
            r0 = 805306368(0x30000000, float:4.656613E-10)
            r22 = r57
            if (r1 != 0) goto L_0x007c
            r0 = r0 & r66
            if (r0 != 0) goto L_0x007d
            r0 = r22
            int r0 = X.G9t.A0N(r9, r0)
        L_0x007c:
            r10 = r10 | r0
        L_0x007d:
            r0 = r6 & 1024(0x400, float:1.435E-42)
            r24 = r58
            r7 = r67
            if (r0 == 0) goto L_0x028d
            r5 = r67 | 6
        L_0x0087:
            r0 = r6 & 2048(0x800, float:2.87E-42)
            r47 = r55
            if (r0 == 0) goto L_0x0280
            r5 = r5 | 48
        L_0x008f:
            r0 = r6 & 4096(0x1000, float:5.74E-42)
            r23 = r59
            if (r0 == 0) goto L_0x026e
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0097:
            r0 = r6 & 8192(0x2000, float:1.14794E-41)
            r21 = r56
            if (r0 == 0) goto L_0x025d
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x009f:
            r0 = r6 & 16384(0x4000, float:2.2959E-41)
            r26 = r62
            if (r0 == 0) goto L_0x024c
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x00a7:
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r68 & r0
            r46 = r63
            if (r0 == 0) goto L_0x023f
            r5 = r5 | r4
        L_0x00b1:
            r0 = r68 & r11
            r44 = r71
            if (r0 == 0) goto L_0x0232
            r5 = r5 | r3
        L_0x00b8:
            r11 = 131072(0x20000, float:1.83671E-40)
            r0 = r68 & r11
            if (r0 == 0) goto L_0x0225
            r5 = r5 | r2
        L_0x00bf:
            r0 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r10 & r0
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r0) goto L_0x0113
            r1 = 4793491(0x492493, float:6.717112E-39)
            r1 = r1 & r5
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r0) goto L_0x0113
            boolean r0 = r9.Bwn()
            if (r0 == 0) goto L_0x0113
            r9.Evl()
        L_0x00db:
            X.5Xd r1 = r9.ASQ()
            if (r1 == 0) goto L_0x0112
            X.JDZ r0 = new X.JDZ
            r16 = r21
            r17 = r22
            r18 = r24
            r19 = r23
            r20 = r27
            r21 = r25
            r22 = r26
            r23 = r46
            r24 = r28
            r25 = r15
            r26 = r8
            r27 = r7
            r28 = r6
            r29 = r30
            r30 = r45
            r31 = r44
            r10 = r0
            r11 = r50
            r12 = r14
            r13 = r49
            r14 = r48
            r15 = r47
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1.A06 = r0
        L_0x0112:
            return
        L_0x0113:
            if (r17 == 0) goto L_0x0117
            X.5Qk r14 = androidx.compose.ui.Modifier.A00
        L_0x0117:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0125
            r1 = 511339969(0x1e7a6dc1, float:1.3257586E-20)
            java.lang.String r0 = "com.instagram.archive.updateshub.UpdatesGrid (UpdatesHub.kt:174)"
            X.0fL.A01(r1, r0)
        L_0x0125:
            r42 = 0
            androidx.compose.foundation.lazy.grid.LazyGridState r4 = X.C56383Hxc.A00(r9)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r44)
            r0 = 1445864934(0x562e25e6, float:4.7869449E13)
            boolean r1 = X.C51967G9n.A1Y(r9, r4, r0)
            java.lang.Object r0 = r9.ECw()
            if (r1 != 0) goto L_0x0140
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x014a
        L_0x0140:
            r2 = 0
            r1 = 4
            X.MFS r0 = new X.MFS
            r0.<init>(r4, r2, r1)
            r9.FLL(r0)
        L_0x014a:
            X.5Wx r3 = X.C51975G9x.A0E(r9, r0, r3)
            r0 = 2
            X.IF4 r13 = new X.IF4
            r13.<init>(r0)
            r0 = 1098907648(0x41800000, float:16.0)
            r1 = 1094713344(0x41400000, float:12.0)
            X.6Fj r2 = new X.6Fj
            r2.<init>(r0, r1, r0, r1)
            X.6Fc r33 = X.C287275Zs.A01(r0)
            X.6Fc r32 = X.C287275Zs.A01(r0)
            r1 = 0
            r12 = 1445878247(0x562e59e7, float:4.7925288E13)
            r0 = r49
            boolean r12 = X.C51967G9n.A1Z(r9, r0, r12)
            boolean r0 = X.C51973G9u.A1J(r10)
            r12 = r12 | r0
            boolean r0 = X.C51974G9v.A1W(r10)
            r12 = r12 | r0
            boolean r0 = X.C51973G9u.A1L(r10)
            r12 = r12 | r0
            boolean r0 = X.C51974G9v.A1U(r10)
            r12 = r12 | r0
            boolean r0 = X.C51973G9u.A1H(r5)
            r12 = r12 | r0
            boolean r0 = X.C51973G9u.A1I(r5)
            r12 = r12 | r0
            boolean r0 = X.C51973G9u.A1J(r5)
            r12 = r12 | r0
            boolean r0 = X.C51974G9v.A1W(r5)
            boolean r12 = X.C51968G9o.A1T(r9, r15, r12, r0)
            boolean r0 = X.C51973G9u.A1I(r10)
            r12 = r12 | r0
            r0 = 458752(0x70000, float:6.42848E-40)
            boolean r11 = X.C51972G9s.A1P(r0, r10, r11)
            r0 = r50
            boolean r11 = X.C51968G9o.A1T(r9, r0, r12, r11)
            boolean r0 = X.C51974G9v.A1V(r10)
            r11 = r11 | r0
            boolean r0 = X.C51973G9u.A1G(r5)
            r11 = r11 | r0
            java.lang.Object r0 = r9.ECw()
            if (r11 != 0) goto L_0x01bf
            java.lang.Object r11 = X.AnonymousClass5XT.A00
            if (r0 != r11) goto L_0x01d5
        L_0x01bf:
            X.IyJ r0 = new X.IyJ
            r16 = r0
            r17 = r50
            r18 = r49
            r19 = r48
            r20 = r47
            r29 = r15
            r31 = r45
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r9.FLL(r0)
        L_0x01d5:
            X.0sP r39 = X.C51965G9l.A0z(r3, r0)
            r11 = 1772544(0x1b0c00, float:2.483863E-39)
            int r0 = r10 << 3
            r40 = r0 & 112(0x70, float:1.57E-43)
            r40 = r40 | r11
            r41 = 400(0x190, float:5.6E-43)
            r31 = r1
            r34 = r2
            r35 = r13
            r36 = r4
            r37 = r9
            r38 = r14
            r43 = r42
            X.HQz.A00(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r0 = 1445955017(0x562f85c9, float:4.8247284E13)
            boolean r10 = X.C51967G9n.A1Y(r9, r4, r0)
            boolean r0 = X.C51975G9x.A1O(r5)
            r10 = r10 | r0
            java.lang.Object r2 = r9.ECw()
            if (r10 != 0) goto L_0x020b
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r2 != r0) goto L_0x0217
        L_0x020b:
            r5 = 35
            X.MHD r2 = new X.MHD
            r0 = r46
            r2.<init>((java.lang.Object) r4, (java.lang.Object) r0, (X.AnonymousClass4D7) r1, (int) r5)
            r9.FLL(r2)
        L_0x0217:
            boolean r0 = X.C51972G9s.A1S(r9, r3, r2, r4)
            if (r0 == 0) goto L_0x00db
            r0 = 2062664513(0x7af1c341, float:6.276519E35)
            X.0fL.A00(r0)
            goto L_0x00db
        L_0x0225:
            r0 = r67 & r2
            if (r0 != 0) goto L_0x00bf
            r0 = r50
            int r0 = X.G9t.A0L(r9, r0)
            r5 = r5 | r0
            goto L_0x00bf
        L_0x0232:
            r0 = r67 & r3
            if (r0 != 0) goto L_0x00b8
            r0 = r44
            int r0 = X.G9t.A0e(r9, r0)
            r5 = r5 | r0
            goto L_0x00b8
        L_0x023f:
            r0 = r67 & r4
            if (r0 != 0) goto L_0x00b1
            r0 = r46
            int r0 = X.G9t.A0J(r9, r0)
            r5 = r5 | r0
            goto L_0x00b1
        L_0x024c:
            r0 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x00a7
            r0 = r26
            boolean r0 = r9.AGw(r0)
            if (r0 == 0) goto L_0x025a
            r12 = 16384(0x4000, float:2.2959E-41)
        L_0x025a:
            r5 = r5 | r12
            goto L_0x00a7
        L_0x025d:
            r0 = r7 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x009f
            r0 = r21
            boolean r0 = r9.AGw(r0)
            if (r0 == 0) goto L_0x026b
            r13 = 2048(0x800, float:2.87E-42)
        L_0x026b:
            r5 = r5 | r13
            goto L_0x009f
        L_0x026e:
            r0 = r7 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0097
            r0 = r23
            boolean r0 = r9.AGw(r0)
            if (r0 == 0) goto L_0x027c
            r16 = 256(0x100, float:3.59E-43)
        L_0x027c:
            r5 = r5 | r16
            goto L_0x0097
        L_0x0280:
            r0 = r67 & 48
            if (r0 != 0) goto L_0x008f
            r0 = r47
            int r0 = X.G9t.A0F(r9, r0)
            r5 = r5 | r0
            goto L_0x008f
        L_0x028d:
            r0 = r67 & 6
            if (r0 != 0) goto L_0x029b
            r0 = r24
            int r0 = X.C41848B3p.A01(r9, r0)
            r5 = r67 | r0
            goto L_0x0087
        L_0x029b:
            r5 = r7
            goto L_0x0087
        L_0x029e:
            r0 = r66 & r2
            if (r0 != 0) goto L_0x0057
            r0 = r27
            int r0 = X.G9t.A0L(r9, r0)
            r10 = r10 | r0
            goto L_0x0057
        L_0x02ab:
            r0 = r66 & r3
            if (r0 != 0) goto L_0x004e
            int r0 = X.G9t.A0K(r9, r15)
            r10 = r10 | r0
            goto L_0x004e
        L_0x02b6:
            r0 = r66 & r4
            if (r0 != 0) goto L_0x0045
            r0 = r28
            int r0 = X.G9t.A0T(r9, r0)
            r10 = r10 | r0
            goto L_0x0045
        L_0x02c3:
            r0 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x003a
            r0 = r48
            int r0 = X.G9t.A0S(r9, r0)
            r10 = r10 | r0
            goto L_0x003a
        L_0x02d0:
            r0 = r8 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0030
            r0 = r45
            int r0 = X.G9t.A0b(r9, r0)
            r10 = r10 | r0
            goto L_0x0030
        L_0x02dd:
            r0 = r8 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0026
            r0 = r30
            int r0 = X.G9t.A0a(r9, r0)
            r10 = r10 | r0
            goto L_0x0026
        L_0x02ea:
            r0 = r66 & 48
            if (r0 != 0) goto L_0x001c
            r0 = r49
            int r0 = X.G9t.A0F(r9, r0)
            r10 = r10 | r0
            goto L_0x001c
        L_0x02f7:
            r0 = r66 & 6
            if (r0 != 0) goto L_0x0303
            int r10 = X.G9t.A0O(r9, r14)
            r10 = r10 | r66
            goto L_0x0014
        L_0x0303:
            r10 = r8
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I4n.A01(android.graphics.drawable.Drawable, X.5Wy, androidx.compose.ui.Modifier, X.JLd, X.Glv, X.0sa, X.0sa, X.0sP, X.0sP, X.0sP, X.0sL, X.0sL, X.0sL, X.0sL, X.62P, X.62P, int, int, int, boolean, boolean, boolean):void");
    }
}
