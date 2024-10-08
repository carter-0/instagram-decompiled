package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.List;
import kotlin.Deprecated;

/* renamed from: X.3YO  reason: invalid class name */
public abstract class AnonymousClass3YO {
    public static final void A00(Context context, AnonymousClass0iw r4, GradientSpinnerAvatarView gradientSpinnerAvatarView, String str) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(gradientSpinnerAvatarView, 2);
        0qQ.A0B(str, 3);
        if (context != null) {
            gradientSpinnerAvatarView.A04();
            gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, r4, new SimpleImageUrl(str));
            gradientSpinnerAvatarView.A05();
            gradientSpinnerAvatarView.setBottomBadgeDrawable(context.getDrawable(R.drawable.avatar_bottom_badge_facebook));
            gradientSpinnerAvatarView.A01 = 0nA.A04(context, 3);
        }
    }

    @Deprecated(message = "We're migrating this to ContentCompatibility StateFlow pattern, please reach out to @lineil for questions")
    public static final boolean A01(UserSession userSession, AnonymousClass3Q3 r6, boolean z) {
        String str;
        if (r6 != null) {
            MediaUploadMetadata BRG = r6.BRG();
            if (BRG != null) {
                str = BRG.A03;
            } else {
                str = null;
            }
            if (("com.instagram.barcelona".equals(str) && !182.A06(0Tu.A05, userSession, 36320000096608109L)) || r6.AdG() != AnonymousClass3QO.DEFAULT || r6.CJs() || r6.CJe() || r6.BtF()) {
                return false;
            }
            if (!r6.CJg() || !z || 182.A06(0Tu.A05, userSession, 36329423254863979L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean A02(1Xj r3, boolean z) {
        boolean z2;
        List At1;
        if (r3.A12() == 19 || ((At1 = r3.A0C.At1()) != null && At1.contains("FB"))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            return z2;
        }
        if (r3.A5O() || z2) {
            return true;
        }
        return false;
    }
}
