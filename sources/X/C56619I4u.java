package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.I4u  reason: case insensitive filesystem */
public abstract class C56619I4u {
    public static final void A00(C286575Wy r20, HLB hlb, I12 i12, C362088hK r23, C62320sa r24, C62320sa r25, C62320sa r26, C62320sa r27, int i, int i2, boolean z) {
        String str;
        C62320sa r10 = r27;
        HLB hlb2 = hlb;
        C62320sa r12 = r24;
        0qQ.A0B(r12, 2);
        C362088hK r13 = r23;
        C62320sa r11 = r26;
        C62320sa r15 = r25;
        C51973G9u.A0r(3, r15, r11, r13);
        C286575Wy r2 = r20;
        r2.ExV(561342434);
        int i3 = i2;
        if ((i2 & 64) != 0) {
            hlb2 = null;
        }
        if ((i3 & 128) != 0) {
            r10 = C58347IqS.A00;
        }
        if (0fL.A02()) {
            0fL.A01(-1253704299, "com.instagram.creation.genai.magicmod.common.ui.MagicModGeneratedImageSelectionBar (MagicModGeneratedImageSelectionBar.kt:44)");
        }
        I12 i122 = i12;
        if (i12 != null) {
            str = i122.A05;
        } else {
            str = null;
        }
        boolean z2 = z;
        HYN.A00(r2, (Modifier) null, AnonymousClass5PI.A01(r2, new J73(9, r12, z2), -1210496756), AnonymousClass5PI.A01(r2, new C59121J7d(hlb2, r13, str, r26, r10), 669029867), AnonymousClass5PI.A01(r2, C59342JFu.A00(r15, 2), -1746410806), 0.0f, 28032, 3);
        if (0fL.A02()) {
            0fL.A00(-1719016669);
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59232JBk(hlb2, r10, r11, r12, r13, i122, r15, i, i3, 1, z2);
        }
    }

    public static final void A01(C286575Wy r29, HLB hlb, C362088hK r31, String str, C62320sa r33, C62320sa r34, int i) {
        int i2;
        C286575Wy r1 = r29;
        r1.ExV(1402799542);
        int i3 = i;
        String str2 = str;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r1, str2) | i;
        } else {
            i2 = i3;
        }
        C62320sa r28 = r33;
        if ((i & 112) == 0) {
            i2 |= G9t.A0F(r1, r28);
        }
        if ((i3 & 7168) == 0) {
            i2 |= G9t.A0R(r1, hlb);
        }
        C62320sa r22 = r34;
        if ((57344 & i) == 0) {
            i2 |= G9t.A0I(r1, r22);
        }
        if ((46171 & i2) != 9234 || !r1.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1482761618, "com.instagram.creation.genai.magicmod.common.ui.PromptButton (MagicModGeneratedImageSelectionBar.kt:107)");
            }
            r1.ExS(2021844389);
            boolean z = true;
            boolean A1S = AnonymousClass7TF.A1S(i2 & 7168, C249703kE.FLAG_MOVED);
            Object ECw = r1.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = C51969G9p.A0R(r1, new C58678Ivn(hlb, 19));
            }
            C270284gU r11 = (C270284gU) ECw;
            C286565Wx A0H = C51965G9l.A0H(r1, false);
            C285245Qk r6 = Modifier.A00;
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A00 = C287425a7.A00(r1);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r1, r6);
            C62320sa r5 = C287485aD.A00;
            C51973G9u.A0z(r1, A0H, r5);
            0sL r4 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r1, A0a, A04, r4);
            0sL r2 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r1, A00)) {
                C51971G9r.A13(r1, r2, A00);
            }
            0sL A1K = C51966G9m.A1K(r1, A01);
            C286575Wy r18 = r1;
            C56617I4s.A03(r18, HMB.DOWN_CENTER, (HLY) null, C304346Dc.A00(r1, 2131965767), r22, ((i2 >> 3) & 7168) | 805306752, 1520, 1000, C51971G9r.A1X(r11));
            Alignment alignment = C287215Zl.A09;
            Modifier A05 = C287195Zj.A05(C287205Zk.A0I(r6, Float.NaN, 44.0f, Float.NaN, Float.NaN));
            r1.ExS(-438407650);
            if ((i2 & 112) != 32) {
                z = false;
            }
            Object ECw2 = r1.ECw();
            if (z || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new C58678Ivn(r28, 18);
                r1.FLL(ECw2);
            }
            Modifier A042 = C287195Zj.A04(C51975G9x.A0F(r1, G9w.A0C(r1, A0H, A05, ECw2)));
            AnonymousClass5RD A002 = C287675aa.A00(alignment, false);
            int A003 = C287425a7.A00(r1);
            AnonymousClass5RM A043 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r1, A042);
            C51973G9u.A0z(r1, A0H, r5);
            C287595aO.A00(r1, A002, r4);
            if (C51965G9l.A1Y(r1, A0H, A043, A0w) || !C51972G9s.A1Q(r1, A003)) {
                C51971G9r.A13(r1, r2, A003);
            }
            C287595aO.A00(r1, A012, A1K);
            AnonymousClass5RD A0W = C51968G9o.A0W(r1);
            int A004 = C287425a7.A00(r1);
            AnonymousClass5RM A044 = C286565Wx.A04(A0H);
            Modifier A013 = C287435a8.A01(r1, r6);
            C51973G9u.A0z(r1, A0H, r5);
            C287595aO.A00(r1, A0W, r4);
            if (C51965G9l.A1Y(r1, A0H, A044, A0w) || !C51972G9s.A1Q(r1, A004)) {
                C51971G9r.A13(r1, r2, A004);
            }
            C287595aO.A00(r1, A013, A1K);
            C288165bT.A04(r1, C287205Zk.A0C(C287195Zj.A0B(r6, 0.0f, 0.0f, 8.0f, 0.0f), 20.0f), C287975bA.A00(r1, R.drawable.instagram_edit_pano_filled_24, 0), C51966G9m.A0L(r1));
            C286575Wy r3 = r1;
            String str3 = str2;
            AnonymousClass5ZZ.A0j(r3, C51966G9m.A0h(r1), str3, 1, 2, (i2 & 14) | 100663296, 11002, C51966G9m.A0I(r1));
            r1.ASN();
            if (C51971G9r.A1R(r1)) {
                0fL.A00(328529977);
            }
        } else {
            r1.Evl();
        }
        C286625Xd ASQ = r1.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9P(r28, r22, hlb, r31, str2, i3, 1);
        }
    }

    public static final void A02(C286575Wy r13, C62320sa r14, int i, boolean z) {
        int i2;
        C286575Wy r7 = r13;
        r13.ExV(2028965358);
        boolean z2 = z;
        if ((i & 14) == 0) {
            i2 = G9t.A0Y(r13, z2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0F(r13, r14);
        }
        if ((i2 & 91) != 18 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(509774418, "com.instagram.creation.genai.magicmod.common.ui.RetryButton (MagicModGeneratedImageSelectionBar.kt:64)");
            }
            AnonymousClass2DO A00 = C287975bA.A00(r13, R.drawable.instagram_arrow_cw_pano_outline_24, 0);
            String A002 = C304346Dc.A00(r13, 2131965787);
            Modifier modifier = Modifier.A00;
            Modifier A07 = C287195Zj.A07(C51975G9x.A0F(r13, C287195Zj.A05(modifier)), 12.0f);
            float f = 1.0f;
            if (z) {
                f = 0.5f;
            }
            Modifier A003 = HRF.A00(A07, f);
            r13.ExS(-1344022060);
            if (!z) {
                r13.ExS(-1344020262);
                boolean A1S = C51968G9o.A1S(i2);
                Object ECw = r13.ECw();
                if (A1S || ECw == AnonymousClass5XT.A00) {
                    ECw = new C58678Ivn(r14, 20);
                    r13.FLL(ECw);
                }
                C51965G9l.A1X(r13, false);
                modifier = C288235ba.A04(r13, modifier, (C62320sa) ECw);
            }
            C51965G9l.A1X(r13, false);
            C288165bT.A07(r7, A003.Ezh(modifier), A00, A002, 8, C51965G9l.A09(r13));
            if (0fL.A02()) {
                0fL.A00(1885064153);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            JGI.A01(ASQ, r14, i, 7, z2);
        }
    }

    public static final void A03(C62320sa r8, C286575Wy r9, int i) {
        int i2;
        r9.ExV(-1853085447);
        if ((i & 14) == 0) {
            i2 = C41848B3p.A01(r9, r8) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-858276451, "com.instagram.creation.genai.magicmod.common.ui.NextButton (MagicModGeneratedImageSelectionBar.kt:80)");
            }
            Alignment alignment = C287215Zl.A09;
            Modifier A05 = C287195Zj.A05(Modifier.A00);
            long A09 = C51965G9l.A09(r9);
            AnonymousClass5aQ.A02(r9);
            Modifier A0Y = C51969G9p.A0Y(G9w.A0F(C287195Zj.A09(C304766Fd.A01(A05, AnonymousClass5ZM.A02, A09), 24.0f, 0.0f)), "magicmod_generated_image_selection_done_button");
            boolean A1N = C51973G9u.A1N(r9, 114829544, i2);
            Object ECw = r9.ECw();
            if (A1N || ECw == AnonymousClass5XT.A00) {
                ECw = C58678Ivn.A00(r9, r8, 17);
            }
            C286565Wx r4 = (C286565Wx) r9;
            Modifier A0D = G9w.A0D(r9, r4, A0Y, (C62320sa) ECw);
            AnonymousClass5RD A00 = C287675aa.A00(alignment, false);
            int A002 = C287425a7.A00(r9);
            AnonymousClass5RM A04 = C286565Wx.A04(r4);
            Modifier A01 = C287435a8.A01(r9, A0D);
            C51973G9u.A0y(r9, r4);
            C51971G9r.A12(r9, A00, A04);
            0sL r1 = C287485aD.A02;
            if (r4.A0K || !C51972G9s.A1Q(r9, A002)) {
                C51971G9r.A13(r9, r1, A002);
            }
            C51965G9l.A18(r9, A01);
            if (C51975G9x.A1V(r9, C304346Dc.A00(r9, 2131968361), AnonymousClass5aQ.A00(r9).A14)) {
                0fL.A00(-1886562620);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, r8, i, 45);
        }
    }
}
