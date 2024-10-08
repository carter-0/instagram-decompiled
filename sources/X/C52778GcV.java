package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.GcV  reason: case insensitive filesystem */
public final class C52778GcV extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C52778GcV(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A04 = obj2;
        this.A05 = obj5;
        this.A03 = obj;
        this.A01 = obj3;
        this.A02 = obj4;
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.A00 != 0) {
            ((0rk) this.A01).A00 = 0;
            ((C52012GBj) this.A04).A0G();
            GE2.A04((C267324bN) this.A02, (JRO) this.A03, (GE2) this.A05, false, false);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        C68056MzN mzN;
        if (this.A00 != 0) {
            ((C52012GBj) this.A04).A0G();
            0rk r1 = (0rk) this.A01;
            int i = r1.A00 - 1;
            r1.A00 = i;
            GE2 ge2 = (GE2) this.A05;
            if (i > 0) {
                ValueAnimator valueAnimator = ge2.A09;
                valueAnimator.setStartDelay(2000);
                valueAnimator.start();
                return;
            }
            GE2.A04((C267324bN) this.A02, (JRO) this.A03, ge2, false, false);
            return;
        }
        C249703kE r3 = (C249703kE) this.A04;
        ((ViewPropertyAnimator) this.A03).setListener((Animator.AnimatorListener) null);
        C53389GnL gnL = (C53389GnL) this.A01;
        View view = r3.itemView;
        0qQ.A06(view);
        if (gnL.A07) {
            view.setElevation(0.0f);
        }
        gnL.A00(view, true);
        if ((r3 instanceof C68056MzN) && (mzN = (C68056MzN) r3) != null) {
            mzN.A01(AnonymousClass05K.A01);
        }
        C67819MvN mvN = (C67819MvN) this.A05;
        mvN.A0C(r3);
        mvN.A01.remove(this.A02);
        if (!mvN.A0L()) {
            mvN.A0A();
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        if (1 - this.A00 != 0) {
            super.onAnimationRepeat(animator);
            return;
        }
        ((GE2) this.A05).A00 *= -1.0f;
    }

    public final void onAnimationStart(Animator animator) {
        if (this.A00 != 0) {
            GE2 ge2 = (GE2) this.A05;
            ge2.A00 = 1.0f;
            GE2.A04((C267324bN) this.A02, (JRO) this.A03, ge2, true, true);
        }
    }
}
