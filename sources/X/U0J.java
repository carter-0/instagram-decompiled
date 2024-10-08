package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class U0J extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewPropertyAnimator A01;
    public final /* synthetic */ V4L A02;
    public final /* synthetic */ AnonymousClass4CO A03;

    public U0J(View view, ViewPropertyAnimator viewPropertyAnimator, V4L v4l, AnonymousClass4CO r4) {
        this.A03 = r4;
        this.A02 = v4l;
        this.A01 = viewPropertyAnimator;
        this.A00 = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.A01.setListener((Animator.AnimatorListener) null);
        C13989Tnp.A16(this.A00);
        AnonymousClass4CO r3 = this.A03;
        V4L v4l = this.A02;
        r3.A0C(v4l.A04);
        r3.A02.remove(v4l.A04);
        r3.A0V();
    }

    public final void onAnimationStart(Animator animator) {
    }
}
