package X;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

public final class SHW {
    public static final C9875Rio A04 = new Object();
    public static final AnonymousClass0eM A05 = AnonymousClass0eN.A01(C13345TVs.A00);
    public Class A00;
    public Method A01;
    public Method A02;
    public boolean A03;

    public final void A00(String str, Socket socket) {
        IllegalStateException illegalStateException;
        0qQ.A0B(str, 1);
        if (socket == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            if (SSLSockets.isSupportedSocket(sSLSocket)) {
                SSLSockets.setUseSessionTickets(sSLSocket, true);
            }
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            if (sSLParameters != null) {
                sSLParameters.setServerNames(AnonymousClass7TE.A1I(new SNIHostName(str)));
                sSLSocket.setSSLParameters(sSLParameters);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (this.A03) {
            Class cls = this.A00;
            if (cls == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else if (cls.isInstance(socket)) {
                try {
                    Method method = this.A02;
                    if (method != null) {
                        method.invoke(socket, new Object[]{true});
                        Method method2 = this.A01;
                        if (method2 != null) {
                            method2.invoke(socket, new Object[]{str});
                            return;
                        }
                        illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                    } else {
                        illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                    }
                    throw illegalStateException;
                } catch (InvocationTargetException e) {
                    throw C41845B3m.A0j(e);
                } catch (IllegalAccessException e2) {
                    throw Pxe.A0e(e2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[ExcHandler: NoSuchMethodException (unused java.lang.NoSuchMethodException), SYNTHETIC, Splitter:B:5:0x000d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SHW() {
        /*
            r5 = this;
            r5.<init>()
            java.lang.String r0 = "com.android.org.conscrypt.OpenSSLSocketImpl"
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x000a }
            goto L_0x0011
        L_0x000a:
            java.lang.String r0 = "org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl"
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch:{ NoSuchMethodException -> 0x003e, NoSuchMethodException -> 0x003e }
        L_0x0011:
            r5.A00 = r2     // Catch:{ NoSuchMethodException -> 0x003e, NoSuchMethodException -> 0x003e }
            r4 = 0
            r3 = 1
            if (r2 == 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            r0 = r4
            goto L_0x0027
        L_0x001a:
            java.lang.String r1 = "setUseSessionTickets"
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ NoSuchMethodException -> 0x003e, NoSuchMethodException -> 0x003e }
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ NoSuchMethodException -> 0x003e, NoSuchMethodException -> 0x003e }
            java.lang.reflect.Method r0 = r2.getMethod(r1, r0)     // Catch:{ NoSuchMethodException -> 0x003e, NoSuchMethodException -> 0x003e }
        L_0x0027:
            r5.A02 = r0     // Catch:{ NoSuchMethodException -> 0x003e, NoSuchMethodException -> 0x003e }
            java.lang.Class r2 = r5.A00     // Catch:{ NoSuchMethodException -> 0x003e, NoSuchMethodException -> 0x003e }
            if (r2 == 0) goto L_0x003a
            java.lang.String r1 = "setHostname"
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ NoSuchMethodException -> 0x003e, NoSuchMethodException -> 0x003e }
            java.lang.reflect.Method r4 = r2.getMethod(r1, r0)     // Catch:{ NoSuchMethodException -> 0x003e, NoSuchMethodException -> 0x003e }
        L_0x003a:
            r5.A01 = r4     // Catch:{ NoSuchMethodException -> 0x003e, NoSuchMethodException -> 0x003e }
            r5.A03 = r3     // Catch:{ NoSuchMethodException -> 0x003e, NoSuchMethodException -> 0x003e }
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SHW.<init>():void");
    }
}
