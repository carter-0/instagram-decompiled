package X;

import android.graphics.Rect;
import com.instagram.direct.inbox.notes.ui.SquareAvatarWithBadgeView;

/* renamed from: X.PYv  reason: case insensitive filesystem */
public final class C73217PYv implements Runnable {
    public final /* synthetic */ SquareAvatarWithBadgeView A00;
    public final /* synthetic */ C62320sa A01;

    public C73217PYv(SquareAvatarWithBadgeView squareAvatarWithBadgeView, C62320sa r2) {
        this.A00 = squareAvatarWithBadgeView;
        this.A01 = r2;
    }

    public final void run() {
        SquareAvatarWithBadgeView squareAvatarWithBadgeView = this.A00;
        AnonymousClass0eM r3 = squareAvatarWithBadgeView.A05;
        if (AnonymousClass7TE.A0c(r3).getParent() == null) {
            squareAvatarWithBadgeView.addView(AnonymousClass7TE.A0c(r3));
        }
        C71397Ojw.A00(AnonymousClass7TE.A0c(r3), 34, this.A01);
        Rect A002 = squareAvatarWithBadgeView.getBadgeDrawableRect();
        if (A002 != null) {
            C66581MXm.A18(A002, AnonymousClass7TE.A0c(r3), squareAvatarWithBadgeView);
        }
    }
}
