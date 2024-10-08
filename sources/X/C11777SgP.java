package X;

import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* renamed from: X.SgP  reason: case insensitive filesystem */
public final /* synthetic */ class C11777SgP implements C13516Tbl {
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        if ((th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException)) {
            S85.A01("Unable to load composition.", th);
            return;
        }
        throw Pxe.A0j("Unable to parse composition", th);
    }
}
