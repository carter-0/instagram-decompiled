package X;

import android.view.View;
import com.instagram.common.session.UserSession;

public final class ALz implements View.OnAttachStateChangeListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C387789mm A01;

    public ALz(UserSession userSession, C387789mm r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final void onViewAttachedToWindow(View view) {
        C387789mm r0 = this.A01;
        C49947FGb.A05(C48145EZn.STORY_POST_CAPTURE_FLOW, r0.A03, C267044ar.A01(AnonymousClass7TE.A0S(r0.A02), this.A00));
    }

    public final void onViewDetachedFromWindow(View view) {
        this.A01.A02.removeOnAttachStateChangeListener(this);
    }
}
