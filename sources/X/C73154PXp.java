package X;

import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.timeinapp.instrumentation.IgTimeInAppActivityListener;

/* renamed from: X.PXp  reason: case insensitive filesystem */
public final class C73154PXp implements Runnable {
    public final /* synthetic */ UserSession A00;

    public C73154PXp(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void run() {
        UserSession userSession = this.A00;
        try {
            1We r0 = 1We.A02;
            if (r0 != null) {
                IgTimeInAppActivityListener.A00(r0.A00, userSession).A04.A01(2Oj.A01);
            }
        } catch (Throwable unused) {
            0f9 AEf = 0wj.A01.AEf("ScreenTime", 817892914);
            AEf.ABQ("ScreenTimeInit", "Failed to insert background event");
            AEf.report();
        }
    }
}
