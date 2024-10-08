package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.HUd  reason: case insensitive filesystem */
public abstract class C54822HUd {
    public static final void A00(C286575Wy r11, int i, int i2) {
        int i3;
        C286625Xd ASQ;
        int i4;
        r11.ExV(2038568695);
        if ((i2 & 6) == 0) {
            i3 = G9t.A05(r11, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1704524422, "com.instagram.barcelona.creation.poll.ui.PollCountdownTimer (PollCountdownTimer.kt:17)");
            }
            long j = (long) i;
            if (j - (System.currentTimeMillis() / 1000) < 0) {
                if (0fL.A02()) {
                    0fL.A00(1780722132);
                }
                ASQ = r11.ASQ();
                if (ASQ != null) {
                    i4 = 0;
                    C59347JFz.A00(ASQ, i, i2, i4);
                }
                return;
            }
            Object A0m = C51967G9n.A0m(r11, -123649578);
            Object obj = AnonymousClass5XT.A00;
            if (A0m == obj) {
                A0m = G9t.A0o(r11, 1G0.A02(TimeUnit.SECONDS.toMillis(j - (System.currentTimeMillis() / 1000))));
            }
            C284945Oz r7 = (C284945Oz) A0m;
            C286565Wx r4 = (C286565Wx) r11;
            C286565Wx.A0L(r4, false);
            C60340gF r2 = C60340gF.A00;
            boolean A1N = C51973G9u.A1N(r11, -123643618, i3);
            Object ECw = r11.ECw();
            if (A1N || ECw == obj) {
                ECw = new C58735Iwi(i, 8, r7);
                r11.FLL(ECw);
            }
            C51968G9o.A1F(r11, r4, ECw, r2, false);
            AnonymousClass5ZZ.A0r(r11, C51966G9m.A0b(r11), C51968G9o.A14(r11, r7.getValue(), 2131953673), C51966G9m.A0M(r11));
            if (0fL.A02()) {
                0fL.A00(1776918677);
            }
        } else {
            r11.Evl();
        }
        ASQ = r11.ASQ();
        if (ASQ != null) {
            i4 = 1;
            C59347JFz.A00(ASQ, i, i2, i4);
        }
    }
}
