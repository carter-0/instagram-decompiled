package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class U0H extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public U0H(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.A00) {
            case 0:
                C276544tV r4 = (C276544tV) this.A02;
                C307786Rm r2 = (C307786Rm) this.A01;
                C307886Rw.A03(r2, r4, new AnonymousClass6Tm(0sr.A1P(new Object[]{r4, r2})), (C277014uI) this.A03);
                return;
            case 1:
                C51969G9p.A1M(this.A01);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        if (1 - this.A00 != 0) {
            super.onAnimationStart(animator);
            return;
        }
        View view = (View) this.A02;
        0qQ.A0A(view);
        ((View) this.A01).setVisibility(0);
        2eQ.A06(view, 500);
        view.setAccessibilityLiveRegion(2);
    }
}
