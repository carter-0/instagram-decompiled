package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

public final class LCW {
    public final ConnectivityManager A00;
    public final AnonymousClass0r6 A01 = AnonymousClass0Zq.A00(new MHD((Object) this, (AnonymousClass4D7) null, 4));

    public final C62471KgM A00() {
        ConnectivityManager connectivityManager = this.A00;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities == null || !networkCapabilities.hasCapability(12) || !networkCapabilities.hasCapability(16)) {
            return C62471KgM.NONE;
        }
        if (networkCapabilities.hasTransport(1)) {
            return C62471KgM.WIFI;
        }
        return C62471KgM.OTHER;
    }

    public LCW(Context context) {
        Object systemService = context.getSystemService(ConnectivityManager.class);
        0qQ.A0C(systemService, AnonymousClass000.A00(326));
        this.A00 = (ConnectivityManager) systemService;
    }
}
