package com.facebook.traffic.ctm.api;

import X.C66580MXl;

public final class ClientTransportMonitorHolder {
    public static volatile IClientTransportMonitor ctm;

    public ClientTransportMonitorHolder() {
        throw C66580MXl.A11();
    }

    public static IClientTransportMonitor get() {
        return ctm;
    }

    public static void set(IClientTransportMonitor iClientTransportMonitor) {
        ctm = iClientTransportMonitor;
    }
}
