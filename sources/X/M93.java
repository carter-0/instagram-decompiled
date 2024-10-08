package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

public final class M93 implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass5Gv A01;
    public final /* synthetic */ KFY A02;

    public M93(UserSession userSession, AnonymousClass5Gv r2, KFY kfy) {
        this.A02 = kfy;
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final void run() {
        Activity activity = this.A02.A00;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            this.A01.A07(this.A00);
        }
    }
}
