package X;

import android.view.TouchDelegate;
import com.instagram.direct.inbox.notes.ui.SquareAvatarWithBadgeView;

/* renamed from: X.Mlu  reason: case insensitive filesystem */
public final class C67320Mlu implements Runnable {
    public final /* synthetic */ SquareAvatarWithBadgeView A00;

    public C67320Mlu(SquareAvatarWithBadgeView squareAvatarWithBadgeView) {
        this.A00 = squareAvatarWithBadgeView;
    }

    public final void run() {
        SquareAvatarWithBadgeView squareAvatarWithBadgeView = this.A00;
        squareAvatarWithBadgeView.removeView(AnonymousClass7TE.A0c(squareAvatarWithBadgeView.A05));
        squareAvatarWithBadgeView.setTouchDelegate((TouchDelegate) null);
    }
}
