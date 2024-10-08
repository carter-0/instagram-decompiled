package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.I2l  reason: case insensitive filesystem */
public abstract class C56581I2l {
    public static final void A00(C286575Wy r8, AnonymousClass6HD r9, int i) {
        int i2;
        C286575Wy r3 = r8;
        r8.ExV(-351733379);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r8, r9) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1063067524, "com.instagram.direct.fragment.managefolders.PillRow (DirectManageFoldersAddChatsFragment.kt:166)");
            }
            C59011J2w j2w = C59011J2w.A00;
            Modifier A04 = C287195Zj.A04(Modifier.A00);
            boolean A1N = C51973G9u.A1N(r8, -1265250468, i2);
            Object ECw = r8.ECw();
            if (A1N || ECw == AnonymousClass5XT.A00) {
                ECw = new C74184PqQ(r9, 30);
                r8.FLL(ECw);
            }
            I63.A02(r3, A04, j2w, (0sP) ECw, 54, C51968G9o.A1Y(r8) ? 1 : 0);
            if (0fL.A02()) {
                0fL.A00(840103630);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r3.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, r9, i, 8);
        }
    }

    public static final void A01(C286575Wy r12, AnonymousClass6HD r13, int i) {
        int i2;
        C286575Wy r7 = r12;
        r12.ExV(-774502373);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r12, r13) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1864701943, "com.instagram.direct.fragment.managefolders.Selections (DirectManageFoldersAddChatsFragment.kt:114)");
            }
            C285245Qk r5 = Modifier.A00;
            AnonymousClass5RD A02 = C291495hO.A02(C287275Zs.A07, r12, C287215Zl.A02, 0);
            int A00 = C287425a7.A00(r12);
            C286565Wx r3 = (C286565Wx) r7;
            AnonymousClass5RM A04 = C286565Wx.A04(r3);
            Modifier A01 = C287435a8.A01(r12, r5);
            C51973G9u.A0y(r12, r3);
            C51971G9r.A12(r12, A02, A04);
            0sL r1 = C287485aD.A02;
            if (r3.A0K || !C51972G9s.A1Q(r12, A00)) {
                C51971G9r.A13(r12, r1, A00);
            }
            C51965G9l.A18(r12, A01);
            String A002 = C288035bG.A00(r12, 2131959670);
            AnonymousClass5ZZ.A0S(r7, C287195Zj.A08(r5, 8.0f), C51966G9m.A0b(r7), A002, C51966G9m.A0M(r12));
            C52747Gbz.A05(r7, C288035bG.A00(r7, 2131959672));
            A00(r7, r13, i2 & 14);
            if (C51967G9n.A1R(r7)) {
                0fL.A00(1187091707);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, r13, i, 9);
        }
    }

    public static final void A02(C286575Wy r4, AnonymousClass6HD r5, AnonymousClass62P r6, int i) {
        int i2;
        r4.ExV(1555831119);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r4, r6) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r4, r5);
        }
        if ((i2 & 19) != 18 || !r4.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1191419381, "com.instagram.direct.fragment.managefolders.Chats (DirectManageFoldersAddChatsFragment.kt:134)");
            }
            C52747Gbz.A02(r4, C287195Zj.A06(Modifier.A00), C288035bG.A00(r4, 2131959671));
            boolean AGw = r4.AGw(r6) | C51973G9u.A1O(r4, -658781487, i2);
            Object ECw = r4.ECw();
            if (AGw || ECw == AnonymousClass5XT.A00) {
                ECw = new C74191PqX(44, (Object) r5, (Object) r6);
                r4.FLL(ECw);
            }
            C51965G9l.A1X(r4, false);
            AnonymousClass6HY.A08(r4, (0sP) ECw);
            if (0fL.A02()) {
                0fL.A00(-1239036957);
            }
        } else {
            r4.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JGL.A01(ASQ, r6, r5, i, 48);
        }
    }
}
