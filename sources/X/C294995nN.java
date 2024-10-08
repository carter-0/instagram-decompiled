package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.5nN  reason: invalid class name and case insensitive filesystem */
public final class C294995nN implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C294985nM A00;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public C294995nN(C294985nM r1) {
        this.A00 = r1;
    }

    public final void onAnimationEnd(Animator animator) {
        C294985nM r3 = this.A00;
        View view = r3.A0a;
        view.setTag(R.id.view_animator, (Object) null);
        int i = r3.A03;
        if (i != -1) {
            view.setVisibility(i);
        }
        C295005nO r0 = r3.A05;
        if (r0 != null) {
            r0.onFinish();
        }
    }

    public final void onAnimationStart(Animator animator) {
        C294985nM r2 = this.A00;
        int i = r2.A04;
        if (i != -1) {
            r2.A0a.setVisibility(i);
        }
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.A0L(((Number) valueAnimator.getAnimatedValue()).floatValue());
    }
}
