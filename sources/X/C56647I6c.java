package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.List;

/* renamed from: X.I6c  reason: case insensitive filesystem */
public abstract class C56647I6c {
    public static final void A05(C286575Wy r16, C62320sa r17, int i, boolean z) {
        int i2;
        C286625Xd ASQ;
        int i3 = 1;
        C62320sa r3 = r17;
        0qQ.A0B(r3, 1);
        C286575Wy r4 = r16;
        r4.ExV(1723265713);
        int i4 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0Y(r4, z) | i;
        } else {
            i2 = i4;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r4, r3);
        }
        if ((i2 & 19) != 18 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(304792522, "com.instagram.aistudio.home.view.CreateAiRow (AiSearchFragment.kt:398)");
            }
            r4.ExS(2076646915);
            if (!z) {
                C285245Qk r5 = Modifier.A00;
                AnonymousClass5RD A0a = C51966G9m.A0a(false);
                int A00 = C287425a7.A00(r4);
                C286565Wx r6 = (C286565Wx) r4;
                AnonymousClass5RM A04 = C286565Wx.A04(r6);
                Modifier A01 = C287435a8.A01(r4, r5);
                C51973G9u.A0y(r4, r6);
                C51971G9r.A12(r4, A0a, A04);
                0sL r1 = C287485aD.A02;
                if (r6.A0K || !C51972G9s.A1Q(r4, A00)) {
                    C51971G9r.A13(r4, r1, A00);
                }
                C51965G9l.A18(r4, A01);
                r4.ASN();
                if (C51967G9n.A1b(r6, false)) {
                    0fL.A00(1957348719);
                }
                ASQ = r4.ASQ();
                if (ASQ == null) {
                    return;
                }
                JGI.A01(ASQ, r3, i4, i3, z);
            }
            C286565Wx A0H = C51965G9l.A0H(r4, false);
            C287245Zp r62 = C287215Zl.A04;
            C285245Qk r8 = Modifier.A00;
            Modifier A08 = C287195Zj.A08(C51966G9m.A0T(r8), 4.0f);
            boolean A1Y = C51974G9v.A1Y(r4, 2076653767, i2);
            Object ECw = r4.ECw();
            if (A1Y || ECw == AnonymousClass5XT.A00) {
                ECw = new MM7(r3, 34);
                r4.FLL(ECw);
            }
            Modifier A05 = C287635aW.A05(A08, (C287625aV) null, (String) null, C51965G9l.A0y(A0H, ECw, false), true);
            AnonymousClass5RD A02 = C287395a4.A02(C287275Zs.A01, r4, r62, 48);
            int A002 = C287425a7.A00(r4);
            AnonymousClass5RM A042 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r4, A05);
            C62320sa r12 = C287485aD.A00;
            C51973G9u.A0z(r4, A0H, r12);
            0sL r11 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r4, A02, A042, r11);
            0sL r63 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r4, A002)) {
                C51971G9r.A13(r4, r63, A002);
            }
            0sL A1K = C51966G9m.A1K(r4, A012);
            AnonymousClass6FX r162 = AnonymousClass6FX.A00;
            Modifier A07 = C287195Zj.A07(r8, 4.0f);
            Alignment alignment = C287215Zl.A0E;
            AnonymousClass5RD A003 = C287675aa.A00(alignment, false);
            int A004 = C287425a7.A00(r4);
            AnonymousClass5RM A043 = C286565Wx.A04(A0H);
            Modifier A013 = C287435a8.A01(r4, A07);
            C51973G9u.A0z(r4, A0H, r12);
            C287595aO.A00(r4, A003, r11);
            if (C51965G9l.A1Y(r4, A0H, A043, A0w) || !C51972G9s.A1Q(r4, A004)) {
                C51971G9r.A13(r4, r63, A004);
            }
            C287595aO.A00(r4, A013, A1K);
            Modifier A0X = C51966G9m.A0X(C51971G9r.A0Q(r8, 56.0f), C51965G9l.A0A(r4));
            AnonymousClass5RD A005 = C287675aa.A00(alignment, false);
            int A006 = C287425a7.A00(r4);
            AnonymousClass5RM A044 = C286565Wx.A04(A0H);
            Modifier A014 = C287435a8.A01(r4, A0X);
            C51973G9u.A0z(r4, A0H, r12);
            C287595aO.A00(r4, A005, r11);
            if (C51965G9l.A1Y(r4, A0H, A044, A0w) || !C51972G9s.A1Q(r4, A006)) {
                C51971G9r.A13(r4, r63, A006);
            }
            C287595aO.A00(r4, A014, A1K);
            C289515dj r13 = C289515dj.A00;
            C288165bT.A05(r4, C51965G9l.A0L(r13, r8), C287975bA.A00(r4, R.drawable.instagram_add_pano_outline_24, 0), C51966G9m.A0G(r4));
            r4.ASN();
            r4.ASN();
            Modifier A045 = C287195Zj.A04(r162.A00(r8));
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r4, 0);
            int A007 = C287425a7.A00(r4);
            AnonymousClass5RM A046 = C286565Wx.A04(A0H);
            Modifier A015 = C287435a8.A01(r4, A045);
            C51973G9u.A0z(r4, A0H, r12);
            C287595aO.A00(r4, A0Z, r11);
            if (C51965G9l.A1Y(r4, A0H, A046, A0w) || !C51972G9s.A1Q(r4, A007)) {
                C51971G9r.A13(r4, r63, A007);
            }
            C287595aO.A00(r4, A015, A1K);
            AnonymousClass5ZZ.A0h(r4, C51966G9m.A0h(r4), C288035bG.A00(r4, 2131952639));
            AnonymousClass5ZZ.A0r(r4, C51966G9m.A0c(r4), C288035bG.A00(r4, 2131952638), C51966G9m.A0M(r4));
            r4.ASN();
            C288165bT.A00(r4, (Modifier) null, C287975bA.A00(r4, R.drawable.instagram_chevron_right_pano_outline_12, 0), 48, 28, 0);
            if (C51967G9n.A1R(r4)) {
                0fL.A00(1224394674);
            }
        } else {
            r4.Evl();
        }
        ASQ = r4.ASQ();
        if (ASQ != null) {
            i3 = 2;
            JGI.A01(ASQ, r3, i4, i3, z);
        }
    }

    public static final void A00(C286575Wy r18, int i) {
        C286575Wy r14 = r18;
        r14.ExV(-1443878421);
        if (i != 0 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1444305512, "com.instagram.aistudio.home.view.SearchResultShimmer (AiSearchFragment.kt:338)");
            }
            C285245Qk r13 = Modifier.A00;
            Modifier A09 = C287195Zj.A09(C51966G9m.A0T(r13), 16.0f, 0.0f);
            C287325Zx r11 = C287275Zs.A07;
            C287265Zr r10 = C287215Zl.A02;
            AnonymousClass5RD A02 = C291495hO.A02(r11, r14, r10, 0);
            int A00 = C287425a7.A00(r14);
            C286565Wx r8 = (C286565Wx) r14;
            AnonymousClass5RM A04 = C286565Wx.A04(r8);
            Modifier A01 = C287435a8.A01(r14, A09);
            C62320sa r7 = C287485aD.A00;
            C51973G9u.A0z(r14, r8, r7);
            0sL r6 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r14, A02, A04, r6);
            0sL r4 = C287485aD.A02;
            if (r8.A0K || !C51972G9s.A1Q(r14, A00)) {
                C51971G9r.A13(r14, r4, A00);
            }
            0sL A1K = C51966G9m.A1K(r14, A01);
            r14.ExS(1528587604);
            int i2 = 0;
            do {
                Modifier A0B = C287195Zj.A0B(r13, 0.0f, 0.0f, 0.0f, 16.0f);
                AnonymousClass5RD A0W = C51968G9o.A0W(r14);
                int A002 = C287425a7.A00(r14);
                AnonymousClass5RM A042 = C286565Wx.A04(r8);
                Modifier A012 = C287435a8.A01(r14, A0B);
                C51973G9u.A0z(r14, r8, r7);
                C287595aO.A00(r14, A0W, r6);
                if (C51965G9l.A1Y(r14, r8, A042, A0w) || !C51972G9s.A1Q(r14, A002)) {
                    C51971G9r.A13(r14, r4, A002);
                }
                C287595aO.A00(r14, A012, A1K);
                AnonymousClass6FX r15 = AnonymousClass6FX.A00;
                C56666I6v.A07(r14, C287205Zk.A0C(r13, 56.0f), AnonymousClass5ZN.A00);
                Modifier A0B2 = C287195Zj.A0B(r15.A00(r13), 12.0f, 0.0f, 0.0f, 0.0f);
                AnonymousClass5RD A022 = C291495hO.A02(r11, r14, r10, 0);
                int A003 = C287425a7.A00(r14);
                AnonymousClass5RM A043 = C286565Wx.A04(r8);
                Modifier A013 = C287435a8.A01(r14, A0B2);
                C51973G9u.A0z(r14, r8, r7);
                C287595aO.A00(r14, A022, r6);
                if (C51965G9l.A1Y(r14, r8, A043, A0w) || !C51972G9s.A1Q(r14, A003)) {
                    C51971G9r.A13(r14, r4, A003);
                }
                C287595aO.A00(r14, A013, A1K);
                C56666I6v.A05(r14, C287205Zk.A07(C51968G9o.A0P(C287195Zj.A0B(C287205Zk.A08(r13, 18.0f), 0.0f, 0.0f, 0.0f, 8.0f), 8.0f), 0.3f));
                C56666I6v.A07(r14, C287205Zk.A07(C287205Zk.A08(r13, 14.0f), 0.5f), AnonymousClass5ZN.A01(8.0f));
                r14.ASN();
                r14.ASN();
                i2++;
            } while (i2 < 3);
            if (C51971G9r.A1S(r14, r8, false)) {
                0fL.A00(1521153811);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            JG9.A01(ASQ, i, 7);
        }
    }

    public static final void A01(C286575Wy r13, Modifier modifier, LRW lrw, String str, 0sP r17, 0sP r18, int i) {
        int i2;
        r13.ExV(642250153);
        int i3 = i;
        Modifier modifier2 = modifier;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r13, modifier) | i;
        } else {
            i2 = i3;
        }
        String str2 = str;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r13, str2);
        }
        0sP r8 = r17;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r13, r8);
        }
        0sP r9 = r18;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r13, r9);
        }
        LRW lrw2 = lrw;
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r13, lrw);
        }
        if ((i2 & 9363) != 9362 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(45080485, "com.instagram.aistudio.home.view.AiHomeSearchBarSection (AiSearchFragment.kt:312)");
            }
            C56203HuW.A01(r13, lrw, "search", ((i2 >> 12) & 14) | 48);
            r13.ExS(-997521226);
            boolean z = true;
            boolean A1S = AnonymousClass7TF.A1S(i2 & 112, 32) | AnonymousClass7TF.A1S(i2 & 896, 256);
            if ((i2 & 7168) != 2048) {
                z = false;
            }
            boolean z2 = A1S | z;
            Object ECw = r13.ECw();
            if (z2 || ECw == AnonymousClass5XT.A00) {
                ECw = C51970G9q.A0z(r13, r9, r8, str2, 6);
            }
            I63.A02(r13, modifier, (0sP) ECw, C58934Izx.A00, ((i2 << 3) & 112) | 384, C51968G9o.A1Y(r13) ? 1 : 0);
            if (0fL.A02()) {
                0fL.A00(1864668815);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9P(modifier2, r8, r9, lrw2, str2, i3, 0);
        }
    }

    public static final void A02(C286575Wy r15, C61040Jve jve, LRW lrw, String str, C62320sa r19, C62320sa r20, 0sP r21, 0sP r22, 0sL r23, int i) {
        int i2;
        C286575Wy r1 = r15;
        r15.ExV(-1654941014);
        int i3 = i;
        C61040Jve jve2 = jve;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r15, jve2) | i;
        } else {
            i2 = i3;
        }
        String str2 = str;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r15, str2);
        }
        LRW lrw2 = lrw;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r15, lrw2);
        }
        0sP r8 = r21;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r15, r8);
        }
        0sP r9 = r22;
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r15, r9);
        }
        C62320sa r10 = r19;
        if ((196608 & i) == 0) {
            i2 |= G9t.A0J(r15, r10);
        }
        0sL r11 = r23;
        if ((1572864 & i) == 0) {
            i2 |= G9t.A0K(r15, r11);
        }
        C62320sa r12 = r20;
        if ((i & 12582912) == 0) {
            i2 |= G9t.A0L(r15, r12);
        }
        if ((i2 & 4793491) != 4793490 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1345944317, "com.instagram.aistudio.home.view.SearchLayout (AiSearchFragment.kt:191)");
            }
            r15.ExS(1472860245);
            boolean z = true;
            boolean A1T = C51968G9o.A1T(r15, jve2, C51968G9o.A1T(r15, lrw2, AnonymousClass7TF.A1S(i2 & 112, 32) | AnonymousClass7TF.A1S(i2 & 7168, C249703kE.FLAG_MOVED), C51974G9v.A1W(i2)), C51974G9v.A1T(i2)) | C51974G9v.A1V(i2);
            if ((i2 & 3670016) != 1048576) {
                z = false;
            }
            boolean z2 = A1T | z;
            Object ECw = r15.ECw();
            if (z2 || ECw == AnonymousClass5XT.A00) {
                ECw = new C58816Iy1(jve, lrw, r10, r12, r8, r9, r11, str2, 0);
                r1.FLL(ECw);
            }
            C51968G9o.A1N(r1);
            AnonymousClass6HY.A08(r1, (0sP) ECw);
            if (0fL.A02()) {
                0fL.A00(534391795);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r1.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JBI(jve2, lrw2, r8, r9, r10, r11, r12, str2, i3, 0);
        }
    }

    public static final void A03(C286575Wy r17, C61040Jve jve, C62320sa r19, int i) {
        int i2;
        C286575Wy r11 = r17;
        r11.ExV(-1246989234);
        int i3 = i;
        C61040Jve jve2 = jve;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r11, jve2) | i;
        } else {
            i2 = i3;
        }
        C62320sa r7 = r19;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r11, r7);
        }
        if ((i2 & 19) != 18 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-796772792, "com.instagram.aistudio.home.view.MaybeShowSearchNoResults (AiSearchFragment.kt:270)");
            }
            if (((List) jve2.A01).isEmpty()) {
                C285245Qk r1 = Modifier.A00;
                Modifier A07 = C287195Zj.A07(C51966G9m.A0T(r1), 24.0f);
                AnonymousClass5RD A0Z = C51970G9q.A0Z(r11, C287215Zl.A00);
                int A00 = C287425a7.A00(r11);
                C286565Wx r4 = (C286565Wx) r11;
                AnonymousClass5RM A04 = C286565Wx.A04(r4);
                Modifier A01 = C287435a8.A01(r11, A07);
                C51973G9u.A0y(r11, r4);
                C51971G9r.A12(r11, A0Z, A04);
                0sL r3 = C287485aD.A02;
                if (r4.A0K || !C51972G9s.A1Q(r11, A00)) {
                    C51971G9r.A13(r11, r3, A00);
                }
                C51965G9l.A18(r11, A01);
                AnonymousClass6G3.A00(r11, (Alignment) null, C287205Zk.A0C(C287195Zj.A07(r1, 16.0f), 100.0f), (C288195bW) null, C287975bA.A00(r11, R.drawable.ig_illustrations_illo_search_no_results_refresh, 0), C288075bK.A03, (String) null, 0.0f, 25008, 104);
                String A002 = C288035bG.A00(r11, 2131952642);
                long A0H = C51966G9m.A0H(r11);
                AnonymousClass5ZZ.A0W(r11, C287195Zj.A07(r1, 16.0f), C51966G9m.A0e(r11), A002, A0H);
                boolean z = jve2.A06;
                int i4 = 2131952641;
                if (z) {
                    i4 = 2131952640;
                }
                String A003 = C288035bG.A00(r11, i4);
                long A0M = C51966G9m.A0M(r11);
                AnonymousClass5ZZ.A0W(r11, C287195Zj.A07(r1, 16.0f), C51966G9m.A0c(r11), A003, A0M);
                r11.ExS(-445331021);
                if (z) {
                    AnonymousClass6CE.A05(r11, C287195Zj.A0B(r1, 0.0f, 16.0f, 0.0f, 0.0f), AnonymousClass6CA.A00.A03(r11, 3, false, false), C288035bG.A00(r11, 2131952639), r7, ((i2 >> 3) & 14) | 1573248);
                }
                C286565Wx.A0L(r4, false);
                r11.ASN();
            }
            if (0fL.A02()) {
                0fL.A00(-1493397660);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            JGL.A01(ASQ, jve2, r7, i3, 14);
        }
    }

    public static final void A04(C286575Wy r25, C60973JuV juV, LRW lrw, 0sL r28, int i, int i2) {
        int i3;
        C286565Wx r1;
        boolean z;
        String A14;
        C286575Wy r15 = r25;
        r15.ExV(-1912878279);
        int i4 = i2;
        C60973JuV juV2 = juV;
        if ((i2 & 6) == 0) {
            i3 = C41848B3p.A01(r15, juV2) | i2;
        } else {
            i3 = i4;
        }
        int i5 = i;
        if ((i2 & 48) == 0) {
            i3 |= G9t.A06(r15, i5);
        }
        LRW lrw2 = lrw;
        if ((i4 & 384) == 0) {
            i3 |= G9t.A0G(r15, lrw2);
        }
        0sL r8 = r28;
        if ((i4 & 3072) == 0) {
            i3 |= G9t.A0H(r15, r8);
        }
        if ((i3 & 1171) != 1170 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-251482599, "com.instagram.aistudio.home.view.SearchResult (AiSearchFragment.kt:372)");
            }
            int i6 = i3 & 112;
            C56203HuW.A00(r15, juV2, lrw2, i5, ((i3 >> 6) & 14) | i6 | ((i3 << 6) & 896));
            if (182.A06(0Tu.A05, C51969G9p.A0j(r15), 36325145469006478L)) {
                r15.ExS(-2024432006);
                AnonymousClass2DN A00 = 1zC.A00(r15, new SimpleImageUrl(DbS.A0V(juV2.A05)));
                boolean z2 = true;
                Modifier A0F = C51967G9n.A0F(Modifier.A00, 6.0f);
                String str = juV2.A06;
                String str2 = juV2.A09;
                boolean z3 = juV2.A0A;
                String str3 = juV2.A02;
                r15.ExS(-1866409282);
                if (str3 == null) {
                    A14 = null;
                } else {
                    A14 = C51968G9o.A14(r15, str3, 2131952615);
                }
                r1 = (C286565Wx) r15;
                z = false;
                C286565Wx.A0L(r1, false);
                boolean A1a = C51974G9v.A1a(r15, -1866406871, i3);
                if (i6 != 32) {
                    z2 = false;
                }
                boolean A1T = C51968G9o.A1T(r15, juV2, A1a, z2);
                Object ECw = r15.ECw();
                if (A1T || ECw == AnonymousClass5XT.A00) {
                    ECw = GL8.A00(r15, juV2, r8, i5, 8);
                }
                HT8.A00(r15, A0F, A00, (C288095bM) null, str, str2, A14, C51965G9l.A0y(r1, ECw, false), (0sK) null, 48, 272, z3);
            } else {
                r15.ExS(-2023980584);
                String str4 = null;
                AnonymousClass2DN A002 = 1zC.A00(r15, DbS.A0V(juV2.A05));
                C288095bM r21 = C288075bK.A03;
                String str5 = juV2.A06;
                String str6 = juV2.A08;
                boolean z4 = juV2.A0A;
                String str7 = juV2.A02;
                r15.ExS(-1866395842);
                if (str7 != null) {
                    str4 = C51968G9o.A14(r15, str7, 2131952615);
                }
                r1 = (C286565Wx) r15;
                z = false;
                C286565Wx.A0L(r1, false);
                boolean A1T2 = C51968G9o.A1T(r15, juV2, C51974G9v.A1a(r15, -1866393431, i3), C51972G9s.A1J(i6));
                Object ECw2 = r15.ECw();
                if (A1T2 || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = GL8.A00(r15, juV2, r8, i5, 9);
                }
                GS8.A04(r15, A002, r21, str5, str6, str4, C51965G9l.A0y(r1, ECw2, false), (0sK) null, 0, 6, 56012, z4);
            }
            if (C51967G9n.A1b(r1, z)) {
                0fL.A00(-2033201246);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r15.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i4, i5, 6, lrw2, juV2, r8);
        }
    }

    public static final void A06(C286575Wy r17, C62320sa r18, int i, boolean z) {
        int i2;
        C286575Wy r11 = r17;
        r11.ExV(-1014199899);
        int i3 = i;
        boolean z2 = z;
        if ((i & 6) == 0) {
            i2 = G9t.A0Y(r11, z2) | i;
        } else {
            i2 = i3;
        }
        C62320sa r7 = r18;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r11, r7);
        }
        if ((i2 & 19) != 18 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1857249852, "com.instagram.aistudio.home.view.SearchNullState (AiSearchFragment.kt:229)");
            }
            C285245Qk r1 = Modifier.A00;
            Modifier A07 = C287195Zj.A07(C51966G9m.A0T(r1), 24.0f);
            AnonymousClass5RD A0Z = C51970G9q.A0Z(r11, C287215Zl.A00);
            int A00 = C287425a7.A00(r11);
            C286565Wx r5 = (C286565Wx) r11;
            AnonymousClass5RM A04 = C286565Wx.A04(r5);
            Modifier A01 = C287435a8.A01(r11, A07);
            C51973G9u.A0y(r11, r5);
            C51971G9r.A12(r11, A0Z, A04);
            0sL r4 = C287485aD.A02;
            if (r5.A0K || !C51972G9s.A1Q(r11, A00)) {
                C51971G9r.A13(r11, r4, A00);
            }
            C51965G9l.A18(r11, A01);
            AnonymousClass6G3.A00(r11, (Alignment) null, C287205Zk.A0C(C287195Zj.A07(r1, 16.0f), 100.0f), (C288195bW) null, C287975bA.A00(r11, R.drawable.ig_illustrations_qp_search_refresh, 0), C288075bK.A03, (String) null, 0.0f, 25008, 104);
            int i4 = 2131952646;
            if (z2) {
                i4 = 2131952645;
            }
            String A002 = C288035bG.A00(r11, i4);
            long A0H = C51966G9m.A0H(r11);
            AnonymousClass5ZZ.A0S(r11, C287195Zj.A07(r1, 16.0f), C51966G9m.A0e(r11), A002, A0H);
            int i5 = 2131952644;
            if (z2) {
                i5 = 2131952643;
            }
            String A003 = C288035bG.A00(r11, i5);
            long A0M = C51966G9m.A0M(r11);
            AnonymousClass5ZZ.A0S(r11, C287195Zj.A07(r1, 16.0f), C51966G9m.A0c(r11), A003, A0M);
            r11.ExS(552010419);
            if (z2) {
                AnonymousClass6CE.A05(r11, C287195Zj.A0B(r1, 0.0f, 16.0f, 0.0f, 0.0f), AnonymousClass6CA.A00.A03(r11, 3, false, false), C288035bG.A00(r11, 2131952639), r7, ((i2 >> 3) & 14) | 1573248);
            }
            if (C51971G9r.A1S(r11, r5, false)) {
                0fL.A00(-1695353962);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            JGI.A01(ASQ, r7, i3, 3, z2);
        }
    }
}
