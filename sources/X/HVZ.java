package X;

import android.content.res.Resources;
import androidx.compose.ui.Modifier;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;

public abstract class HVZ {
    public static final void A00(Modifier modifier, C286575Wy r14, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        0qQ.A0B(modifier, 1);
        C286575Wy r11 = r14;
        r14.ExV(-2011648080);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 6) == 0) {
            i3 = G9t.A05(r14, i) | i2;
        } else {
            i3 = i4;
        }
        if ((i2 & 48) == 0) {
            i3 |= G9t.A0P(r14, modifier);
        }
        if ((i3 & 19) != 18 || !r14.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1166503316, "com.instagram.barcelona.quotemedia.QuoteCountButton (QuoteCountButton.kt:24)");
            }
            AnonymousClass5ZQ A00 = AnonymousClass5ZN.A00();
            Modifier A09 = C287195Zj.A09(C304766Fd.A01(C304766Fd.A01(modifier, A00, C285595Rx.A02(AnonymousClass5RX.A0K[(int) (AnonymousClass5RW.A01 & 63)], AnonymousClass5RW.A03(AnonymousClass5RW.A01), AnonymousClass5RW.A02(AnonymousClass5RW.A01), AnonymousClass5RW.A01(AnonymousClass5RW.A01), 0.4f)), A00, C285595Rx.A02(AnonymousClass5RX.A0K[(int) (AnonymousClass5RW.A09 & 63)], AnonymousClass5RW.A03(AnonymousClass5RW.A09), AnonymousClass5RW.A02(AnonymousClass5RW.A09), AnonymousClass5RW.A01(AnonymousClass5RW.A09), 0.2f)), 10.0f, 5.0f);
            AnonymousClass5RD A0L = C51975G9x.A0L(r14);
            int A002 = C287425a7.A00(r14);
            C286565Wx r8 = (C286565Wx) r11;
            AnonymousClass5RM A04 = C286565Wx.A04(r8);
            Modifier A01 = C287435a8.A01(r14, A09);
            C51973G9u.A0y(r14, r8);
            C51971G9r.A12(r14, A0L, A04);
            0sL r1 = C287485aD.A02;
            if (r8.A0K || !C51972G9s.A1Q(r14, A002)) {
                C51971G9r.A13(r14, r1, A002);
            }
            C51965G9l.A18(r14, A01);
            AnonymousClass2DO A003 = C287975bA.A00(r14, R.drawable.instagram_search_pano_filled_24, 0);
            C285245Qk r82 = Modifier.A00;
            C288165bT.A02(r14, C287205Zk.A0C(r82, 14.0f), A003, C51966G9m.A0E(r14));
            Resources A0B = C51975G9x.A0B(r14);
            0qQ.A07(A0B);
            AnonymousClass5ZZ.A0W(r11, C287195Zj.A0B(r82, 2.0f, 0.0f, 0.0f, 0.0f), C51966G9m.A0f(r11), C253673rC.A04(A0B, Integer.valueOf(i), IgNetworkConsentStorage.MAX_ENTRIES, true, false), C51966G9m.A0E(r11));
            if (C51967G9n.A1R(r11)) {
                0fL.A00(-443521049);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            JGH.A01(ASQ, modifier2, i5, i4, 4);
        }
    }
}
