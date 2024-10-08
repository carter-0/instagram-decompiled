package X;

import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

/* renamed from: X.Oku  reason: case insensitive filesystem */
public final class C71455Oku implements Animation.AnimationListener {
    public final /* synthetic */ TransitionDrawable A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass7NY A02;

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public C71455Oku(TransitionDrawable transitionDrawable, View view, AnonymousClass7NY r3) {
        this.A02 = r3;
        this.A01 = view;
        this.A00 = transitionDrawable;
    }

    public final void onAnimationEnd(Animation animation) {
        AccelerateInterpolator accelerateInterpolator = this.A02.A00;
        0qQ.A0B(accelerateInterpolator, 3);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.05f, 1.0f, 1.05f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setDuration(1000);
        scaleAnimation.setInterpolator(accelerateInterpolator);
        View view = this.A01;
        view.startAnimation(scaleAnimation);
        TransitionDrawable transitionDrawable = this.A00;
        if (transitionDrawable != null) {
            view.postDelayed(new C73054PUl(transitionDrawable), 750);
        }
    }
}
