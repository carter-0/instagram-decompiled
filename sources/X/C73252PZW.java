package X;

import android.graphics.Rect;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;

/* renamed from: X.PZW  reason: case insensitive filesystem */
public final class C73252PZW implements Runnable {
    public final /* synthetic */ ReelAvatarWithBadgeView A00;
    public final /* synthetic */ C62320sa A01;

    public C73252PZW(ReelAvatarWithBadgeView reelAvatarWithBadgeView, C62320sa r2) {
        this.A00 = reelAvatarWithBadgeView;
        this.A01 = r2;
    }

    public final void run() {
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = this.A00;
        AnonymousClass0eM r3 = reelAvatarWithBadgeView.A06;
        if (AnonymousClass7TE.A0c(r3).getParent() == null) {
            reelAvatarWithBadgeView.addView(AnonymousClass7TE.A0c(r3));
        }
        C71396Ojv.A00(AnonymousClass7TE.A0c(r3), 21, this.A01);
        Rect A002 = reelAvatarWithBadgeView.getBadgeDrawableRect();
        if (A002 != null) {
            C66581MXm.A18(A002, AnonymousClass7TE.A0c(r3), reelAvatarWithBadgeView);
        }
    }
}
