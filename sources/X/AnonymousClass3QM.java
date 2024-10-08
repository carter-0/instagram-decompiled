package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.3QM  reason: invalid class name */
public final class AnonymousClass3QM extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewPropertyAnimator A01;
    public final /* synthetic */ AnonymousClass3AQ A02;
    public final /* synthetic */ C249703kE A03;

    public AnonymousClass3QM(View view, ViewPropertyAnimator viewPropertyAnimator, AnonymousClass3AQ r3, C249703kE r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = view;
        this.A01 = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        this.A00.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.A01.setListener((Animator.AnimatorListener) null);
        AnonymousClass3AQ r2 = this.A02;
        C249703kE r1 = this.A03;
        r2.A0O(r1);
        r2.A00.remove(r1);
        r2.A0V();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
