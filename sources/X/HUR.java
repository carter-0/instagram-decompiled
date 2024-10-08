package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

public abstract class HUR {
    public static final void A00(C286575Wy r14, Modifier modifier, C62320sa r16, int i, int i2, boolean z) {
        int i3;
        Modifier modifier2 = modifier;
        C62320sa r11 = r16;
        0qQ.A0B(r11, 0);
        C286575Wy r6 = r14;
        r14.ExV(1580599782);
        int i4 = i2;
        int i5 = i;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r6, r11) | i;
        } else {
            i3 = i5;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0Z(r6, z2);
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i5 & 384) == 0) {
            i3 |= G9t.A0Q(r6, modifier2);
        }
        if ((i3 & 147) != 146 || !r6.Bwn()) {
            if (i6 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-162908050, "com.instagram.barcelona.common.ui.button.VolumeButton (AudioButton.kt:11)");
            }
            int i7 = R.drawable.instagram_volume_pano_outline_24;
            if (z) {
                i7 = R.drawable.instagram_volume_off_pano_outline_24;
            }
            AnonymousClass2DO A00 = C287975bA.A00(r6, i7, 0);
            int i8 = 2131953289;
            if (z) {
                i8 = 2131953290;
            }
            HUT.A00(r6, modifier2, A00, (C53353Gmd) null, C288035bG.A00(r6, i8), r11, (i3 & 14) | ((i3 << 3) & 7168), 16);
            if (0fL.A02()) {
                0fL.A00(-1188421531);
            }
        } else {
            r6.Evl();
        }
        C286625Xd ASQ = r6.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new J8R(i5, i4, 1, modifier2, r11, z);
        }
    }
}
