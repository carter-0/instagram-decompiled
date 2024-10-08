package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

public final class M94 implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass5Gv A01;
    public final /* synthetic */ KFY A02;

    public M94(UserSession userSession, AnonymousClass5Gv r2, KFY kfy) {
        this.A02 = kfy;
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final void run() {
        KFY kfy = this.A02;
        Activity activity = kfy.A00;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            this.A01.A07(this.A00);
            K8A k8a = kfy.A01.A00;
            if (k8a instanceof C61942KSr) {
                JTO.A0k(((C61942KSr) k8a).A0Y).A0E.getValue();
            }
        }
    }
}
