package X;

import android.graphics.Rect;
import android.view.View;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.PZQ  reason: case insensitive filesystem */
public final class C73246PZQ implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ Ncv A01;

    public C73246PZQ(View view, Ncv ncv) {
        this.A01 = ncv;
        this.A00 = view;
    }

    public final void run() {
        Rect A0W = AnonymousClass7TE.A0W();
        FollowButton followButton = this.A01.A0A;
        followButton.getHitRect(A0W);
        A0W.top -= 15;
        A0W.left -= 15;
        A0W.bottom += 15;
        A0W.right += 15;
        C66581MXm.A18(A0W, followButton, this.A00);
    }
}
