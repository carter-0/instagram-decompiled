package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.Hat  reason: case insensitive filesystem */
public abstract class C55022Hat {
    public static final void A00(C62320sa r15, C286575Wy r16, int i) {
        int i2;
        C62320sa r3 = r15;
        0qQ.A0B(r15, 0);
        C286575Wy r12 = r16;
        r12.ExV(959133184);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r12, r15) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r12.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1397745190, "com.instagram.friendmap.view.compose.FriendMapNotesWithLocationNux (FriendMapNotesWithLocationNux.kt:23)");
            }
            C285245Qk r10 = Modifier.A00;
            Modifier A0T = C51966G9m.A0T(r10);
            AnonymousClass5RD A0X = C51968G9o.A0X(r12);
            int A00 = C287425a7.A00(r12);
            C286565Wx r5 = (C286565Wx) r12;
            AnonymousClass5RM A04 = C286565Wx.A04(r5);
            Modifier A01 = C287435a8.A01(r12, A0T);
            C51973G9u.A0y(r12, r5);
            C51971G9r.A12(r12, A0X, A04);
            0sL r1 = C287485aD.A02;
            if (r5.A0K || !C51972G9s.A1Q(r12, A00)) {
                C51971G9r.A13(r12, r1, A00);
            }
            C51965G9l.A18(r12, A01);
            AnonymousClass6G3.A05(r12, A0T, C287975bA.A00(r12, R.drawable.friend_map_notes_illo_friend_map_notes, 0));
            String A002 = C304346Dc.A00(r12, 2131962756);
            AnonymousClass5ZZ.A0X(r12, C287195Zj.A0B(r10, C287645aX.A01(r12, R.dimen.action_button_min_width), C287645aX.A01(r12, R.dimen.abc_button_padding_horizontal_material), C287645aX.A01(r12, R.dimen.action_button_min_width), 0.0f), I5Q.A00(r12), A002, C51966G9m.A0H(r12));
            C56649I6e.A02(r12, C287975bA.A00(r12, R.drawable.instagram_content_note_add_pano_outline_24, 0), new C53509Gpf(C304346Dc.A00(r12, 2131962749), C304346Dc.A00(r12, 2131962753)));
            C56649I6e.A05(r12, new C53509Gpf(C304346Dc.A00(r12, 2131962750), C304346Dc.A00(r12, 2131962754)), R.drawable.instagram_users_pano_outline_24);
            C56649I6e.A05(r12, new C53509Gpf(C304346Dc.A00(r12, 2131962751), C304346Dc.A00(r12, 2131962755)), R.drawable.instagram_location_arrow_pano_outline_24);
            r12.ASN();
            C60340gF r4 = C60340gF.A00;
            boolean A1N = C51973G9u.A1N(r12, 532035291, i2);
            Object ECw = r12.ECw();
            if (A1N || ECw == AnonymousClass5XT.A00) {
                ECw = new C66181MGs(r3, (AnonymousClass4D7) null, 37);
                r12.FLL(ECw);
            }
            if (C51972G9s.A1S(r12, r5, ECw, r4)) {
                0fL.A00(1832650568);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r12.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, r3, i3, 24);
        }
    }
}
