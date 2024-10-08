package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* renamed from: X.Hds  reason: case insensitive filesystem */
public abstract class C55202Hds {
    public static final void A00(C286575Wy r19, C53029GhK ghK, int i) {
        int i2;
        String str;
        C53029GhK ghK2 = ghK;
        0qQ.A0B(ghK2, 0);
        C286575Wy r14 = r19;
        r14.ExV(-1704292441);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r14, ghK2) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1674130740, "com.instagram.wonderwall.ui.compose.screens.WallPostComposerScreen (WallPostComposerScreen.kt:32)");
            }
            C270284gU A02 = AnonymousClass6FW.A02(r14, ghK2.A07, 0);
            C56462Hyu.A00(r14, AnonymousClass5PI.A01(r14, new JG0(4, ghK2, A02), -839040679), 6);
            if (((C53321Gm7) C51967G9n.A0n(r14, A02, -1629227470)).A0A && (str = ((C53321Gm7) A02.getValue()).A05) != null) {
                Alignment alignment = C287215Zl.A06;
                C285245Qk r12 = Modifier.A00;
                AnonymousClass5RD A00 = C287675aa.A00(alignment, false);
                int A002 = C287425a7.A00(r14);
                C286565Wx r2 = (C286565Wx) r14;
                AnonymousClass5RM A04 = C286565Wx.A04(r2);
                Modifier A01 = C287435a8.A01(r14, r12);
                C51973G9u.A0y(r14, r2);
                C51971G9r.A12(r14, A00, A04);
                0sL r1 = C287485aD.A02;
                if (r2.A0K || !C51972G9s.A1Q(r14, A002)) {
                    C51971G9r.A13(r14, r1, A002);
                }
                C51965G9l.A18(r14, A01);
                Modifier A003 = JJP.A00(C51966G9m.A0T(r12), C287655aY.A00, 0);
                r14.ExS(-1880601854);
                int i4 = i2 & 14;
                boolean A1S = AnonymousClass7TF.A1S(i4, 4);
                Object ECw = r14.ECw();
                if (A1S || ECw == AnonymousClass5XT.A00) {
                    ECw = C58704IwD.A00(r14, ghK2, 9);
                }
                C62320sa A0y = C51965G9l.A0y(r2, ECw, false);
                boolean A1X = C51970G9q.A1X(r14, -1880600195, i4, 4);
                Object ECw2 = r14.ECw();
                if (A1X || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = C59098J6g.A01(ghK2, 7);
                    r14.FLL(ECw2);
                }
                I3F.A01(r14, A003, (C60173Jgs) null, str, A0y, C51965G9l.A0z(r2, ECw2), 0, 4);
                r14.ASN();
            }
            C51965G9l.A1X(r14, false);
            C55817Hnx hnx = ((C53321Gm7) A02.getValue()).A02;
            if (hnx != null) {
                I6X.A04(r14, hnx, 8);
            }
            if (0fL.A02()) {
                0fL.A00(-618665738);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            JGE.A01(ASQ, ghK2, i3, 18);
        }
    }
}
