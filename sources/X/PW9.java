package X;

import android.net.ConnectivityManager;
import android.os.Looper;

public final class PW9 implements Runnable {
    public final /* synthetic */ 1Ou A00;

    public PW9(1Ou r1) {
        this.A00 = r1;
    }

    public final void run() {
        1Ou r5 = this.A00;
        r5.A0B("onUserSessionWillEnd");
        Looper.myQueue().removeIdleHandler(r5.A06);
        if (182.A06(0Tu.A05, r5.A08, 36329088247873315L)) {
            if (r5.A0O) {
                ConnectivityManager connectivityManager = r5.A00;
                if (connectivityManager != null) {
                    connectivityManager.unregisterNetworkCallback(r5.A04);
                }
                r5.A0O = false;
            }
        } else if (r5.A01) {
            r5.A03.unregisterReceiver(r5.A02);
            r5.A01 = false;
        }
    }
}
