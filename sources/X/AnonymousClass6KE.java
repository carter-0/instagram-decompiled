package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.6KE  reason: invalid class name */
public final class AnonymousClass6KE extends AnimatorListenerAdapter {
    public boolean A00;
    public final /* synthetic */ AnonymousClass6KV A01;

    public final void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    public final void onAnimationStart(Animator animator) {
        this.A00 = false;
    }

    public AnonymousClass6KE(AnonymousClass6KV r1) {
        this.A01 = r1;
    }

    public final void onAnimationEnd(Animator animator) {
        AnonymousClass61R r0;
        C316246lL r2 = this.A01.A04;
        if (!this.A00 && (r0 = r2.A09) != null) {
            r0.EFJ(2);
            r0.E2p();
        }
    }
}
