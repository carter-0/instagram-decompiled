package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

public abstract class I2G {
    public static final void A01(C286575Wy r45, C62320sa r46, AnonymousClass62P r47, int i, boolean z) {
        int i2;
        C286625Xd ASQ;
        C62320sa r44 = r46;
        AnonymousClass62P r43 = r47;
        int A02 = DbW.A02(0, r43, r44);
        C286575Wy r0 = r45;
        r0.ExV(1962495726);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r0, r43) | i;
        } else {
            i2 = i3;
        }
        boolean z2 = z;
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r0, z2);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r0, r44);
        }
        if ((i2 & 147) != 146 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1181963172, "com.instagram.aistudio.editor.AiNuxScreen (AiNuxScreen.kt:62)");
            }
            Object A0r = C51965G9l.A0r(r0);
            Object A16 = C51966G9m.A16(r0);
            if (r43.isEmpty()) {
                if (0fL.A02()) {
                    0fL.A00(-261241958);
                }
                ASQ = r0.ASQ();
                if (ASQ == null) {
                    return;
                }
                ASQ.A06 = new JG4(i3, A02, r44, r43, z2);
            }
            C285245Qk r12 = Modifier.A00;
            C287325Zx r6 = C287275Zs.A07;
            C287265Zr r7 = C287215Zl.A02;
            AnonymousClass5RD A022 = C291495hO.A02(r6, r0, r7, 0);
            int A00 = C287425a7.A00(r0);
            C286565Wx r1 = (C286565Wx) r0;
            AnonymousClass5RM A04 = C286565Wx.A04(r1);
            Modifier A01 = C287435a8.A01(r0, r12);
            C62320sa r13 = C287485aD.A00;
            C51973G9u.A0z(r0, r1, r13);
            0sL r11 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A022, A04, r11);
            0sL r9 = C287485aD.A02;
            if (r1.A0K || !C51972G9s.A1Q(r0, A00)) {
                C51971G9r.A13(r0, r9, A00);
            }
            0sL A1K = C51966G9m.A1K(r0, A01);
            Modifier A002 = C304676Et.A00.A00(I28.A02(r0, C51966G9m.A0U(r12)), true);
            AnonymousClass5RD A023 = C291495hO.A02(r6, r0, r7, 0);
            int A003 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(r1);
            Modifier A012 = C287435a8.A01(r0, A002);
            C51973G9u.A0z(r0, r1, r13);
            C287595aO.A00(r0, A023, r11);
            if (C51965G9l.A1Y(r0, r1, A042, A0w) || !C51972G9s.A1Q(r0, A003)) {
                C51971G9r.A13(r0, r9, A003);
            }
            C287595aO.A00(r0, A012, A1K);
            Modifier A0B = C287195Zj.A0B(r12, 32.0f, 20.0f, 32.0f, 24.0f);
            AnonymousClass5RD A024 = C291495hO.A02(r6, r0, C287215Zl.A00, 48);
            int A004 = C287425a7.A00(r0);
            AnonymousClass5RM A043 = C286565Wx.A04(r1);
            Modifier A013 = C287435a8.A01(r0, A0B);
            C51973G9u.A0z(r0, r1, r13);
            C287595aO.A00(r0, A024, r11);
            if (C51965G9l.A1Y(r0, r1, A043, A0w) || !C51972G9s.A1Q(r0, A004)) {
                C51971G9r.A13(r0, r9, A004);
            }
            C287595aO.A00(r0, A013, A1K);
            A02(r0, r43, 0, i2 & 14, A02);
            AnonymousClass5ZZ.A0S(r0, C51967G9n.A0D(r12, 20.0f), C51966G9m.A0c(r0), C288035bG.A00(r0, 2131952738), C51966G9m.A0M(r0));
            r0.ASN();
            boolean z3 = false;
            AnonymousClass2DO A005 = C287975bA.A00(r0, R.drawable.instagram_bulb_pano_outline_24, 0);
            int i4 = 2131952731;
            if (z) {
                i4 = 2131952729;
            }
            String A006 = C288035bG.A00(r0, i4);
            int i5 = 2131952730;
            if (z) {
                i5 = 2131952728;
            }
            C56649I6e.A04(r0, A005, A006, i5);
            C56649I6e.A04(r0, C287975bA.A00(r0, R.drawable.instagram_channels_social_pano_outline_24, 0), C288035bG.A00(r0, 2131952733), 2131952732);
            AnonymousClass2DO A007 = C287975bA.A00(r0, R.drawable.instagram_licensing_pano_outline_24, 0);
            String A008 = C288035bG.A00(r0, 2131952735);
            if (0fL.A02()) {
                0fL.A01(-618095796, "com.instagram.aistudio.editor.buildAnnotatedString (AiNuxScreen.kt:156)");
            }
            C303876Bd r72 = new C303876Bd(16);
            String A009 = C288035bG.A00(r0, 2131952726);
            String A14 = C51968G9o.A14(r0, A009, 2131952734);
            int length = A14.length();
            int A07 = 00l.A07(A14, A009, length - 1);
            int A05 = DbX.A05(A009) + A07;
            r72.A09(A14);
            r72.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, C51966G9m.A0c(r0).A02.A08, (C291795ht) null, 65531, 0, 0, 0), 0, length);
            r72.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C291795ht) null, 65534, C51966G9m.A0N(r0), 0, 0), A07, A05);
            C286025Tq A0K = C51967G9n.A0K(r72, "privacy_policies", "clickable link", A07, A05);
            if (0fL.A02()) {
                0fL.A00(-1344583201);
            }
            boolean A1S = C51973G9u.A1S(r0, A16, A0r, -874760132);
            Object ECw = r0.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = C59103J6l.A00(r0, A16, A0r, 16);
            }
            C56649I6e.A02(r0, A007, new C53507Gpd(A0K, A008, C51965G9l.A0z(r1, ECw)));
            r0.ASN();
            Object A0m = C51967G9n.A0m(r0, 721447608);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = G9t.A0o(r0, 0);
            }
            C284945Oz A0J = C51965G9l.A0J(r1, A0m, false);
            String A0010 = C288035bG.A00(r0, 2131952724);
            if (0fL.A02()) {
                0fL.A01(1148863478, "com.instagram.aistudio.editor.buildAnnotatedStringWithTwoLinks (AiNuxScreen.kt:188)");
            }
            C303876Bd r5 = new C303876Bd(16);
            String A0011 = C288035bG.A00(r0, 2131952727);
            String A0012 = C288035bG.A00(r0, 2131952725);
            String A014 = C288035bG.A01(r0, new Object[]{A0011, A0012}, 2131952737);
            int length2 = A014.length();
            int i6 = length2 - 1;
            int A072 = 00l.A07(A014, A0011, i6);
            int A052 = DbX.A05(A0011) + A072;
            int A073 = 00l.A07(A014, A0012, i6);
            int A053 = DbX.A05(A0012) + A073;
            r5.A09(A014);
            r5.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, C51966G9m.A0c(r0).A02.A08, (C291795ht) null, 65531, 0, 0, 0), 0, length2);
            r5.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C291795ht) null, 65534, C51966G9m.A0N(r0), 0, 0), A072, A052);
            r5.A0A("first clickable link", "first clickable link", A072, A052);
            r5.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C291795ht) null, 65534, C51966G9m.A0N(r0), 0, 0), A073, A053);
            r5.A0A("second clickable link", "second clickable link", A073, A053);
            C51967G9n.A15(A0J, A052);
            C286025Tq A025 = r5.A02();
            if (0fL.A02()) {
                0fL.A00(-202396986);
            }
            r0.ExS(721450292);
            if ((i2 & 896) == 256) {
                z3 = true;
            }
            Object ECw2 = r0.ECw();
            if (z3 || ECw2 == obj) {
                ECw2 = new MMA(r44, A02);
                r0.FLL(ECw2);
            }
            C62320sa A0y = C51965G9l.A0y(r1, ECw2, false);
            boolean A1S2 = C51973G9u.A1S(r0, A0r, A16, 721466230);
            Object ECw3 = r0.ECw();
            if (A1S2 || ECw3 == obj) {
                ECw3 = new C58751Iwy(46, A16, A0r, A0J);
                r0.FLL(ECw3);
            }
            I7L.A03(r0, (Modifier) null, A025, A0010, (String) null, A0y, (C62320sa) null, C51965G9l.A0z(r1, ECw3), 0, 3456, 17404, false, false, false, false, false, true, false, false);
            if (C51967G9n.A1R(r0)) {
                0fL.A00(-1633809710);
            }
        } else {
            r0.Evl();
        }
        ASQ = r0.ASQ();
        if (ASQ != null) {
            A02 = 3;
            ASQ.A06 = new JG4(i3, A02, r44, r43, z2);
        }
    }

    public static final void A00(C286575Wy r18, Modifier modifier, ImageUrl imageUrl, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        ImageUrl imageUrl2 = imageUrl;
        0qQ.A0B(imageUrl2, 1);
        C286575Wy r12 = r18;
        r12.ExV(1532860140);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r12, modifier2) | i;
        } else {
            i3 = i6;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r12, imageUrl2);
        }
        if ((i3 & 19) != 18 || !r12.Bwn()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1296228315, "com.instagram.aistudio.editor.BouncingImage (AiNuxScreen.kt:256)");
            }
            0lg A0j = C51969G9p.A0j(r12);
            float A00 = C51965G9l.A00(DbS.A0J(A0j, 0), A0j, 37168500952007124L);
            Object A0m = C51967G9n.A0m(r12, 36020695);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = C287705ad.A00(1.0f);
                r12.FLL(A0m);
            }
            AnonymousClass5b4 r6 = (AnonymousClass5b4) A0m;
            C286565Wx A0H = C51965G9l.A0H(r12, false);
            boolean A1S = C51966G9m.A1S(r12, A00, C51967G9n.A1Z(r12, r6, 36023030));
            Object ECw = r12.ECw();
            if (A1S || ECw == obj) {
                ECw = new C59714JUx(r6, (AnonymousClass4D7) null, A00, 1);
                r12.FLL(ECw);
            }
            C286645Xf.A04(r12, imageUrl2, C51965G9l.A10(A0H, ECw));
            AnonymousClass2DN A02 = 1zC.A02(r12, imageUrl2, (C62320sa) null, (C62320sa) null, (C62320sa) null, ((i3 >> 3) & 14) | 196608, 94, 0, true, false);
            Modifier A0C = C51976G9y.A0C(r12, modifier2, 188.0f);
            float A002 = C51975G9x.A00(r6);
            AnonymousClass6G3.A03(r12, HRI.A00(A0C, A002, A002), A02);
            if (0fL.A02()) {
                0fL.A00(2069358467);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = GSJ.A01(imageUrl2, modifier2, i4, i6, 6);
        }
    }

    public static final void A02(C286575Wy r18, AnonymousClass62P r19, int i, int i2, int i3) {
        int i4;
        ImageUrl imageUrl;
        String str;
        int i5 = i;
        AnonymousClass62P r3 = r19;
        0qQ.A0B(r3, 0);
        C286575Wy r9 = r18;
        r9.ExV(-632351433);
        int i6 = i3;
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = G9t.A0O(r9, r3) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= G9t.A06(r9, i5);
        }
        if ((i4 & 19) != 18 || !r9.Bwn()) {
            if (i7 != 0) {
                i5 = 3000;
            }
            if (0fL.A02()) {
                0fL.A01(1355568497, "com.instagram.aistudio.editor.ImageFlash (AiNuxScreen.kt:228)");
            }
            Object A0m = C51967G9n.A0m(r9, -766862483);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = G9t.A0o(r9, 0);
            }
            C284945Oz r6 = (C284945Oz) A0m;
            C286565Wx A0H = C51965G9l.A0H(r9, false);
            Integer valueOf = Integer.valueOf(C51971G9r.A0B(r6));
            r9.ExS(-766860276);
            boolean A1S = AnonymousClass7TF.A1S(i4 & 112, 32) | C51968G9o.A1Q(i4);
            Object ECw = r9.ECw();
            if (A1S || ECw == obj) {
                ECw = new JTZ(r6, r3, (AnonymousClass4D7) null, i5, 1);
                r9.FLL(ECw);
            }
            C51968G9o.A1E(r9, A0H, ECw, valueOf);
            HPC hpc = (HPC) r3.get(C51971G9r.A0B(r6));
            r9.ExS(-766855232);
            boolean z = hpc instanceof C54037GyM;
            if (z) {
                imageUrl = C51976G9y.A0G(r9);
            } else if (hpc instanceof C54036GyL) {
                imageUrl = ((C54036GyL) hpc).A00;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            C286565Wx.A0L(A0H, false);
            r9.ExS(-766847794);
            if (z) {
                str = C304346Dc.A00(r9, 2131952736);
            } else if (hpc instanceof C54036GyL) {
                str = ((C54036GyL) hpc).A01;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            C286565Wx.A0L(A0H, false);
            Alignment alignment = C287215Zl.A0C;
            C285245Qk r7 = Modifier.A00;
            AnonymousClass5RD A00 = C287675aa.A00(alignment, false);
            int A002 = C287425a7.A00(r9);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r9, r7);
            C51973G9u.A0y(r9, A0H);
            C51971G9r.A12(r9, A00, A04);
            0sL r5 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r9, A002)) {
                C51971G9r.A13(r9, r5, A002);
            }
            C51965G9l.A18(r9, A01);
            A00(r9, C51967G9n.A0D(r7, 18.0f), imageUrl, 6, 0);
            HT0.A00(r9, (AnonymousClass5Z4) null, str, 0, 0, 26, C51966G9m.A08(r9), false);
            if (C51967G9n.A1R(r9)) {
                0fL.A00(1585268596);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59130J7m(r3, i6, i5, i2, 0);
        }
    }
}
