package X;

import com.instagram.reels.ui.badge.ReelBrandingBadgeView;
import java.util.concurrent.TimeUnit;

/* renamed from: X.PEo  reason: case insensitive filesystem */
public final class C72661PEo implements C74257Prl {
    public final C14289TtN A00;
    public final ReelBrandingBadgeView A01;

    public final void A00() {
        C14289TtN ttN = this.A00;
        ttN.A01();
        this.A01.A02(ttN);
    }

    public C72661PEo(ReelBrandingBadgeView reelBrandingBadgeView, Integer num) {
        this.A01 = reelBrandingBadgeView;
        this.A00 = new C14289TtN(reelBrandingBadgeView.getContext(), num, TimeUnit.MILLISECONDS);
    }
}
