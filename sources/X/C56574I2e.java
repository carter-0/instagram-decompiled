package X;

import android.os.Build;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.I2e  reason: case insensitive filesystem */
public abstract class C56574I2e {
    public static final void A02(C286575Wy r13, HPM hpm, 0sL r15, int i, int i2) {
        int i3;
        HPM hpm2 = hpm;
        0qQ.A0B(r15, 1);
        C286575Wy r8 = r13;
        r13.ExV(-1175148640);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = G9t.A0O(r13, hpm) | i;
        } else {
            i3 = i6;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= G9t.A0F(r13, r15);
        }
        if ((i3 & 91) != 18 || !r13.Bwn()) {
            if (i5 != 0) {
                hpm2 = null;
            }
            if (0fL.A02()) {
                0fL.A01(115814719, "com.instagram.creation.genai.magicmod.common.ui.MagicModLoadingOverlayBox (MagicModLoadingOverlayBox.kt:42)");
            }
            C285245Qk r5 = Modifier.A00;
            AnonymousClass5RD A0Y = C51970G9q.A0Y();
            int A00 = C287425a7.A00(r13);
            C286565Wx r6 = (C286565Wx) r8;
            AnonymousClass5RM A04 = C286565Wx.A04(r6);
            Modifier A01 = C287435a8.A01(r13, r5);
            C51973G9u.A0y(r13, r6);
            C51971G9r.A12(r13, A0Y, A04);
            0sL r4 = C287485aD.A02;
            if (r6.A0K || !C51972G9s.A1Q(r13, A00)) {
                C51971G9r.A13(r13, r4, A00);
            }
            C51965G9l.A18(r13, A01);
            C56161Htp.A01((AnonymousClass5b8) null, r8, (Modifier) null, hpm2, "AnimationCrossfade", JJU.A00(r13, r15, C289515dj.A00, 31, 89052064), (i3 & 14) | 27648, 6);
            if (C51967G9n.A1R(r8)) {
                0fL.A00(27535882);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            ASQ.A06 = GSJ.A01(r15, hpm2, i4, i6, 28);
        }
    }

    public static final Modifier A00(HPM hpm) {
        float f;
        if (hpm instanceof H96) {
            int i = Build.VERSION.SDK_INT;
            Modifier modifier = Modifier.A00;
            if (i >= 31) {
                modifier = HRG.A00(modifier, C55299HfS.A00, 40.0f, 40.0f);
                f = 0.7f;
            } else {
                f = 0.5f;
            }
            return HRF.A00(modifier, f);
        } else if (!(hpm instanceof H97) || Build.VERSION.SDK_INT < 31) {
            return Modifier.A00;
        } else {
            return HRG.A00(Modifier.A00, C55299HfS.A00, 20.0f, 20.0f);
        }
    }

    public static final void A01(C286575Wy r15, int i) {
        C286575Wy r13 = r15;
        r15.ExV(-636235958);
        int i2 = i;
        if (i != 0 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1247544770, "com.instagram.creation.genai.magicmod.common.ui.MagicModScanAnimation (MagicModLoadingOverlayBox.kt:83)");
            }
            GRG A01 = GRH.A01(new GRJ(GQC.A01(C52518GVv.A02, 2500, 0), AnonymousClass05K.A01), GRH.A02(r15), r13, 1.25f, -1.25f, 28728);
            Object A0m = C51967G9n.A0m(r13, 2136907714);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = G9t.A0o(r13, Float.valueOf(-1.25f));
            }
            C284945Oz r3 = (C284945Oz) A0m;
            C286565Wx A0H = C51965G9l.A0H(r13, false);
            C284945Oz r11 = A01.A08;
            boolean A1T = C51970G9q.A1T((C51972G9s.A02(r11) > C51971G9r.A02(r3) ? 1 : (C51972G9s.A02(r11) == C51971G9r.A02(r3) ? 0 : -1)));
            C51967G9n.A14(r3, C51972G9s.A02(r11));
            List A1P = 0sr.A1P(new AnonymousClass5RW[]{C51965G9l.A0N(C289505di.A00(r13, R.color.fds_transparent)), C51965G9l.A0N(C289505di.A00(r13, R.color.white_35_transparent)), C51965G9l.A0N(C289505di.A00(r13, R.color.white_35_transparent)), C51965G9l.A0N(C289505di.A00(r13, R.color.fds_transparent))});
            Object A0m2 = C51967G9n.A0m(r13, 2136919909);
            if (A0m2 == obj) {
                A0m2 = 0sr.A1P(new Float[]{Float.valueOf(0.0f), Float.valueOf(0.65f), Float.valueOf(0.75f), C51967G9n.A0h()});
                r13.FLL(A0m2);
            }
            List list = (List) A0m2;
            C286565Wx.A0L(A0H, false);
            float A02 = C51972G9s.A02(r11);
            r13.ExS(2136926429);
            boolean AGr = r13.AGr(A02);
            Object ECw = r13.ECw();
            if (AGr || ECw == obj) {
                ECw = new C52919Get(A01, A1P, list, A1T);
                r13.FLL(ECw);
            }
            C286565Wx.A0L(A0H, false);
            Modifier A0O = C51968G9o.A0O();
            long A04 = C285595Rx.A02(AnonymousClass5RX.A0K[(int) (AnonymousClass5RW.A01 & 63)], AnonymousClass5RW.A03(AnonymousClass5RW.A01), AnonymousClass5RW.A02(AnonymousClass5RW.A01), AnonymousClass5RW.A01(AnonymousClass5RW.A01), 0.35f);
            AnonymousClass5S2 r1 = AnonymousClass5S0.A00;
            if (C51967G9n.A1X(r13, C304766Fd.A00(C304766Fd.A01(A0O, r1, A04), (C304786Ff) ECw, r1))) {
                0fL.A00(-1652904053);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            JG9.A01(ASQ, i2, 24);
        }
    }
}
