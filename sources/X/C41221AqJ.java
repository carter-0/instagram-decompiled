package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.AqJ  reason: case insensitive filesystem */
public final class C41221AqJ implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C255783ui A01;
    public final /* synthetic */ C249693kD A02;
    public final /* synthetic */ C316846mJ A03;

    public C41221AqJ(UserSession userSession, C255783ui r2, C249693kD r3, C316846mJ r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final void run() {
        C316846mJ r4 = this.A03;
        C249693kD r3 = this.A02;
        C255783ui r6 = this.A01;
        UserSession userSession = this.A00;
        View view = r4.A00;
        if (view != null) {
            ViewGroup A012 = C3019160o.A01(view);
            View view2 = r4.A00;
            if (view2 != null) {
                C306406Ma.A04(view2, r6, r3.AcY(userSession), A012.getWidth(), A012.getHeight(), true);
                r4.A0A.A03(0);
                return;
            }
        }
        0qQ.A0F("view");
        throw AnonymousClass00P.createAndThrow();
    }
}
