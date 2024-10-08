package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import org.webrtc.NetworkMonitor;

/* renamed from: X.4C4  reason: invalid class name */
public final class AnonymousClass4C4 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ C2604845v A00;

    public final void onAvailable(Network network) {
        0qQ.A0B(network, 0);
        super.onAvailable(network);
        C2603145d r2 = this.A00.A01.A00;
        r2.A03.A01(new AnonymousClass464(r2));
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        0qQ.A0B(network, 0);
        0qQ.A0B(networkCapabilities, 1);
        try {
            super.onCapabilitiesChanged(network, networkCapabilities);
            boolean z = true;
            boolean hasTransport = networkCapabilities.hasTransport(1);
            boolean hasTransport2 = networkCapabilities.hasTransport(0);
            if (!networkCapabilities.hasTransport(3) && !networkCapabilities.hasTransport(2) && !networkCapabilities.hasTransport(4)) {
                z = false;
            }
            C2604845v r0 = this.A00;
            if (hasTransport2) {
                hasTransport |= true;
            }
            if (z) {
                hasTransport |= true;
            }
            C2603145d r2 = r0.A01.A00;
            r2.A03.A01(new AnonymousClass465(r2, hasTransport ? 1 : 0));
        } catch (SecurityException e) {
            0KC.A0F(NetworkMonitor.TAG, "Error getting network information.", e);
        }
    }

    public final void onLost(Network network) {
        0qQ.A0B(network, 0);
        super.onLost(network);
        C2603145d r2 = this.A00.A01.A00;
        r2.A03.A01(new AiO(r2));
    }

    public AnonymousClass4C4(C2604845v r1) {
        this.A00 = r1;
    }
}
