package X;

import com.facebook.proxygen.HTTPClient;
import com.facebook.proxygen.HTTPRequestHandler;
import com.facebook.proxygen.HTTPThread;
import com.facebook.proxygen.JniHandler;
import com.facebook.proxygen.NativeReadBuffer;
import com.facebook.proxygen.NetworkStatusMonitor;
import com.facebook.proxygen.TraceEventContext;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class SRB {
    public static int A0V;
    public static int A0W;
    public static int A0X = 3;
    public static int A0Y;
    public static HTTPClient A0Z;
    public static NetworkStatusMonitor A0a;
    public static C10289Rpn A0b;
    public static String A0c = "";
    public static String A0d;
    public static String A0e = "";
    public static String A0f = "";
    public static Thread A0g;
    public static List A0h;
    public static boolean A0i;
    public static boolean A0j;
    public static boolean A0k;
    public static boolean A0l = true;
    public static boolean A0m;
    public static final HTTPThread A0n = new HTTPThread();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final AnonymousClass1C6 A09;
    public final 1C5 A0A;
    public final AnonymousClass1x6 A0B = new AnonymousClass1x6(AnonymousClass1x6.A02);
    public final AnonymousClass1Bx A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final AnonymousClass1Bw A0U;

    static {
        0dV.A0C("fb");
        0dV.A0C("liger");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        if (r6.equals("") != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0097, code lost:
        if (A0W != r4) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ad, code lost:
        if (A0Y == r2) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00() {
        /*
            com.facebook.proxygen.HTTPClient r9 = A0Z
            monitor-enter(r9)
            java.lang.String r0 = "http.nonProxyHosts"
            java.lang.String r1 = java.lang.System.getProperty(r0)     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = "http.proxyHost"
            java.lang.String r6 = java.lang.System.getProperty(r0)     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = "http.proxyPort"
            java.lang.Integer r0 = java.lang.Integer.getInteger(r0)     // Catch:{ all -> 0x00d2 }
            java.lang.String r3 = ""
            r8 = 0
            if (r0 != 0) goto L_0x001d
            r6 = r3
            r4 = 0
            goto L_0x0021
        L_0x001d:
            int r4 = r0.intValue()     // Catch:{ all -> 0x00d2 }
        L_0x0021:
            java.lang.String r0 = "https.proxyHost"
            java.lang.String r5 = java.lang.System.getProperty(r0)     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = "https.proxyPort"
            java.lang.Integer r0 = java.lang.Integer.getInteger(r0)     // Catch:{ all -> 0x00d2 }
            if (r0 != 0) goto L_0x0032
            r5 = r3
            r2 = 0
            goto L_0x0036
        L_0x0032:
            int r2 = r0.intValue()     // Catch:{ all -> 0x00d2 }
        L_0x0036:
            java.lang.String r7 = X.C10105Rmh.A00     // Catch:{ all -> 0x00d2 }
            boolean r0 = A0i     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x0062
            boolean r0 = r7.equals(r3)     // Catch:{ all -> 0x00d2 }
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = X.C10105Rmh.A01     // Catch:{ all -> 0x00d2 }
            int r4 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x00d2 }
            r2 = r4
            r6 = r7
            r5 = r7
        L_0x004b:
            boolean r0 = r6.equals(r3)     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x006c
        L_0x0051:
            java.lang.String r0 = "proxyHost"
            java.lang.String r6 = java.lang.System.getProperty(r0)     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = "proxyPort"
            java.lang.Integer r0 = java.lang.Integer.getInteger(r0)     // Catch:{ all -> 0x00d2 }
            if (r0 != 0) goto L_0x0065
            goto L_0x006a
        L_0x0062:
            if (r6 == 0) goto L_0x0051
            goto L_0x004b
        L_0x0065:
            int r4 = r0.intValue()     // Catch:{ all -> 0x00d2 }
            goto L_0x006c
        L_0x006a:
            r6 = r3
            r4 = 0
        L_0x006c:
            if (r5 == 0) goto L_0x0074
            boolean r0 = r5.equals(r3)     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x0076
        L_0x0074:
            r5 = r6
            r2 = r4
        L_0x0076:
            if (r1 == 0) goto L_0x0084
            java.lang.String r0 = A0c     // Catch:{ all -> 0x00d2 }
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ all -> 0x00d2 }
            if (r0 != 0) goto L_0x0084
            A0c = r1     // Catch:{ all -> 0x00d2 }
            r1 = 1
            goto L_0x0085
        L_0x0084:
            r1 = 0
        L_0x0085:
            if (r6 == 0) goto L_0x0092
            java.lang.String r0 = A0e     // Catch:{ all -> 0x00d2 }
            boolean r0 = r6.equalsIgnoreCase(r0)     // Catch:{ all -> 0x00d2 }
            if (r0 != 0) goto L_0x0092
            A0e = r6     // Catch:{ all -> 0x00d2 }
            goto L_0x0099
        L_0x0092:
            if (r1 != 0) goto L_0x0099
            int r0 = A0W     // Catch:{ all -> 0x00d2 }
            r1 = 0
            if (r0 == r4) goto L_0x009a
        L_0x0099:
            r1 = 1
        L_0x009a:
            A0W = r4     // Catch:{ all -> 0x00d2 }
            if (r5 == 0) goto L_0x00a9
            java.lang.String r0 = A0f     // Catch:{ all -> 0x00d2 }
            boolean r0 = r5.equalsIgnoreCase(r0)     // Catch:{ all -> 0x00d2 }
            if (r0 != 0) goto L_0x00a9
            A0f = r5     // Catch:{ all -> 0x00d2 }
            goto L_0x00af
        L_0x00a9:
            if (r1 != 0) goto L_0x00af
            int r0 = A0Y     // Catch:{ all -> 0x00d2 }
            if (r0 == r2) goto L_0x00b0
        L_0x00af:
            r8 = 1
        L_0x00b0:
            A0Y = r2     // Catch:{ all -> 0x00d2 }
            if (r8 == 0) goto L_0x00d0
            com.facebook.proxygen.HTTPClient r2 = A0Z     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = A0e     // Catch:{ all -> 0x00d2 }
            r2.setProxy(r0, r4, r3, r3)     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = A0f     // Catch:{ all -> 0x00d2 }
            int r0 = A0Y     // Catch:{ all -> 0x00d2 }
            r2.setSecureProxy(r1, r0, r3, r3)     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = A0c     // Catch:{ all -> 0x00d2 }
            r0 = 0
            r2.setProxyDomainsRules(r0, r1)     // Catch:{ all -> 0x00d2 }
            r2.mProxyClientAddress = r0     // Catch:{ all -> 0x00d2 }
            r0 = 1
            r2.mProxyFallbackEnabled = r0     // Catch:{ all -> 0x00d2 }
            r2.reInitializeIfNeeded()     // Catch:{ all -> 0x00d2 }
        L_0x00d0:
            monitor-exit(r9)     // Catch:{ all -> 0x00d2 }
            return
        L_0x00d2:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00d2 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SRB.A00():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (A0f.isEmpty() == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8) {
        /*
            com.facebook.proxygen.HTTPClient r3 = A0Z
            monitor-enter(r3)
            com.facebook.proxygen.HTTPClient r2 = A0Z     // Catch:{ all -> 0x0038 }
            monitor-enter(r2)     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = A0e     // Catch:{ all -> 0x0035 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = A0f     // Catch:{ all -> 0x0035 }
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0035 }
            r0 = 0
            if (r1 != 0) goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            r2 = 0
            if (r0 == 0) goto L_0x001e
            monitor-exit(r3)     // Catch:{ all -> 0x0038 }
            return r2
        L_0x001e:
            com.facebook.proxygen.HTTPClient r1 = A0Z     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = ""
            r1.setProxy(r4, r8, r0, r0)     // Catch:{ all -> 0x0038 }
            r1.setSecureProxy(r4, r8, r0, r0)     // Catch:{ all -> 0x0038 }
            r1.setProxyDomainsRules(r5, r6)     // Catch:{ all -> 0x0038 }
            r1.mProxyClientAddress = r7     // Catch:{ all -> 0x0038 }
            r1.mProxyFallbackEnabled = r2     // Catch:{ all -> 0x0038 }
            r1.reInitializeIfNeeded()     // Catch:{ all -> 0x0038 }
            r0 = 1
            monitor-exit(r3)     // Catch:{ all -> 0x0038 }
            return r0
        L_0x0035:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0038 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SRB.A01(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):boolean");
    }

    public final void A02(HTTPRequestHandler hTTPRequestHandler, JniHandler jniHandler, NativeReadBuffer nativeReadBuffer, TraceEventContext traceEventContext, 1QS r11, String str) {
        Pxe.A1G();
        A0Z.make(jniHandler, nativeReadBuffer, traceEventContext);
        if (AnonymousClass20W.A02()) {
            0qQ.A0B("true", 1);
            Map map = r11.A0A;
            map.put("ta_enabled", "true");
            String A002 = AnonymousClass000.A00(1766);
            0qQ.A0B(str, 1);
            map.put(A002, str);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (1Fn r2 : r11.A01) {
            if (!AnonymousClass20W.A05.containsValue(r2.A00)) {
                A1C.add(r2);
            }
        }
        if (!r11.A02("User-Agent")) {
            Pxf.A1M("User-Agent", 1Ch.A00(), A1C);
        }
        if (!r11.A02("Accept-Language")) {
            Pxf.A1M("Accept-Language", C61930qI.A00(), A1C);
        }
        if (!r11.A02("Connection")) {
            Pxf.A1M("Connection", "Keep-Alive", A1C);
        }
        1HW r1 = r11.A05;
        if (r1 != null) {
            r1.ACo(r11.A09, A1C);
        }
        if (0KC.A01.isLoggable(3)) {
            ArrayList A1D = AnonymousClass7TE.A1D(A1C);
            URI uri = r11.A09;
            String host = uri.getHost();
            if (host != null) {
                Pxf.A1M("Host", host, A1D);
            }
            Pxf.A1M("Accept-Encoding", "gzip,deflate", A1D);
            RhV.A00(r11.A06, 1Qp.A00(r11.A07), uri, (1Fn[]) A1D.toArray(new 1Fn[A1D.size()]));
        }
        hTTPRequestHandler.executeWithDefragmentation(C11410SSi.A02(r11, A1C));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x01a9, code lost:
        if (r3 == false) goto L_0x01ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SRB(android.content.Context r82, X.AnonymousClass1C6 r83, X.1C5 r84, X.AnonymousClass1Bw r85, X.AnonymousClass1Bx r86, java.lang.String r87, java.lang.String r88, java.lang.String r89, java.lang.String r90, java.lang.String r91, java.lang.String r92, java.util.List r93, int r94, int r95, int r96, int r97, int r98, int r99, int r100, int r101, int r102, int r103, long r104, boolean r106, boolean r107, boolean r108, boolean r109, boolean r110, boolean r111, boolean r112, boolean r113, boolean r114, boolean r115, boolean r116, boolean r117, boolean r118, boolean r119, boolean r120, boolean r121, boolean r122, boolean r123, boolean r124, boolean r125, boolean r126, boolean r127, boolean r128, boolean r129) {
        /*
            r81 = this;
            java.lang.String r17 = ""
            r3 = 10000(0x2710, float:1.4013E-41)
            r0 = r81
            r0.<init>()
            X.1x8 r2 = X.AnonymousClass1x6.A02
            X.1x6 r1 = new X.1x6
            r1.<init>(r2)
            r0.A0B = r1
            r1 = r85
            r0.A0U = r1
            r1 = r86
            r0.A0C = r1
            A0d = r17
            r1 = r84
            r0.A0A = r1
            r1 = r83
            r0.A09 = r1
            A0V = r3
            r1 = r114
            r0.A0S = r1
            r1 = r115
            r0.A0J = r1
            r1 = r116
            r0.A0K = r1
            r1 = r117
            r0.A0P = r1
            r1 = r118
            r0.A0N = r1
            r1 = r119
            r0.A0T = r1
            r1 = r88
            r0.A0D = r1
            r1 = r89
            r0.A0F = r1
            r1 = r95
            r0.A05 = r1
            r1 = r120
            r0.A0Q = r1
            r1 = r96
            r0.A03 = r1
            r1 = r97
            r0.A07 = r1
            r1 = r98
            r0.A04 = r1
            r1 = r121
            r0.A0M = r1
            r1 = r99
            r0.A06 = r1
            r1 = r100
            r0.A01 = r1
            r1 = r101
            r0.A00 = r1
            r1 = r102
            r0.A02 = r1
            r1 = r104
            r0.A08 = r1
            r1 = r123
            r0.A0L = r1
            r1 = r90
            r0.A0E = r1
            r1 = r91
            r0.A0H = r1
            r1 = r92
            r0.A0G = r1
            r1 = r124
            r0.A0O = r1
            r1 = r125
            r0.A0R = r1
            r1 = r126
            r0.A0I = r1
            A0m = r127
            A0h = r93
            A0X = r103
            A0l = r128
            A0k = r129
            r16 = r0
            monitor-enter(r16)
            X.Pxe.A1G()     // Catch:{ all -> 0x0314 }
            com.facebook.proxygen.HTTPThread r7 = A0n     // Catch:{ all -> 0x0314 }
            X.THT r1 = new X.THT     // Catch:{ all -> 0x0314 }
            r2 = r94
            r1.<init>(r2, r7)     // Catch:{ all -> 0x0314 }
            java.lang.Thread r2 = new java.lang.Thread     // Catch:{ all -> 0x0314 }
            r2.<init>(r1)     // Catch:{ all -> 0x0314 }
            A0g = r2     // Catch:{ all -> 0x0314 }
            r1 = 7
            r2.setPriority(r1)     // Catch:{ all -> 0x0314 }
            java.lang.Thread r1 = A0g     // Catch:{ all -> 0x0314 }
            r1.start()     // Catch:{ all -> 0x0314 }
            r7.waitForInitialization()     // Catch:{ all -> 0x0314 }
            boolean r1 = r7.eventBaseInitErrored()     // Catch:{ all -> 0x0314 }
            if (r1 != 0) goto L_0x030e
            A0j = r106     // Catch:{ all -> 0x0314 }
            r6 = r107
            A0i = r107     // Catch:{ all -> 0x0314 }
            com.facebook.proxygen.EventBase r3 = r7.getEventBase()     // Catch:{ all -> 0x0314 }
            java.lang.String r2 = A0d     // Catch:{ all -> 0x0314 }
            X.Rpn r1 = new X.Rpn     // Catch:{ all -> 0x0314 }
            r1.<init>(r3, r2)     // Catch:{ all -> 0x0314 }
            A0b = r1     // Catch:{ all -> 0x0314 }
            X.Som r2 = new X.Som     // Catch:{ all -> 0x0314 }
            r2.<init>(r0)     // Catch:{ all -> 0x0314 }
            com.facebook.proxygen.HTTPClient$Builder r1 = new com.facebook.proxygen.HTTPClient$Builder     // Catch:{ all -> 0x0314 }
            r1.<init>(r2)     // Catch:{ all -> 0x0314 }
            com.facebook.proxygen.EventBase r2 = r7.getEventBase()     // Catch:{ all -> 0x0314 }
            r1.mEventBase = r2     // Catch:{ all -> 0x0314 }
            r2 = 1
            r1.setMaxIdleHTTP2Sessions(r2)     // Catch:{ all -> 0x0314 }
            r1.mUseLoadBalancing = r2     // Catch:{ all -> 0x0314 }
            java.io.File r8 = r82.getCacheDir()     // Catch:{ all -> 0x0314 }
            java.lang.String r5 = "fbdns"
            java.lang.String r3 = A0d     // Catch:{ all -> 0x0314 }
            if (r3 != 0) goto L_0x00f5
            r3 = r17
        L_0x00f5:
            java.lang.String r4 = ".store"
            java.lang.String r3 = X.002.A0g(r5, r3, r4)     // Catch:{ all -> 0x0314 }
            java.io.File r3 = X.JTO.A0s(r8, r3)     // Catch:{ all -> 0x0314 }
            java.lang.String r10 = r3.toString()     // Catch:{ all -> 0x0314 }
            r8 = 200(0xc8, float:2.8E-43)
            r9 = 150(0x96, float:2.1E-43)
            r5 = 0
            com.facebook.proxygen.PersistentSSLCacheSettings r3 = new com.facebook.proxygen.PersistentSSLCacheSettings     // Catch:{ all -> 0x0314 }
            r3.<init>(r10, r8, r9, r5)     // Catch:{ all -> 0x0314 }
            r1.mPersistentDNSCacheSettings = r3     // Catch:{ all -> 0x0314 }
            java.io.File r8 = r82.getCacheDir()     // Catch:{ all -> 0x0314 }
            java.lang.String r5 = "fbtlsx"
            java.lang.String r3 = A0d     // Catch:{ all -> 0x0314 }
            if (r3 != 0) goto L_0x011b
            r3 = r17
        L_0x011b:
            java.lang.String r3 = X.002.A0g(r5, r3, r4)     // Catch:{ all -> 0x0314 }
            java.io.File r3 = X.JTO.A0s(r8, r3)     // Catch:{ all -> 0x0314 }
            java.lang.String r8 = r3.toString()     // Catch:{ all -> 0x0314 }
            r5 = 50
            com.facebook.proxygen.PersistentSSLCacheSettings r3 = new com.facebook.proxygen.PersistentSSLCacheSettings     // Catch:{ all -> 0x0314 }
            r3.<init>(r8, r5, r9, r2)     // Catch:{ all -> 0x0314 }
            r1.mPersistentSSLCacheSettings = r3     // Catch:{ all -> 0x0314 }
            r3 = r108
            r1.mDnsCacheEnabled = r3     // Catch:{ all -> 0x0314 }
            r5 = 0
            r1.setDnsMaxRetries(r5)     // Catch:{ all -> 0x0314 }
            r3 = r109
            r1.mResetDNSResolverAsynchronously = r3     // Catch:{ all -> 0x0314 }
            r3 = 163840(0x28000, float:2.29589E-40)
            r1.setFlowControl(r2, r3, r3)     // Catch:{ all -> 0x0314 }
            r1.mEnableHTTP2 = r2     // Catch:{ all -> 0x0314 }
            r1.setFizzHTTP2StaticOverride(r2, r5)     // Catch:{ all -> 0x0314 }
            if (r107 != 0) goto L_0x014a
            r5 = 1
        L_0x014a:
            r1.mIsHTTPSEnforced = r5     // Catch:{ all -> 0x0314 }
            r1.setIsSandbox(r6)     // Catch:{ all -> 0x0314 }
            r1.mEnableZstd = r2     // Catch:{ all -> 0x0314 }
            r3 = r122
            r1.mEnableDzCompression = r3     // Catch:{ all -> 0x0314 }
            boolean r3 = r0.A0S     // Catch:{ all -> 0x0314 }
            r1.mTransactionIdleTimeoutDisabled = r3     // Catch:{ all -> 0x0314 }
            boolean r3 = r0.A0J     // Catch:{ all -> 0x0314 }
            r1.mDisableCircularLogSink = r3     // Catch:{ all -> 0x0314 }
            if (r111 == 0) goto L_0x0177
            com.facebook.proxygen.EventBase r3 = r7.getEventBase()     // Catch:{ all -> 0x0314 }
            com.facebook.proxygen.NetworkStatusMonitor r5 = new com.facebook.proxygen.NetworkStatusMonitor     // Catch:{ all -> 0x0314 }
            r5.<init>(r3)     // Catch:{ all -> 0x0314 }
            r3 = 0
            com.facebook.proxygen.ProxygenRadioMeter r3 = com.facebook.proxygen.ProxygenRadioMeter.getInstance(r3)     // Catch:{ all -> 0x0314 }
            r5.mRadioMeter = r3     // Catch:{ all -> 0x0314 }
            r3 = 5
            r5.init(r3)     // Catch:{ all -> 0x0314 }
            A0a = r5     // Catch:{ all -> 0x0314 }
            r1.mNetworkStatusMonitor = r5     // Catch:{ all -> 0x0314 }
        L_0x0177:
            if (r112 == 0) goto L_0x017b
            r1.mEnableTransportCallbacks = r2     // Catch:{ all -> 0x0314 }
        L_0x017b:
            if (r110 == 0) goto L_0x0183
            r3 = r87
            r1.mPreConnects = r3     // Catch:{ all -> 0x0314 }
            r1.mEnableLigerPreconnect = r2     // Catch:{ all -> 0x0314 }
        L_0x0183:
            android.content.Context r3 = X.C60960kU.A00     // Catch:{ all -> 0x0314 }
            boolean r3 = X.AnonymousClass0Wg.A00(r3)     // Catch:{ all -> 0x0314 }
            if (r3 == 0) goto L_0x018f
            java.lang.String r3 = "VPN"
            r1.mInitialNetworkType = r3     // Catch:{ all -> 0x0314 }
        L_0x018f:
            if (r107 != 0) goto L_0x0193
            if (r113 == 0) goto L_0x019d
        L_0x0193:
            java.util.ArrayList r3 = X.C11342SNz.A00()     // Catch:{ all -> 0x0314 }
            byte[][] r3 = X.C11342SNz.A01(r3)     // Catch:{ all -> 0x0314 }
            r1.mUserInstalledCertificates = r3     // Catch:{ all -> 0x0314 }
        L_0x019d:
            boolean r64 = A0j     // Catch:{ all -> 0x0314 }
            boolean r8 = r0.A0Q     // Catch:{ all -> 0x0314 }
            boolean r3 = r0.A0R     // Catch:{ all -> 0x0314 }
            r53 = 0
            if (r8 != 0) goto L_0x01ab
            r68 = 1
            if (r3 != 0) goto L_0x01ad
        L_0x01ab:
            r68 = 0
        L_0x01ad:
            java.lang.String r6 = "igfizz"
            java.io.File r5 = r82.getCacheDir()     // Catch:{ all -> 0x0314 }
            java.lang.String r3 = A0d     // Catch:{ all -> 0x0314 }
            if (r3 != 0) goto L_0x01b9
            r3 = r17
        L_0x01b9:
            java.lang.String r3 = X.002.A0g(r6, r3, r4)     // Catch:{ all -> 0x0314 }
            java.io.File r3 = X.JTO.A0s(r5, r3)     // Catch:{ all -> 0x0314 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x0314 }
            r6 = 30
            r5 = 150(0x96, float:2.1E-43)
            r3 = 0
            com.facebook.proxygen.PersistentSSLCacheSettings r9 = new com.facebook.proxygen.PersistentSSLCacheSettings     // Catch:{ all -> 0x0314 }
            r9.<init>(r7, r6, r5, r3)     // Catch:{ all -> 0x0314 }
            r36 = 5
            r74 = -1
            com.facebook.proxygen.FizzSettings r7 = new com.facebook.proxygen.FizzSettings     // Catch:{ all -> 0x0314 }
            r63 = r7
            r65 = r3
            r66 = r2
            r67 = r9
            r69 = r2
            r70 = r36
            r71 = r3
            r72 = r3
            r73 = r53
            r75 = r3
            r76 = r3
            r77 = r3
            r78 = r53
            r79 = r3
            r80 = r3
            r63.<init>(r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80)     // Catch:{ all -> 0x0314 }
            r1.mFizzSettings = r7     // Catch:{ all -> 0x0314 }
            boolean r7 = r0.A0K     // Catch:{ all -> 0x0314 }
            if (r7 == 0) goto L_0x02f5
            boolean r7 = r0.A0T     // Catch:{ all -> 0x0314 }
            r78 = r7
            java.lang.String r7 = r0.A0D     // Catch:{ all -> 0x0314 }
            r77 = r7
            java.lang.String r7 = r0.A0F     // Catch:{ all -> 0x0314 }
            r76 = r7
            boolean r7 = r0.A0P     // Catch:{ all -> 0x0314 }
            r75 = r7
            int r7 = r0.A05     // Catch:{ all -> 0x0314 }
            r27 = r7
            boolean r7 = r0.A0N     // Catch:{ all -> 0x0314 }
            r28 = r7
            int r7 = r0.A03     // Catch:{ all -> 0x0314 }
            r29 = r7
            int r7 = r0.A07     // Catch:{ all -> 0x0314 }
            r23 = r7
            int r7 = r0.A04     // Catch:{ all -> 0x0314 }
            r22 = r7
            boolean r7 = r0.A0M     // Catch:{ all -> 0x0314 }
            r21 = r7
            int r7 = r0.A06     // Catch:{ all -> 0x0314 }
            r20 = r7
            int r7 = r0.A01     // Catch:{ all -> 0x0314 }
            r19 = r7
            int r7 = r0.A00     // Catch:{ all -> 0x0314 }
            r18 = r7
            int r15 = r0.A02     // Catch:{ all -> 0x0314 }
            java.lang.String r14 = r0.A0E     // Catch:{ all -> 0x0314 }
            boolean r13 = r0.A0L     // Catch:{ all -> 0x0314 }
            java.lang.String r12 = r0.A0H     // Catch:{ all -> 0x0314 }
            java.lang.String r11 = r0.A0G     // Catch:{ all -> 0x0314 }
            boolean r10 = r0.A0O     // Catch:{ all -> 0x0314 }
            boolean r9 = r0.A0I     // Catch:{ all -> 0x0314 }
            r25 = 1280(0x500, float:1.794E-42)
            r33 = 2000(0x7d0, float:2.803E-42)
            r44 = 2
            r47 = 2147483647(0x7fffffff, float:NaN)
            r59 = 3
            r60 = 10
            r68 = 1000000(0xf4240, float:1.401298E-39)
            com.facebook.proxygen.QuicSettings r7 = new com.facebook.proxygen.QuicSettings     // Catch:{ all -> 0x0314 }
            r24 = r3
            r26 = r3
            r30 = r23
            r31 = r3
            r32 = r3
            r34 = r22
            r35 = r13
            r37 = r14
            r38 = r20
            r39 = r19
            r40 = r18
            r41 = r15
            r42 = r3
            r43 = r3
            r45 = r21
            r46 = r11
            r48 = r3
            r49 = r12
            r50 = r10
            r51 = r3
            r52 = r3
            r54 = r53
            r55 = r3
            r56 = r3
            r57 = r9
            r58 = r3
            r61 = r53
            r62 = r3
            r63 = r3
            r64 = r2
            r65 = r53
            r66 = r3
            r67 = r3
            r69 = r3
            r70 = r3
            r72 = r2
            r73 = r3
            r18 = r7
            r19 = r77
            r20 = r78
            r21 = r76
            r22 = r2
            r23 = r75
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73)     // Catch:{ all -> 0x0314 }
            r1.mQuicSettings = r7     // Catch:{ all -> 0x0314 }
            java.lang.String r10 = "igquicfizz"
            java.io.File r9 = r82.getCacheDir()     // Catch:{ all -> 0x0314 }
            java.lang.String r7 = A0d     // Catch:{ all -> 0x0314 }
            if (r7 != 0) goto L_0x02b7
            r7 = r17
        L_0x02b7:
            java.lang.String r4 = X.002.A0g(r10, r7, r4)     // Catch:{ all -> 0x0314 }
            java.io.File r4 = X.JTO.A0s(r9, r4)     // Catch:{ all -> 0x0314 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0314 }
            com.facebook.proxygen.PersistentSSLCacheSettings r7 = new com.facebook.proxygen.PersistentSSLCacheSettings     // Catch:{ all -> 0x0314 }
            r7.<init>(r4, r6, r5, r3)     // Catch:{ all -> 0x0314 }
            com.facebook.proxygen.FizzSettings r4 = new com.facebook.proxygen.FizzSettings     // Catch:{ all -> 0x0314 }
            r17 = r4
            r18 = r2
            r19 = r3
            r20 = r2
            r21 = r7
            r22 = r8
            r23 = r3
            r24 = r36
            r25 = r3
            r27 = r53
            r28 = r74
            r29 = r3
            r30 = r3
            r32 = r53
            r33 = r3
            r34 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0314 }
            r1.mQuicFizzSettings = r4     // Catch:{ all -> 0x0314 }
            r1.mAttemptEarlyDataInQuicPreconnect = r3     // Catch:{ all -> 0x0314 }
            long r4 = r0.A08     // Catch:{ all -> 0x0314 }
            r1.mQuicVersion = r4     // Catch:{ all -> 0x0314 }
        L_0x02f5:
            X.Sos r2 = new X.Sos     // Catch:{ all -> 0x0314 }
            r2.<init>(r0)     // Catch:{ all -> 0x0314 }
            r1.mRootCACallbacks = r2     // Catch:{ all -> 0x0314 }
            com.facebook.proxygen.HTTPClient r0 = r1.build()     // Catch:{ all -> 0x0314 }
            A0Z = r0     // Catch:{ all -> 0x0314 }
            r0.callNativeInit(r3, r3)     // Catch:{ all -> 0x0314 }
            X.Rpn r0 = A0b     // Catch:{ all -> 0x0314 }
            com.facebook.proxygen.utils.CircularEventLog r0 = r0.A00     // Catch:{ all -> 0x0314 }
            r0.nonBlockingInit()     // Catch:{ all -> 0x0314 }
            monitor-exit(r16)
            return
        L_0x030e:
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x0314 }
            r0.<init>()     // Catch:{ all -> 0x0314 }
            throw r0     // Catch:{ all -> 0x0314 }
        L_0x0314:
            r1 = move-exception
            com.facebook.proxygen.utils.LigerInitializationException r0 = new com.facebook.proxygen.utils.LigerInitializationException     // Catch:{ all -> 0x031b }
            r0.<init>(r1)     // Catch:{ all -> 0x031b }
            throw r0     // Catch:{ all -> 0x031b }
        L_0x031b:
            r0 = move-exception
            monitor-exit(r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SRB.<init>(android.content.Context, X.1C6, X.1C5, X.1Bw, X.1Bx, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, int, int, int, int, int, int, int, int, int, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
