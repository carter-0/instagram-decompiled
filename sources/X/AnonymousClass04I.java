package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.04I  reason: invalid class name */
public final class AnonymousClass04I extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ 04K A01;
    public final /* synthetic */ AnonymousClass04L A02;

    public AnonymousClass04I(View view, 04K r2, AnonymousClass04L r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = view;
    }

    public final void onAnimationCancel(Animator animator) {
        this.A02.CvA(this.A00);
    }

    public final void onAnimationEnd(Animator animator) {
        this.A02.CvE(this.A00);
    }

    public final void onAnimationStart(Animator animator) {
        this.A02.CvM(this.A00);
    }
}
