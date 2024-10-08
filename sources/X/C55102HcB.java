package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HcB  reason: case insensitive filesystem */
public abstract class C55102HcB {
    public static final void A00(C286575Wy r19, Modifier modifier, C53268GlG glG, C62320sa r22, C62320sa r23, int i, int i2) {
        int i3;
        int i4;
        AnonymousClass6CG r14;
        Modifier modifier2 = modifier;
        C53268GlG glG2 = glG;
        C62320sa r4 = r22;
        C62320sa r9 = r23;
        DbZ.A0t(0, glG2, r4, r9);
        C286575Wy r12 = r19;
        r12.ExV(-1763700294);
        int i5 = i2;
        int i6 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C51970G9q.A05(G9t.A1T(r12, glG2, i6) ? 1 : 0) | i;
        } else {
            i3 = i6;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r12, modifier2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i6 & 384) == 0) {
            i3 |= G9t.A0G(r12, r4);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i6 & 3072) == 0) {
            i3 |= G9t.A0H(r12, r9);
        }
        if ((i3 & 1171) != 1170 || !r12.Bwn()) {
            if (i7 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(1369359817, "com.instagram.remindme.savesheet.ui.MediaReminderComponent (MediaReminderComponent.kt:31)");
            }
            C60340gF r10 = C60340gF.A00;
            boolean A1P = C51973G9u.A1P(r12, 2033363263, i3);
            Object ECw = r12.ECw();
            if (A1P || ECw == AnonymousClass5XT.A00) {
                ECw = new C66160MFx(r4, (AnonymousClass4D7) null, 9);
                r12.FLL(ECw);
            }
            C286565Wx A0E = C51975G9x.A0E(r12, ECw, r10);
            C287245Zp r102 = C287215Zl.A04;
            C287355a0 r7 = C287275Zs.A04;
            Modifier A08 = C287195Zj.A08(modifier2, 8.0f);
            AnonymousClass5RD A00 = C287395a4.A00(r7, r12, r102);
            int A002 = C287425a7.A00(r12);
            AnonymousClass5RM A04 = C286565Wx.A04(A0E);
            Modifier A01 = C287435a8.A01(r12, A08);
            C51973G9u.A0y(r12, A0E);
            C51971G9r.A12(r12, A00, A04);
            0sL r72 = C287485aD.A02;
            if (A0E.A0K || !C51972G9s.A1Q(r12, A002)) {
                C51971G9r.A13(r12, r72, A002);
            }
            C51965G9l.A18(r12, A01);
            AnonymousClass6FX r8 = AnonymousClass6FX.A00;
            String A003 = C288035bG.A00(r12, 2131965970);
            AnonymousClass5ZZ.A0Q(r12, G9w.A0I(r8.A00(Modifier.A00), 12.0f), C51966G9m.A0h(r12), A003, C51966G9m.A0H(r12));
            int intValue = glG2.A01.intValue();
            if (intValue == 0) {
                i4 = 2131965971;
            } else if (intValue == 1) {
                i4 = 2131965972;
            } else {
                throw AnonymousClass7TE.A1K();
            }
            String A004 = C288035bG.A00(r12, i4);
            C52399GQy A03 = AnonymousClass6CA.A00.A03(r12, 1, false, true);
            AnonymousClass6CD r15 = AnonymousClass6CD.SMALL;
            if (intValue != 0) {
                r14 = AnonymousClass6CF.A00;
            } else {
                r14 = IPU.A00;
            }
            AnonymousClass6CE.A00((C287605aT) null, r12, (Modifier) null, r14, r15, A03, A004, r9, ((i3 >> 9) & 14) | 1572864, 156, false, false);
            if (C51967G9n.A1R(r12)) {
                0fL.A00(-567882919);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG8(glG2, r9, r4, modifier2, i6, i5, 22);
        }
    }
}
