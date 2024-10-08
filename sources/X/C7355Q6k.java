package X;

import android.net.ConnectivityManager;
import android.net.Network;

/* renamed from: X.Q6k  reason: case insensitive filesystem */
public final class C7355Q6k extends ConnectivityManager.NetworkCallback {
    public final int A00;
    public final Object A01;

    public C7355Q6k(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onAvailable(Network network) {
        if (this.A00 != 0) {
            0qQ.A0B(network, 0);
            super.onAvailable(network);
            ((C11197SEx) this.A01).A01.setNetworkStateConnected();
            return;
        }
        C11424STg.A02().post(new TFK(this, true));
    }

    public final void onLost(Network network) {
        if (this.A00 != 0) {
            0qQ.A0B(network, 0);
            super.onLost(network);
            ((C11197SEx) this.A01).A01.setNetworkStateDisconnected();
            return;
        }
        C11424STg.A02().post(new TFK(this, false));
    }
}
