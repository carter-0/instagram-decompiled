package X;

import android.view.View;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;

/* renamed from: X.EpT  reason: case insensitive filesystem */
public abstract class C49104EpT {
    public static final boolean A00(AnonymousClass6PB r3) {
        if (r3.A01 != null) {
            return false;
        }
        View inflate = r3.A09.inflate();
        0qQ.A0C(inflate, C273654mx.A00(3086));
        ReelBrandingBadgeView reelBrandingBadgeView = (ReelBrandingBadgeView) inflate;
        r3.A01 = reelBrandingBadgeView;
        int A04 = AnonymousClass7TG.A04(reelBrandingBadgeView.getContext());
        ReelBrandingBadgeView reelBrandingBadgeView2 = r3.A01;
        if (reelBrandingBadgeView2 != null) {
            reelBrandingBadgeView2.setTranslationX((float) A04);
        }
        if (r3.A01 != null) {
            return true;
        }
        return false;
    }
}
