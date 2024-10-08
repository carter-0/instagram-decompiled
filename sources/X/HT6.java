package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

public abstract class HT6 {
    public static final void A00(C286575Wy r18, Modifier modifier, C62320sa r20, int i, int i2, boolean z) {
        int i3;
        boolean z2 = z;
        Modifier modifier2 = modifier;
        C62320sa r14 = r20;
        0qQ.A0B(r14, 0);
        C286575Wy r1 = r18;
        r1.ExV(1263336045);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r1, r14) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r1, modifier2);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0a(r1, z2);
        }
        if ((i3 & 147) != 146 || !r1.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            z2 = C51966G9m.A1Q(i7, z2);
            if (0fL.A02()) {
                0fL.A01(-1296042861, "com.instagram.aistudio.home.view.section.AiHomeLargeCreateCardSection (AiHomeLargeCreateCardSection.kt:35)");
            }
            AnonymousClass5ZQ A00 = AnonymousClass5ZN.A00();
            boolean A1M = C51975G9x.A1M(12.0f);
            long j = AnonymousClass5RV.A00;
            Modifier A01 = C56169Hty.A01(modifier2, A00, 12.0f, j, j, A1M);
            if (!z2) {
                A01 = A01.Ezh(C54739HQw.A00(Modifier.A00, 1.0f, false));
            }
            Modifier A07 = C287195Zj.A07(C51976G9y.A0B(r1, A01), 24.0f);
            r1.ExS(-291126617);
            int i8 = i3 & 14;
            boolean A1S = AnonymousClass7TF.A1S(i8, 4);
            Object ECw = r1.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = new MM7(r14, 41);
                r1.FLL(ECw);
            }
            C286565Wx A0H = C51965G9l.A0H(r1, false);
            Modifier A06 = C287635aW.A06(A07, (C62320sa) ECw);
            AnonymousClass5RD A0X = C51968G9o.A0X(r1);
            int A002 = C287425a7.A00(r1);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r1, A06);
            C51973G9u.A0y(r1, A0H);
            C51971G9r.A12(r1, A0X, A04);
            0sL r7 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r1, A002)) {
                C51971G9r.A13(r1, r7, A002);
            }
            C51965G9l.A18(r1, A012);
            AnonymousClass2DO A003 = C287975bA.A00(r1, R.drawable.instagram_illustrations_product_illustration_pi_plus_ai_home, 0);
            C285245Qk r72 = Modifier.A00;
            AnonymousClass6G3.A05(r1, C287205Zk.A08(r72, 160.0f), A003);
            String A004 = C288035bG.A00(r1, 2131952639);
            AnonymousClass5ZZ.A07(r1, C287205Zk.A08(C287195Zj.A0A(r72, 0.0f, 12.0f, 0.0f), 28.0f), C51966G9m.A0d(r1), A004);
            C51975G9x.A14(r1, C51966G9m.A0c(r1), C288035bG.A00(r1, 2131952638));
            r1.ExS(1998465668);
            if (z2) {
                C286575Wy r16 = r1;
                AnonymousClass6CE.A05(r16, C287195Zj.A0B(C51966G9m.A0T(r72), 0.0f, 24.0f, 0.0f, 0.0f), C51965G9l.A0m(r1), C288035bG.A00(r1, 2131952621), r14, i8 | 1573248);
            }
            if (C51971G9r.A1S(r1, A0H, false)) {
                0fL.A00(835819811);
            }
        } else {
            r1.Evl();
        }
        C286625Xd ASQ = r1.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8R(i5, i4, 0, modifier2, r14, z2);
        }
    }
}
