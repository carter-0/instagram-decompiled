package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

public abstract class HUJ {
    public static final void A00(C286575Wy r16, Modifier modifier, ImageUrl imageUrl, 0sP r19, int i) {
        int i2;
        Modifier modifier2 = modifier;
        0sP r4 = r19;
        int A02 = DbW.A02(0, modifier2, r4);
        C286575Wy r11 = r16;
        r11.ExV(2095217660);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r11, modifier2) | i;
        } else {
            i2 = i3;
        }
        ImageUrl imageUrl2 = imageUrl;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r11, imageUrl2);
        }
        if ((i3 & 384) == 0) {
            i2 |= G9t.A0G(r11, r4);
        }
        if ((i2 & 147) != 146 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1116746264, "com.instagram.archive.updateshub.PreviewNuxPog (PreviewNuxPog.kt:28)");
            }
            if (imageUrl != null) {
                r11.ExS(-1332593931);
                Object A0m = C51967G9n.A0m(r11, -2121195546);
                Object obj = AnonymousClass5XT.A00;
                if (A0m == obj) {
                    A0m = G9t.A0o(r11, (Object) null);
                }
                C284945Oz r9 = (C284945Oz) A0m;
                C286565Wx A0H = C51965G9l.A0H(r11, false);
                AnonymousClass2DN A01 = 1zC.A01(r11, imageUrl2, (i2 >> 3) & 14);
                C57119IPi iPi = C57119IPi.A00;
                Object A0m2 = C51967G9n.A0m(r11, -2121186220);
                if (A0m2 == obj) {
                    A0m2 = C59099J6h.A01(r11, r9, A02);
                }
                Modifier A0E = C51973G9u.A0E(A0H, modifier2, A0m2);
                boolean A1P = C51973G9u.A1P(r11, -2121183936, i2);
                Object ECw = r11.ECw();
                if (A1P || ECw == obj) {
                    ECw = new MMZ(r9, r4, 49);
                    r11.FLL(ECw);
                }
                GRY.A01(r11, C52638GaC.A01(r11, A0E, C51965G9l.A0y(A0H, ECw, false)), A01, (C288095bM) null, iPi, (0sP) null, 1572912, 0, 1976, true);
            } else {
                r11.ExS(-1332063242);
                AnonymousClass6G3.A03(r11, C287205Zk.A0D(modifier2, 110.0f), C287975bA.A00(r11, R.drawable.ig_illustrations_illo_my_week_refresh, 0));
            }
            if (C51970G9q.A1a(r11, false)) {
                0fL.A00(-1319142899);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r11.ASQ();
        if (ASQ != null) {
            ASQ.A06 = JGN.A01(r4, imageUrl2, modifier2, i3, 13);
        }
    }
}
