package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Hc8  reason: case insensitive filesystem */
public abstract class C55099Hc8 {
    public static final void A00(C286575Wy r24, ImageUrl imageUrl, int i) {
        int i2;
        C286575Wy r0 = r24;
        r0.ExV(-1633224372);
        int i3 = i;
        ImageUrl imageUrl2 = imageUrl;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r0, imageUrl2) | i;
        } else {
            i2 = i3;
        }
        if ((i2 & 3) != 2 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1085358454, "com.instagram.reels.music.bottomsheet.MusicVinylMimicryBottomsheetContent (MusicVinylMimicryBottomsheetFragment.kt:97)");
            }
            C287265Zr r5 = C287215Zl.A00;
            C285245Qk r3 = Modifier.A00;
            Modifier A09 = C287195Zj.A09(r3, 0.0f, C287645aX.A00(r0));
            AnonymousClass5RD A00 = C291495hO.A00(C287275Zs.A07, r0, r5);
            int A002 = C287425a7.A00(r0);
            C286565Wx r2 = (C286565Wx) r0;
            AnonymousClass5RM A04 = C286565Wx.A04(r2);
            Modifier A01 = C287435a8.A01(r0, A09);
            C51973G9u.A0y(r0, r2);
            C51971G9r.A12(r0, A00, A04);
            0sL r7 = C287485aD.A02;
            if (r2.A0K || !C51972G9s.A1Q(r0, A002)) {
                C51971G9r.A13(r0, r7, A002);
            }
            C51965G9l.A18(r0, A01);
            r0.ExS(1470333536);
            if (imageUrl != null) {
                C286575Wy r17 = r0;
                AnonymousClass6G3.A00(r17, (Alignment) null, C287195Zj.A0B(C287205Zk.A0C(r3, 232.0f), 0.0f, 0.0f, 0.0f, 25.0f), (C288195bW) null, C287995bC.A00(new AnonymousClass9Wo(C51970G9q.A0N(r0), C51970G9q.A0f(r0), imageUrl2, AnonymousClass05K.A01, "", "", -45.0f, -1, false, false), r0), C288075bK.A04, (String) null, 0.0f, 25008, 104);
            }
            C286565Wx.A0L(r2, false);
            AnonymousClass5ZZ.A0u(r0, C51966G9m.A0d(r0), C288035bG.A00(r0, 2131967775), C51966G9m.A0H(r0));
            String A003 = C288035bG.A00(r0, 2131967774);
            long A0H = C51966G9m.A0H(r0);
            C286575Wy r11 = r0;
            AnonymousClass5ZZ.A0X(r11, C287195Zj.A09(r3, 0.0f, C287645aX.A00(r0)), C51966G9m.A0c(r0), A003, A0H);
            if (C51967G9n.A1R(r0)) {
                0fL.A00(1299569017);
            }
        } else {
            r0.Evl();
        }
        C286625Xd ASQ = r0.ASQ();
        if (ASQ != null) {
            JGD.A01(ASQ, imageUrl2, i3, 40);
        }
    }
}
