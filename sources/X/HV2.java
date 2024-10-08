package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

public abstract class HV2 {
    public static final void A00(C286575Wy r12, Modifier modifier, C62320sa r14, int i, int i2) {
        int i3;
        0qQ.A0B(r14, 0);
        C286575Wy r4 = r12;
        r12.ExV(-628775453);
        int i4 = i2;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = C41848B3p.A01(r12, r14) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r12, modifier);
        }
        if ((i3 & 19) != 18 || !r12.Bwn()) {
            if (i5 != 0) {
                modifier = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-566644370, "com.instagram.barcelona.feed.post.ui.PostTagButton (PostTagButton.kt:21)");
            }
            AnonymousClass2DO A00 = C287975bA.A00(r12, R.drawable.barcelona_hashtag_outline_16, 0);
            String A002 = C288035bG.A00(r12, 2131953719);
            C288165bT.A06(r4, C288235ba.A02(r12, C287205Zk.A0C(modifier, 20.0f), C51965G9l.A0R(0), r14), A00, C288075bK.A05, A002, 24576, 0, C51966G9m.A0M(r12));
            if (0fL.A02()) {
                0fL.A00(1640462918);
            }
        } else {
            r12.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            ASQ.A06 = GSJ.A01(modifier, r14, i4, i, 17);
        }
    }
}
