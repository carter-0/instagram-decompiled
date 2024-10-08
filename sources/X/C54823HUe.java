package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HUe  reason: case insensitive filesystem */
public abstract class C54823HUe {
    public static final void A00(C286575Wy r15, Modifier modifier, C62320sa r17, 0sK r18, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        0sK r12 = r18;
        C62320sa r13 = r17;
        AnonymousClass7TF.A1B(r13, 0, r12);
        r15.ExV(-494296183);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r15, r13) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r15, modifier2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0G(r15, r12);
        }
        if ((i3 & 147) != 146 || !r15.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-355508382, "com.instagram.barcelona.creation.voiceclips.AnimatedProgressContainer (AnimatedProgressContainer.kt:16)");
            }
            C270284gU A03 = I69.A03(r15, ((C53355Gmf) r13.invoke()).A02);
            int i7 = i3 >> 3;
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A00 = C287425a7.A00(r15);
            C286565Wx r3 = (C286565Wx) r15;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r15, modifier2);
            C51973G9u.A0y(r15, r3);
            C51971G9r.A12(r15, A0a, A04);
            0sL r5 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r15, A00)) {
                C51971G9r.A13(r15, r5, A00);
            }
            C51965G9l.A18(r15, A01);
            boolean AGu = r15.AGu(A03) | C51973G9u.A1N(r15, 46838559, i3);
            Object ECw = r15.ECw();
            if (AGu || ECw == AnonymousClass5XT.A00) {
                ECw = C51970G9q.A0u(r15, A03, r13, 38);
            }
            C286565Wx.A0L(r3, false);
            C51967G9n.A1M(ECw, r15, r12, i7 & 112);
            if (C51967G9n.A1R(r15)) {
                0fL.A00(1869863922);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r15.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i5, i4, 11, r12, r13, modifier2);
        }
    }
}
