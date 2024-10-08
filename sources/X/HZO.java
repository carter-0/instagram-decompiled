package X;

import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

public abstract class HZO {
    public static final void A00(C286575Wy r36, Alignment alignment, Modifier modifier, 0sL r39, 0sL r40, int i, int i2) {
        int i3;
        0sL r35 = r39;
        0sL r34 = r40;
        Alignment alignment2 = alignment;
        Modifier modifier2 = modifier;
        0sL r1 = r35;
        AnonymousClass7TG.A1Q(r1, r34);
        C286575Wy r10 = r36;
        r10.ExV(-18731858);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r10, modifier2) | i;
        } else {
            i3 = i6;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r10, alignment2);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i6 & 384) == 0) {
            i3 |= G9t.A0G(r10, r1);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i6 & 3072) == 0) {
            i3 |= G9t.A0H(r10, r34);
        }
        if ((i3 & 1171) != 1170 || !r10.Bwn()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                alignment2 = C287215Zl.A0A;
            }
            if (0fL.A02()) {
                0fL.A01(-1223653364, "com.instagram.creator.agent.settings.swipablerow.SwipeableRow (SwipeableRow.kt:30)");
            }
            Object A0m = C51967G9n.A0m(r10, -733290411);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = G9t.A0o(r10, Float.valueOf(0.0f));
            }
            C284945Oz r12 = (C284945Oz) A0m;
            C286565Wx r7 = (C286565Wx) r10;
            C286565Wx.A0L(r7, false);
            Object A0m2 = C51967G9n.A0m(r10, -733288879);
            if (A0m2 == obj) {
                A0m2 = C287705ad.A00(0.0f);
                r10.FLL(A0m2);
            }
            AnonymousClass5b4 r5 = (AnonymousClass5b4) A0m2;
            C286565Wx.A0L(r7, false);
            C262224Cq r4 = ((AnonymousClass6FV) C51974G9v.A0Y(r10, r10.ECw(), obj)).A00;
            Alignment alignment3 = C287215Zl.A0E;
            AnonymousClass5RD A00 = C287675aa.A00(alignment3, false);
            int A002 = C287425a7.A00(r10);
            AnonymousClass5RM A04 = C286565Wx.A04(r7);
            Modifier A01 = C287435a8.A01(r10, modifier2);
            C62320sa r19 = C287485aD.A00;
            C51973G9u.A0z(r10, r7, r19);
            0sL r3 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r10, A00, A04, r3);
            0sL r2 = C287485aD.A02;
            if (r7.A0K || !C51972G9s.A1Q(r10, A002)) {
                C51971G9r.A13(r10, r2, A002);
            }
            0sL r13 = C287485aD.A04;
            C287595aO.A00(r10, A01, r13);
            C289515dj r14 = C289515dj.A00;
            C285245Qk r15 = Modifier.A00;
            Object A0m3 = C51967G9n.A0m(r10, 1350740608);
            if (A0m3 == obj) {
                A0m3 = G9w.A0t(r10, r12, 42);
            }
            Modifier AAz = r14.AAz(alignment2, C51973G9u.A0E(r7, r15, A0m3));
            AnonymousClass5RD A003 = C287675aa.A00(alignment3, false);
            int A004 = C287425a7.A00(r10);
            AnonymousClass5RM A042 = C286565Wx.A04(r7);
            Modifier A012 = C287435a8.A01(r10, AAz);
            C51973G9u.A0z(r10, r7, r19);
            C287595aO.A00(r10, A003, r3);
            if (C51965G9l.A1Y(r10, r7, A042, A0w) || !C51972G9s.A1Q(r10, A004)) {
                C51971G9r.A13(r10, r2, A004);
            }
            C287595aO.A00(r10, A012, r13);
            C51972G9s.A11(r10, r35, i3 >> 6);
            boolean A1Z = C51967G9n.A1Z(r10, r5, 1350746531);
            Object ECw = r10.ECw();
            if (A1Z || ECw == obj) {
                ECw = G9w.A0t(r10, r5, 43);
            }
            Modifier A013 = C56164Htt.A01(r15, C51965G9l.A0z(r7, ECw));
            AnonymousClass6Gj r26 = AnonymousClass6Gj.Horizontal;
            boolean A1S = C51973G9u.A1S(r10, r5, r4, 1350753441);
            Object ECw2 = r10.ECw();
            if (A1S || ECw2 == obj) {
                ECw2 = J6W.A00(r10, r4, r5, r12, 36);
            }
            JNP A005 = GQV.A00(r10, C51965G9l.A0z(r7, ECw2));
            boolean A1S2 = C51973G9u.A1S(r10, r4, r5, 1350764325);
            Object ECw3 = r10.ECw();
            if (A1S2 || ECw3 == obj) {
                ECw3 = new C66192MHi(r5, r12, (AnonymousClass4D7) null, r4);
                r10.FLL(ECw3);
            }
            C286565Wx.A0L(r7, false);
            Modifier Ezh = A013.Ezh(new DraggableElement(A005, r26, (C287605aT) null, GQV.A00, (0sK) ECw3, true, false));
            AnonymousClass5RD A006 = C287675aa.A00(alignment3, false);
            int A007 = C287425a7.A00(r10);
            AnonymousClass5RM A043 = C286565Wx.A04(r7);
            Modifier A014 = C287435a8.A01(r10, Ezh);
            C51973G9u.A0z(r10, r7, r19);
            C287595aO.A00(r10, A006, r3);
            if (C51965G9l.A1Y(r10, r7, A043, A0w) || !C51972G9s.A1Q(r10, A007)) {
                C51971G9r.A13(r10, r2, A007);
            }
            C287595aO.A00(r10, A014, r13);
            C51972G9s.A11(r10, r34, i3 >> 9);
            if (C51967G9n.A1R(r10)) {
                0fL.A00(1050513898);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG8(alignment2, r35, modifier2, r34, i6, i4, 16);
        }
    }
}
