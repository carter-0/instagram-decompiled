package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

public abstract class HT2 {
    public static final void A00(C62320sa r7, C286575Wy r8, int i) {
        int i2;
        0qQ.A0B(r7, 0);
        r8.ExV(-90769869);
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r8, r7) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-721034936, "com.instagram.aistudio.home.view.button.AiHomeShareButton (AiHomeShareButton.kt:16)");
            }
            AnonymousClass2DO A00 = C287975bA.A00(r8, R.drawable.instagram_direct_pano_outline_24, 0);
            long A0L = C51966G9m.A0L(r8);
            Modifier A04 = C287205Zk.A04(Modifier.A00);
            r8.ExS(-1238481175);
            boolean A1R = C51968G9o.A1R(i2);
            Object ECw = r8.ECw();
            if (A1R || ECw == AnonymousClass5XT.A00) {
                ECw = new MM7(r7, 36);
                r8.FLL(ECw);
            }
            C51965G9l.A1X(r8, false);
            C288165bT.A05(r8, C287635aW.A06(A04, (C62320sa) ECw), A00, A0L);
            if (0fL.A02()) {
                0fL.A00(320454674);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, r7, i, 14);
        }
    }
}
