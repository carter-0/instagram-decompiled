package X;

import java.util.concurrent.Callable;

public final class TN3 implements Callable {
    public final /* synthetic */ C10672Rw7 A00;

    public TN3(C10672Rw7 rw7) {
        this.A00 = rw7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01a0, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01a1, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0249, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0268, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0269, code lost:
        X.0KC.A0F("InstagramSonarProber", "Error in probe session", r2);
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0077, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008b, code lost:
        if (r9 != false) goto L_0x008d;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01be A[Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01e8 A[Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0239 A[Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0249 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:90:0x0156] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0268 A[ExcHandler: IOException | RuntimeException | JSONException (r2v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:8:0x0022] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x014b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r18 = this;
            r0 = r18
            X.Rw7 r4 = r0.A00
            X.1C1 r5 = r4.A01     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            java.lang.String r0 = r5.A02     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            java.net.URL r3 = new java.net.URL     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            r3.<init>(r0)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            r9 = 0
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ SocketException -> 0x009a, IOException | RuntimeException | JSONException -> 0x0268, IOException | RuntimeException | JSONException -> 0x0268 }
            if (r0 != 0) goto L_0x0018
            java.lang.Integer r6 = X.AnonymousClass05K.A0N     // Catch:{ SocketException -> 0x009a, IOException | RuntimeException | JSONException -> 0x0268, IOException | RuntimeException | JSONException -> 0x0268 }
            goto L_0x009f
        L_0x0018:
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch:{ SocketException -> 0x009a, IOException | RuntimeException | JSONException -> 0x0268, IOException | RuntimeException | JSONException -> 0x0268 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ SocketException -> 0x009a, IOException | RuntimeException | JSONException -> 0x0268, IOException | RuntimeException | JSONException -> 0x0268 }
            r7 = 0
            r6 = 0
        L_0x0022:
            boolean r0 = r8.hasNext()     // Catch:{ SocketException -> 0x005a, IOException | RuntimeException | JSONException -> 0x0268, IOException | RuntimeException | JSONException -> 0x0268 }
            if (r0 == 0) goto L_0x005a
            java.lang.Object r1 = r8.next()     // Catch:{ SocketException -> 0x005a, IOException | RuntimeException | JSONException -> 0x0268, IOException | RuntimeException | JSONException -> 0x0268 }
            java.net.NetworkInterface r1 = (java.net.NetworkInterface) r1     // Catch:{ SocketException -> 0x005a, IOException | RuntimeException | JSONException -> 0x0268, IOException | RuntimeException | JSONException -> 0x0268 }
            boolean r0 = r1.isUp()     // Catch:{ SocketException -> 0x005a, IOException | RuntimeException | JSONException -> 0x0268, IOException | RuntimeException | JSONException -> 0x0268 }
            if (r0 == 0) goto L_0x0022
            java.util.Enumeration r0 = r1.getInetAddresses()     // Catch:{ SocketException -> 0x005a, IOException | RuntimeException | JSONException -> 0x0268, IOException | RuntimeException | JSONException -> 0x0268 }
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch:{ SocketException -> 0x005a, IOException | RuntimeException | JSONException -> 0x0268, IOException | RuntimeException | JSONException -> 0x0268 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ SocketException -> 0x005a, IOException | RuntimeException | JSONException -> 0x0268, IOException | RuntimeException | JSONException -> 0x0268 }
        L_0x0040:
            boolean r0 = r2.hasNext()     // Catch:{ SocketException -> 0x005a, IOException | RuntimeException | JSONException -> 0x0268, IOException | RuntimeException | JSONException -> 0x0268 }
            if (r0 == 0) goto L_0x0022
            java.lang.Object r1 = r2.next()     // Catch:{ SocketException -> 0x005a, IOException | RuntimeException | JSONException -> 0x0268, IOException | RuntimeException | JSONException -> 0x0268 }
            java.net.InetAddress r1 = (java.net.InetAddress) r1     // Catch:{ SocketException -> 0x005a, IOException | RuntimeException | JSONException -> 0x0268, IOException | RuntimeException | JSONException -> 0x0268 }
            boolean r0 = r1.isLinkLocalAddress()     // Catch:{ SocketException -> 0x005a, IOException | RuntimeException | JSONException -> 0x0268, IOException | RuntimeException | JSONException -> 0x0268 }
            if (r0 != 0) goto L_0x0040
            boolean r0 = r1 instanceof java.net.Inet6Address     // Catch:{ SocketException -> 0x005a, IOException | RuntimeException | JSONException -> 0x0268, IOException | RuntimeException | JSONException -> 0x0268 }
            if (r0 == 0) goto L_0x0058
            r6 = 1
            goto L_0x0040
        L_0x0058:
            r7 = 1
            goto L_0x0040
        L_0x005a:
            if (r7 != 0) goto L_0x005f
            if (r6 != 0) goto L_0x005f
            goto L_0x009a
        L_0x005f:
            boolean r0 = r5.A04     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            if (r0 == 0) goto L_0x008a
            java.lang.String r2 = ""
            if (r7 == 0) goto L_0x0078
            java.lang.String r1 = r5.A00     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            boolean r0 = r1.equals(r2)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            if (r0 != 0) goto L_0x0078
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r1)     // Catch:{ UnknownHostException -> 0x0077, IOException | RuntimeException | JSONException -> 0x0268, IOException | RuntimeException | JSONException -> 0x0268 }
            r0.getHostAddress()     // Catch:{ UnknownHostException -> 0x0077, IOException | RuntimeException | JSONException -> 0x0268, IOException | RuntimeException | JSONException -> 0x0268 }
            goto L_0x0078
        L_0x0077:
            r7 = 0
        L_0x0078:
            if (r6 == 0) goto L_0x0092
            java.lang.String r1 = r5.A01     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            boolean r0 = r1.equals(r2)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            if (r0 != 0) goto L_0x008d
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r1)     // Catch:{ UnknownHostException -> 0x008b, IOException | RuntimeException | JSONException -> 0x0268, IOException | RuntimeException | JSONException -> 0x0268 }
            r0.getHostAddress()     // Catch:{ UnknownHostException -> 0x008b, IOException | RuntimeException | JSONException -> 0x0268, IOException | RuntimeException | JSONException -> 0x0268 }
            goto L_0x008d
        L_0x008a:
            r9 = r6
        L_0x008b:
            if (r9 == 0) goto L_0x0092
        L_0x008d:
            if (r7 == 0) goto L_0x009d
            java.lang.Integer r6 = X.AnonymousClass05K.A00     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            goto L_0x009f
        L_0x0092:
            if (r7 == 0) goto L_0x0097
            java.lang.Integer r6 = X.AnonymousClass05K.A01     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            goto L_0x009f
        L_0x0097:
            java.lang.Integer r6 = X.AnonymousClass05K.A0Y     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            goto L_0x009f
        L_0x009a:
            java.lang.Integer r6 = X.AnonymousClass05K.A0N     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            goto L_0x009f
        L_0x009d:
            java.lang.Integer r6 = X.AnonymousClass05K.A0C     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
        L_0x009f:
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            r0 = 1
            r3.setDoOutput(r0)     // Catch:{ all -> 0x025c }
            r0 = 0
            r3.setChunkedStreamingMode(r0)     // Catch:{ all -> 0x025c }
            r0 = -1318610755(0xffffffffb16798bd, float:-3.3701746E-9)
            X.0fi.A01(r3, r0)     // Catch:{ all -> 0x025c }
            android.net.Uri$Builder r1 = X.Pxe.A0I()     // Catch:{ all -> 0x025c }
            java.lang.String r0 = r5.A03     // Catch:{ all -> 0x025c }
            android.net.Uri$Builder r2 = r1.encodedQuery(r0)     // Catch:{ all -> 0x025c }
            java.lang.String r1 = "network_interface"
            int r0 = r6.intValue()     // Catch:{ all -> 0x025c }
            switch(r0) {
                case 0: goto L_0x00e4;
                case 1: goto L_0x00da;
                case 2: goto L_0x00dd;
                case 3: goto L_0x00e0;
                default: goto L_0x00c7;
            }     // Catch:{ all -> 0x025c }
        L_0x00c7:
            java.lang.String r0 = "dns_failed"
        L_0x00c9:
            android.net.Uri r1 = X.DbV.A08(r2, r1, r0)     // Catch:{ all -> 0x025c }
            r0 = 2056740567(0x7a975ed7, float:3.929802E35)
            X.0fY r0 = X.0fi.A01(r3, r0)     // Catch:{ all -> 0x025c }
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ all -> 0x025c }
            r2.<init>(r0)     // Catch:{ all -> 0x025c }
            goto L_0x00e7
        L_0x00da:
            java.lang.String r0 = "ipv4"
            goto L_0x00c9
        L_0x00dd:
            java.lang.String r0 = "ipv6"
            goto L_0x00c9
        L_0x00e0:
            java.lang.String r0 = "unknown"
            goto L_0x00c9
        L_0x00e4:
            java.lang.String r0 = "dual"
            goto L_0x00c9
        L_0x00e7:
            java.lang.String r0 = r1.getQuery()     // Catch:{ all -> 0x0252 }
            r2.print(r0)     // Catch:{ all -> 0x0252 }
            r2.close()     // Catch:{ all -> 0x025c }
            r0 = -1880779888(0xffffffff8fe59390, float:-2.2637982E-29)
            X.0fV r0 = X.0fi.A00(r3, r0)     // Catch:{ all -> 0x025c }
            java.io.BufferedReader r2 = X.Pxg.A0X(r0)     // Catch:{ all -> 0x025c }
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x024d }
        L_0x0100:
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x024d }
            if (r0 == 0) goto L_0x010a
            r1.append(r0)     // Catch:{ all -> 0x024d }
            goto L_0x0100
        L_0x010a:
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x024d }
            r2.close()     // Catch:{ all -> 0x025c }
            r3.disconnect()     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            org.json.JSONObject r6 = X.C66580MXl.A17(r0)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            java.util.LinkedHashSet r5 = X.DbS.A0y()     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            java.lang.String r0 = "uris_to_probe"
            org.json.JSONArray r2 = r6.getJSONArray(r0)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            r1 = 0
        L_0x0124:
            int r0 = r2.length()     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            if (r1 >= r0) goto L_0x0134
            java.lang.String r0 = r2.getString(r1)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            r5.add(r0)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            int r1 = r1 + 1
            goto L_0x0124
        L_0x0134:
            boolean r0 = r5.isEmpty()     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            if (r0 != 0) goto L_0x0261
            java.lang.String r3 = "spsid"
            boolean r0 = r6.has(r3)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            if (r0 == 0) goto L_0x023e
            java.lang.String r2 = r6.getString(r3)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
        L_0x0147:
            java.util.Iterator r10 = r5.iterator()     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
        L_0x014b:
            boolean r0 = r10.hasNext()     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            if (r0 == 0) goto L_0x024b
            java.lang.String r15 = X.AnonymousClass7TE.A18(r10)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            r9 = 0
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r15)     // Catch:{ IOException -> 0x01a0, all -> 0x0249 }
            java.lang.String r8 = r0.getHostAddress()     // Catch:{ IOException -> 0x01a0, all -> 0x0249 }
            java.lang.String r1 = ""
            if (r2 == 0) goto L_0x016e
            boolean r0 = r2.isEmpty()     // Catch:{ IOException -> 0x019e, all -> 0x0249 }
            if (r0 != 0) goto L_0x016e
            java.lang.String r0 = "/?_nc_spsid="
            java.lang.String r1 = X.002.A0R(r0, r2)     // Catch:{ IOException -> 0x019e, all -> 0x0249 }
        L_0x016e:
            java.lang.String r0 = "https://"
            java.lang.String r1 = X.002.A0g(r0, r15, r1)     // Catch:{ IOException -> 0x019e, all -> 0x0249 }
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x019e, all -> 0x0249 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x019e, all -> 0x0249 }
            java.net.URLConnection r5 = r0.openConnection()     // Catch:{ IOException -> 0x019e, all -> 0x0249 }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ IOException -> 0x019e, all -> 0x0249 }
            java.lang.String r1 = "FB-Sonar-Prober-Type"
            java.lang.String r0 = "rtt"
            r5.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x0199, all -> 0x0242 }
            r0 = -1070782994(0xffffffffc02d25ee, float:-2.70544)
            X.0fi.A02(r5, r0)     // Catch:{ IOException -> 0x0199, all -> 0x0242 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0199, all -> 0x0242 }
            r5.getResponseCode()     // Catch:{ IOException -> 0x0199, all -> 0x0242 }
            long r0 = X.Pxe.A0C(r0)     // Catch:{ IOException -> 0x0199, all -> 0x0242 }
            goto L_0x01b1
        L_0x0199:
            r7 = move-exception
            r9 = r7
            if (r5 == 0) goto L_0x01a7
            goto L_0x01a4
        L_0x019e:
            r7 = move-exception
            goto L_0x01a2
        L_0x01a0:
            r7 = move-exception
            r8 = r9
        L_0x01a2:
            r9 = r7
            goto L_0x01a7
        L_0x01a4:
            r5.disconnect()     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
        L_0x01a7:
            r0 = -1
            java.lang.String r6 = "InstagramSonarProber"
            java.lang.String r5 = "Error in probe session"
            X.0KC.A0F(r6, r5, r7)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            goto L_0x01b4
        L_0x01b1:
            r5.disconnect()     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
        L_0x01b4:
            java.lang.String r6 = ":"
            r5 = 443(0x1bb, float:6.21E-43)
            java.lang.String r14 = X.002.A0b(r8, r6, r5)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            if (r9 == 0) goto L_0x0239
            r17 = 1
            java.lang.String r16 = r9.toString()     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
        L_0x01c4:
            int r5 = (int) r0     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            long r12 = (long) r5     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            X.Rxv r11 = new X.Rxv     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            r11.<init>(r12, r14, r15, r16, r17)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            int r6 = r4.A00     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            r0 = 3
            X.0qQ.A0B(r2, r0)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            X.0wX r1 = X.C61170le.A00     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            X.0kM r0 = new X.0kM     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            r0.<init>(r1)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            X.0wc r1 = r0.A00()     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            java.lang.String r0 = "async_tcp_probe_latency"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r1, r0)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            boolean r0 = r5.isSampled()     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            if (r0 == 0) goto L_0x014b
            java.lang.Long r1 = X.DbS.A0j(r6)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            java.lang.String r0 = "sample_rate"
            r5.A9F(r0, r1)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            java.lang.String r1 = r11.A04     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            java.lang.String r0 = "hostname"
            r5.AAJ(r0, r1)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            boolean r0 = r11.A05     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            java.lang.String r0 = "is_err"
            r5.A7p(r0, r1)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            r5.AAJ(r3, r2)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            long r0 = r11.A00     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            r0 = 273(0x111, float:3.83E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            r5.A9F(r0, r1)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            java.lang.String r1 = r11.A03     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            java.lang.String r0 = "host_ip_address"
            r5.AAJ(r0, r1)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            java.lang.String r1 = r11.A02     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            if (r1 != 0) goto L_0x0223
            java.lang.String r1 = ""
        L_0x0223:
            java.lang.String r0 = "err_msg"
            r5.AAJ(r0, r1)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            long r0 = r11.A01     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            java.lang.String r0 = "ttfb"
            r5.A9F(r0, r1)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            r5.Cgf()     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            goto L_0x014b
        L_0x0239:
            r17 = 0
            r16 = 0
            goto L_0x01c4
        L_0x023e:
            java.lang.String r2 = ""
            goto L_0x0147
        L_0x0242:
            r0 = move-exception
            if (r5 == 0) goto L_0x0267
            r5.disconnect()     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            goto L_0x0267
        L_0x0249:
            r0 = move-exception
            goto L_0x0267
        L_0x024b:
            r0 = 1
            goto L_0x0271
        L_0x024d:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0257 }
            goto L_0x025b
        L_0x0252:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0257 }
            goto L_0x025b
        L_0x0257:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ all -> 0x025c }
        L_0x025b:
            throw r1     // Catch:{ all -> 0x025c }
        L_0x025c:
            r0 = move-exception
            r3.disconnect()     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
            goto L_0x0267
        L_0x0261:
            java.lang.String r0 = "IP used for probing did not produce any hostnames to probe."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
        L_0x0267:
            throw r0     // Catch:{ IOException | RuntimeException | JSONException -> 0x0268 }
        L_0x0268:
            r2 = move-exception
            java.lang.String r1 = "InstagramSonarProber"
            java.lang.String r0 = "Error in probe session"
            X.0KC.A0F(r1, r0, r2)
            r0 = 0
        L_0x0271:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TN3.call():java.lang.Object");
    }
}
