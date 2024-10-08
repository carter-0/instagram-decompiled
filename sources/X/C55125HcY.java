package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.HcY  reason: case insensitive filesystem */
public abstract class C55125HcY {
    public static final void A00(C62320sa r19, C286575Wy r20, int i) {
        int i2;
        C62320sa r3 = r19;
        0qQ.A0B(r3, 0);
        C286575Wy r11 = r20;
        r11.ExV(-755601254);
        int i3 = i;
        if ((i & 14) == 0) {
            i2 = C41848B3p.A01(r11, r3) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 11) != 2 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-989214620, "com.instagram.schools.channels.ui.SchoolChannelCreationNuxComponent (SchoolChannelCreationNuxComponent.kt:24)");
            }
            Modifier A0T = C51966G9m.A0T(Modifier.A00);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r11, 0);
            int A00 = C287425a7.A00(r11);
            C286565Wx r7 = (C286565Wx) r11;
            AnonymousClass5RM A04 = C286565Wx.A04(r7);
            Modifier A01 = C287435a8.A01(r11, A0T);
            C51973G9u.A0y(r11, r7);
            C51971G9r.A12(r11, A0Z, A04);
            0sL r5 = C287485aD.A02;
            if (r7.A0K || !C51972G9s.A1Q(r11, A00)) {
                C51971G9r.A13(r11, r5, A00);
            }
            C51965G9l.A18(r11, A01);
            I7M.A03(r11, A0T, new C53512Gpi(R.drawable.instagram_illustrations_product_illustration_pi_plus_conversation, 144.0f), (CharSequence) null, C288035bG.A00(r11, 2131972716), 24624, 4068);
            C56649I6e.A03(r11, C287975bA.A00(r11, R.drawable.instagram_users_pano_outline_24, 0), C53509Gpf.A00(r11, C288035bG.A00(r11, 2131972711), 2131972710), 64, 4, false);
            C56649I6e.A03(r11, C287975bA.A00(r11, R.drawable.instagram_report_pano_outline_24, 0), C53509Gpf.A00(r11, C288035bG.A00(r11, 2131972713), 2131972712), 64, 4, false);
            C56649I6e.A03(r11, C287975bA.A00(r11, R.drawable.instagram_reactions_pano_outline_24, 0), C53509Gpf.A00(r11, C288035bG.A00(r11, 2131972715), 2131972714), 64, 4, false);
            AnonymousClass6CE.A00((C287605aT) null, r11, C287205Zk.A05(C287195Zj.A08(A0T, 4.0f), 44.0f), (AnonymousClass6CG) null, (AnonymousClass6CD) null, C51965G9l.A0m(r11), C288035bG.A00(r11, 2131956891), r3, (i2 & 14) | 24576, 456, true, false);
            if (C51967G9n.A1R(r11)) {
                0fL.A00(1311142275);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, r3, i3, 41);
        }
    }
}
