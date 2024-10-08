package com.instagram.debug.network;

import X.0qQ;
import X.1Qd;

public final class DebugNetworkShapingRequestCallbackWrapper {
    public final NetworkShapingConfiguration configuration;
    public final String tag;

    public DebugNetworkShapingRequestCallbackWrapper(NetworkShapingConfiguration networkShapingConfiguration, String str) {
        0qQ.A0B(networkShapingConfiguration, 1);
        0qQ.A0B(str, 2);
        this.configuration = networkShapingConfiguration;
        this.tag = str;
    }

    public 1Qd maybeWrapCallback(1Qd r4, String str) {
        0qQ.A0B(r4, 0);
        0qQ.A0B(str, 1);
        if (this.configuration.isNetworkShapingOn()) {
            return new NetworkShapingRequestCallback(r4, this.configuration, str, this.tag);
        }
        return r4;
    }
}
