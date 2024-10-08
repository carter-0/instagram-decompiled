package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;
import java.util.Map;

public abstract class HZW {
    public static final void A00(C286575Wy r59, C62320sa r60, C62320sa r61, C62320sa r62, 0sP r63, int i, int i2) {
        int i3;
        0sP r17 = r63;
        C62320sa r58 = r60;
        C62320sa r57 = r61;
        C62320sa r56 = r62;
        C62320sa r3 = r58;
        boolean A1b = C51973G9u.A1b(r3, r57, r56);
        C286575Wy r0 = r59;
        r0.ExV(364206397);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = C41848B3p.A01(r0, r3) | i;
        } else {
            i3 = i5;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= G9t.A0F(r0, r57);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 896) == 0) {
            i3 |= G9t.A0G(r0, r56);
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i3 |= G9t.A0H(r0, r17);
        }
        if ((i3 & 5851) != 1170 || !r0.Bwn()) {
            if (i6 != 0) {
                r17 = null;
            }
            if (0fL.A02()) {
                0fL.A01(1825309459, "com.instagram.direct.aiagent.upsell.AiAgentBottomSheetNuxScreen (AiAgentBottomSheetNuxScreen.kt:35)");
            }
            C287265Zr r4 = C287215Zl.A00;
            C285245Qk r13 = Modifier.A00;
            C287325Zx r7 = C287275Zs.A07;
            AnonymousClass5RD A02 = C291495hO.A02(r7, r0, r4, 48);
            int A00 = C287425a7.A00(r0);
            C286565Wx r8 = (C286565Wx) r0;
            AnonymousClass5RM A04 = C286565Wx.A04(r8);
            Modifier A01 = C287435a8.A01(r0, r13);
            C62320sa r6 = C287485aD.A00;
            C51973G9u.A0z(r0, r8, r6);
            0sL r5 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A02, A04, r5);
            0sL r42 = C287485aD.A02;
            if (r8.A0K || !C51972G9s.A1Q(r0, A00)) {
                C51971G9r.A13(r0, r42, A00);
            }
            0sL A1K = C51966G9m.A1K(r0, A01);
            AnonymousClass6G3.A06(r0, C287195Zj.A0B(r13, 0.0f, 12.0f, 0.0f, 36.0f), C287975bA.A00(r0, R.drawable.instagram_illustrations_product_illustration_pi_plus_ai_studio, 0), 440);
            String A002 = C288035bG.A00(r0, 2131952848);
            C286575Wy r20 = r0;
            AnonymousClass5ZZ.A0S(r20, C287195Zj.A0B(C287195Zj.A09(r13, 32.0f, 0.0f), 0.0f, 0.0f, 0.0f, 12.0f), AnonymousClass5aQ.A01(r0).A04, A002, C51966G9m.A0H(r0));
            Modifier A09 = C287195Zj.A09(r13, 12.0f, 0.0f);
            AnonymousClass5RD A022 = C291495hO.A02(r7, r0, C287215Zl.A02, 0);
            int A003 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(r8);
            Modifier A012 = C287435a8.A01(r0, A09);
            C51973G9u.A0z(r0, r8, r6);
            C287595aO.A00(r0, A022, r5);
            if (C51965G9l.A1Y(r0, r8, A042, A0w) || !C51972G9s.A1Q(r0, A003)) {
                C51971G9r.A13(r0, r42, A003);
            }
            C287595aO.A00(r0, A012, A1K);
            C56649I6e.A03(r20, C287975bA.A00(r0, R.drawable.instagram_channels_pano_outline_24, 0), C53509Gpf.A00(r0, C288035bG.A00(r0, 2131952842), 2131952841), 64, 4, false);
            C56649I6e.A03(r20, C287975bA.A00(r0, R.drawable.instagram_gen_ai_pano_outline_24, 0), C53509Gpf.A00(r0, C288035bG.A00(r0, 2131952844), 2131952843), 64, 4, false);
            AnonymousClass2DO A004 = C287975bA.A00(r0, R.drawable.instagram_rotate_pano_outline_24, 0);
            String A005 = C288035bG.A00(r0, 2131952847);
            if (C51967G9n.A1U(r0, -35369219)) {
                0fL.A01(574458170, "com.instagram.direct.aiagent.upsell.thirdBulletText (AiAgentBottomSheetNuxScreen.kt:94)");
            }
            String A14 = C51968G9o.A14(r0, C288035bG.A00(r0, 2131952846), 2131952845);
            String A006 = C288035bG.A00(r0, 2131952846);
            int A08 = 00l.A08(A14, A006, 0, false);
            int A05 = DbX.A05(A006) + A08;
            AnonymousClass5ZB r41 = new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C291795ht) null, 65534, C51966G9m.A0D(r0), 0, 0);
            C303876Bd r64 = new C303876Bd(16);
            r64.A09(A14);
            r64.A06(r41, A08, A05);
            C286025Tq A0K = C51967G9n.A0K(r64, "link", "AI at Meta link", A08, A05);
            if (0fL.A02()) {
                0fL.A00(780737618);
            }
            C286565Wx.A0L(r8, false);
            int i7 = i3 << 12;
            C286575Wy r18 = r0;
            C52636GaA.A00(r18, (Modifier) null, (Modifier) null, (AnonymousClass5RW) null, A004, A0K, (C54611HKu) null, (C59489JLn) null, A005, (String) null, (String) null, (Map) null, r58, 0, 0, 0, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED, i7 & 57344, 114646, 0, false);
            r0.ASN();
            G9w.A15(r0, r13, 12.0f);
            String A007 = C288035bG.A00(r0, 2131952568);
            String A008 = C288035bG.A00(r0, 2131952567);
            if (C51967G9n.A1U(r0, 2131309359)) {
                0fL.A01(-913146120, "com.instagram.direct.aiagent.upsell.footerAiTerms (AiAgentBottomSheetNuxScreen.kt:119)");
            }
            String A009 = C288035bG.A00(r0, 2131952840);
            String A142 = C51968G9o.A14(r0, A009, 2131952839);
            C303876Bd r52 = new C303876Bd(16);
            r52.A09(A142);
            r52.A09("\n");
            int A082 = 00l.A08(A142, A009, 0, false);
            int A052 = DbX.A05(A009) + A082;
            r52.A06(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, (AnonymousClass5ZD) null, (C291795ht) null, 65534, C51966G9m.A0D(r0), 0, 0), A082, A052);
            C286025Tq A0K2 = C51967G9n.A0K(r52, "Link", A009, A082, A052);
            if (0fL.A02()) {
                0fL.A00(761692451);
            }
            C286565Wx.A0L(r8, false);
            I7L.A03(r0, C51966G9m.A0T(r13), A0K2, A007, A008, r57, r56, r17, (i3 & 112) | 384 | (i7 & 3670016), ((i3 >> 6) & 112) | 3456, 17304, false, false, false, false, false, A1b, false, false);
            if (C51967G9n.A1R(r0)) {
                0fL.A00(1539305566);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG8(r56, r57, r17, r58, i5, i4, 17);
        }
    }
}
