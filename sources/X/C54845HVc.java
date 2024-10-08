package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.HVc  reason: case insensitive filesystem */
public abstract class C54845HVc {
    public static final void A00(C286575Wy r14, Modifier modifier, String str, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        String str2 = str;
        0qQ.A0B(str2, 0);
        C286575Wy r4 = r14;
        r14.ExV(-250935523);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r14, str2) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r14, modifier2);
        }
        if ((i3 & 19) != 18 || !r14.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1030931451, "com.instagram.barcelona.sponsored.ui.SponsoredLabelInHeader (SponsoredLabel.kt:40)");
            }
            AnonymousClass5ZZ.A0E(r4, C51967G9n.A0E(modifier2, 4.0f), C51966G9m.A0c(r14), str2, 1, i3 & 14, 15352, C51966G9m.A0M(r14));
            if (0fL.A02()) {
                0fL.A00(-1419379234);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59139J7v(modifier2, str2, i4, i5, 5);
        }
    }
}
