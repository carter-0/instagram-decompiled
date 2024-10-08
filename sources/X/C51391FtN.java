package X;

import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.FtN  reason: case insensitive filesystem */
public final class C51391FtN implements Runnable {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;

    public C51391FtN(AnonymousClass0iw r1, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = r1;
    }

    public final void run() {
        if (!C48212Eat.A00) {
            UserSession userSession = this.A01;
            BusinessFlowAnalyticsLogger A002 = C319596qs.A00(C319586qr.EDIT_PROFILE, this.A00, userSession, (String) null);
            C22030Xtl xtl = new C22030Xtl("self_profile", "self_profile", "onboarding_checklist", (String) null, (String) null, (Map) null, (Map) null, (Map) null);
            if (A002 != null) {
                A002.ClC(xtl);
            }
            C48212Eat.A00 = true;
        }
    }
}
