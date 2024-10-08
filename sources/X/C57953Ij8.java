package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ij8  reason: case insensitive filesystem */
public final class C57953Ij8 implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C255773uh A01;
    public final /* synthetic */ C255783ui A02;
    public final /* synthetic */ C316826mH A03;

    public C57953Ij8(UserSession userSession, C255773uh r2, C255783ui r3, C316826mH r4) {
        this.A03 = r4;
        this.A00 = userSession;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void run() {
        C316826mH r2 = this.A03;
        C255773uh r4 = this.A01;
        C255783ui r3 = this.A02;
        View view = r2.A01;
        if (view != null) {
            ViewGroup A012 = C3019160o.A01(view);
            View view2 = r2.A01;
            if (view2 != null) {
                C51975G9x.A10(view2, r4, r3, A012.getWidth(), A012.getHeight());
                return;
            }
        }
        0qQ.A0F("stickerContainerView");
        throw AnonymousClass00P.createAndThrow();
    }
}
