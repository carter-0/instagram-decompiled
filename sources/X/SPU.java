package X;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.webrtc.CameraVideoCapturer;

public class SPU {
    public static final SPU A00;
    public static final Logger A01 = Pxf.A11(Y1U.class);

    public void A0C(SSLSocketFactory sSLSocketFactory) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: X.TYy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: X.TYx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: X.TYz} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: X.TZ0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: X.TZ0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: X.TYy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: X.TYy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: X.TYy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: X.TYy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: X.TYy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: X.TYy} */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        if (r1 != null) goto L_0x006b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r2 = "java.vm.name"
            java.lang.String r0 = java.lang.System.getProperty(r2)
            java.lang.String r1 = "Dalvik"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = java.lang.System.getProperty(r2)
            boolean r0 = r1.equals(r0)
            r2 = 0
            if (r0 == 0) goto L_0x0030
            int r1 = X.TZ0.A01()     // Catch:{ ReflectiveOperationException -> 0x0030 }
            r0 = 29
            if (r1 < r0) goto L_0x0030
            java.lang.String r0 = "com.android.org.conscrypt.SSLParametersImpl"
            java.lang.Class.forName(r0)     // Catch:{ ReflectiveOperationException -> 0x0030 }
            X.TYw r1 = new X.TYw     // Catch:{ ReflectiveOperationException -> 0x0030 }
            r3 = r2
            r4 = r2
            r5 = r2
            r6 = r2
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ ReflectiveOperationException -> 0x0030 }
            goto L_0x006b
        L_0x0030:
            X.TZ0 r1 = X.TZ0.A02()
            if (r1 != 0) goto L_0x006b
            java.lang.String r0 = "No platform found on Android"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x003d:
            java.lang.String r2 = "okhttp.platform"
            r1 = 0
            byte[] r0 = X.SUS.A07
            java.lang.String r0 = java.lang.System.getProperty(r2)     // Catch:{ AccessControlException -> 0x004a }
            if (r0 == 0) goto L_0x004a
            r1 = r0
        L_0x004a:
            java.lang.String r0 = "conscrypt"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0065
            java.security.Provider[] r1 = java.security.Security.getProviders()
            r0 = 0
            r0 = r1[r0]
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = "Conscrypt"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0076
        L_0x0065:
            X.TYz r1 = X.TYz.A01()
            if (r1 == 0) goto L_0x0076
        L_0x006b:
            A00 = r1
            java.lang.Class<X.Y1U> r0 = X.Y1U.class
            java.util.logging.Logger r0 = X.Pxf.A11(r0)
            A01 = r0
            return
        L_0x0076:
            java.lang.Class<javax.net.ssl.SSLParameters> r2 = javax.net.ssl.SSLParameters.class
            java.lang.String r1 = "setApplicationProtocols"
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r4 = 0
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ NoSuchMethodException -> 0x0096 }
            java.lang.reflect.Method r3 = r2.getMethod(r1, r0)     // Catch:{ NoSuchMethodException -> 0x0096 }
            java.lang.Class<javax.net.ssl.SSLSocket> r2 = javax.net.ssl.SSLSocket.class
            java.lang.String r1 = "getApplicationProtocol"
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x0096 }
            java.lang.reflect.Method r0 = r2.getMethod(r1, r0)     // Catch:{ NoSuchMethodException -> 0x0096 }
            X.TYx r1 = new X.TYx     // Catch:{ NoSuchMethodException -> 0x0096 }
            r1.<init>(r3, r0)     // Catch:{ NoSuchMethodException -> 0x0096 }
            goto L_0x006b
        L_0x0096:
            r5 = 0
            java.lang.String r2 = "org.eclipse.jetty.alpn.ALPN"
            r1 = 1
            java.lang.Class r3 = java.lang.Class.forName(r2, r1, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e6 }
            java.lang.String r0 = "$Provider"
            java.lang.String r0 = X.002.A0R(r2, r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e6 }
            java.lang.Class r4 = java.lang.Class.forName(r0, r1, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e6 }
            java.lang.String r0 = "$ClientProvider"
            java.lang.String r0 = X.002.A0R(r2, r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e6 }
            java.lang.Class r6 = java.lang.Class.forName(r0, r1, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e6 }
            java.lang.String r0 = "$ServerProvider"
            java.lang.String r0 = X.002.A0R(r2, r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e6 }
            java.lang.Class r7 = java.lang.Class.forName(r0, r1, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e6 }
            java.lang.String r1 = "put"
            java.lang.Class<javax.net.ssl.SSLSocket> r2 = javax.net.ssl.SSLSocket.class
            java.lang.Class[] r0 = new java.lang.Class[]{r2, r4}     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e6 }
            java.lang.reflect.Method r8 = r3.getMethod(r1, r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e6 }
            java.lang.String r1 = "get"
            java.lang.Class[] r0 = new java.lang.Class[]{r2}     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e6 }
            java.lang.reflect.Method r9 = r3.getMethod(r1, r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e6 }
            java.lang.String r1 = "remove"
            java.lang.Class[] r0 = new java.lang.Class[]{r2}     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e6 }
            java.lang.reflect.Method r10 = r3.getMethod(r1, r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e6 }
            X.TYy r1 = new X.TYy     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e6 }
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x00e6 }
            goto L_0x006b
        L_0x00e6:
            X.SPU r1 = new X.SPU
            r1.<init>()
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SPU.<clinit>():void");
    }

    public final void A04(String str, Object obj) {
        if (this instanceof TZ0) {
            TZ0 tz0 = (TZ0) this;
            C10644Rvd rvd = tz0.A05;
            if (obj != null) {
                try {
                    rvd.A02.invoke(obj, new Object[0]);
                    return;
                } catch (Exception unused) {
                }
            }
            tz0.A05(str, (Throwable) null, 5);
            return;
        }
        if (obj == null) {
            str = 002.A0R(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        A05(str, (Throwable) obj, 5);
    }

    public final void A05(String str, Throwable th, int i) {
        Level level;
        int min;
        if (this instanceof TZ0) {
            int i2 = 5;
            if (i != 5) {
                i2 = 3;
            }
            if (th != null) {
                str = 002.A0T(str, Log.getStackTraceString(th), 10);
            }
            int i3 = 0;
            int length = str.length();
            while (i3 < length) {
                int indexOf = str.indexOf(10, i3);
                if (indexOf == -1) {
                    indexOf = length;
                }
                do {
                    min = Math.min(indexOf, i3 + CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS);
                    Log.println(i2, "OkHttp", str.substring(i3, min));
                    i3 = min;
                } while (min < indexOf);
                i3 = min + 1;
            }
            return;
        }
        if (i == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        A01.log(level, str, th);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.ClassCastException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.AssertionError} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.ClassCastException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.ClassCastException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.net.InetSocketAddress r3, java.net.Socket r4, int r5) {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.TZ0
            if (r0 == 0) goto L_0x0018
            r4.connect(r3, r5)     // Catch:{ AssertionError -> 0x0008, ClassCastException -> 0x0015 }
            goto L_0x0017
        L_0x0008:
            r1 = move-exception
            boolean r0 = X.SUS.A0B(r1)
            if (r0 == 0) goto L_0x0016
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0015:
            r1 = move-exception
        L_0x0016:
            throw r1
        L_0x0017:
            return
        L_0x0018:
            r4.connect(r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SPU.A06(java.net.InetSocketAddress, java.net.Socket, int):void");
    }

    public final void A07(SSLSocket sSLSocket) {
        if (this instanceof TYy) {
            try {
                ((TYy) this).A04.invoke((Object) null, new Object[]{sSLSocket});
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw Pxe.A0e("failed to remove ALPN");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        throw X.Pxe.A0e("unable to determine cleartext support");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        return true;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[ExcHandler: IllegalAccessException | IllegalArgumentException | InvocationTargetException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:11:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[ExcHandler: ClassNotFoundException | NoSuchMethodException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:11:0x002c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A08(java.lang.String r5) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.TZ0
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "android.security.NetworkSecurityPolicy"
            java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch:{  }
            java.lang.String r1 = "getInstance"
            r0 = 0
            java.lang.Object r2 = X.C41847B3o.A17(r3, r1, r0)     // Catch:{  }
            java.lang.String r1 = "isCleartextTrafficPermitted"
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ NoSuchMethodException -> 0x002a }
            java.lang.reflect.Method r1 = r3.getMethod(r1, r0)     // Catch:{ NoSuchMethodException -> 0x002a }
            java.lang.Object[] r0 = new java.lang.Object[]{r5}     // Catch:{ NoSuchMethodException -> 0x002a }
            java.lang.Object r0 = r1.invoke(r2, r0)     // Catch:{ NoSuchMethodException -> 0x002a }
            boolean r0 = X.AnonymousClass7TE.A1a(r0)     // Catch:{ NoSuchMethodException -> 0x002a }
            return r0
        L_0x002a:
            java.lang.String r0 = "isCleartextTrafficPermitted"
            java.lang.Object r0 = X.Pxj.A0l(r2, r3, r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d, ClassNotFoundException | NoSuchMethodException -> 0x003d, IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0035, IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0035 }
            boolean r0 = X.AnonymousClass7TE.A1a(r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d, ClassNotFoundException | NoSuchMethodException -> 0x003d, IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0035, IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0035 }
            return r0
        L_0x0035:
            java.lang.String r0 = "unable to determine cleartext support"
            java.lang.AssertionError r0 = X.Pxe.A0e(r0)
            throw r0
        L_0x003d:
            r0 = 1
            return r0
        L_0x003f:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SPU.A08(java.lang.String):boolean");
    }

    public String A09(SSLSocket sSLSocket) {
        if (this instanceof TYx) {
            try {
                String str = (String) ((TYx) this).A00.invoke(sSLSocket, Pxe.A1b());
                if (str == null || str.equals("")) {
                    return null;
                }
                return str;
            } catch (InvocationTargetException e) {
                if (!(e.getCause() instanceof UnsupportedOperationException)) {
                    throw Pxe.A0e("failed to get ALPN selected protocol");
                }
            } catch (IllegalAccessException unused) {
                throw Pxe.A0e("failed to get ALPN selected protocol");
            }
        } else if (this instanceof TYy) {
            try {
                TLP tlp = (TLP) Proxy.getInvocationHandler(((TYy) this).A02.invoke((Object) null, new Object[]{sSLSocket}));
                boolean z = tlp.A01;
                if (!z && tlp.A00 == null) {
                    A00.A05("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null, 4);
                    return null;
                } else if (!z) {
                    return tlp.A00;
                } else {
                    return null;
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                throw Pxe.A0e("failed to get ALPN selected protocol");
            }
        } else if (!(this instanceof TZ0)) {
            return null;
        } else {
            TZ0 tz0 = (TZ0) this;
            if (!tz0.A00.isInstance(sSLSocket)) {
                return null;
            }
            try {
                byte[] bArr = (byte[]) tz0.A01.invoke(sSLSocket, Pxe.A1b());
                if (bArr != null) {
                    return new String(bArr, StandardCharsets.UTF_8);
                }
                return null;
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw Pxe.A0e(e2);
            }
        }
    }

    public SSLContext A0A() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw Pxe.A0j("No TLS provider", e);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.TPe] */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ce, code lost:
        throw X.Pxe.A0e(r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c9 A[ExcHandler: IllegalAccessException | InvocationTargetException (r0v6 'e' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:24:0x0074] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(java.lang.String r8, java.util.List r9, javax.net.ssl.SSLSocket r10) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.TYx
            if (r0 == 0) goto L_0x002d
            r0 = r7
            X.TYx r0 = (X.TYx) r0
            javax.net.ssl.SSLParameters r3 = r10.getSSLParameters()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0026 }
            java.util.ArrayList r2 = A00(r9)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0026 }
            java.lang.reflect.Method r1 = r0.A01     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0026 }
            int r0 = r2.size()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0026 }
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0026 }
            java.lang.Object[] r0 = r2.toArray(r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0026 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0026 }
            r1.invoke(r3, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0026 }
            r10.setSSLParameters(r3)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0026 }
            return
        L_0x0026:
            java.lang.String r0 = "failed to set SSL parameters"
            java.lang.AssertionError r0 = X.Pxe.A0e(r0)
            throw r0
        L_0x002d:
            boolean r0 = r7 instanceof X.TYy
            if (r0 == 0) goto L_0x0061
            r4 = r7
            X.TYy r4 = (X.TYy) r4
            java.util.ArrayList r3 = A00(r9)
            java.lang.Class<X.SPU> r0 = X.SPU.class
            java.lang.ClassLoader r2 = r0.getClassLoader()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005a }
            java.lang.Class r1 = r4.A00     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005a }
            java.lang.Class r0 = r4.A01     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005a }
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r0}     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005a }
            X.TLP r0 = new X.TLP     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005a }
            r0.<init>(r3)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005a }
            java.lang.Object r0 = java.lang.reflect.Proxy.newProxyInstance(r2, r1, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005a }
            java.lang.reflect.Method r2 = r4.A03     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005a }
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[]{r10, r0}     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005a }
            r2.invoke(r1, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x005a }
            return
        L_0x005a:
            java.lang.String r0 = "failed to set ALPN"
            java.lang.AssertionError r0 = X.Pxe.A0e(r0)
            throw r0
        L_0x0061:
            boolean r0 = r7 instanceof X.TZ0
            if (r0 == 0) goto L_0x00cf
            r2 = r7
            X.TZ0 r2 = (X.TZ0) r2
            java.lang.Class r0 = r2.A00
            boolean r0 = r0.isInstance(r10)
            if (r0 == 0) goto L_0x00cf
            r6 = 0
            r0 = 1
            if (r8 == 0) goto L_0x008a
            java.lang.reflect.Method r1 = r2.A04     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c9 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c9 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c9 }
            r1.invoke(r10, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c9 }
            java.lang.reflect.Method r1 = r2.A03     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c9 }
            java.lang.Object[] r0 = new java.lang.Object[]{r8}     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c9 }
            r1.invoke(r10, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c9 }
        L_0x008a:
            java.lang.reflect.Method r5 = r2.A02     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c9 }
            X.TPe r4 = new X.TPe     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c9 }
            r4.<init>()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c9 }
            int r3 = r9.size()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c9 }
            r2 = 0
        L_0x0096:
            if (r2 >= r3) goto L_0x00b5
            java.lang.Object r1 = r9.get(r2)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c9 }
            X.XRO r0 = X.XRO.HTTP_1_0     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c9 }
            if (r1 == r0) goto L_0x00b2
            java.lang.String r1 = r1.toString()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c9 }
            int r0 = r1.length()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c9 }
            r4.A0B(r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c9 }
            int r0 = r1.length()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c9 }
            r4.A0G(r1, r6, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c9 }
        L_0x00b2:
            int r2 = r2 + 1
            goto L_0x0096
        L_0x00b5:
            long r0 = r4.A00     // Catch:{ EOFException -> 0x00c3, IllegalAccessException | InvocationTargetException -> 0x00c9 }
            byte[] r0 = r4.E6H(r0)     // Catch:{ EOFException -> 0x00c3, IllegalAccessException | InvocationTargetException -> 0x00c9 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c9 }
            r5.invoke(r10, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c9 }
            return
        L_0x00c3:
            r0 = move-exception
            java.lang.AssertionError r0 = X.Pxe.A0e(r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c9 }
            throw r0     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c9 }
        L_0x00c9:
            r0 = move-exception
            java.lang.AssertionError r0 = X.Pxe.A0e(r0)
            throw r0
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SPU.A0B(java.lang.String, java.util.List, javax.net.ssl.SSLSocket):void");
    }

    public C9113RPk A0D(X509TrustManager x509TrustManager) {
        C13682Ter ter;
        if (this instanceof TZ0) {
            try {
                Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
                declaredMethod.setAccessible(true);
                ter = new C13195TPb(declaredMethod, x509TrustManager);
            } catch (NoSuchMethodException unused) {
                ter = new C13194TPa(x509TrustManager.getAcceptedIssuers());
            }
        } else {
            ter = new C13194TPa(x509TrustManager.getAcceptedIssuers());
        }
        return new TZ1(ter);
    }

    public static ArrayList A00(List list) {
        ArrayList A0m = C51970G9q.A0m(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj != XRO.HTTP_1_0) {
                DbU.A1X(obj, A0m);
            }
        }
        return A0m;
    }

    public final Object A03() {
        if (this instanceof TZ0) {
            C10644Rvd rvd = ((TZ0) this).A05;
            Method method = rvd.A00;
            if (method == null) {
                return null;
            }
            try {
                Object invoke = method.invoke((Object) null, new Object[0]);
                rvd.A01.invoke(invoke, new Object[]{"response.body().close()"});
                return invoke;
            } catch (Exception unused) {
                return null;
            }
        } else if (A01.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        } else {
            return null;
        }
    }

    public final String toString() {
        return C51968G9o.A16(this);
    }
}
