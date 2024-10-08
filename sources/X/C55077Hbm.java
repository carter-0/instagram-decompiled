package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.Hbm  reason: case insensitive filesystem */
public abstract class C55077Hbm {
    public static final void A00(C286575Wy r11, 0sP r12, int i, boolean z) {
        int i2;
        r11.ExV(-457346335);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r11, r12) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= G9t.A0Z(r11, z);
        }
        if ((i2 & 19) != 18 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-473738084, "com.instagram.opal.impl.ui.OpalProfilePicSelectorContent (OpalProfilePicSelectorFragment.kt:136)");
            }
            C287075Yx r6 = new C287075Yx(AnonymousClass5aQ.A00(r11).A0C);
            Modifier A0U = C51969G9p.A0U();
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r11, 0);
            int A00 = C287425a7.A00(r11);
            C286565Wx r5 = (C286565Wx) r11;
            AnonymousClass5RM A04 = C286565Wx.A04(r5);
            Modifier A01 = C287435a8.A01(r11, A0U);
            C51973G9u.A0y(r11, r5);
            C51971G9r.A12(r11, A0Z, A04);
            0sL r1 = C287485aD.A02;
            if (r5.A0K || !C51972G9s.A1Q(r11, A00)) {
                C51971G9r.A13(r11, r1, A00);
            }
            C51965G9l.A18(r11, A01);
            String A002 = C304346Dc.A00(r11, 2131968887);
            Object A0m = C51967G9n.A0m(r11, -207244978);
            Object obj = AnonymousClass5XT.A00;
            C287605aT r10 = (C287605aT) C51972G9s.A0l(r11, A0m, obj);
            C286565Wx.A0L(r5, false);
            r11.ExS(-207241541);
            int i3 = i2 & 14;
            boolean A1S = AnonymousClass7TF.A1S(i3, 4);
            Object ECw = r11.ECw();
            if (A1S || ECw == obj) {
                ECw = new C51791G2a(r12, 3);
                r11.FLL(ECw);
            }
            C52636GaA.A0A(r11, C287635aW.A02(r6, r10, A0U, C51965G9l.A0y(r5, ECw, false)), C287975bA.A00(r11, R.drawable.instagram_user_circle_pano_outline_24, 0), A002);
            String A003 = C304346Dc.A00(r11, 2131968871);
            C287605aT r102 = (C287605aT) C51974G9v.A0W(r11, obj, -207228786);
            C286565Wx.A0L(r5, false);
            boolean A1R = C51972G9s.A1R(r11, -207225350, i3, 4);
            Object ECw2 = r11.ECw();
            if (A1R || ECw2 == obj) {
                ECw2 = new C51791G2a(r12, 4);
                r11.FLL(ECw2);
            }
            C52636GaA.A0A(r11, C287635aW.A02(r6, r102, A0U, C51965G9l.A0y(r5, ECw2, false)), C287975bA.A00(r11, R.drawable.instagram_photo_pano_outline_24, 0), A003);
            r11.ExS(-207218123);
            if (z) {
                String A004 = C304346Dc.A00(r11, 2131968892);
                C287605aT r2 = (C287605aT) C51974G9v.A0W(r11, obj, -207211282);
                C286565Wx.A0L(r5, false);
                boolean A1X = C51970G9q.A1X(r11, -207207717, i3, 4);
                Object ECw3 = r11.ECw();
                if (A1X || ECw3 == obj) {
                    ECw3 = new C51791G2a(r12, 5);
                    r11.FLL(ECw3);
                }
                C52636GaA.A0A(r11, C287635aW.A02(r6, r2, A0U, C51965G9l.A0y(r5, ECw3, false)), C287975bA.A00(r11, R.drawable.instagram_delete_pano_outline_24, 0), A004);
            }
            if (C51971G9r.A1S(r11, r5, false)) {
                0fL.A00(-1418244255);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            JGI.A01(ASQ, r12, i, 13, z);
        }
    }
}
