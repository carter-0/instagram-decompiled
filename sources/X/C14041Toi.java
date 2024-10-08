package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.Toi  reason: case insensitive filesystem */
public final class C14041Toi extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewPropertyAnimator A01;
    public final /* synthetic */ C249703kE A02;
    public final /* synthetic */ AnonymousClass4CO A03;

    public C14041Toi(View view, ViewPropertyAnimator viewPropertyAnimator, C249703kE r3, AnonymousClass4CO r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = view;
        this.A01 = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        this.A00.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.A01.setListener((Animator.AnimatorListener) null);
        AnonymousClass4CO r2 = this.A03;
        C249703kE r1 = this.A02;
        r2.A0O(r1);
        r2.A00.remove(r1);
        r2.A0V();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
