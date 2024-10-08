package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import java.util.Iterator;

/* renamed from: X.HwC  reason: case insensitive filesystem */
public abstract class C56299HwC {
    public static final void A00(C286575Wy r16, C284945Oz r17, C62320sa r18, AnonymousClass62P r19, int i, boolean z) {
        int i2;
        C286575Wy r14 = r16;
        r14.ExV(-1353344266);
        int i3 = i;
        AnonymousClass62P r4 = r19;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r14, r4) | i;
        } else {
            i2 = i3;
        }
        C284945Oz r6 = r17;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r14, r6);
        }
        boolean z2 = z;
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0a(r14, z2);
        }
        C62320sa r5 = r18;
        if ((i3 & 3072) == 0) {
            i2 |= G9t.A0H(r14, r5);
        }
        if ((i2 & 1171) != 1170 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(693188461, "com.instagram.direct.ui.professional.Layout (DirectMoveThreadActionBottomSheet.kt:119)");
            }
            C285245Qk r10 = Modifier.A00;
            AnonymousClass5RD A02 = C291495hO.A02(C287275Zs.A07, r14, C287215Zl.A02, 0);
            int A00 = C287425a7.A00(r14);
            C286565Wx r9 = (C286565Wx) r14;
            AnonymousClass5RM A04 = C286565Wx.A04(r9);
            Modifier A01 = C287435a8.A01(r14, r10);
            C51973G9u.A0y(r14, r9);
            C51971G9r.A12(r14, A02, A04);
            0sL r1 = C287485aD.A02;
            if (r9.A0K || !C51972G9s.A1Q(r14, A00)) {
                C51971G9r.A13(r14, r1, A00);
            }
            C51965G9l.A18(r14, A01);
            Iterator A17 = C51968G9o.A17(r14, r4, 507065447);
            while (A17.hasNext()) {
                2PM r12 = (2PM) A17.next();
                String A002 = C66786McX.A00(C51968G9o.A0I(r14), C51968G9o.A0h(r14), r12.A00());
                boolean A1T = C51969G9p.A1T(r6, r12);
                boolean A1U = C51966G9m.A1U(r14, r12, C51973G9u.A1O(r14, 624929902, i2));
                Object ECw = r14.ECw();
                if (A1U || ECw == AnonymousClass5XT.A00) {
                    ECw = new C73667Phg(41, r12, r6);
                    r14.FLL(ECw);
                }
                A01(r14, A002, C51965G9l.A0y(r9, ECw, false), 0, A1T);
            }
            C286565Wx.A0L(r9, false);
            String A003 = C288035bG.A00(r14, 2131964252);
            r14.ExS(507076780);
            boolean A1O = C51972G9s.A1O(i2);
            Object ECw2 = r14.ECw();
            if (A1O || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = new C73907Pli(r5, 33);
                r14.FLL(ECw2);
            }
            I7L.A05(r14, (Modifier) null, A003, C51965G9l.A0y(r9, ECw2, false), (i2 << 3) & 7168, 0, 32756, z);
            if (C51967G9n.A1R(r14)) {
                0fL.A00(2130495350);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8U(r4, r5, r6, i3, 7, z2);
        }
    }

    public static final void A01(C286575Wy r12, String str, C62320sa r14, int i, boolean z) {
        int i2;
        C286575Wy r3 = r12;
        r12.ExV(-2036107348);
        int i3 = i;
        String str2 = str;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r12, str) | i;
        } else {
            i2 = i;
        }
        boolean z2 = z;
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r12, z2);
        }
        C62320sa r9 = r14;
        if ((i & 384) == 0) {
            i2 |= G9t.A0G(r12, r14);
        }
        if ((i2 & 147) != 146 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1189295954, "com.instagram.direct.ui.professional.Folder (DirectMoveThreadActionBottomSheet.kt:139)");
            }
            C52636GaA.A0N(r3, C51967G9n.A0J(r12, R.drawable.instagram_folder_pano_outline_24), new C57123IPm(z2, r14), str2, i2 & 14, 130782);
            if (0fL.A02()) {
                0fL.A00(1979347794);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59140J7w(r9, str2, i3, 2, z2);
        }
    }
}
