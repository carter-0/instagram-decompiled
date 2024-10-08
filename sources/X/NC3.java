package X;

import android.content.Context;
import com.facebook.proxyservice.observer.ProxyServiceBroadcaster;
import java.util.List;

public final class NC3 extends C11768SgE implements C13715Tfe {
    public static NC3 A03;
    public static boolean A04;
    public static final C70297O1b A05 = new Object();
    public final C74588Pxb A00;
    public final 02m A01;
    public final C70773OKt A02;

    public final void D5g(String str, int i, int i2, String str2) {
        String str3;
        AnonymousClass7TF.A1C(str, 0, str2);
        02m r3 = this.A01;
        r3.markerPoint(79499422, "on_connected");
        ProxyServiceBroadcaster proxyServiceBroadcaster = ProxyServiceBroadcaster.instance;
        synchronized (proxyServiceBroadcaster) {
            str3 = proxyServiceBroadcaster.clientRegion;
        }
        r3.markerAnnotate(79499422, "client_region", str3);
        0Tu r6 = 0Tu.A05;
        String A042 = 1AW.A04(r6, 18863762652201118L);
        String A043 = 1AW.A04(r6, 18863762652266655L);
        AnonymousClass1Bu.A00();
        if (!SRB.A01(str, A042, A043, str2, i)) {
            0KC.A0D("proxy_service", "IGProxyService::stop due to system proxy is already set.");
            r3.markerAnnotate(79499422, "cancel_reason", "system_proxy_set");
            r3.markerEnd(79499422, 4);
            this.A02.A00(4);
            this.A04.stop();
            return;
        }
        C62880wX r1 = C61170le.A00;
        183 r0 = 183.A01;
        if (r0 != null) {
            0qQ.A0B(r1, 0);
            1AV A012 = r0.A01();
            1ET.A01.getValue();
            1AV.A00(A012, false);
        }
        r3.markerEnd(79499422, 2);
        this.A02.A00(2);
    }

    public final String getAppName() {
        return "IG4A";
    }

    public final void onDiagnosticMessage(String str) {
        0qQ.A0B(str, 0);
        C70773OKt oKt = this.A02;
        if (oKt.A02) {
            List A0R = 00l.A0R(str, new String[]{": "}, 2);
            if (A0R.size() < 2) {
                oKt.A00.markerPoint(79496324, AnonymousClass7TF.A0j(00p.A0g(str, " ", "_", false)));
                return;
            }
            String A19 = AnonymousClass7TE.A19(A0R, 0);
            String A192 = AnonymousClass7TE.A19(A0R, 1);
            02m r0 = oKt.A00;
            r0.markerPoint(79496324, A19);
            r0.markerAnnotate(79496324, A19, A192);
            oKt.A01.add(str);
        }
    }

    public final void D97() {
        SRB.A01("", (String) null, (String) null, (String) null, 0);
    }

    public final Context getContext() {
        Context context = C60960kU.A00;
        0qQ.A07(context);
        return context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0075, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getPsiphonConfig() {
        /*
            r8 = this;
            android.content.Context r7 = X.C60960kU.A00
            X.0qQ.A07(r7)
            android.content.res.AssetManager r1 = r7.getAssets()
            java.lang.String r0 = "proxyservice_config.json"
            java.io.InputStream r3 = r1.open(r0)
            java.lang.String r2 = "proxy_service"
            r6 = 0
            r4 = 1
            r5 = 0
            java.lang.String r1 = X.C61120lW.A04(r7)     // Catch:{ RuntimeException -> 0x0039, NumberFormatException -> 0x0037 }
            if (r1 == 0) goto L_0x0052
            java.lang.String r0 = "."
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ RuntimeException -> 0x0039, NumberFormatException -> 0x0037 }
            java.util.List r0 = X.00l.A0R(r1, r0, r6)     // Catch:{ RuntimeException -> 0x0039, NumberFormatException -> 0x0037 }
            java.lang.Object r0 = X.00k.A0J(r0)     // Catch:{ RuntimeException -> 0x0039, NumberFormatException -> 0x0037 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ RuntimeException -> 0x0039, NumberFormatException -> 0x0037 }
            if (r0 == 0) goto L_0x0052
            java.lang.Integer r0 = X.00y.A0l(r0)     // Catch:{ RuntimeException -> 0x0039, NumberFormatException -> 0x0037 }
            if (r0 == 0) goto L_0x0052
            int r5 = r0.intValue()     // Catch:{ RuntimeException -> 0x0039, NumberFormatException -> 0x0037 }
            goto L_0x0052
        L_0x0037:
            r0 = move-exception
            goto L_0x0045
        L_0x0039:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0072 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "Failed to get version name (%s)."
            goto L_0x004f
        L_0x0045:
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0072 }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "String to int failed (%s)."
        L_0x004f:
            X.0KC.A0O(r2, r0, r1)     // Catch:{ all -> 0x0072 }
        L_0x0052:
            X.0qQ.A0A(r3)     // Catch:{ all -> 0x0072 }
            byte[] r2 = X.C11108SAj.A01(r3)     // Catch:{ all -> 0x0072 }
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A05     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0072 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0072 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0072 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = X.JTR.A14(r1, r0, r4)     // Catch:{ all -> 0x0072 }
            if (r3 == 0) goto L_0x0071
            r3.close()
        L_0x0071:
            return r0
        L_0x0072:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r0 = move-exception
            X.1zE.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NC3.getPsiphonConfig():java.lang.String");
    }

    public NC3(C74588Pxb pxb, 02m r3) {
        super(pxb);
        this.A00 = pxb;
        this.A01 = r3;
        this.A02 = new C70773OKt(r3);
        ProxyServiceBroadcaster.instance.registerObserver(this);
    }
}
