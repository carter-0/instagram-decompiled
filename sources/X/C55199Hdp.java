package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.wonderwall.model.WallPostInfo;
import com.instagram.wonderwall.model.WallPostItem;

/* renamed from: X.Hdp  reason: case insensitive filesystem */
public abstract class C55199Hdp {
    public static final void A00(C286575Wy r19, WallPostItem wallPostItem, C66528MVg mVg, int i, int i2) {
        int i3;
        long j;
        boolean z;
        C66528MVg mVg2 = mVg;
        WallPostItem wallPostItem2 = wallPostItem;
        0qQ.A0B(wallPostItem2, 0);
        C286575Wy r15 = r19;
        r15.ExV(1750034128);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r15, wallPostItem2) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r15, mVg2);
        }
        if ((i3 & 19) != 18 || !r15.Bwn()) {
            if (i6 != 0) {
                mVg2 = null;
            }
            if (0fL.A02()) {
                0fL.A01(-1473146104, "com.instagram.wonderwall.ui.compose.components.WallUFI (WallUFI.kt:26)");
            }
            WallPostInfo BeB = wallPostItem2.BeB();
            0lg A0j = C51969G9p.A0j(r15);
            boolean A1Z = G9t.A1Z(r15, A0j, BeB, 302642834);
            Object ECw = r15.ECw();
            if (A1Z || ECw == AnonymousClass5XT.A00) {
                if (!182.A06(DbS.A0J(A0j, 0), A0j, 36322353739409504L) || (BeB.A0B && BeB.A04.A03)) {
                    z = false;
                } else {
                    z = true;
                }
                ECw = C51967G9n.A0e(r15, z);
            }
            boolean A1a = AnonymousClass7TE.A1a(ECw);
            C286565Wx A0H = C51965G9l.A0H(r15, false);
            C287245Zp r4 = C287215Zl.A04;
            C285245Qk r8 = Modifier.A00;
            AnonymousClass5RD A0Q = C51965G9l.A0Q(r15, r4);
            int A00 = C287425a7.A00(r15);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r15, r8);
            C51973G9u.A0y(r15, A0H);
            C51971G9r.A12(r15, A0Q, A04);
            0sL r9 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r15, A00)) {
                C51971G9r.A13(r15, r9, A00);
            }
            C51965G9l.A18(r15, A01);
            r15.ExS(-756903921);
            if (A1a) {
                Modifier A03 = C287205Zk.A03(G9w.A0I(r8, 8.0f));
                boolean A1Y = C51974G9v.A1Y(r15, -756899388, i3) | C51973G9u.A1G(i3);
                Object ECw2 = r15.ECw();
                if (A1Y || ECw2 == AnonymousClass5XT.A00) {
                    ECw2 = C51970G9q.A0v(r15, mVg2, wallPostItem2, 44);
                }
                C288165bT.A06(r15, C287635aW.A05(A03, (C287625aV) null, (String) null, C51965G9l.A0y(A0H, ECw2, false), true), C287975bA.A00(r15, R.drawable.instagram_reply_pano_outline_24, 0), (C288095bM) null, C304346Dc.A00(r15, 2131971084), 0, 24, 0);
            }
            C286565Wx.A0L(A0H, false);
            Modifier A032 = C287205Zk.A03(r8);
            boolean A1U = C51968G9o.A1U(r15, BeB, C51974G9v.A1Y(r15, -756888003, i3), C51975G9x.A1N(i3));
            Object ECw3 = r15.ECw();
            if (A1U || ECw3 == AnonymousClass5XT.A00) {
                ECw3 = new C20704Wxb(45, wallPostItem2, BeB, mVg2);
                r15.FLL(ECw3);
            }
            Modifier A0V = C51969G9p.A0V(A0H, A032, ECw3);
            boolean z2 = BeB.A0A;
            int i7 = R.drawable.instagram_heart_pano_outline_24;
            if (z2) {
                i7 = R.drawable.instagram_heart_pano_filled_24;
            }
            AnonymousClass2DO A002 = C287975bA.A00(r15, i7, 0);
            int i8 = 2131964931;
            if (z2) {
                i8 = 2131964944;
            }
            String A003 = C304346Dc.A00(r15, i8);
            if (z2) {
                j = C51967G9n.A0a(r15, -756870890).A0Q;
            } else {
                j = C51967G9n.A0a(r15, -756869866).A0n;
            }
            C286565Wx.A0L(A0H, false);
            C288165bT.A08(r15, A0V, A002, A003, j);
            C55197Hdn.A00(r15, (Modifier) null, BeB, (C62320sa) null, 0, 62, false, false, false);
            if (C51967G9n.A1R(r15)) {
                0fL.A00(1217726228);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r15.ASQ();
        if (ASQ != null) {
            ASQ.A06 = GSJ.A01(mVg2, wallPostItem2, i4, i5, 40);
        }
    }
}
