package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.GcS  reason: case insensitive filesystem */
public final class C52775GcS extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;

    public C52775GcS(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onAnimationEnd(Animator animator) {
        2Wa r1;
        C54619HLc hLc;
        switch (this.A00) {
            case 0:
                r1 = (2Wa) this.A01;
                hLc = C54619HLc.COLLAPSED;
                break;
            case 1:
                r1 = (2Wa) this.A01;
                hLc = C54619HLc.EXPANDED;
                break;
            case 2:
                ((Runnable) this.A01).run();
                return;
            case 3:
                0qQ.A0B(animator, 0);
                super.onAnimationEnd(animator);
                C52871Ge4 ge4 = (C52871Ge4) this.A01;
                if (ge4.A00) {
                    ge4.A01.start();
                    return;
                }
                return;
            default:
                ((View) this.A01).setVisibility(4);
                return;
        }
        r1.A01(hLc);
    }

    public final void onAnimationStart(Animator animator) {
        switch (this.A00) {
            case 0:
            case 1:
                ((2Wa) this.A01).A01(C54619HLc.ANIMATING);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
