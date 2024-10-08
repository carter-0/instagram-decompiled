package X;

import com.facebook.tigon.iface.TigonRequest;
import com.facebook.tigon.tigonhuc.HucClient;
import com.facebook.tigon.tigonhuc.TigonHucBodyProvider;
import com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder;

/* renamed from: X.TJk  reason: case insensitive filesystem */
public final class C13054TJk implements Runnable {
    public final /* synthetic */ TigonRequest A00;
    public final /* synthetic */ HucClient A01;
    public final /* synthetic */ TigonHucBodyProvider A02;
    public final /* synthetic */ TigonHucCallbackForwarder A03;

    public C13054TJk(TigonRequest tigonRequest, HucClient hucClient, TigonHucBodyProvider tigonHucBodyProvider, TigonHucCallbackForwarder tigonHucCallbackForwarder) {
        this.A00 = tigonRequest;
        this.A01 = hucClient;
        this.A02 = tigonHucBodyProvider;
        this.A03 = tigonHucCallbackForwarder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01e2, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01f7, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01f8, code lost:
        r2 = r2.A03;
        r1 = com.facebook.tigon.iface.TigonErrorCode.FATAL_ERROR.value;
        r0 = r5.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0203, code lost:
        if (r0 != null) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0205, code lost:
        r6 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0206, code lost:
        r2.onError(r1, "HucClient", 2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0209, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x020a, code lost:
        X.Pxe.A1F();
        r2.A03.onError(com.facebook.tigon.iface.TigonErrorCode.CANCEL.value, "HucClient", 4, "Request cancelled");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0219, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f5, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ad, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        X.1zE.A00(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c0, code lost:
        X.1zE.A00(r12, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01c4, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01c5, code lost:
        r3 = r2.A03;
        r2 = com.facebook.tigon.iface.TigonErrorCode.TRANSIENT_ERROR.value;
        r1 = 5;
        r0 = r5.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01d0, code lost:
        if (r0 != null) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01d2, code lost:
        r6 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01d4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01d5, code lost:
        r3 = r2.A03;
        r2 = com.facebook.tigon.iface.TigonErrorCode.FATAL_ERROR.value;
        r0 = r1.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01df, code lost:
        if (r0 != null) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01e1, code lost:
        r6 = r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x0199 */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01f7 A[ExcHandler: MalformedURLException (r5v1 'e' java.net.MalformedURLException A[CUSTOM_DECLARE]), Splitter:B:1:0x0007] */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[ExcHandler: InterruptedException (unused java.lang.InterruptedException), SYNTHETIC, Splitter:B:1:0x0007] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01c4 A[ExcHandler: Exception (r5v2 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:1:0x0007] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01d4 A[ExcHandler: ProtocolException (r1v5 'e' java.net.ProtocolException A[CUSTOM_DECLARE]), Splitter:B:1:0x0007] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            java.lang.String r6 = ""
            java.lang.String r4 = "HucClient"
            r5 = 1
            r2 = r17
            com.facebook.tigon.iface.TigonRequest r12 = r2.A00     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            java.lang.String r0 = r12.url()     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            java.net.URL r7 = new java.net.URL     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            r7.<init>(r0)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            java.net.URLConnection r3 = r7.openConnection()     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            java.lang.String r0 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            X.0qQ.A0C(r3, r0)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            r0 = 10000(0x2710, float:1.4013E-41)
            r3.setConnectTimeout(r0)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            r0 = 30000(0x7530, float:4.2039E-41)
            r3.setReadTimeout(r0)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            r11 = 0
            r3.setUseCaches(r11)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            r3.setDoInput(r5)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            java.lang.String r1 = "User-Agent"
            com.facebook.tigon.tigonhuc.HucClient r9 = r2.A01     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            java.lang.String r0 = r9.userAgent     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            r3.addRequestProperty(r1, r0)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            java.lang.String r1 = "X-FB-HTTP-Engine"
            java.lang.String r0 = "Tigon-Native-HUC"
            r3.addRequestProperty(r1, r0)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            java.lang.String r1 = "https"
            java.lang.String r0 = r7.getProtocol()     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            boolean r0 = r1.equals(r0)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            if (r0 == 0) goto L_0x005a
            r1 = r3
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            javax.net.ssl.SSLSocketFactory r0 = r9.sslSocketFactory     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            if (r0 == 0) goto L_0x0055
            r1.setSSLSocketFactory(r0)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
        L_0x0055:
            javax.net.ssl.HostnameVerifier r0 = r9.hostnameVerifier     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            r1.setHostnameVerifier(r0)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
        L_0x005a:
            java.util.Map r0 = r12.headers()     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            java.util.Iterator r16 = X.AnonymousClass7TF.A0u(r0)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            r14 = -1
            r0 = -1
        L_0x0066:
            boolean r8 = r16.hasNext()     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            if (r8 == 0) goto L_0x0098
            java.util.Map$Entry r13 = X.AnonymousClass7TE.A1J(r16)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            int r8 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r8 != 0) goto L_0x008c
            java.lang.String r8 = X.DbT.A13(r13)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            java.lang.String r10 = X.AnonymousClass7TF.A0j(r8)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            java.lang.String r8 = "content-length"
            boolean r8 = r10.equals(r8)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            if (r8 == 0) goto L_0x008c
            java.lang.String r0 = X.DbS.A0s(r13)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
        L_0x008c:
            java.lang.String r10 = X.DbT.A13(r13)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            java.lang.String r8 = X.DbS.A0s(r13)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            r3.addRequestProperty(r10, r8)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            goto L_0x0066
        L_0x0098:
            java.lang.String r8 = r12.method()     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            r3.setRequestMethod(r8)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            java.lang.String r10 = r3.getRequestMethod()     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            java.lang.String r8 = "POST"
            boolean r8 = X.0qQ.A0K(r10, r8)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            if (r8 == 0) goto L_0x00fb
            com.facebook.tigon.tigonhuc.TigonHucBodyProvider r10 = r2.A02     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            if (r10 == 0) goto L_0x00fb
            r3.setDoOutput(r5)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            int r8 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r8 != 0) goto L_0x00ba
            r3.setChunkedStreamingMode(r11)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            goto L_0x00bd
        L_0x00ba:
            r3.setFixedLengthStreamingMode(r0)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
        L_0x00bd:
            java.util.concurrent.CountDownLatch r13 = new java.util.concurrent.CountDownLatch     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            r13.<init>(r5)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            r8 = -222769129(0xfffffffff2b8d017, float:-7.321191E30)
            X.0fY r8 = X.0fi.A01(r3, r8)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            java.io.BufferedOutputStream r12 = new java.io.BufferedOutputStream     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            r12.<init>(r8)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder r8 = r2.A03     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            com.facebook.tigon.tigonhuc.HucBodyStream r11 = new com.facebook.tigon.tigonhuc.HucBodyStream     // Catch:{ all -> 0x00f3 }
            r16 = r8
            r14 = r0
            r11.<init>(r12, r13, r14, r16)     // Catch:{ all -> 0x00f3 }
            r10.beginStream(r11)     // Catch:{ all -> 0x00f3 }
            r0 = 120(0x78, double:5.93E-322)
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00f3 }
            boolean r0 = r13.await(r0, r10)     // Catch:{ all -> 0x00f3 }
            if (r0 != 0) goto L_0x00f8
            com.facebook.tigon.iface.TigonErrorCode r0 = com.facebook.tigon.iface.TigonErrorCode.TRANSIENT_ERROR     // Catch:{ all -> 0x00f3 }
            int r3 = r0.value     // Catch:{ all -> 0x00f3 }
            r1 = 3
            java.lang.String r0 = "Timed out uploading request body"
            r8.onError(r3, r4, r1, r0)     // Catch:{ all -> 0x00f3 }
            r12.close()     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            return
        L_0x00f3:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x00f5:
            r1 = move-exception
            goto L_0x01c0
        L_0x00f8:
            r12.close()     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
        L_0x00fb:
            r0 = 405908572(0x1831ac5c, float:2.2963733E-24)
            X.0fi.A02(r3, r0)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            X.1Fy r8 = r9.certificatePinner     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            if (r8 == 0) goto L_0x0122
            boolean r0 = r3 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            if (r0 == 0) goto L_0x0122
            r0 = r3
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            if (r0 == 0) goto L_0x0122
            java.lang.String r7 = r7.getHost()     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            if (r7 == 0) goto L_0x01b9
            java.security.cert.Certificate[] r1 = r0.getServerCertificates()     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            X.0qQ.A07(r1)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            X.1Fx r8 = (X.AnonymousClass1Fx) r8     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            X.1Cf r0 = r8.A00     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            r0.AH3(r7, r1)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
        L_0x0122:
            int r8 = r3.getResponseCode()     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            r7 = -1
            if (r8 != r7) goto L_0x0135
            com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder r3 = r2.A03     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            com.facebook.tigon.iface.TigonErrorCode r0 = com.facebook.tigon.iface.TigonErrorCode.TRANSIENT_ERROR     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            int r1 = r0.value     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            java.lang.String r0 = "Could not retrieve response code from HttpUrlConnection"
            r3.onError(r1, r4, r5, r0)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            return
        L_0x0135:
            java.util.Map r0 = r3.getHeaderFields()     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            X.0qQ.A0A(r0)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            java.util.Iterator r5 = X.AnonymousClass7TF.A0u(r0)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
        L_0x0144:
            boolean r0 = r5.hasNext()     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            if (r0 == 0) goto L_0x0169
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r5)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            java.lang.String r1 = X.DbT.A13(r0)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            if (r1 == 0) goto L_0x0144
            X.0qQ.A0A(r0)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            java.lang.Object r0 = X.00k.A0J(r0)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            if (r0 == 0) goto L_0x0144
            X.AnonymousClass7TF.A1I(r1, r0, r9)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            goto L_0x0144
        L_0x0169:
            java.util.Map r0 = X.0Yt.A08(r9)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder r5 = r2.A03     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            r5.onResponse(r8, r0)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            java.lang.String r1 = r3.getRequestMethod()     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            X.0qQ.A07(r1)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            java.lang.String r0 = "HEAD"
            boolean r0 = r1.equals(r0)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            if (r0 != 0) goto L_0x01b5
            r0 = 100
            if (r0 > r8) goto L_0x0191
            r0 = 200(0xc8, float:2.8E-43)
            if (r8 < r0) goto L_0x01b5
            r0 = 204(0xcc, float:2.86E-43)
            if (r8 == r0) goto L_0x01b5
            r0 = 304(0x130, float:4.26E-43)
            if (r8 == r0) goto L_0x01b5
        L_0x0191:
            r0 = 665044123(0x27a3c49b, float:4.545475E-15)
            X.0fV r3 = X.0fi.A00(r3, r0)     // Catch:{ IOException -> 0x0199, InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, Exception -> 0x01c4 }
            goto L_0x019d
        L_0x0199:
            java.io.InputStream r3 = r3.getErrorStream()     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
        L_0x019d:
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r0]     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
        L_0x01a1:
            int r0 = r3.read(r1)     // Catch:{ all -> 0x01ab }
            if (r0 == r7) goto L_0x01b2
            r5.onBody(r1, r0)     // Catch:{ all -> 0x01ab }
            goto L_0x01a1
        L_0x01ab:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01ad }
        L_0x01ad:
            r1 = move-exception
            X.1zE.A00(r3, r0)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            goto L_0x01c3
        L_0x01b2:
            r3.close()     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
        L_0x01b5:
            r5.onEOM()     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            return
        L_0x01b9:
            java.lang.String r0 = "Host cannot be null"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
            goto L_0x01c3
        L_0x01c0:
            X.1zE.A00(r12, r0)     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
        L_0x01c3:
            throw r1     // Catch:{ InterruptedException -> 0x020a, MalformedURLException -> 0x01f7, ProtocolException -> 0x01d4, IOException -> 0x01e4, Exception -> 0x01c4 }
        L_0x01c4:
            r5 = move-exception
            com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder r3 = r2.A03
            com.facebook.tigon.iface.TigonErrorCode r0 = com.facebook.tigon.iface.TigonErrorCode.TRANSIENT_ERROR
            int r2 = r0.value
            r1 = 5
            java.lang.String r0 = r5.getMessage()
            if (r0 == 0) goto L_0x01f3
            r6 = r0
            goto L_0x01f3
        L_0x01d4:
            r1 = move-exception
            com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder r3 = r2.A03
            com.facebook.tigon.iface.TigonErrorCode r0 = com.facebook.tigon.iface.TigonErrorCode.FATAL_ERROR
            int r2 = r0.value
            java.lang.String r0 = r1.getMessage()
            if (r0 == 0) goto L_0x01e2
            r6 = r0
        L_0x01e2:
            r1 = 2
            goto L_0x01f3
        L_0x01e4:
            r1 = move-exception
            com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder r3 = r2.A03
            com.facebook.tigon.iface.TigonErrorCode r0 = com.facebook.tigon.iface.TigonErrorCode.TRANSIENT_ERROR
            int r2 = r0.value
            java.lang.String r0 = r1.getMessage()
            if (r0 == 0) goto L_0x01f2
            r6 = r0
        L_0x01f2:
            r1 = 1
        L_0x01f3:
            r3.onError(r2, r4, r1, r6)
            return
        L_0x01f7:
            r5 = move-exception
            r3 = 2
            com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder r2 = r2.A03
            com.facebook.tigon.iface.TigonErrorCode r0 = com.facebook.tigon.iface.TigonErrorCode.FATAL_ERROR
            int r1 = r0.value
            java.lang.String r0 = r5.getMessage()
            if (r0 == 0) goto L_0x0206
            r6 = r0
        L_0x0206:
            r2.onError(r1, r4, r3, r6)
            return
        L_0x020a:
            X.Pxe.A1F()
            com.facebook.tigon.tigonhuc.TigonHucCallbackForwarder r3 = r2.A03
            com.facebook.tigon.iface.TigonErrorCode r0 = com.facebook.tigon.iface.TigonErrorCode.CANCEL
            int r2 = r0.value
            r1 = 4
            java.lang.String r0 = "Request cancelled"
            r3.onError(r2, r4, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13054TJk.run():void");
    }
}
