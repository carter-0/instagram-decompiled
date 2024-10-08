package X;

import android.animation.Animator;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.Ngz  reason: case insensitive filesystem */
public final class C69201Ngz extends AnonymousClass4HM {
    public final /* synthetic */ CircularImageView A00;

    public final void onAnimationCancel(Animator animator) {
        0qQ.A0B(animator, 0);
        onAnimationEnd(animator);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void onAnimationEnd(Animator animator) {
        0qQ.A0B(animator, 0);
        this.A00.setVisibility(4);
        animator.removeListener(this);
    }

    public C69201Ngz(CircularImageView circularImageView) {
        this.A00 = circularImageView;
    }
}
