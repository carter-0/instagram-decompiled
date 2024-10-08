package X;

import com.facebook.proxyservice.observer.ProxyServiceBroadcaster;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: X.Soy  reason: case insensitive filesystem */
public final class C12203Soy implements C13715Tfe, AnonymousClass0lh, 0lk {
    public final UserSession A00;

    public final void D5g(String str, int i, int i2, String str2) {
        0qQ.A0B(str, 0);
        synchronized (this) {
            0KC.A0D("proxy_service", "Setting MQTT Proxy.");
            RealtimeClientManager.getInstance(this.A00).setProxy(new Proxy(Proxy.Type.SOCKS, InetSocketAddress.createUnresolved(str, i2)));
        }
    }

    public final void D97() {
        synchronized (this) {
            0KC.A0D("proxy_service", "Clearing MQTT Proxy.");
            RealtimeClientManager.getInstance(this.A00).setProxy((Proxy) null);
        }
    }

    public final void DwZ(boolean z) {
    }

    public final void onSessionWillEnd() {
        ProxyServiceBroadcaster proxyServiceBroadcaster = ProxyServiceBroadcaster.instance;
        synchronized (proxyServiceBroadcaster) {
            proxyServiceBroadcaster.observers.remove(this);
        }
    }

    public C12203Soy(UserSession userSession) {
        this.A00 = userSession;
        0KC.A0D("proxy_service", "Attach session scoped listener.");
        ProxyServiceBroadcaster.instance.registerObserver(this);
    }
}
