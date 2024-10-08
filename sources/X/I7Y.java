package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import com.instagram.common.session.UserSession;

public final class I7Y implements Animator.AnimatorListener {
    public final /* synthetic */ C314226hr A00;
    public final /* synthetic */ boolean A01;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public I7Y(C314226hr r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.A01) {
            C314226hr r4 = this.A00;
            UserSession userSession = r4.A0F;
            if (182.A06(0Tu.A05, userSession, 36320987939152897L)) {
                1Av A002 = 1Au.A00(userSession);
                if (DbT.A00(A002.A01, AnonymousClass000.A00(1848)) < 1) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(r4.A0U);
                    animatorSet.addListener(new C56672I7b(3, A002, r4));
                    animatorSet.start();
                }
            }
        }
    }
}
