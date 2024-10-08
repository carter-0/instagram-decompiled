package X;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: X.4Wa  reason: invalid class name and case insensitive filesystem */
public final class C265724Wa implements Animation.AnimationListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ boolean A01;

    public final void onAnimationRepeat(Animation animation) {
    }

    public C265724Wa(View view, boolean z) {
        this.A00 = view;
        this.A01 = z;
    }

    public final void onAnimationEnd(Animation animation) {
        View view = this.A00;
        int i = 4;
        if (this.A01) {
            i = 0;
        }
        view.setVisibility(i);
    }

    public final void onAnimationStart(Animation animation) {
        this.A00.setVisibility(0);
    }
}
