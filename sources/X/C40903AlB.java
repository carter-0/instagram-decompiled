package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.AlB  reason: case insensitive filesystem */
public final class C40903AlB implements Runnable {
    public final /* synthetic */ 1Cj A00;

    public C40903AlB(1Cj r1) {
        this.A00 = r1;
    }

    public final void run() {
        UserSession userSession = this.A00.A06;
        1P2 A002 = 1P1.A00(userSession);
        A002.A08("main_feed");
        if (1KU.A0B(userSession)) {
            1Ga A003 = 1GZ.A00(userSession);
            synchronized (A003) {
                Map map = A003.A01;
                11W r0 = (11W) map.get("clips_discover_prefetch");
                if (r0 != null) {
                    r0.onCancel();
                    map.remove("clips_discover_prefetch");
                    A003.A02.remove("clips_discover_prefetch");
                }
            }
            return;
        }
        A002.A08("clips_discover_prefetch");
    }
}
