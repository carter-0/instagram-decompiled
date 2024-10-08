package X;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;

public final class TYz extends SPU {
    /* JADX WARNING: type inference failed for: r0v2, types: [X.TYz, java.lang.Object] */
    public static TYz A01() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            return new Object();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final SSLContext A0A() {
        try {
            return SSLContext.getInstance("TLSv1.3", Conscrypt.newProviderBuilder().provideTrustManager().build());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", Conscrypt.newProviderBuilder().provideTrustManager().build());
            } catch (NoSuchAlgorithmException unused) {
                throw Pxe.A0j("No TLS provider", e);
            }
        }
    }

    public final String A09(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    public final void A0B(String str, List list, SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, Pxf.A1a(SPU.A00(list), 0));
        }
    }

    public final void A0C(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }
}
