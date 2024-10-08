package X;

import android.view.TouchDelegate;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;

/* renamed from: X.Ml8  reason: case insensitive filesystem */
public final class C67273Ml8 implements Runnable {
    public final /* synthetic */ ReelAvatarWithBadgeView A00;

    public C67273Ml8(ReelAvatarWithBadgeView reelAvatarWithBadgeView) {
        this.A00 = reelAvatarWithBadgeView;
    }

    public final void run() {
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = this.A00;
        reelAvatarWithBadgeView.removeView(AnonymousClass7TE.A0c(reelAvatarWithBadgeView.A06));
        reelAvatarWithBadgeView.setTouchDelegate((TouchDelegate) null);
    }
}
