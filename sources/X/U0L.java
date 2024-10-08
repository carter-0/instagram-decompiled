package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class U0L extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewPropertyAnimator A01;
    public final /* synthetic */ C249703kE A02;
    public final /* synthetic */ AnonymousClass4CN A03;

    public U0L(View view, ViewPropertyAnimator viewPropertyAnimator, C249703kE r3, AnonymousClass4CN r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = view;
        this.A01 = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        this.A00.setTranslationY(0.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.A00.setAlpha(1.0f);
        ViewPropertyAnimator viewPropertyAnimator = this.A01;
        viewPropertyAnimator.setUpdateListener((ValueAnimator.AnimatorUpdateListener) null);
        viewPropertyAnimator.setListener((Animator.AnimatorListener) null);
        AnonymousClass4CN r2 = this.A03;
        C249703kE r1 = this.A02;
        r2.A0Q(r1);
        r2.A0A.remove(r1);
        r2.A0V();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
