package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

public final class M95 implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass5Gv A01;
    public final /* synthetic */ KFZ A02;

    public M95(UserSession userSession, AnonymousClass5Gv r2, KFZ kfz) {
        this.A02 = kfz;
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
