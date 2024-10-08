package com.facebook.proxyservice.observer;

import X.AnonymousClass7TE;
import X.C10875Rzb;
import X.C13715Tfe;
import java.util.List;

public class ProxyServiceBroadcaster {
    public static final C10875Rzb Companion = new Object();
    public static final ProxyServiceBroadcaster instance = new ProxyServiceBroadcaster();
    public String clientAddress = "";
    public String clientRegion = "";
    public int httpProxyPort;
    public boolean isProxyMode;
    public final List observers = AnonymousClass7TE.A1C();
    public String proxyAddress = "";
    public int socksProxyPort;

    public final synchronized String getProxyAddress() {
        return this.proxyAddress;
    }

    public final synchronized int getSocksProxyPort() {
        return this.socksProxyPort;
    }

    public final synchronized void registerObserver(C13715Tfe tfe) {
        if (this.isProxyMode) {
            tfe.D5g(this.proxyAddress, this.httpProxyPort, this.socksProxyPort, this.clientAddress);
        }
        this.observers.add(tfe);
    }

    public static final ProxyServiceBroadcaster getInstance() {
        return instance;
    }
}
