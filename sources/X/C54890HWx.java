package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;

/* renamed from: X.HWx  reason: case insensitive filesystem */
public abstract class C54890HWx {
    public static final void A00(C286575Wy r10, int i) {
        C286575Wy r4 = r10;
        r10.ExV(731093074);
        if (i != 0 || !r10.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(1792745596, "com.instagram.comments.mvvm.view.compose.RowCommentPinBadge (RowCommentPinBadge.kt:16)");
            }
            C288165bT.A07(r4, C287205Zk.A0C(C287195Zj.A0B(Modifier.A00, 4.0f, 3.0f, 0.0f, 0.0f), 12.0f), C51967G9n.A0J(r10, R.drawable.instagram_pin_pano_filled_24), C288035bG.A00(r10, 2131969490), 8, C51966G9m.A0L(r10));
            if (0fL.A02()) {
                0fL.A00(1075883084);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r4.ASQ();
        if (ASQ != null) {
            JG9.A01(ASQ, i, 17);
        }
    }
}
