package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* renamed from: X.HQx  reason: case insensitive filesystem */
public abstract class C54740HQx {
    public static final void A00(C286575Wy r14, Alignment alignment, Modifier modifier, 0sK r17, int i, int i2, boolean z) {
        int i3;
        boolean z2 = z;
        Alignment alignment2 = alignment;
        Modifier modifier2 = modifier;
        r14.ExV(1781813501);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r14, modifier2) | i;
        } else {
            i3 = i6;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r14, alignment);
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i6 & 384) == 0) {
            i3 |= G9t.A0a(r14, z2);
        }
        0sK r9 = r17;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i6 & 3072) == 0) {
            i3 |= G9t.A0H(r14, r9);
        }
        if ((i3 & 1171) != 1170 || !r14.Bwn()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                alignment2 = C287215Zl.A0E;
            }
            if (i8 != 0) {
                z2 = false;
            }
            if (0fL.A02()) {
                0fL.A01(982371219, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:64)");
            }
            AnonymousClass5RD A00 = C287675aa.A00(alignment2, z2);
            boolean A1Z = C51965G9l.A1Z(r14, A00, AnonymousClass7TF.A1S(i3 & 7168, C249703kE.FLAG_MOVED));
            Object ECw = r14.ECw();
            if (A1Z || ECw == AnonymousClass5XT.A00) {
                ECw = new JGF(3, r9, A00);
                r14.FLL(ECw);
            }
            AnonymousClass6ID.A01(r14, modifier2, (0sL) ECw, i3 & 14, 0);
            if (0fL.A02()) {
                0fL.A00(-955722092);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r14.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J9E(modifier2, alignment2, r9, i6, i4, 0, z2);
        }
    }
}
