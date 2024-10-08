package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.HSy  reason: case insensitive filesystem */
public abstract class C54791HSy {
    public static final void A00(C286575Wy r27, Modifier modifier, String str, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        String str2 = str;
        0qQ.A0B(str2, 1);
        C286575Wy r4 = r27;
        r4.ExV(1709400248);
        int i4 = i2;
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r4, modifier2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r4, str2);
        }
        if ((i3 & 19) != 18 || !r4.Bwn()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(854958472, "com.instagram.aistudio.editor.InputFieldShimmer (InputFieldShimmer.kt:31)");
            }
            float A00 = AnonymousClass5Z5.A00(((AnonymousClass5Z4) r4.AJO(AnonymousClass5ZZ.A00)).A00.A04);
            C287325Zx r6 = C287275Zs.A07;
            C287265Zr r2 = C287215Zl.A02;
            Modifier A08 = C287205Zk.A08(C287195Zj.A0B(C51968G9o.A0Q(C287195Zj.A09(C51966G9m.A0V(modifier2), C287645aX.A00(r4), 0.0f), 12.0f, 1.5f, AnonymousClass5aQ.A00(r4).A0H), C287645aX.A00(r4), 18.0f, C287645aX.A00(r4), C287645aX.A01(r4, R.dimen.abc_button_padding_horizontal_material)), 54.0f - 1.5f);
            AnonymousClass5RD A01 = C291495hO.A01(r6, r4, r2);
            int A002 = C287425a7.A00(r4);
            C286565Wx r22 = (C286565Wx) r4;
            AnonymousClass5RM A04 = C286565Wx.A04(r22);
            Modifier A012 = C287435a8.A01(r4, A08);
            C62320sa r62 = C287485aD.A00;
            C51973G9u.A0z(r4, r22, r62);
            0sL r5 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r4, A01, A04, r5);
            0sL r1 = C287485aD.A02;
            if (r22.A0K || !C51972G9s.A1Q(r4, A002)) {
                C51971G9r.A13(r4, r1, A002);
            }
            0sL A1K = C51966G9m.A1K(r4, A012);
            C285245Qk r0 = Modifier.A00;
            Object A0m = C51967G9n.A0m(r4, -1752242789);
            if (A0m == AnonymousClass5XT.A00) {
                A0m = new C58726IwZ(0.75f, 6);
                r4.FLL(A0m);
            }
            Modifier A0D = C51973G9u.A0D(r22, r0, A0m);
            long A0M = C51966G9m.A0M(r4);
            AnonymousClass5Z4 A0g = C51966G9m.A0g(r4);
            int A03 = C51965G9l.A03(i3);
            AnonymousClass5ZZ.A0B(r4, A0D, A0g, str2, 5, 1, 2, A03, 390, 11128, A0M);
            Modifier A0B = C287195Zj.A0B(C287205Zk.A08(r0, A00), 0.0f, 5.0f, 0.0f, 0.0f);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A003 = C287425a7.A00(r4);
            AnonymousClass5RM A042 = C286565Wx.A04(r22);
            Modifier A013 = C287435a8.A01(r4, A0B);
            C51973G9u.A0z(r4, r22, r62);
            C287595aO.A00(r4, A0a, r5);
            if (C51965G9l.A1Y(r4, r22, A042, A0w) || !C51972G9s.A1Q(r4, A003)) {
                C51971G9r.A13(r4, r1, A003);
            }
            C287595aO.A00(r4, A013, A1K);
            C56666I6v.A06(r4, C287205Zk.A0D(r0, 113.0f), 11.0f);
            if (C51971G9r.A1R(r4)) {
                0fL.A00(-756038862);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59139J7v(modifier2, str2, i4, i, 0);
        }
    }
}
