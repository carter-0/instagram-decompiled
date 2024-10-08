package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Hdq  reason: case insensitive filesystem */
public abstract class C55200Hdq {
    public static final void A00(C286575Wy r8, ImageUrl imageUrl, String str, float f, int i) {
        int i2;
        String str2 = str;
        0qQ.A0B(str, 0);
        r8.ExV(878708003);
        int i3 = i;
        if ((i & 6) == 0) {
            i2 = G9t.A0O(r8, str) | i;
        } else {
            i2 = i;
        }
        ImageUrl imageUrl2 = imageUrl;
        if ((i & 48) == 0) {
            i2 |= G9t.A0P(r8, imageUrl);
        }
        float f2 = f;
        if ((i & 384) == 0) {
            i2 |= G9t.A01(r8, f);
        }
        if ((i2 & 147) != 146 || !r8.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-874582703, "com.instagram.wonderwall.ui.compose.components.WallUserProfilePhoto (WallUserProfilePhoto.kt:21)");
            }
            AnonymousClass6G3.A0B(r8, C51971G9r.A0Q(Modifier.A00, f), C51966G9m.A0o(r8, imageUrl, i2 >> 3), G9w.A0h(r8, str, 2131970048), 0);
            if (0fL.A02()) {
                0fL.A00(161046109);
            }
        } else {
            r8.Evl();
        }
        C286625Xd ASQ = r8.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59138J7u(imageUrl2, str2, f2, i3, 1);
        }
    }
}
