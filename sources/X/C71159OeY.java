package X;

import android.animation.Animator;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.OeY  reason: case insensitive filesystem */
public final class C71159OeY implements Animator.AnimatorListener {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C330537Nf A02;
    public final /* synthetic */ C254763t0 A03;
    public final /* synthetic */ 0r1 A04;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public C71159OeY(RecyclerView recyclerView, UserSession userSession, C330537Nf r3, C254763t0 r4, 0r1 r5) {
        this.A04 = r5;
        this.A02 = r3;
        this.A00 = recyclerView;
        this.A01 = userSession;
        this.A03 = r4;
    }

    public final void onAnimationEnd(Animator animator) {
        String str;
        0r1 r2 = this.A04;
        if (r2.A00) {
            C330537Nf r1 = this.A02;
            r1.A00 = 0.0f;
            r1.A05 = null;
            this.A00.invalidate();
            AnonymousClass4kA A002 = AnonymousClass4k9.A00(this.A01);
            C254763t0 r0 = this.A03;
            if (r0 == null || (str = r0.A00) == null) {
                str = "";
            }
            DbX.A1T(A002.A00.AR4(), C273654mx.A00(582), str, true);
            return;
        }
        animator.setStartDelay(200);
        animator.start();
        r2.A00 = true;
    }
}
