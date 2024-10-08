package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.HXv  reason: case insensitive filesystem */
public abstract class C54913HXv {
    public static final void A00(C286575Wy r13, C62320sa r14, C62320sa r15, int i) {
        int i2;
        C62320sa r3 = r15;
        C62320sa r4 = r14;
        AnonymousClass7TG.A1N(r14, r15);
        C286575Wy r11 = r13;
        r13.ExV(838719159);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r13, r14) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r13, r15);
        }
        if ((i2 & 19) != 18 || !r13.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(124436460, "com.instagram.creation.genai.attribution.bottomsheet.GenericFeatureNotAvailableContent (CreationGenAIFeatureUnavailableGenericBottomSheetFragment.kt:101)");
            }
            C287265Zr r6 = C287215Zl.A00;
            C285245Qk r5 = Modifier.A00;
            Modifier A0B = C287195Zj.A0B(r5, 0.0f, 0.0f, 0.0f, C287645aX.A00(r13));
            AnonymousClass5RD A00 = C291495hO.A00(C287275Zs.A07, r13, r6);
            int A002 = C287425a7.A00(r13);
            C286565Wx r8 = (C286565Wx) r11;
            AnonymousClass5RM A04 = C286565Wx.A04(r8);
            Modifier A01 = C287435a8.A01(r13, A0B);
            C51973G9u.A0y(r13, r8);
            C51971G9r.A12(r13, A00, A04);
            0sL r62 = C287485aD.A02;
            if (r8.A0K || !C51972G9s.A1Q(r13, A002)) {
                C51971G9r.A13(r13, r62, A002);
            }
            C51965G9l.A18(r13, A01);
            String A003 = C304346Dc.A00(r13, 2131956905);
            long A0H = C51966G9m.A0H(r13);
            AnonymousClass5ZZ.A0X(r11, C287195Zj.A09(r5, 0.0f, C287645aX.A00(r11)), C51965G9l.A0S(r13), A003, A0H);
            String A004 = C304346Dc.A00(r11, 2131956908);
            long A0M = C51966G9m.A0M(r11);
            AnonymousClass5ZZ.A0X(r11, C287205Zk.A07(C287195Zj.A09(r5, 0.0f, C287645aX.A01(r11, R.dimen.account_discovery_bottom_gap)), 0.75f), C51966G9m.A0c(r11), A004, A0M);
            I7L.A0A(r4, C304346Dc.A00(r11, 2131968772), r11, (i2 << 3) & 112);
            C54915HXx.A00(r3, r11, (i2 >> 3) & 14);
            if (C51967G9n.A1R(r11)) {
                0fL.A00(-1913290259);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JGL(r4, r3, i3, 39);
        }
    }
}
