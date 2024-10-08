package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

public abstract class HUU {
    public static final void A00(C286575Wy r13, Modifier modifier, C53353Gmd gmd, C62320sa r16, int i, int i2) {
        int i3;
        C53353Gmd gmd2 = gmd;
        Modifier modifier2 = modifier;
        C62320sa r10 = r16;
        0qQ.A0B(r10, 0);
        C286575Wy r5 = r13;
        r13.ExV(-1303649747);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r5, r10) | i;
        } else {
            i3 = i5;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r5, modifier2);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r5, gmd);
        }
        if ((i3 & 147) != 146 || !r5.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                gmd2 = C53353Gmd.A04;
            }
            if (0fL.A02()) {
                0fL.A01(-1607898133, "com.instagram.barcelona.common.ui.button.RemoveAttachmentButton (RemoveAttachmentButton.kt:15)");
            }
            HUT.A00(r5, modifier2, C287975bA.A00(r5, R.drawable.instagram_x_pano_outline_24, 0), gmd2, C288035bG.A00(r5, 2131971989), r10, C51972G9s.A04(i3 << 6, i3 & 14), 0);
            if (0fL.A02()) {
                0fL.A00(327291351);
            }
        } else {
            r5.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i5, i4, 10, modifier2, gmd2, r10);
        }
    }
}
