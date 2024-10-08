package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: X.39I  reason: invalid class name */
public final class AnonymousClass39I extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ AnonymousClass39H A00;

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        0qQ.A0B(networkCapabilities, 1);
        AnonymousClass389.A00();
        AnonymousClass39H r1 = this.A00;
        r1.A03(C2804952b.A00(r1.A00));
    }

    public AnonymousClass39I(AnonymousClass39H r1) {
        this.A00 = r1;
    }

    public final void onLost(Network network) {
        AnonymousClass389.A00();
        AnonymousClass39H r1 = this.A00;
        r1.A03(C2804952b.A00(r1.A00));
    }
}
