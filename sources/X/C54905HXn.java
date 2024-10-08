package X;

import androidx.compose.animation.SizeAnimationModifierElement;
import androidx.compose.ui.Modifier;

/* renamed from: X.HXn  reason: case insensitive filesystem */
public abstract class C54905HXn {
    public static final void A00(C286575Wy r23, 0sP r24, int i, int i2) {
        int i3;
        0sP r5 = r24;
        0qQ.A0B(r5, 1);
        C286575Wy r15 = r23;
        r15.ExV(-1962662903);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 6) == 0) {
            i3 = G9t.A05(r15, i5) | i2;
        } else {
            i3 = i4;
        }
        if ((i2 & 48) == 0) {
            i3 |= G9t.A0F(r15, r5);
        }
        if ((i3 & 19) != 18 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-908885539, "com.instagram.creation.capture.quickcapture.potato.capture.view.compose.PotatoCaptionFormField (PotatoCaptionFormField.kt:39)");
            }
            Object A0m = C51967G9n.A0m(r15, -1120012015);
            Object obj = AnonymousClass5XT.A00;
            C56547I1b i1b = (C56547I1b) C51972G9s.A0k(r15, A0m, obj);
            C286565Wx A0G = C51965G9l.A0G(r15);
            Object A0m2 = C51967G9n.A0m(r15, -1120010605);
            if (A0m2 == obj) {
                A0m2 = G9t.A0o(r15, "");
            }
            C284945Oz r6 = (C284945Oz) A0m2;
            C286565Wx.A0L(A0G, false);
            C60340gF r12 = C60340gF.A00;
            Object A0m3 = C51967G9n.A0m(r15, -1120008811);
            if (A0m3 == obj) {
                A0m3 = new MG0(i1b, (AnonymousClass4D7) null, 11);
                r15.FLL(A0m3);
            }
            C51968G9o.A1E(r15, A0G, A0m3, r12);
            Modifier A0U = C51970G9q.A0U(AnonymousClass6FZ.A00(C51969G9p.A0U()).Ezh(new SizeAnimationModifierElement(new C287965b7(new C289005cr(1 | (1 << 32)), 1.0f, 400.0f), C287215Zl.A0E)), i1b);
            String A1A = C51966G9m.A1A(r6);
            AnonymousClass5Z4 A05 = AnonymousClass5Z4.A00((C291805hu) null, (C289645dx) null, C51966G9m.A0g(r15), (C268454dQ) null, (AnonymousClass5ZD) null, (C291825hw) null, 0, 0, 0, 6291454, C51966G9m.A0H(r15), 0, 0, 0);
            C304776Fe r2 = new C304776Fe(AnonymousClass5aQ.A00(r15).A06);
            r15.ExS(-1120002656);
            boolean A1S = AnonymousClass7TF.A1S(i3 & 14, 4) | C51968G9o.A1S(i3);
            Object ECw = r15.ECw();
            if (A1S || ECw == obj) {
                ECw = new J6V(r6, r5, i5, 2);
                r15.FLL(ECw);
            }
            I5J.A02(r15, A0U, r2, A05, A1A, C51965G9l.A0z(A0G, ECw), AnonymousClass5PI.A01(r15, JJQ.A00(r6, 43), -1099598100), 0, 1, 100663296, 15064, true);
            if (0fL.A02()) {
                0fL.A00(389676977);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r15.ASQ();
        if (ASQ != null) {
            JGH.A01(ASQ, r5, i5, i4, 13);
        }
    }
}
