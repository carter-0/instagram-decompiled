package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.OeZ  reason: case insensitive filesystem */
public final class C71160OeZ implements Animator.AnimatorListener {
    public final /* synthetic */ ValueAnimator A00;
    public final /* synthetic */ RecyclerView A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C330537Nf A03;
    public final /* synthetic */ C254763t0 A04;
    public final /* synthetic */ 0r1 A05;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public C71160OeZ(ValueAnimator valueAnimator, RecyclerView recyclerView, UserSession userSession, C330537Nf r4, C254763t0 r5, 0r1 r6) {
        this.A00 = valueAnimator;
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = recyclerView;
        this.A02 = userSession;
        this.A04 = r5;
    }

    public final void onAnimationRepeat(Animator animator) {
        ValueAnimator valueAnimator = this.A00;
        0qQ.A0A(valueAnimator);
        0r1 r6 = this.A05;
        valueAnimator.addListener(new C71159OeY(this.A01, this.A02, this.A03, this.A04, r6));
    }
}
