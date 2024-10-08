package X;

import android.os.SystemClock;
import com.instagram.common.session.UserSession;

/* renamed from: X.4En  reason: invalid class name and case insensitive filesystem */
public final class C262504En extends 0ng {
    public final /* synthetic */ 2TO A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C262504En(2TO r4) {
        super(88983322, 3, false, false);
        this.A00 = r4;
    }

    public final void run() {
        UserSession userSession = this.A00.A00;
        if (userSession != null) {
            1Av A002 = 1Au.A00(userSession);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            0xY AR4 = A002.A01.AR4();
            AR4.E5c("mobile_config_last_sync_time_peak", elapsedRealtime);
            AR4.apply();
        }
    }
}
