package X;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

public final class Y5X extends ProxySelector {
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    public final List select(URI uri) {
        if (uri != null) {
            return Collections.singletonList(Proxy.NO_PROXY);
        }
        throw AnonymousClass7TE.A0w("uri must not be null");
    }
}
