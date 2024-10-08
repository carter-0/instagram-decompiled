package X;

import android.net.NetworkInfo;
import com.facebook.traffic.nts.TrafficNetworkTelemetryServicesManager;
import com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer;
import com.facebook.traffic.nts.providers.reachability.ReachabilityV2ProviderImpl;

/* renamed from: X.WTp  reason: case insensitive filesystem */
public final class C19307WTp implements AnonymousClass0qK {
    public final void onConnectionChanged(NetworkInfo networkInfo) {
        TrafficNTSProvidersAppLayer trafficNTSProvidersAppLayer;
        ReachabilityV2ProviderImpl reachabilityV2Provider;
        TrafficNetworkTelemetryServicesManager manager = TrafficNetworkTelemetryServicesManager.Companion.getManager();
        if (manager != null && (trafficNTSProvidersAppLayer = manager.providers) != null && (reachabilityV2Provider = trafficNTSProvidersAppLayer.getReachabilityV2Provider()) != null) {
            int i = 1;
            if (networkInfo != null) {
                if (networkInfo.getType() == 1) {
                    i = 3;
                } else {
                    i = 0;
                    if (networkInfo.getType() == 0) {
                        i = 2;
                    }
                }
            }
            reachabilityV2Provider.updateConnectionType(i);
        }
    }

    public C19307WTp() {
        C62670v5.A0B.A03(this);
    }
}
