package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.HXt  reason: case insensitive filesystem */
public abstract class C54911HXt {
    public static final void A00(C286575Wy r21, String str, String str2, String str3, C62320sa r25, C62320sa r26, C62320sa r27, int i) {
        int i2;
        String str4 = str;
        0qQ.A0B(str4, 0);
        String str5 = str2;
        C62320sa r9 = r25;
        C62320sa r8 = r26;
        AnonymousClass7TG.A0w(1, str5, r9, r8);
        C62320sa r4 = r27;
        0qQ.A0B(r4, 5);
        C286575Wy r5 = r21;
        r5.ExV(-1907256422);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r5, str4) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r5, str5);
        }
        String str6 = str3;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0Q(r5, str6);
        }
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r5, r9);
        }
        if ((i3 & 24576) == 0) {
            i2 |= G9t.A0I(r5, r8);
        }
        if ((196608 & i) == 0) {
            i2 |= G9t.A0J(r5, r4);
        }
        if ((74899 & i2) != 74898 || !r5.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(176293321, "com.instagram.creation.genai.attribution.bottomsheet.CreationGenAIAttributionBottomSheetContent (CreationGenAIAttributionBottomSheetContent.kt:26)");
            }
            C60340gF r12 = C60340gF.A00;
            r5.ExS(-691635091);
            boolean A1P = C51972G9s.A1P(458752, i2, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
            Object ECw = r5.ECw();
            if (A1P || ECw == AnonymousClass5XT.A00) {
                ECw = new MG0(r4, (AnonymousClass4D7) null, 34);
                r5.FLL(ECw);
            }
            C286565Wx A0E = C51975G9x.A0E(r5, ECw, r12);
            C287265Zr r13 = C287215Zl.A00;
            C285245Qk r7 = Modifier.A00;
            Modifier A0B = C287195Zj.A0B(r7, 0.0f, 0.0f, 0.0f, C287645aX.A00(r5));
            AnonymousClass5RD A00 = C291495hO.A00(C287275Zs.A07, r5, r13);
            int A002 = C287425a7.A00(r5);
            AnonymousClass5RM A04 = C286565Wx.A04(A0E);
            Modifier A01 = C287435a8.A01(r5, A0B);
            C51973G9u.A0y(r5, A0E);
            C51971G9r.A12(r5, A00, A04);
            0sL r132 = C287485aD.A02;
            if (A0E.A0K || !C51972G9s.A1Q(r5, A002)) {
                C51971G9r.A13(r5, r132, A002);
            }
            C51965G9l.A18(r5, A01);
            long A0H = C51966G9m.A0H(r5);
            C286575Wy r122 = r5;
            AnonymousClass5ZZ.A0O(r122, C287195Zj.A09(r7, 0.0f, C287645aX.A00(r5)), C51966G9m.A0d(r5), str4, i2 & 14, A0H);
            long A0M = C51966G9m.A0M(r5);
            C286575Wy r123 = r5;
            AnonymousClass5ZZ.A0O(r123, C287205Zk.A07(C287195Zj.A0B(r7, 0.0f, 0.0f, 0.0f, C287645aX.A00(r5)), 0.75f), C51966G9m.A0c(r5), str5, (i2 >> 3) & 14, A0M);
            r5.ExS(-164340283);
            if (str3 != null) {
                boolean A1a = C51974G9v.A1a(r5, -164336183, i2);
                Object ECw2 = r5.ECw();
                if (A1a || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = new C66218MIz(r9, 23);
                    r5.FLL(ECw2);
                }
                I7L.A0B(C51965G9l.A0y(A0E, ECw2, false), str6, r5, (i2 >> 6) & 14);
            }
            C286565Wx.A0L(A0E, false);
            C54915HXx.A00(r8, r5, (i2 >> 12) & 14);
            if (C51967G9n.A1R(r5)) {
                0fL.A00(-1894440490);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JAC(r9, r8, r4, str4, str5, str6, i3, 1);
        }
    }
}
