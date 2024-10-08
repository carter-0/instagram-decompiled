package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.HYe  reason: case insensitive filesystem */
public abstract class C54922HYe {
    public static final void A00(C286575Wy r20, Modifier modifier, C55473HiH hiH, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C55473HiH hiH2 = hiH;
        0qQ.A0B(hiH2, 1);
        C286575Wy r13 = r20;
        r13.ExV(863979025);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = G9t.A0O(r13, modifier2) | i;
        } else {
            i3 = i6;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= G9t.A0P(r13, hiH2);
        }
        if ((i3 & 91) != 18 || !r13.Bwn()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1301564847, "com.instagram.creation.genai.themes.ui.AiThemesMoreMenuButton (AiThemesMoreMenuButton.kt:40)");
            }
            Object A0m = C51967G9n.A0m(r13, -351708308);
            Object obj = AnonymousClass5XT.A00;
            C284945Oz r3 = (C284945Oz) C51974G9v.A0Z(r13, A0m, obj, false);
            C286565Wx A0H = C51965G9l.A0H(r13, false);
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A00 = C287425a7.A00(r13);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r13, modifier2);
            C51973G9u.A0y(r13, A0H);
            C51971G9r.A12(r13, A0a, A04);
            0sL r9 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r13, A00)) {
                C51971G9r.A13(r13, r9, A00);
            }
            C51965G9l.A18(r13, A01);
            C288165bT.A07(r13, C288235ba.A03(r13, Modifier.A00, C288035bG.A00(r13, 2131975247), new C58717IwQ(42, hiH2, r3)), C287975bA.A00(r13, R.drawable.instagram_more_horizontal_pano_outline_24, 0), C288035bG.A00(r13, 2131975246), 8, C51966G9m.A0I(r13));
            boolean A1W = C51971G9r.A1W(r3);
            HL4 hl4 = HL4.A02;
            long A002 = C54759HRr.A00(-50.0f, 8.0f);
            C59102J6k j6k = new C59102J6k(27, (Object) r3, (Object) hiH2);
            Object A0m2 = C51967G9n.A0m(r13, -1937970327);
            if (A0m2 == obj) {
                A0m2 = new C58672Ivh(r3, 47);
                r13.FLL(A0m2);
            }
            C56261HvV.A00((C56838IEj) null, r13, (Modifier) null, hl4, C51965G9l.A0y(A0H, A0m2, false), j6k, JFF.A00, 221568, 193, A002, A1W, false);
            if (C51967G9n.A1R(r13)) {
                0fL.A00(-302803551);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = GSJ.A01(hiH2, modifier2, i4, i6, 29);
        }
    }
}
