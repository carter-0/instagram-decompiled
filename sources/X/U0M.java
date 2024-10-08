package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class U0M extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewPropertyAnimator A01;
    public final /* synthetic */ C249703kE A02;
    public final /* synthetic */ AnonymousClass4CN A03;
    public final /* synthetic */ C328287Ef A04;

    public U0M(View view, ViewPropertyAnimator viewPropertyAnimator, C249703kE r3, AnonymousClass4CN r4, C328287Ef r5) {
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = view;
        this.A04 = r5;
        this.A01 = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        View view = this.A00;
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        C328287Ef r0 = this.A04;
        if (r0 != null) {
            r0.AHu();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.A01;
        viewPropertyAnimator.setUpdateListener((ValueAnimator.AnimatorUpdateListener) null);
        viewPropertyAnimator.setListener((Animator.AnimatorListener) null);
        AnonymousClass4CN r2 = this.A03;
        C249703kE r1 = this.A02;
        r2.A0O(r1);
        r2.A00.remove(r1);
        r2.A0V();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
