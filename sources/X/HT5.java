package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;

public abstract class HT5 {
    public static final void A00(C286575Wy r18, Modifier modifier, C62320sa r20, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        0qQ.A0B(r20, 0);
        C286575Wy r0 = r18;
        r0.ExV(-394932365);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r0, r20) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r0, modifier2);
        }
        if ((i3 & 19) != 18 || !r0.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1897534156, "com.instagram.aistudio.home.view.section.AiHomeCreateCardFooterSection (AiHomeCreateCardFooterSection.kt:30)");
            }
            FillElement fillElement = C287205Zk.A02;
            Modifier A0D = C287205Zk.A0D(C287195Zj.A07(modifier2.Ezh(fillElement), 32.0f), 318.0f);
            C287265Zr r3 = C287215Zl.A00;
            C287325Zx r7 = C287275Zs.A07;
            AnonymousClass5RD A02 = C291495hO.A02(r7, r0, r3, 48);
            int A00 = C287425a7.A00(r0);
            C286565Wx r14 = (C286565Wx) r0;
            AnonymousClass5RM A04 = C286565Wx.A04(r14);
            Modifier A01 = C287435a8.A01(r0, A0D);
            C62320sa r13 = C287485aD.A00;
            C51973G9u.A0z(r0, r14, r13);
            0sL r12 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A02, A04, r12);
            0sL r10 = C287485aD.A02;
            if (r14.A0K || !C51972G9s.A1Q(r0, A00)) {
                C51971G9r.A13(r0, r10, A00);
            }
            0sL A1K = C51966G9m.A1K(r0, A01);
            C285245Qk r4 = Modifier.A00;
            Modifier Ezh = r4.Ezh(fillElement);
            AnonymousClass5RD A022 = C287395a4.A02(C287275Zs.A01, r0, C287215Zl.A04, 48);
            int A002 = C287425a7.A00(r0);
            AnonymousClass5RM A042 = C286565Wx.A04(r14);
            Modifier A012 = C287435a8.A01(r0, Ezh);
            C51973G9u.A0z(r0, r14, r13);
            C287595aO.A00(r0, A022, r12);
            if (C51965G9l.A1Y(r0, r14, A042, A0w) || !C51972G9s.A1Q(r0, A002)) {
                C51971G9r.A13(r0, r10, A002);
            }
            C287595aO.A00(r0, A012, A1K);
            AnonymousClass6FX r17 = AnonymousClass6FX.A00;
            Modifier A0B = C287195Zj.A0B(C287205Zk.A0D(r4, 214.0f), 0.0f, 0.0f, 12.0f, 0.0f);
            AnonymousClass5RD A023 = C291495hO.A02(r7, r0, C287215Zl.A02, 0);
            int A003 = C287425a7.A00(r0);
            AnonymousClass5RM A043 = C286565Wx.A04(r14);
            Modifier A013 = C287435a8.A01(r0, A0B);
            C51973G9u.A0z(r0, r14, r13);
            C287595aO.A00(r0, A023, r12);
            if (C51965G9l.A1Y(r0, r14, A043, A0w) || !C51972G9s.A1Q(r0, A003)) {
                C51971G9r.A13(r0, r10, A003);
            }
            C287595aO.A00(r0, A013, A1K);
            String A004 = C288035bG.A00(r0, 2131952639);
            C286575Wy r6 = r0;
            AnonymousClass5ZZ.A0P(r6, C287195Zj.A0B(r4, 0.0f, 0.0f, 0.0f, 2.0f), C51966G9m.A0h(r0), A004, 1, C51966G9m.A0H(r0));
            C286575Wy r72 = r0;
            AnonymousClass5ZZ.A0m(r72, C51966G9m.A0b(r0), C288035bG.A00(r0, 2131952638), 1, 16250, C51966G9m.A0H(r0));
            r0.ASN();
            AnonymousClass6G3.A03(r0, r17.A00(C287205Zk.A0C(r4, 96.0f)), C287975bA.A00(r0, R.drawable.ig_illustrations_illo_ai_studio_refresh, 0));
            r0.ASN();
            String A005 = C288035bG.A00(r0, 2131952621);
            C286575Wy r62 = r0;
            AnonymousClass6CE.A01(r62, C287195Zj.A0B(Ezh, 0.0f, 16.0f, 0.0f, 0.0f), AnonymousClass6CD.SMALL, C51965G9l.A0m(r0), A005, r20, (i3 & 14) | 1573248, 408, false);
            if (C51967G9n.A1R(r0)) {
                0fL.A00(-295836414);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            ASQ.A06 = GSJ.A01(modifier2, r20, i4, i5, 9);
        }
    }
}
