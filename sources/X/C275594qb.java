package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.4qb  reason: invalid class name and case insensitive filesystem */
public final class C275594qb extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ ViewPropertyAnimator A03;
    public final /* synthetic */ AnonymousClass3AQ A04;
    public final /* synthetic */ C249703kE A05;

    public C275594qb(View view, ViewPropertyAnimator viewPropertyAnimator, AnonymousClass3AQ r3, C249703kE r4, int i, int i2) {
        this.A04 = r3;
        this.A05 = r4;
        this.A00 = i;
        this.A02 = view;
        this.A01 = i2;
        this.A03 = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.A00 != 0) {
            this.A02.setTranslationX(0.0f);
        }
        if (this.A01 != 0) {
            this.A02.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.A03.setListener((Animator.AnimatorListener) null);
        AnonymousClass3AQ r2 = this.A04;
        C249703kE r1 = this.A05;
        r2.A0P(r1);
        r2.A04.remove(r1);
        r2.A0V();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
