package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.Hwj  reason: case insensitive filesystem */
public abstract class C56332Hwj {
    public static final void A00(C286575Wy r19, Modifier modifier, 0sP r21, int i) {
        int i2;
        Modifier modifier2 = modifier;
        0sP r4 = r21;
        boolean A1U = AnonymousClass7TF.A1U(0, modifier2, r4);
        C286575Wy r10 = r19;
        r10.ExV(477367566);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r10, modifier2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0F(r10, r4);
        }
        if ((i2 & 91) != 18 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(64363060, "com.instagram.potato.reply.PotatoReplySheetFormField (PotatoReplySheetFormField.kt:37)");
            }
            Object A0m = C51967G9n.A0m(r10, -1480412971);
            Object obj = AnonymousClass5XT.A00;
            C56547I1b i1b = (C56547I1b) C51972G9s.A0k(r10, A0m, obj);
            C286565Wx A0H = C51965G9l.A0H(r10, false);
            Object A0m2 = C51967G9n.A0m(r10, -1480411561);
            if (A0m2 == obj) {
                A0m2 = G9t.A0o(r10, "");
            }
            C284945Oz A0J = C51965G9l.A0J(A0H, A0m2, false);
            Modifier A0U = C51970G9q.A0U(modifier2, i1b);
            String A1A = C51966G9m.A1A(A0J);
            AnonymousClass5Z4 A05 = AnonymousClass5Z4.A00((C291805hu) null, (C289645dx) null, C51966G9m.A0g(r10), (C268454dQ) null, (AnonymousClass5ZD) null, (C291825hw) null, 0, 0, 0, 6291454, C51966G9m.A0H(r10), 0, 0, 0);
            C304776Fe r12 = new C304776Fe(AnonymousClass5aQ.A00(r10).A06);
            Object A0m3 = C51967G9n.A0m(r10, -1480406759);
            if (A0m3 == obj) {
                A0m3 = new G4S(A0J, 9);
                r10.FLL(A0m3);
            }
            I5J.A02(r10, A0U, r12, A05, A1A, C51965G9l.A0z(A0H, A0m3), JJS.A00(r10, A0J, r4, 17, 992086193), 0, A1U ? 1 : 0, 100663344, 15064, A1U);
            if (0fL.A02()) {
                0fL.A00(375291040);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            JGO.A01(ASQ, modifier2, r4, i3, 40);
        }
    }

    public static final void A01(C286575Wy r17, C62320sa r18, int i, int i2, boolean z) {
        int i3;
        boolean z2 = z;
        C286575Wy r7 = r17;
        r7.ExV(-2009886417);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = G9t.A0Y(r7, z2) | i;
        } else {
            i3 = i6;
        }
        C62320sa r15 = r18;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= G9t.A0F(r7, r15);
        }
        if ((i3 & 91) != 18 || !r7.Bwn()) {
            z2 = C51966G9m.A1R(i5, z2);
            if (0fL.A02()) {
                0fL.A01(-1074375327, "com.instagram.potato.reply.GenerateButton (PotatoReplySheetFormField.kt:85)");
            }
            Alignment alignment = C287215Zl.A09;
            C285245Qk r2 = Modifier.A00;
            Modifier A0X = C51966G9m.A0X(C51968G9o.A0P(HRF.A00(C287205Zk.A08(C287205Zk.A0D(r2, 52.0f), 36.0f), C51970G9q.A00(z2 ? 1 : 0)), 44.0f), C51966G9m.A0G(r7));
            boolean A1S = C51975G9x.A1S(r7, 1646929462, i3);
            Object ECw = r7.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = new C51802G2l((Object) r15, 49);
                r7.FLL(ECw);
            }
            C286565Wx A0H = C51965G9l.A0H(r7, false);
            Modifier A01 = C288235ba.A01(r7, A0X, (C287625aV) null, (String) null, (C62320sa) ECw, 6, z2);
            AnonymousClass5RD A00 = C287675aa.A00(alignment, false);
            int A002 = C287425a7.A00(r7);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r7, A01);
            C51973G9u.A0y(r7, A0H);
            C51971G9r.A12(r7, A00, A04);
            0sL r1 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r7, A002)) {
                C51971G9r.A13(r7, r1, A002);
            }
            C51965G9l.A18(r7, A012);
            C288165bT.A04(r7, C287205Zk.A04(r2), C287975bA.A00(r7, R.drawable.instagram_direct_pano_filled_24, 0), C51966G9m.A0A(r7));
            if (C51967G9n.A1R(r7)) {
                0fL.A00(-1304202728);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59131J7n(r15, i6, i4, 7, z2);
        }
    }
}
