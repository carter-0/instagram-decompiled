package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.Hba  reason: case insensitive filesystem */
public abstract class C55065Hba {
    public static final void A00(C62320sa r14, C286575Wy r15, int i) {
        int i2;
        C62320sa r3 = r14;
        0qQ.A0B(r14, 0);
        C286575Wy r8 = r15;
        r15.ExV(-584648997);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r15, r14) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r15.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1090813897, "com.instagram.newsfeed.followrequests.ui.compose.FollowRequestsError (FollowRequestsError.kt:19)");
            }
            C285245Qk r6 = Modifier.A00;
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A00 = C287425a7.A00(r15);
            C286565Wx r7 = (C286565Wx) r8;
            AnonymousClass5RM A04 = C286565Wx.A04(r7);
            Modifier A01 = C287435a8.A01(r15, r6);
            C51973G9u.A0y(r15, r7);
            C51971G9r.A12(r15, A0a, A04);
            0sL r1 = C287485aD.A02;
            if (r7.A0K || !C51972G9s.A1Q(r15, A00)) {
                C51971G9r.A13(r15, r1, A00);
            }
            C51965G9l.A18(r15, A01);
            C289515dj r5 = C289515dj.A00;
            C287605aT r4 = (C287605aT) C51974G9v.A0V(r15, -337347416);
            C286565Wx.A0L(r7, false);
            boolean A1W = C51971G9r.A1W(C54738HQv.A00(r4, r15, 6));
            int i4 = R.drawable.loadmore_icon_refresh;
            if (A1W) {
                i4 = R.drawable.loadmore_icon_refresh_pressed;
            }
            C288165bT.A06(r8, C287635aW.A04(r4, C51965G9l.A0L(r5, r6), r14), C287975bA.A00(r15, i4, 0), (C288095bM) null, C288035bG.A00(r15, 2131972371), 0, 24, 0);
            if (C51967G9n.A1R(r8)) {
                0fL.A00(269891138);
            }
        } else {
            r15.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, r3, i3, 29);
        }
    }
}
