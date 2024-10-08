package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.HZs  reason: case insensitive filesystem */
public abstract class C54962HZs {
    public static final void A00(C286575Wy r18, C62320sa r19, C62320sa r20, int i) {
        int i2;
        C62320sa r14 = r19;
        0qQ.A0B(r14, 0);
        C286575Wy r9 = r18;
        r9.ExV(-898705696);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r9, r14) | i;
        } else {
            i2 = i3;
        }
        C62320sa r15 = r20;
        if ((i & 48) == 0) {
            i2 |= G9t.A0F(r9, r15);
        }
        if ((i2 & 19) != 18 || !r9.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(972277987, "com.instagram.direct.screenshotblocking.ui.BottomSheetContent (ScreenshotBlockingNux.kt:92)");
            }
            C285245Qk r6 = Modifier.A00;
            Modifier A0T = C51966G9m.A0T(r6);
            Modifier A0B = C287195Zj.A0B(A0T, 0.0f, 0.0f, 0.0f, 24.0f);
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r9, 0);
            int A00 = C287425a7.A00(r9);
            C286565Wx r5 = (C286565Wx) r9;
            AnonymousClass5RM A04 = C286565Wx.A04(r5);
            Modifier A01 = C287435a8.A01(r9, A0B);
            C51973G9u.A0y(r9, r5);
            C51971G9r.A12(r9, A0Z, A04);
            0sL r3 = C287485aD.A02;
            if (r5.A0K || !C51972G9s.A1Q(r9, A00)) {
                C51971G9r.A13(r9, r3, A00);
            }
            C51965G9l.A18(r9, A01);
            C304676Et r52 = C304676Et.A00;
            AnonymousClass2DO A002 = C287975bA.A00(r9, R.drawable.ig_illustrations_illo_screenshot_block_refresh, 0);
            Modifier A0F = C287205Zk.A0F(A0T, Float.NaN, 170.0f);
            C287265Zr r4 = C287215Zl.A00;
            AnonymousClass6G3.A03(r9, r52.AB0(r4, A0F), A002);
            String A003 = C304346Dc.A00(r9, 2131963819);
            long A0H = C51966G9m.A0H(r9);
            C286575Wy r16 = r9;
            AnonymousClass5ZZ.A0Q(r16, r52.AB0(r4, C287195Zj.A0B(r6, 32.0f, 16.0f, 32.0f, 16.0f)), C51966G9m.A0e(r9), A003, A0H);
            C56649I6e.A01(r9, C287975bA.A00(r9, R.drawable.instagram_circle_block_off_pano_outline_24, 0), 2131963816);
            C56649I6e.A01(r9, C287975bA.A00(r9, R.drawable.instagram_report_pano_outline_24, 0), 2131963817);
            C56649I6e.A01(r9, C287975bA.A00(r9, R.drawable.instagram_app_imessage_pano_outline_24, 0), 2131963818);
            I7L.A02(r9, A0T, (CharSequence) null, C304346Dc.A00(r9, 2131968772), C304346Dc.A00(r9, 2131964884), r14, r15, ((i2 << 3) & 112) | 384 | ((i2 << 15) & 3670016), 24472, false, true);
            if (C51967G9n.A1R(r9)) {
                0fL.A00(-835988962);
            }
        } else {
            r9.Evl();
        }
        C286625Xd ASQ = r9.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JGO(r14, r15, i3, 16);
        }
    }
}
