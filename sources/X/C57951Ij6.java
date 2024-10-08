package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ij6  reason: case insensitive filesystem */
public final class C57951Ij6 implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C317546nR A01;
    public final /* synthetic */ C255783ui A02;
    public final /* synthetic */ C249693kD A03;

    public C57951Ij6(UserSession userSession, C317546nR r2, C255783ui r3, C249693kD r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = userSession;
    }

    public final void run() {
        C317546nR r4 = this.A01;
        C249693kD r3 = this.A03;
        C255783ui r5 = this.A02;
        UserSession userSession = this.A00;
        View view = r4.A01;
        if (view != null) {
            ViewGroup A012 = C3019160o.A01(view);
            View view2 = r4.A01;
            if (view2 != null) {
                C306406Ma.A04(view2, r5, r3.AcY(userSession), A012.getWidth(), A012.getHeight(), true);
                return;
            }
        }
        0qQ.A0F("stickerContainerView");
        throw AnonymousClass00P.createAndThrow();
    }
}
