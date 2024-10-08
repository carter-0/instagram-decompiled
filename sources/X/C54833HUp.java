package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.HUp  reason: case insensitive filesystem */
public abstract class C54833HUp {
    public static final void A00(C286575Wy r14, Modifier modifier, C62320sa r16, int i, int i2) {
        int i3;
        C62320sa r12 = r16;
        Modifier modifier2 = modifier;
        C286575Wy r7 = r14;
        r14.ExV(2025447707);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r14, modifier) | i;
        } else {
            i3 = i6;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0F(r14, r12);
        }
        if ((i3 & 19) != 18 || !r14.Bwn()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i7 != 0) {
                r12 = null;
            }
            if (0fL.A02()) {
                0fL.A01(-319249464, "com.instagram.barcelona.feed.post.ui.PinnedPostLabel (PinnedPostLabel.kt:10)");
            }
            C54842HUz.A00(r7, modifier2, (C69316NjH) null, C288035bG.A00(r14, 2131953672), (String) null, r12, (C62320sa) null, (0sL) null, R.drawable.instagram_pin_pano_outline_24, ((i3 << 9) & 7168) | ((i3 << 15) & 3670016), 436, false);
            if (0fL.A02()) {
                0fL.A00(-1040612350);
            }
        } else {
            r14.Evl();
        }
        C286625Xd ASQ = r7.ASQ();
        if (ASQ != null) {
            ASQ.A06 = GSJ.A01(modifier2, r12, i4, i6, 15);
        }
    }
}
