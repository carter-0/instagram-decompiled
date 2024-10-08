package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

public abstract class I5F {
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C286575Wy r8, X.C59502JMa r9, java.lang.String r10, X.C62320sa r11, int r12) {
        /*
            r4 = r9
            r5 = r11
            X.AnonymousClass7TG.A1O(r9, r11)
            r0 = 32983325(0x1f7491d, float:9.083838E-38)
            r8.ExV(r0)
            r7 = r12
            r0 = r12 & 6
            r6 = r10
            if (r0 != 0) goto L_0x0093
            int r3 = X.G9t.A0O(r8, r10)
            r3 = r3 | r12
        L_0x0016:
            r0 = r12 & 48
            if (r0 != 0) goto L_0x001f
            int r0 = X.G9t.A0F(r8, r9)
            r3 = r3 | r0
        L_0x001f:
            r0 = r12 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0028
            int r0 = X.G9t.A0G(r8, r11)
            r3 = r3 | r0
        L_0x0028:
            r1 = r3 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r1 != r0) goto L_0x0047
            boolean r0 = r8.Bwn()
            if (r0 == 0) goto L_0x0047
            r8.Evl()
        L_0x0037:
            X.5Xd r0 = r8.ASQ()
            if (r0 == 0) goto L_0x0046
            r8 = 16
            X.J7x r3 = new X.J7x
            r3.<init>(r4, r5, r6, r7, r8)
            r0.A06 = r3
        L_0x0046:
            return
        L_0x0047:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0055
            r1 = -657349998(0xffffffffd8d1a292, float:-1.84396932E15)
            java.lang.String r0 = "instagram.features.clips.blend.ui.BlendInviteScreen (BlendInviteScreen.kt:56)"
            X.0fL.A01(r1, r0)
        L_0x0055:
            boolean r0 = r9 instanceof X.C57603IdU
            if (r0 == 0) goto L_0x007a
            r1 = 2123559269(0x7e92f165, float:9.766034E37)
        L_0x005c:
            X.5Qk r0 = X.C51965G9l.A0K(r8, r1)
            androidx.compose.ui.Modifier r1 = X.G9t.A0p(r8, r0)
            androidx.compose.foundation.layout.FillElement r0 = X.C287205Zk.A01
            androidx.compose.ui.Modifier r0 = r1.Ezh(r0)
            X.GQD.A00(r8, r0)
        L_0x006d:
            boolean r0 = X.C51970G9q.A1Z(r8)
            if (r0 == 0) goto L_0x0037
            r0 = 706715239(0x2a1f9e67, float:1.4176994E-13)
            X.0fL.A00(r0)
            goto L_0x0037
        L_0x007a:
            boolean r0 = r9 instanceof X.C57601IdS
            r1 = 2123565477(0x7e9309a5, float:9.77233E37)
            if (r0 == 0) goto L_0x005c
            r0 = 2123562977(0x7e92ffe1, float:9.769794E37)
            r8.ExS(r0)
            r2 = r4
            X.IdS r2 = (X.C57601IdS) r2
            r1 = r3 & 14
            r0 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            A03(r8, r2, r10, r11, r0)
            goto L_0x006d
        L_0x0093:
            r3 = r12
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I5F.A02(X.5Wy, X.JMa, java.lang.String, X.0sa, int):void");
    }

    public static final void A03(C286575Wy r24, C57601IdS idS, String str, C62320sa r27, int i) {
        int i2;
        String A00;
        C57601IdS idS2 = idS;
        C62320sa r10 = r27;
        int A02 = DbW.A02(1, idS2, r10);
        C286575Wy r0 = r24;
        r0.ExV(-131397597);
        int i3 = i;
        int i4 = i & 6;
        String str2 = str;
        if (i4 == 0) {
            i2 = G9t.A0O(r0, str2) | i3;
        } else {
            i2 = i3;
        }
        if ((i3 & 48) == 0) {
            i2 |= G9t.A0F(r0, idS2);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r0, r10);
        }
        if ((i2 & 147) != 146 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1579968501, "instagram.features.clips.blend.ui.LoadedBlendInviteScreen (BlendInviteScreen.kt:67)");
            }
            Object A0r = C51965G9l.A0r(r0);
            r0.AJO(C286935Yj.A00);
            Object A0m = C51967G9n.A0m(r0, -1436722394);
            Object obj = AnonymousClass5XT.A00;
            C284945Oz r6 = (C284945Oz) C51974G9v.A0Z(r0, A0m, obj, false);
            C286565Wx A0H = C51965G9l.A0H(r0, false);
            C285245Qk r12 = Modifier.A00;
            Modifier A022 = I28.A02(r0, G9t.A0p(r0, r12).Ezh(C287205Zk.A01));
            boolean A1T = C51968G9o.A1T(r0, idS2, AnonymousClass7TF.A1S(i2 & 14, 4), C51967G9n.A1Z(r0, A0r, -1436714578));
            Object ECw = r0.ECw();
            if (A1T || ECw == obj) {
                ECw = new C73673Phm(idS2, A0r, str2, 41);
                r0.FLL(ECw);
            }
            Modifier A002 = C288305bh.A00(A022, C51965G9l.A0y(A0H, ECw, false));
            AnonymousClass5RD A0N = G9w.A0N(r0);
            int A003 = C287425a7.A00(r0);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r0, A002);
            C51973G9u.A0y(r0, A0H);
            C51971G9r.A12(r0, A0N, A04);
            0sL r9 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r0, A003)) {
                C51971G9r.A13(r0, r9, A003);
            }
            C51965G9l.A18(r0, A01);
            HL5 hl5 = HL5.EMPHASIZED;
            int i5 = idS2.A01;
            String str3 = idS2.A04;
            String A004 = A00(r0, str3, i5);
            Integer num = idS2.A02;
            r0.ExS(388155835);
            if (num == null) {
                A00 = null;
            } else {
                A00 = A00(r0, str3, num.intValue());
            }
            C286565Wx.A0L(A0H, false);
            C286575Wy r16 = r0;
            I7M.A02(r16, (Modifier) null, new C53512Gpi(R.drawable.instagram_illustrations_product_illustration_pi_plus_blend_on_media, 155.0f), hl5, A00, A004, (String) null, (C62320sa) null, 384, 4034, C51966G9m.A0H(r0));
            Integer num2 = idS2.A03;
            if (num2 == AnonymousClass05K.A00 || num2 == AnonymousClass05K.A01) {
                r0.ExS(-851658515);
                A01(r0, 0);
                Modifier A042 = C287195Zj.A04(C51966G9m.A0T(r12));
                String A005 = C288035bG.A00(r0, idS2.A00);
                boolean A1P = C51973G9u.A1P(r0, 388176117, i2);
                Object ECw2 = r0.ECw();
                if (A1P || ECw2 == obj) {
                    ECw2 = C58690Ivz.A00(r6, r10, A02);
                    r0.FLL(ECw2);
                }
                C286575Wy r17 = r0;
                HXO.A00((C287605aT) null, r17, A042, C54661HMs.LARGE, A005, C51965G9l.A0y(A0H, ECw2, false), 196614, 24, false, C51971G9r.A1W(r6));
            } else if (num2 == AnonymousClass05K.A0C) {
                r0.ExS(-851217788);
                String A006 = C288035bG.A00(r0, idS2.A00);
                boolean A1Z = C51974G9v.A1Z(r0, 388186806, i2);
                Object ECw3 = r0.ECw();
                if (A1Z || ECw3 == obj) {
                    ECw3 = new C58679Ivo(r10, 38);
                    r0.FLL(ECw3);
                }
                HXO.A00((C287605aT) null, r16, (Modifier) null, C54661HMs.LARGE, A006, C51965G9l.A0y(A0H, ECw3, false), 196608, 89, false, false);
            } else {
                r0.ExS(-851025898);
                HXO.A00((C287605aT) null, r16, (Modifier) null, C54661HMs.LARGE, C288035bG.A00(r0, idS2.A00), C58571Iu4.A00, 221568, 73, false, false);
            }
            if (C51971G9r.A1S(r0, A0H, false)) {
                0fL.A00(-1740383427);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59141J7x(idS2, r10, str2, i3, 17);
        }
    }

    public static final String A00(C286575Wy r2, String str, int i) {
        String A00;
        if (0fL.A02()) {
            0fL.A01(-1628312049, "instagram.features.clips.blend.ui.getTextWithUsername (BlendInviteScreen.kt:118)");
        }
        if (str != null) {
            r2.ExS(-1009050287);
            A00 = C51968G9o.A14(r2, str, i);
        } else {
            r2.ExS(-1008998021);
            A00 = C288035bG.A00(r2, i);
        }
        if (C51970G9q.A1Z(r2)) {
            0fL.A00(927147297);
        }
        return A00;
    }

    public static final void A01(C286575Wy r7, int i) {
        r7.ExV(1518169528);
        if (i != 0 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-2088740054, "instagram.features.clips.blend.ui.BlendDisclaimerComponent (BlendInviteScreen.kt:136)");
            }
            C285245Qk r3 = Modifier.A00;
            AnonymousClass5RD A02 = C291495hO.A02(C287275Zs.A07, r7, C287215Zl.A02, 0);
            int A00 = C287425a7.A00(r7);
            C286565Wx r5 = (C286565Wx) r7;
            AnonymousClass5RM A04 = C286565Wx.A04(r5);
            Modifier A01 = C287435a8.A01(r7, r3);
            C51973G9u.A0y(r7, r5);
            C51971G9r.A12(r7, A02, A04);
            0sL r1 = C287485aD.A02;
            if (r5.A0K || !C51972G9s.A1Q(r7, A00)) {
                C51971G9r.A13(r7, r1, A00);
            }
            C51965G9l.A18(r7, A01);
            C56649I6e.A04(r7, C287975bA.A00(r7, R.drawable.instagram_reels_pano_outline_24, 0), C288035bG.A00(r7, 2131953853), 2131953852);
            C56649I6e.A04(r7, C287975bA.A00(r7, R.drawable.instagram_clock_dotted_pano_outline_24, 0), C288035bG.A00(r7, 2131953855), 2131953854);
            C56649I6e.A04(r7, C287975bA.A00(r7, R.drawable.instagram_lock_pano_outline_24, 0), C288035bG.A00(r7, 2131953851), 2131953850);
            G9w.A15(r7, r3, 24.0f);
            if (C51967G9n.A1R(r7)) {
                0fL.A00(2105124894);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            JGA.A01(ASQ, i, 22);
        }
    }
}
