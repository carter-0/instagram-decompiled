package X;

import android.animation.Animator;
import android.widget.ImageView;

/* renamed from: X.OeU  reason: case insensitive filesystem */
public final class C71155OeU implements Animator.AnimatorListener {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ AnonymousClass61R A01;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public C71155OeU(ImageView imageView, AnonymousClass61R r2) {
        this.A01 = r2;
        this.A00 = imageView;
    }

    public final void onAnimationEnd(Animator animator) {
        AnonymousClass61R r1 = this.A01;
        if (r1 != null) {
            this.A00.setImageDrawable(r1);
            r1.EFK();
            r1.E2p();
        }
    }
}
