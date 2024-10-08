package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.List;

/* renamed from: X.6Y5  reason: invalid class name */
public final class AnonymousClass6Y5 extends AnimatorListenerAdapter {
    public final /* synthetic */ C309306Xt A00;

    public AnonymousClass6Y5(C309306Xt r1) {
        this.A00 = r1;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        C309306Xt r0 = this.A00;
        AnonymousClass6Y5.super.setVisible(false, false);
        List<C309246Xn> list = r0.A05;
        if (list != null && !r0.A06) {
            for (C309246Xn A002 : list) {
                A002.A00();
            }
        }
    }
}
