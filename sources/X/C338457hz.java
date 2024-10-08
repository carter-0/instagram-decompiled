package X;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.7hz  reason: invalid class name and case insensitive filesystem */
public final class C338457hz implements Animation.AnimationListener {
    public final /* synthetic */ SwipeRefreshLayout A00;

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public C338457hz(SwipeRefreshLayout swipeRefreshLayout) {
        this.A00 = swipeRefreshLayout;
    }

    public final void onAnimationEnd(Animation animation) {
        C227322j1 r0;
        SwipeRefreshLayout swipeRefreshLayout = this.A00;
        if (swipeRefreshLayout.A0G) {
            C338507i4 r1 = swipeRefreshLayout.A0C;
            r1.setAlpha(255);
            r1.start();
            if (swipeRefreshLayout.A0F && (r0 = swipeRefreshLayout.A0E) != null) {
                r0.Dcp();
            }
            swipeRefreshLayout.A02 = swipeRefreshLayout.A0B.getTop();
            return;
        }
        swipeRefreshLayout.A06();
    }
}
