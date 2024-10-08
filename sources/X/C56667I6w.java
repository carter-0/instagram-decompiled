package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;

/* renamed from: X.I6w  reason: case insensitive filesystem */
public abstract class C56667I6w {
    public static final void A01(C286575Wy r12, C59721JVf jVf, 0sP r14, 0sP r15, 0sL r16, int i) {
        int i2;
        C59721JVf jVf2 = jVf;
        0qQ.A0B(jVf, 0);
        0sP r8 = r14;
        0sP r10 = r15;
        0sL r7 = r16;
        AnonymousClass7TG.A1U(r7, r14, r15);
        r12.ExV(1780993380);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r12, jVf) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r12, r7);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r12, r14);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r12, r15);
        }
        if ((i2 & 1171) != 1170 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1633530214, "com.instagram.creation.drafts.ui.DraftList (DraftList.kt:55)");
            }
            boolean z = true;
            boolean A1L = C51972G9s.A1L(i2) | AnonymousClass7TF.A1S(i2 & 896, 256) | C51967G9n.A1Z(r12, jVf, -229126046);
            if ((i2 & 7168) != 2048) {
                z = false;
            }
            boolean z2 = A1L | z;
            Object ECw = r12.ECw();
            if (z2 || ECw == AnonymousClass5XT.A00) {
                ECw = new C58769IxG(30, r15, r7, r8, jVf2);
                r12.FLL(ECw);
            }
            C51965G9l.A1X(r12, false);
            AnonymousClass6HY.A08(r12, (0sP) ECw);
            if (0fL.A02()) {
                0fL.A00(-1812398282);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG7(r7, r8, jVf2, r10, i3, 6);
        }
    }

    public static final void A00(AnonymousClass6FY r15, C286575Wy r16, String str, String str2, 0sP r19, 0sL r20, int i) {
        int i2;
        C286575Wy r14 = r16;
        r14.ExV(98700557);
        int i3 = i;
        AnonymousClass6FY r12 = r15;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r14, r15) | i;
        } else {
            i2 = i3;
        }
        String str3 = str;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r14, str3);
        }
        String str4 = str2;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0Q(r14, str4);
        }
        0sL r6 = r20;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r14, r6);
        }
        0sP r8 = r19;
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r14, r8);
        }
        if ((i2 & 9363) != 9362 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-2141949238, "com.instagram.creation.drafts.ui.DraftListItemOverflowIcon (DraftList.kt:171)");
            }
            Object A0m = C51967G9n.A0m(r14, -1538113269);
            Object obj = AnonymousClass5XT.A00;
            C284945Oz r7 = (C284945Oz) C51974G9v.A0Z(r14, A0m, obj, false);
            C286565Wx A0H = C51965G9l.A0H(r14, false);
            C284945Oz A0J = C51965G9l.A0J(A0H, C51974G9v.A0X(r14, obj, -1538110869, false), false);
            Modifier AB1 = r12.AB1(C287215Zl.A04, Modifier.A00);
            Object A0m2 = C51967G9n.A0m(r14, -1538106838);
            if (A0m2 == obj) {
                A0m2 = new MMQ(r7, 44);
                r14.FLL(A0m2);
            }
            C288165bT.A08(r16, C51969G9p.A0V(A0H, AB1, A0m2), C287975bA.A00(r14, R.drawable.instagram_more_horizontal_pano_filled_24, 0), C288035bG.A00(r14, 2131966723), C51966G9m.A0L(r14));
            boolean A1W = C51971G9r.A1W(r7);
            Object A0m3 = C51967G9n.A0m(r14, -1538095253);
            if (A0m3 == obj) {
                A0m3 = new MMQ(r7, 45);
                r14.FLL(A0m3);
            }
            C62320sa A0y = C51965G9l.A0y(A0H, A0m3, false);
            int i4 = i2 & 112;
            boolean A1Q = C51973G9u.A1Q(r14, -1538093229, i2) | C51972G9s.A1J(i4) | C51973G9u.A1I(i2);
            Object ECw = r14.ECw();
            if (A1Q || ECw == obj) {
                ECw = new C51803G2m((Object) r6, str3, str4, 31);
                r14.FLL(ECw);
            }
            C62320sa A0y2 = C51965G9l.A0y(A0H, ECw, false);
            Object A0m4 = C51967G9n.A0m(r14, -1538090958);
            if (A0m4 == obj) {
                A0m4 = new MP4(A0J, 3);
                r14.FLL(A0m4);
            }
            A04(r14, str3, A0y, A0y2, C51965G9l.A0z(A0H, A0m4), ((i2 >> 3) & 14) | 24960, A1W);
            if (C51971G9r.A1W(A0J)) {
                Object A0m5 = C51967G9n.A0m(r14, -1538086445);
                if (A0m5 == obj) {
                    A0m5 = new MMQ(A0J, 46);
                    r14.FLL(A0m5);
                }
                C62320sa A0y3 = C51965G9l.A0y(A0H, A0m5, false);
                r14.ExS(-1538084248);
                boolean A1S = AnonymousClass7TF.A1S(i2 & 57344, Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) | AnonymousClass7TF.A1S(i4, 32);
                Object ECw2 = r14.ECw();
                if (A1S || ECw2 == obj) {
                    ECw2 = C51970G9q.A0y(r14, r8, str3, 27);
                }
                A05(r14, A0y3, C51965G9l.A0y(A0H, ECw2, false), 6);
            }
            if (0fL.A02()) {
                0fL.A00(-1751577617);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J87(r12, str3, str4, r8, r6, i3);
        }
    }

    public static final void A02(C286575Wy r18, C53294Glg glg, 0sP r20, 0sP r21, 0sL r22, int i) {
        int i2;
        C286575Wy r4 = r18;
        r4.ExV(-1412062530);
        int i3 = i;
        C53294Glg glg2 = glg;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r4, glg2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r4, r20);
        }
        0sL r182 = r22;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r4, r182);
        }
        0sP r19 = r21;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r4, r19);
        }
        if ((i2 & 1171) != 1170 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1041831669, "com.instagram.creation.drafts.ui.DraftListItem (DraftList.kt:69)");
            }
            C285245Qk r10 = Modifier.A00;
            Modifier A08 = C287195Zj.A08(C51966G9m.A0T(r10), 4.0f);
            boolean A1U = C51966G9m.A1U(r4, glg2, C51973G9u.A1Q(r4, -1195400886, i2));
            Object ECw = r4.ECw();
            if (A1U || ECw == AnonymousClass5XT.A00) {
                ECw = new C66291MMa(42, r19, glg2);
                r4.FLL(ECw);
            }
            C286565Wx A0H = C51965G9l.A0H(r4, false);
            Modifier A06 = C287635aW.A06(A08, (C62320sa) ECw);
            AnonymousClass5RD A0V = C51968G9o.A0V(r4);
            int A00 = C287425a7.A00(r4);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r4, A06);
            C62320sa r15 = C287485aD.A00;
            C51973G9u.A0z(r4, A0H, r15);
            0sL r14 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r4, A0V, A04, r14);
            0sL r13 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r4, A00)) {
                C51971G9r.A13(r4, r13, A00);
            }
            0sL A1K = C51966G9m.A1K(r4, A01);
            AnonymousClass6FX r7 = AnonymousClass6FX.A00;
            A03(r4, glg2.A00, glg2.A03, 0, glg2.A06);
            Modifier A002 = r7.A00(r7.AB1(C287215Zl.A04, C287195Zj.A05(r10)));
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r4, 0);
            int A003 = C287425a7.A00(r4);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r4, A002);
            C51973G9u.A0z(r4, A0H, r15);
            C287595aO.A00(r4, A0Z, r14);
            if (C51965G9l.A1Y(r4, A0H, A042, A0w) || !C51972G9s.A1Q(r4, A003)) {
                C51971G9r.A13(r4, r13, A003);
            }
            C287595aO.A00(r4, A012, A1K);
            r4.ExS(-246400113);
            String str = glg2.A05;
            if (str.length() > 0) {
                A07(str, r4, 0);
            }
            C286565Wx.A0L(A0H, false);
            r4.ExS(-246396347);
            String str2 = glg2.A04;
            if (str2.length() > 0) {
                C289585dr.A00(r4, C287195Zj.A0B(r10, 0.0f, 0.0f, 0.0f, 6.0f));
                A06(str2, r4, 0);
            }
            C286565Wx.A0L(A0H, false);
            r4.ExS(-246389917);
            String str3 = glg2.A01;
            if (str3.length() > 0) {
                C289585dr.A00(r4, C287195Zj.A0B(r10, 0.0f, 0.0f, 0.0f, 6.0f));
                A06(str3, r4, 0);
            }
            C286565Wx.A0L(A0H, false);
            r4.ASN();
            C286575Wy r8 = r4;
            A00(r7, r8, glg2.A02, str, r20, r182, ((i2 << 3) & 7168) | 6 | ((i2 << 9) & 57344));
            if (C51967G9n.A1R(r4)) {
                0fL.A00(-1038921551);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG7(glg2, r182, r19, r20, i3, 7);
        }
    }

    public static final void A03(C286575Wy r16, C54649HMg hMg, String str, int i, boolean z) {
        int i2;
        int i3;
        C286575Wy r14 = r16;
        r14.ExV(-1874956125);
        int i4 = i;
        String str2 = str;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r14, str2) | i;
        } else {
            i2 = i4;
        }
        C54649HMg hMg2 = hMg;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r14, hMg2);
        }
        boolean z2 = z;
        if ((i4 & 384) == 0) {
            i2 |= G9t.A0a(r14, z2);
        }
        if ((i2 & 147) != 146 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(916814903, "com.instagram.creation.drafts.ui.DraftListItemPreviewThumbnail (DraftList.kt:112)");
            }
            C285245Qk r10 = Modifier.A00;
            Modifier A0C = C287205Zk.A0C(C51969G9p.A0X(r10, 4.0f, C51966G9m.A0C(r14)), 80.0f);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A00 = C287425a7.A00(r14);
            C286565Wx r7 = (C286565Wx) r14;
            AnonymousClass5RM A04 = C286565Wx.A04(r7);
            Modifier A01 = C287435a8.A01(r14, A0C);
            C51973G9u.A0y(r14, r7);
            C51971G9r.A12(r14, A0a, A04);
            0sL r1 = C287485aD.A02;
            if (r7.A0K || !C51972G9s.A1Q(r14, A00)) {
                C51971G9r.A13(r14, r1, A00);
            }
            C51965G9l.A18(r14, A01);
            C289515dj r9 = C289515dj.A00;
            r14.ExS(-103712507);
            if (str != null) {
                boolean A1N = C51973G9u.A1N(r14, -103710614, i2);
                Object ECw = r14.ECw();
                if (A1N || ECw == AnonymousClass5XT.A00) {
                    Bitmap decodeFile = BitmapFactory.decodeFile(str2);
                    0qQ.A07(decodeFile);
                    ECw = new C3018360g(decodeFile);
                    r14.FLL(ECw);
                }
                C3018260f r13 = (C3018260f) ECw;
                C286565Wx.A0L(r7, false);
                AnonymousClass6GC r11 = new AnonymousClass6GC(r13, C51975G9x.A08(((C3018360g) r13).A00));
                r11.A00 = 1;
                AnonymousClass6G3.A08(r14, C51968G9o.A0P(r10, 4.0f), r11, C288075bK.A00);
            }
            C286565Wx.A0L(r7, false);
            r14.ExS(-103697173);
            if (z || hMg2 == C54649HMg.CAROUSEL || hMg2 == C54649HMg.VIDEO) {
                Modifier A0B = C287195Zj.A0B(r9.AAz(C287215Zl.A0D, C287205Zk.A0C(r10, 20.0f)), 0.0f, 4.0f, 4.0f, 0.0f);
                if (z) {
                    i3 = R.drawable.instagram_shopping_bag_pano_filled_24;
                } else {
                    i3 = hMg2.A00;
                }
                C288165bT.A00(r14, A0B, C287975bA.A00(r14, i3, 0), 0, 18, AnonymousClass5aQ.A00(r14).A0U);
            }
            if (C51971G9r.A1S(r14, r7, false)) {
                0fL.A00(-133149311);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59140J7w(hMg2, str2, i4, 1, z2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: X.PqV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: X.PqV} */
    /* JADX WARNING: type inference failed for: r0v15 */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a7, code lost:
        if (r0 == X.AnonymousClass5XT.A00) goto L_0x00a9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C286575Wy r19, java.lang.String r20, X.C62320sa r21, X.C62320sa r22, X.0sP r23, int r24, boolean r25) {
        /*
            r0 = -1903851590(0xffffffff8e8587ba, float:-3.291773E-30)
            r14 = r19
            r14.ExV(r0)
            r2 = r24
            r0 = r24 & 6
            r9 = 4
            r6 = r20
            if (r0 != 0) goto L_0x00e9
            int r8 = X.G9t.A0O(r14, r6)
            r8 = r8 | r24
        L_0x0017:
            r0 = r24 & 48
            r1 = r25
            if (r0 != 0) goto L_0x0022
            int r0 = X.G9t.A0Z(r14, r1)
            r8 = r8 | r0
        L_0x0022:
            r0 = r2 & 384(0x180, float:5.38E-43)
            r11 = 256(0x100, float:3.59E-43)
            r5 = r21
            if (r0 != 0) goto L_0x002f
            int r0 = X.G9t.A0G(r14, r5)
            r8 = r8 | r0
        L_0x002f:
            r0 = r2 & 3072(0xc00, float:4.305E-42)
            r10 = 2048(0x800, float:2.87E-42)
            r4 = r22
            if (r0 != 0) goto L_0x003c
            int r0 = X.G9t.A0H(r14, r4)
            r8 = r8 | r0
        L_0x003c:
            r0 = r2 & 24576(0x6000, float:3.4438E-41)
            r12 = 16384(0x4000, float:2.2959E-41)
            r3 = r23
            if (r0 != 0) goto L_0x0049
            int r0 = X.G9t.A0I(r14, r3)
            r8 = r8 | r0
        L_0x0049:
            r7 = r8 & 9363(0x2493, float:1.312E-41)
            r0 = 9362(0x2492, float:1.3119E-41)
            if (r7 != r0) goto L_0x006e
            boolean r0 = r14.Bwn()
            if (r0 == 0) goto L_0x006e
            r14.Evl()
        L_0x0058:
            X.5Xd r7 = r14.ASQ()
            if (r7 == 0) goto L_0x006d
            r14 = 1
            X.J9O r0 = new X.J9O
            r8 = r0
            r9 = r4
            r10 = r3
            r11 = r5
            r12 = r6
            r13 = r2
            r15 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r7.A06 = r0
        L_0x006d:
            return
        L_0x006e:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x007c
            r7 = -78964114(0xfffffffffb4b1a6e, float:-1.0545723E36)
            java.lang.String r0 = "com.instagram.creation.drafts.ui.DraftItemOverflowMenu (DraftList.kt:202)"
            X.0fL.A01(r7, r0)
        L_0x007c:
            r13 = 0
            r0 = -1541130034(0xffffffffa42438ce, float:-3.5609947E-17)
            r14.ExS(r0)
            r7 = r8 & 896(0x380, float:1.256E-42)
            boolean r11 = X.AnonymousClass7TF.A1S(r7, r11)
            r0 = 57344(0xe000, float:8.0356E-41)
            boolean r0 = X.C51972G9s.A1P(r8, r0, r12)
            r11 = r11 | r0
            r0 = r8 & 14
            boolean r9 = X.AnonymousClass7TF.A1S(r0, r9)
            r9 = r9 | r11
            r0 = r8 & 7168(0x1c00, float:1.0045E-41)
            boolean r0 = X.AnonymousClass7TF.A1S(r0, r10)
            r9 = r9 | r0
            java.lang.Object r0 = r14.ECw()
            if (r9 != 0) goto L_0x00a9
            java.lang.Object r9 = X.AnonymousClass5XT.A00
            if (r0 != r9) goto L_0x00bc
        L_0x00a9:
            r20 = 31
            X.PqV r0 = new X.PqV
            r15 = r0
            r16 = r5
            r17 = r4
            r18 = r3
            r19 = r6
            r15.<init>((java.lang.Object) r16, (java.lang.Object) r17, (java.lang.Object) r18, (java.lang.String) r19, (int) r20)
            r14.FLL(r0)
        L_0x00bc:
            X.0sP r0 = (X.0sP) r0
            boolean r25 = X.C51968G9o.A1Y(r14)
            r22 = 0
            X.JF6 r19 = X.JF6.A00
            int r8 = r8 << 6
            r8 = r8 & 7168(0x1c00, float:1.0045E-41)
            r7 = r7 | r8
            r21 = 241(0xf1, float:3.38E-43)
            r15 = r13
            r16 = r13
            r24 = r1
            r18 = r0
            r20 = r7
            r17 = r5
            X.C56261HvV.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0058
            r0 = -1373631512(0xffffffffae200be8, float:-3.6390363E-11)
            X.0fL.A00(r0)
            goto L_0x0058
        L_0x00e9:
            r8 = r2
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56667I6w.A04(X.5Wy, java.lang.String, X.0sa, X.0sa, X.0sP, int, boolean):void");
    }

    public static final void A05(C286575Wy r10, C62320sa r11, C62320sa r12, int i) {
        int i2;
        C286575Wy r4 = r10;
        r10.ExV(-1411536275);
        C62320sa r9 = r11;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r10, r11) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r10, r12);
        }
        if ((i2 & 19) != 18 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-9573324, "com.instagram.creation.drafts.ui.DraftDeleteConfirmDialog (DraftList.kt:234)");
            }
            C56632I5m.A03(r4, new C53398GnV(AnonymousClass05K.A0C, C288035bG.A00(r10, 2131957531), r12, 12), HXM.A00(r10, (Integer) null, (C62320sa) null, 2131954722, 30), C51975G9x.A0B(r10).getQuantityString(R.plurals.story_drafts_confirmation_title, 1), (String) null, r9, i2 & 14, 4068);
            if (0fL.A02()) {
                0fL.A00(1312331002);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JGL(r9, r12, i, 38);
        }
    }

    public static final void A06(String str, C286575Wy r8, int i) {
        int i2;
        C286575Wy r3 = r8;
        r8.ExV(-1698197052);
        String str2 = str;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r8, str) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1324464900, "com.instagram.creation.drafts.ui.DraftListItemSubtitle (DraftList.kt:157)");
            }
            AnonymousClass5ZZ.A0n(r3, C51966G9m.A0b(r8), str2, i2 & 14, C51966G9m.A0M(r8));
            if (0fL.A02()) {
                0fL.A00(214630447);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            JGG.A01(ASQ, str2, i, 4);
        }
    }

    public static final void A07(String str, C286575Wy r8, int i) {
        int i2;
        C286575Wy r3 = r8;
        r8.ExV(1735081356);
        String str2 = str;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r8, str) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(612837055, "com.instagram.creation.drafts.ui.DraftListItemTitle (DraftList.kt:148)");
            }
            AnonymousClass5ZZ.A0n(r3, C51966G9m.A0c(r8), str2, i2 & 14, C51966G9m.A0H(r8));
            if (0fL.A02()) {
                0fL.A00(385723569);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            JGG.A01(ASQ, str2, i, 5);
        }
    }
}
