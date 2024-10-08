package X;

import android.view.View;
import com.instagram.common.session.UserSession;

public final class I9v implements View.OnAttachStateChangeListener {
    public final /* synthetic */ C56533I0e A00;
    public final /* synthetic */ String A01;

    public final void onViewDetachedFromWindow(View view) {
        0qQ.A0B(view, 0);
        view.removeOnAttachStateChangeListener(this);
    }

    public I9v(C56533I0e i0e, String str) {
        this.A00 = i0e;
        this.A01 = str;
    }

    public final void onViewAttachedToWindow(View view) {
        UserSession userSession = this.A00.A00;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(C56533I0e.A02, userSession), "ig_rights_management_media_notice_impression");
        if (A0e.isSampled()) {
            A0e.A9F("ig_user_id", DbV.A0q(userSession.A06));
            A0e.A9F("media_igid", DbV.A0q(this.A01));
            A0e.Cgf();
        }
    }
}
