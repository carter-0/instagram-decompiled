package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.Tos  reason: case insensitive filesystem */
public final class C14048Tos extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ ViewPropertyAnimator A03;
    public final /* synthetic */ C249703kE A04;
    public final /* synthetic */ AnonymousClass4CN A05;
    public final /* synthetic */ C328287Ef A06;

    public C14048Tos(View view, ViewPropertyAnimator viewPropertyAnimator, C249703kE r3, AnonymousClass4CN r4, C328287Ef r5, int i, int i2) {
        this.A05 = r4;
        this.A04 = r3;
        this.A06 = r5;
        this.A00 = i;
        this.A02 = view;
        this.A01 = i2;
        this.A03 = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        this.A06.AHu();
        if (this.A00 != 0) {
            this.A02.setTranslationX(0.0f);
        }
        if (this.A01 != 0) {
            this.A02.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        ViewPropertyAnimator viewPropertyAnimator = this.A03;
        viewPropertyAnimator.setUpdateListener((ValueAnimator.AnimatorUpdateListener) null);
        viewPropertyAnimator.setListener((Animator.AnimatorListener) null);
        AnonymousClass4CN r2 = this.A05;
        C249703kE r1 = this.A04;
        r2.A0P(r1);
        r2.A04.remove(r1);
        r2.A0V();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
