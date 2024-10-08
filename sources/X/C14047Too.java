package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.Too  reason: case insensitive filesystem */
public final class C14047Too extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewPropertyAnimator A01;
    public final /* synthetic */ C249703kE A02;
    public final /* synthetic */ AnonymousClass4CO A03;

    public C14047Too(View view, ViewPropertyAnimator viewPropertyAnimator, C249703kE r3, AnonymousClass4CO r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = viewPropertyAnimator;
        this.A00 = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.A01.setListener((Animator.AnimatorListener) null);
        this.A00.setAlpha(1.0f);
        AnonymousClass4CO r2 = this.A03;
        C249703kE r1 = this.A02;
        r2.A0Q(r1);
        r2.A0A.remove(r1);
        r2.A0V();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
