package X;

import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.timeinapp.instrumentation.IgTimeInAppActivityListener;

/* renamed from: X.3Fo  reason: invalid class name and case insensitive filesystem */
public final class C239223Fo implements Runnable {
    public final /* synthetic */ UserSession A00;

    public C239223Fo(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void run() {
        UserSession userSession = this.A00;
        try {
            1We r0 = 1We.A02;
            if (r0 != null) {
                IgTimeInAppActivityListener.A00(r0.A00, userSession).A04.A01(2Oj.A02);
            }
        } catch (Throwable unused) {
            0f9 AEf = 0wj.A01.AEf("ScreenTime", 817892914);
            AEf.ABQ(C66579MXk.A00(612), "Failed to insert foreground event");
            AEf.report();
        }
    }
}
