package X;

import android.animation.Animator;
import android.view.View;

/* renamed from: X.OeW  reason: case insensitive filesystem */
public final class C71157OeW implements Animator.AnimatorListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C71157OeW(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.A00) {
            case 0:
                ((View) this.A01).setVisibility(DbW.A01(this.A02 ? 1 : 0));
                return;
            case 1:
                C15286UZq uZq = (C15286UZq) this.A01;
                uZq.A0M = false;
                if (this.A02) {
                    uZq.A0N = true;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void onAnimationStart(Animator animator) {
        if (this.A00 == 0) {
            ((View) this.A01).setVisibility(0);
        }
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }
}
