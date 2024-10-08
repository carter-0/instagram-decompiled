package X;

import android.content.Context;
import com.instagram.realtimeclient.RealtimeConstants;
import java.lang.ref.Reference;
import java.net.Socket;
import java.security.cert.Certificate;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.TNi  reason: case insensitive filesystem */
public final class C13150TNi implements Callable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C13150TNi(Object obj, Object obj2, String str, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A03 = obj;
        this.A01 = i;
        this.A04 = str;
    }

    public final Object call() {
        String str;
        int length;
        String str2;
        String A002;
        String str3;
        String str4;
        String str5;
        if (this.A00 != 0) {
            Socket socket = (Socket) this.A03;
            S9L.A00(socket.isConnected());
            C10676RwF rwF = (C10676RwF) this.A02;
            SSLSocketFactory sSLSocketFactory = rwF.A03;
            String str6 = this.A04;
            SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str6, this.A01, true);
            C10229Rop rop = rwF.A01;
            sSLSocket.getInputStream();
            SSLSession session = sSLSocket.getSession();
            if (session == null) {
                throw new SSLException("SSL Session is null");
            } else if ("SSL_NULL_WITH_NULL_NULL".equals(session.getCipherSuite())) {
                if (sSLSocket.isClosed()) {
                    str2 = "closed";
                } else {
                    str2 = "open";
                }
                if (sSLSocket.isConnected()) {
                    A002 = RealtimeConstants.MQTT_CONNECTED;
                } else {
                    A002 = C66579MXk.A00(309);
                }
                if (sSLSocket.isBound()) {
                    str3 = "bound";
                } else {
                    str3 = "unbound";
                }
                if (sSLSocket.isInputShutdown()) {
                    str4 = "input_shutdown";
                } else {
                    str4 = "input_open";
                }
                if (sSLSocket.isOutputShutdown()) {
                    str5 = "output_shutdown";
                } else {
                    str5 = "output_open";
                }
                throw new SSLException(Pxf.A0m("SSL handshake returned an invalid session. Socket state (%s, %s, %s, %s, %s, %s, %s)", new Object[]{str2, A002, str3, str4, str5, str6, String.valueOf(sSLSocket.getInetAddress())}));
            } else if (rop.A00.verify(str6, session)) {
                return sSLSocket;
            } else {
                String obj = sSLSocket.getInetAddress().toString();
                try {
                    Certificate[] peerCertificates = session.getPeerCertificates();
                    if (peerCertificates == null || (length = peerCertificates.length) <= 0) {
                        str = "No certificates";
                    } else {
                        str = Pxf.A0m("num: %d, %s", new Object[]{Integer.valueOf(length), peerCertificates[0].toString()});
                    }
                } catch (SSLException e) {
                    str = Pxf.A0l("Exception getting certificates ", e);
                }
                throw new SSLException(Pxf.A0m("could not verify hostname for (%s, %s). (%s)", new Object[]{str6, obj, str}));
            }
        } else {
            Context context = (Context) this.A03;
            int i = this.A01;
            String str7 = this.A04;
            Context context2 = (Context) ((Reference) this.A02).get();
            if (context2 != null) {
                context = context2;
            }
            return C11425STh.A00(context, str7, i);
        }
    }
}
