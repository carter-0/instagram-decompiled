package X;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;

/* renamed from: X.5DL  reason: invalid class name */
public final class AnonymousClass5DL extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ 1Ou A00;

    public AnonymousClass5DL(1Ou r1) {
        this.A00 = r1;
    }

    public final void onAvailable(Network network) {
        super.onAvailable(network);
        1Ou r3 = this.A00;
        IntentFilter intentFilter = 1Ou.A0W;
        r3.A05.obtainMessage(2).sendToTarget();
        1Ou.A07(r3, "onConnectivityChanged", 0);
    }

    public final void onLost(Network network) {
        super.onLost(network);
        this.A00.A0B("onConnectivityChanged");
    }
}
