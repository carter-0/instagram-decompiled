package X;

import androidx.compose.ui.Modifier;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.HWw  reason: case insensitive filesystem */
public abstract class C54889HWw {
    public static final void A00(C286575Wy r11, ImageUrl imageUrl, int i) {
        int i2;
        0qQ.A0B(imageUrl, 0);
        C286575Wy r5 = r11;
        r11.ExV(975829025);
        if ((i & 14) == 0) {
            i2 = G9t.A0O(r11, imageUrl) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !r11.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-316057145, "com.instagram.comments.mvvm.view.compose.RowCommentLikedByAuthorBadge (RowCommentLikedByCreatorBadge.kt:20)");
            }
            C288165bT.A07(r5, C287205Zk.A0C(C287195Zj.A07(Modifier.A00, 4.0f), 12.0f), C287975bA.A00(r11, R.drawable.instagram_heart_pano_filled_24, 0), C288035bG.A00(r11, 2131964945), 392, AnonymousClass5aQ.A00(r11).A0T);
            GRY.A04(r5, C51966G9m.A0o(r5, imageUrl, i2), new GS6(12.0f, 12.0f, 2.0f, 1.0f), 56, 2044);
            if (0fL.A02()) {
                0fL.A00(-13215668);
            }
        } else {
            r11.Evl();
        }
        C286625Xd ASQ = r5.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, imageUrl, i, 26);
        }
    }
}
