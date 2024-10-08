package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.HZf  reason: case insensitive filesystem */
public abstract class C54949HZf {
    public static final void A00(C286575Wy r14, int i) {
        C286575Wy r10 = r14;
        r14.ExV(1932824191);
        int i2 = i;
        if (i != 0 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(848867656, "com.instagram.direct.fragment.thread.threaddetail.sections.lockedchat.Content (BottomSheetContent.kt:22)");
            }
            C285245Qk r6 = Modifier.A00;
            Modifier A0T = C51966G9m.A0T(r6);
            Modifier A0B = C287195Zj.A0B(A0T, 0.0f, 0.0f, 0.0f, 24.0f);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r14, 0);
            int A00 = C287425a7.A00(r14);
            C286565Wx r7 = (C286565Wx) r10;
            AnonymousClass5RM A04 = C286565Wx.A04(r7);
            Modifier A01 = C287435a8.A01(r14, A0B);
            C51973G9u.A0y(r14, r7);
            C51971G9r.A12(r14, A0Z, A04);
            0sL r1 = C287485aD.A02;
            if (r7.A0K || !C51972G9s.A1Q(r14, A00)) {
                C51971G9r.A13(r14, r1, A00);
            }
            C51965G9l.A18(r14, A01);
            C304676Et r4 = C304676Et.A00;
            AnonymousClass2DO A002 = C287975bA.A00(r14, R.drawable.ig_illustrations_illo_lock_chat_refresh, 0);
            Modifier A0F = C287205Zk.A0F(A0T, Float.NaN, 170.0f);
            C287265Zr r12 = C287215Zl.A00;
            AnonymousClass6G3.A03(r14, r4.AB0(r12, A0F), A002);
            String A003 = C304346Dc.A00(r14, 2131963794);
            long A0H = C51966G9m.A0H(r14);
            AnonymousClass5ZZ.A0Q(r10, r4.AB0(r12, C287195Zj.A0B(r6, 0.0f, 16.0f, 0.0f, 16.0f)), C51966G9m.A0e(r10), A003, A0H);
            C56649I6e.A01(r10, C287975bA.A00(r10, R.drawable.instagram_folder_pano_outline_24, 0), 2131963800);
            C56649I6e.A01(r10, C287975bA.A00(r10, R.drawable.instagram_eye_off_pano_outline_24, 0), 2131963802);
            C56649I6e.A01(r10, C287975bA.A00(r10, R.drawable.instagram_alert_off_pano_outline_24, 0), 2131963801);
            if (C51967G9n.A1R(r10)) {
                0fL.A00(-185952145);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            JG9.A01(ASQ, i2, 43);
        }
    }
}
