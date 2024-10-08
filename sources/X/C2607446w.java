package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.46w  reason: invalid class name and case insensitive filesystem */
public final class C2607446w extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewPropertyAnimator A01;
    public final /* synthetic */ AnonymousClass3AQ A02;
    public final /* synthetic */ C249703kE A03;

    public C2607446w(View view, ViewPropertyAnimator viewPropertyAnimator, AnonymousClass3AQ r3, C249703kE r4) {
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = viewPropertyAnimator;
        this.A00 = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.A01.setListener((Animator.AnimatorListener) null);
        this.A00.setAlpha(1.0f);
        AnonymousClass3AQ r2 = this.A02;
        C249703kE r1 = this.A03;
        r2.A0Q(r1);
        r2.A06.remove(r1);
        r2.A0V();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
