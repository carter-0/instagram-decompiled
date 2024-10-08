package X;

import androidx.compose.foundation.lazy.LazyListState;

public abstract class HVU {
    public static final void A00(LazyListState lazyListState, C286575Wy r7, C62320sa r8, int i) {
        int i2;
        AnonymousClass7TG.A1N(lazyListState, r8);
        r7.ExV(-1471007431);
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r7, lazyListState) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= G9t.A0F(r7, r8);
        }
        if ((i2 & 91) != 18 || !r7.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(269758433, "com.instagram.barcelona.permalink.ui.component.DetectScrollUp (DetectScrollUp.kt:10)");
            }
            r7.ExS(-941056251);
            boolean z = true;
            boolean A1S = AnonymousClass7TF.A1S(i2 & 14, 4);
            if ((i2 & 112) != 32) {
                z = false;
            }
            boolean z2 = A1S | z;
            Object ECw = r7.ECw();
            if (z2 || ECw == AnonymousClass5XT.A00) {
                ECw = new MHC((Object) r8, (Object) lazyListState, (AnonymousClass4D7) null, 22);
                r7.FLL(ECw);
            }
            C51972G9s.A10(r7, ECw, lazyListState);
            if (0fL.A02()) {
                0fL.A00(-119318325);
            }
        } else {
            r7.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            JGL.A01(ASQ, lazyListState, r8, i, 22);
        }
    }
}
