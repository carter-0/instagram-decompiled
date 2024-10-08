package X;

import android.net.ssl.SSLSockets;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: X.TYw  reason: case insensitive filesystem */
public final class C13412TYw extends TZ0 {
    public final String A09(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }

    public final void A0B(String str, List list, SSLSocket sSLSocket) {
        try {
            if (SSLSockets.isSupportedSocket(sSLSocket)) {
                SSLSockets.setUseSessionTickets(sSLSocket, true);
            }
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols(Pxf.A1a(SPU.A00(list), 0));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw Pxe.A0c("Android internal error", e);
        }
    }
}
