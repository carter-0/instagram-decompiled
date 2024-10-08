package X;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public final class WCR implements Animation.AnimationListener {
    public final /* synthetic */ SwipeRefreshLayout A00;

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public WCR(SwipeRefreshLayout swipeRefreshLayout) {
        this.A00 = swipeRefreshLayout;
    }

    public final void onAnimationEnd(Animation animation) {
        this.A00.A09((Animation.AnimationListener) null);
    }
}
