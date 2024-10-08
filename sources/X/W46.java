package X;

import android.animation.ValueAnimator;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.profile.fragment.UserDetailFragment;

public final /* synthetic */ class W46 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ UserDetailFragment A00;

    public /* synthetic */ W46(UserDetailFragment userDetailFragment) {
        this.A00 = userDetailFragment;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C324466zK r0;
        UserDetailFragment userDetailFragment = this.A00;
        int A0M = AnonymousClass7TE.A0M(valueAnimator.getAnimatedValue());
        IgFrameLayout igFrameLayout = userDetailFragment.A0L;
        if (igFrameLayout != null && (r0 = userDetailFragment.A0O) != null) {
            igFrameLayout.setTranslationY((float) (A0M - r0.A05));
        }
    }
}
