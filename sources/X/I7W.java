package X;

import android.animation.Animator;
import com.instagram.common.session.UserSession;

public final class I7W implements Animator.AnimatorListener {
    public final /* synthetic */ UserSession A00;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public I7W(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void onAnimationEnd(Animator animator) {
        UserSession userSession = this.A00;
        AnonymousClass7TG.A0g(AnonymousClass7TE.A0q(userSession), "close_friends_badge_animation_count").apply();
        1Av A002 = 1Au.A00(userSession);
        long currentTimeMillis = System.currentTimeMillis();
        0xY A0p = AnonymousClass7TE.A0p(A002);
        A0p.E5c("close_friends_badge_last_timestamp", currentTimeMillis);
        A0p.apply();
    }
}
