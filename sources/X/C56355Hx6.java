package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.wonderwall.model.WallInfo;

/* renamed from: X.Hx6  reason: case insensitive filesystem */
public abstract class C56355Hx6 {
    public static final void A00(C286575Wy r12, WallInfo wallInfo, C53047Ghf ghf, int i) {
        int i2;
        AnonymousClass7TF.A1H(wallInfo, ghf);
        C286575Wy r5 = r12;
        r12.ExV(2001124565);
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r12, wallInfo) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r12, ghf);
        }
        if ((i2 & 19) != 18 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-290698803, "com.instagram.wonderwall.ui.compose.components.AddToWallPostCard (AddToWallCard.kt:34)");
            }
            C285245Qk r3 = Modifier.A00;
            r12.ExS(-681041789);
            boolean A1S = AnonymousClass7TF.A1S(i2 & 112, 32) | C51968G9o.A1R(i2);
            Object ECw = r12.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = C51970G9q.A0v(r12, ghf, wallInfo, 38);
            }
            C51965G9l.A1X(r12, false);
            C55194Hdk.A00(r5, C51966G9m.A0V(C52638GaC.A01(r12, r3, (C62320sa) ECw)), AnonymousClass5PI.A01(r12, C59346JFy.A00(wallInfo, 19), 1795834272), 0.0f, 24576, 14, false, false);
            if (0fL.A02()) {
                0fL.A00(-188277724);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            JGM.A01(ASQ, wallInfo, ghf, i, 17);
        }
    }

    public static final void A01(C286575Wy r19, WallInfo wallInfo, C53047Ghf ghf, int i) {
        int i2;
        WallInfo wallInfo2 = wallInfo;
        C53047Ghf ghf2 = ghf;
        boolean A1U = AnonymousClass7TF.A1U(0, wallInfo2, ghf2);
        C286575Wy r10 = r19;
        r10.ExV(-1696395619);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r10, wallInfo2) | i;
        } else {
            i2 = i3;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r10, ghf2);
        }
        if ((i2 & 19) != 18 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1753882010, "com.instagram.wonderwall.ui.compose.components.AddToWallPostFloatingButton (AddToWallCard.kt:62)");
            }
            C285245Qk r8 = Modifier.A00;
            r10.ExS(-1991710517);
            boolean A1S = AnonymousClass7TF.A1S(i2 & 112, 32) | C51968G9o.A1Q(i2);
            Object ECw = r10.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = C51970G9q.A0v(r10, ghf2, wallInfo2, 39);
            }
            C286565Wx A0H = C51965G9l.A0H(r10, false);
            Modifier A0C = C287205Zk.A0C(C287195Zj.A0B(C52638GaC.A01(r10, r8, (C62320sa) ECw), 0.0f, 0.0f, 0.0f, 32.0f), 64.0f);
            AnonymousClass5ZQ r15 = AnonymousClass5ZN.A00;
            long j = AnonymousClass5RV.A00;
            Modifier A01 = C304766Fd.A01(C304816Fi.A03(C56169Hty.A01(A0C, r15, 12.0f, j, j, A1U), r15, 0.0f, C51965G9l.A0A(r10)), r15, C51966G9m.A08(r10));
            AnonymousClass5RD A0Z = C51966G9m.A0Z(false);
            int A00 = C287425a7.A00(r10);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A012 = C287435a8.A01(r10, A01);
            C51973G9u.A0y(r10, A0H);
            C51971G9r.A12(r10, A0Z, A04);
            0sL r2 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r10, A00)) {
                C51971G9r.A13(r10, r2, A00);
            }
            C51965G9l.A18(r10, A012);
            C288165bT.A06(r10, C287205Zk.A04(r8), C287975bA.A00(r10, R.drawable.instagram_add_pano_filled_24, 0), (C288095bM) null, C304346Dc.A00(r10, 2131952258), 384, 24, 0);
            if (C51967G9n.A1R(r10)) {
                0fL.A00(-1352546330);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            JGM.A01(ASQ, wallInfo2, ghf2, i3, 18);
        }
    }
}
