package X;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.regex.Pattern;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.3xB  reason: invalid class name and case insensitive filesystem */
public final class C257303xB extends C257213x2 implements C257103wr {
    public static final Pattern A0C = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public long A00;
    public long A01;
    public InputStream A02;
    public HttpURLConnection A03;
    public int A04;
    public C257263x7 A05;
    public boolean A06;
    public final int A07;
    public final int A08;
    public final C257313xC A09;
    public final C257313xC A0A;
    public final String A0B;

    public C257303xB(C257313xC r2, String str, int i, int i2) {
        super(true);
        this.A0B = str;
        this.A07 = i;
        this.A08 = i2;
        this.A09 = r2;
        this.A0A = new C257313xC();
    }

    public final void changeHttpPriority(byte b, boolean z) {
    }

    public final void close() {
        try {
            InputStream inputStream = this.A02;
            if (inputStream != null) {
                inputStream.close();
            }
            this.A02 = null;
            A00();
            if (this.A06) {
                this.A06 = false;
                A01();
            }
        } catch (IOException e) {
            throw new C2609547r(this.A05, e, (int) CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, 3);
        } catch (Throwable th) {
            this.A02 = null;
            A00();
            if (this.A06) {
                this.A06 = false;
                A01();
            }
            throw th;
        }
    }

    private void A00() {
        HttpURLConnection httpURLConnection = this.A03;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                2AG.A05(Pxd.A00(143), "Unexpected error while disconnecting", e);
            }
            this.A03 = null;
        }
    }

    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.A03;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.47q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: X.47q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: X.47q} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long open(X.C257263x7 r30) {
        /*
            r29 = this;
            r8 = r29
            r7 = r30
            r8.A05 = r7
            r5 = 0
            r8.A00 = r5
            r8.A01 = r5
            r8.A02()
            X.3x6 r0 = r7.A07
            if (r0 == 0) goto L_0x0047
            java.util.Map r0 = r0.A0Q
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x001d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            r3.getClass()
            r1.getClass()
            X.3xC r2 = r8.A0A
            monitor-enter(r2)
            r0 = 0
            r2.A00 = r0     // Catch:{ all -> 0x0044 }
            java.util.Map r0 = r2.A01     // Catch:{ all -> 0x0044 }
            r0.put(r3, r1)     // Catch:{ all -> 0x0044 }
            monitor-exit(r2)
            goto L_0x001d
        L_0x0044:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x0047:
            r9 = 1
            android.net.Uri r0 = r7.A06     // Catch:{ IOException -> 0x03b1 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x03b1 }
            java.net.URL r10 = new java.net.URL     // Catch:{ IOException -> 0x03b1 }
            r10.<init>(r0)     // Catch:{ IOException -> 0x03b1 }
            int r13 = r7.A01     // Catch:{ IOException -> 0x03b1 }
            byte[] r12 = r7.A0A     // Catch:{ IOException -> 0x03b1 }
            long r2 = r7.A04     // Catch:{ IOException -> 0x03b1 }
            long r0 = r7.A03     // Catch:{ IOException -> 0x03b1 }
            int r4 = r7.A00     // Catch:{ IOException -> 0x03b1 }
            r4 = r4 & 1
            r17 = 0
            if (r4 != r9) goto L_0x0065
            r17 = 1
        L_0x0065:
            java.util.Map r4 = r7.A09     // Catch:{ IOException -> 0x03b1 }
            r16 = r4
            java.lang.String r4 = r10.getHost()     // Catch:{ IOException -> 0x03b1 }
            java.net.InetAddress r4 = java.net.InetAddress.getByName(r4)     // Catch:{ IOException -> 0x03b1 }
            boolean r4 = r4.isLoopbackAddress()     // Catch:{ IOException -> 0x03b1 }
            if (r4 == 0) goto L_0x0094
            java.net.Proxy r4 = java.net.Proxy.NO_PROXY     // Catch:{ IOException -> 0x03b1 }
            java.net.URLConnection r4 = r10.openConnection(r4)     // Catch:{ IOException -> 0x03b1 }
        L_0x007d:
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ IOException -> 0x03b1 }
            int r10 = r8.A07     // Catch:{ IOException -> 0x03b1 }
            r4.setConnectTimeout(r10)     // Catch:{ IOException -> 0x03b1 }
            int r10 = r8.A08     // Catch:{ IOException -> 0x03b1 }
            r4.setReadTimeout(r10)     // Catch:{ IOException -> 0x03b1 }
            java.util.HashMap r14 = new java.util.HashMap     // Catch:{ IOException -> 0x03b1 }
            r14.<init>()     // Catch:{ IOException -> 0x03b1 }
            X.3xC r11 = r8.A09     // Catch:{ IOException -> 0x03b1 }
            if (r11 == 0) goto L_0x00ae
            monitor-enter(r11)     // Catch:{ IOException -> 0x03b1 }
            goto L_0x0099
        L_0x0094:
            java.net.URLConnection r4 = r10.openConnection()     // Catch:{ IOException -> 0x03b1 }
            goto L_0x007d
        L_0x0099:
            java.util.Map r10 = r11.A00     // Catch:{ all -> 0x03ae }
            if (r10 != 0) goto L_0x00aa
            java.util.Map r15 = r11.A01     // Catch:{ all -> 0x03ae }
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ all -> 0x03ae }
            r10.<init>(r15)     // Catch:{ all -> 0x03ae }
            java.util.Map r10 = java.util.Collections.unmodifiableMap(r10)     // Catch:{ all -> 0x03ae }
            r11.A00 = r10     // Catch:{ all -> 0x03ae }
        L_0x00aa:
            monitor-exit(r11)     // Catch:{ IOException -> 0x03b1 }
            r14.putAll(r10)     // Catch:{ IOException -> 0x03b1 }
        L_0x00ae:
            X.3xC r11 = r8.A0A     // Catch:{ IOException -> 0x03b1 }
            monitor-enter(r11)     // Catch:{ IOException -> 0x03b1 }
            java.util.Map r10 = r11.A00     // Catch:{ all -> 0x03ae }
            if (r10 != 0) goto L_0x00c2
            java.util.Map r15 = r11.A01     // Catch:{ all -> 0x03ae }
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ all -> 0x03ae }
            r10.<init>(r15)     // Catch:{ all -> 0x03ae }
            java.util.Map r10 = java.util.Collections.unmodifiableMap(r10)     // Catch:{ all -> 0x03ae }
            r11.A00 = r10     // Catch:{ all -> 0x03ae }
        L_0x00c2:
            monitor-exit(r11)     // Catch:{ IOException -> 0x03b1 }
            r14.putAll(r10)     // Catch:{ IOException -> 0x03b1 }
            r10 = r16
            r14.putAll(r10)     // Catch:{ IOException -> 0x03b1 }
            java.util.Set r10 = r14.entrySet()     // Catch:{ IOException -> 0x03b1 }
            java.util.Iterator r14 = r10.iterator()     // Catch:{ IOException -> 0x03b1 }
        L_0x00d3:
            boolean r10 = r14.hasNext()     // Catch:{ IOException -> 0x03b1 }
            if (r10 == 0) goto L_0x00ef
            java.lang.Object r10 = r14.next()     // Catch:{ IOException -> 0x03b1 }
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10     // Catch:{ IOException -> 0x03b1 }
            java.lang.Object r11 = r10.getKey()     // Catch:{ IOException -> 0x03b1 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ IOException -> 0x03b1 }
            java.lang.Object r10 = r10.getValue()     // Catch:{ IOException -> 0x03b1 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ IOException -> 0x03b1 }
            r4.setRequestProperty(r11, r10)     // Catch:{ IOException -> 0x03b1 }
            goto L_0x00d3
        L_0x00ef:
            r22 = -1
            r20 = 0
            int r10 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x00fc
            int r10 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r10 != 0) goto L_0x00fc
            goto L_0x0125
        L_0x00fc:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x03b1 }
            r14.<init>()     // Catch:{ IOException -> 0x03b1 }
            java.lang.String r10 = "bytes="
            r14.append(r10)     // Catch:{ IOException -> 0x03b1 }
            r14.append(r2)     // Catch:{ IOException -> 0x03b1 }
            java.lang.String r10 = "-"
            r14.append(r10)     // Catch:{ IOException -> 0x03b1 }
            int r10 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r10 == 0) goto L_0x011a
            long r10 = r2 + r0
            r15 = 1
            long r10 = r10 - r15
            r14.append(r10)     // Catch:{ IOException -> 0x03b1 }
        L_0x011a:
            java.lang.String r11 = r14.toString()     // Catch:{ IOException -> 0x03b1 }
            if (r11 == 0) goto L_0x0125
            java.lang.String r10 = "Range"
            r4.setRequestProperty(r10, r11)     // Catch:{ IOException -> 0x03b1 }
        L_0x0125:
            java.lang.String r11 = r8.A0B     // Catch:{ IOException -> 0x03b1 }
            if (r11 == 0) goto L_0x012e
            java.lang.String r10 = "User-Agent"
            r4.setRequestProperty(r10, r11)     // Catch:{ IOException -> 0x03b1 }
        L_0x012e:
            if (r17 == 0) goto L_0x0131
            goto L_0x0134
        L_0x0131:
            java.lang.String r11 = "identity"
            goto L_0x0136
        L_0x0134:
            java.lang.String r11 = "gzip"
        L_0x0136:
            r10 = 2098(0x832, float:2.94E-42)
            java.lang.String r10 = X.AnonymousClass000.A00(r10)     // Catch:{ IOException -> 0x03b1 }
            r4.setRequestProperty(r10, r11)     // Catch:{ IOException -> 0x03b1 }
            r4.setInstanceFollowRedirects(r9)     // Catch:{ IOException -> 0x03b1 }
            r10 = 0
            if (r12 == 0) goto L_0x0146
            r10 = 1
        L_0x0146:
            r4.setDoOutput(r10)     // Catch:{ IOException -> 0x03b1 }
            if (r13 == r9) goto L_0x015c
            r10 = 2
            if (r13 == r10) goto L_0x0159
            r10 = 3
            if (r13 != r10) goto L_0x0152
            goto L_0x015f
        L_0x0152:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x03b1 }
            r0.<init>()     // Catch:{ IOException -> 0x03b1 }
            goto L_0x03b0
        L_0x0159:
            java.lang.String r10 = "POST"
            goto L_0x0161
        L_0x015c:
            java.lang.String r10 = "GET"
            goto L_0x0161
        L_0x015f:
            java.lang.String r10 = "HEAD"
        L_0x0161:
            r4.setRequestMethod(r10)     // Catch:{ IOException -> 0x03b1 }
            if (r12 == 0) goto L_0x017e
            int r10 = r12.length     // Catch:{ IOException -> 0x03b1 }
            r4.setFixedLengthStreamingMode(r10)     // Catch:{ IOException -> 0x03b1 }
            r10 = -1400611512(0xffffffffac845d48, float:-3.762022E-12)
            X.0fi.A02(r4, r10)     // Catch:{ IOException -> 0x03b1 }
            r10 = -847674779(0xffffffffcd798265, float:-2.6162952E8)
            X.0fY r10 = X.0fi.A01(r4, r10)     // Catch:{ IOException -> 0x03b1 }
            r10.write(r12)     // Catch:{ IOException -> 0x03b1 }
            r10.close()     // Catch:{ IOException -> 0x03b1 }
            goto L_0x0184
        L_0x017e:
            r10 = 1597792589(0x5f3c614d, float:1.3574215E19)
            X.0fi.A02(r4, r10)     // Catch:{ IOException -> 0x03b1 }
        L_0x0184:
            r8.A03 = r4     // Catch:{ IOException -> 0x03b1 }
            int r10 = r4.getResponseCode()     // Catch:{ IOException -> 0x03b1 }
            r8.A04 = r10     // Catch:{ IOException -> 0x03b1 }
            r4.getResponseMessage()     // Catch:{ IOException -> 0x03b1 }
            int r13 = r8.A04
            java.lang.String r12 = "Content-Range"
            r11 = 200(0xc8, float:2.8E-43)
            r27 = -1
            if (r13 < r11) goto L_0x0333
            r10 = 299(0x12b, float:4.19E-43)
            if (r13 > r10) goto L_0x0333
            r4.getContentType()
            int r10 = r8.A04
            if (r10 != r11) goto L_0x01a9
            int r10 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r10 == 0) goto L_0x01a9
            r5 = r2
        L_0x01a9:
            r2 = 2179(0x883, float:3.053E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.lang.String r3 = r4.getHeaderField(r2)
            java.lang.String r2 = "gzip"
            boolean r26 = r2.equalsIgnoreCase(r3)
            if (r26 != 0) goto L_0x02bf
            java.lang.String r3 = "Content-Length"
            java.lang.String r15 = r4.getHeaderField(r3)
            boolean r13 = android.text.TextUtils.isEmpty(r15)
            java.lang.String r11 = "]"
            r2 = 143(0x8f, float:2.0E-43)
            java.lang.String r10 = X.Pxd.A00(r2)
            if (r13 != 0) goto L_0x01e1
            long r24 = java.lang.Long.parseLong(r15)     // Catch:{ NumberFormatException -> 0x01d4 }
            goto L_0x01e3
        L_0x01d4:
            r2 = 178(0xb2, float:2.5E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            java.lang.String r2 = X.002.A0g(r2, r15, r11)
            X.2AG.A03(r10, r2)
        L_0x01e1:
            r24 = -1
        L_0x01e3:
            java.lang.String r13 = r4.getHeaderField(r12)
            boolean r2 = android.text.TextUtils.isEmpty(r13)
            if (r2 != 0) goto L_0x0235
            java.util.regex.Pattern r2 = A0C
            java.util.regex.Matcher r2 = r2.matcher(r13)
            boolean r14 = r2.find()
            if (r14 == 0) goto L_0x0235
            r14 = 2
            java.lang.String r14 = r2.group(r14)     // Catch:{ NumberFormatException -> 0x0228 }
            long r18 = java.lang.Long.parseLong(r14)     // Catch:{ NumberFormatException -> 0x0228 }
            java.lang.String r2 = r2.group(r9)     // Catch:{ NumberFormatException -> 0x0228 }
            long r16 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x0228 }
            long r18 = r18 - r16
            r16 = 1
            long r18 = r18 + r16
            int r2 = (r24 > r20 ? 1 : (r24 == r20 ? 0 : -1))
            if (r2 < 0) goto L_0x0235
            int r2 = (r24 > r18 ? 1 : (r24 == r18 ? 0 : -1))
            if (r2 == 0) goto L_0x0235
            r2 = 152(0x98, float:2.13E-43)
            java.lang.String r2 = X.Pxd.A00(r2)     // Catch:{ NumberFormatException -> 0x0228 }
            java.lang.String r14 = "] ["
            java.lang.String r2 = X.002.A11(r2, r15, r14, r13, r11)     // Catch:{ NumberFormatException -> 0x0228 }
            X.2AG.A04(r10, r2)     // Catch:{ NumberFormatException -> 0x0228 }
            goto L_0x0235
        L_0x0228:
            r2 = 179(0xb3, float:2.51E-43)
            java.lang.String r2 = X.Pxd.A00(r2)
            java.lang.String r2 = X.002.A0g(r2, r13, r11)
            X.2AG.A03(r10, r2)
        L_0x0235:
            int r2 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r2 != 0) goto L_0x02bf
            java.lang.String r15 = r4.getHeaderField(r3)
            java.lang.String r13 = r4.getHeaderField(r12)
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            java.lang.String r12 = "HttpUtil"
            if (r0 != 0) goto L_0x025b
            long r2 = java.lang.Long.parseLong(r15)     // Catch:{ NumberFormatException -> 0x024e }
            goto L_0x025d
        L_0x024e:
            r0 = 178(0xb2, float:2.5E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r0 = X.002.A0g(r0, r15, r11)
            X.2AG.A03(r12, r0)
        L_0x025b:
            r2 = -1
        L_0x025d:
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x02b7
            java.util.regex.Pattern r0 = X.C10078RmG.A01
            java.util.regex.Matcher r10 = r0.matcher(r13)
            boolean r0 = r10.matches()
            if (r0 == 0) goto L_0x02b7
            r0 = 2
            java.lang.String r0 = r10.group(r0)     // Catch:{ NumberFormatException -> 0x02a8 }
            r0.getClass()     // Catch:{ NumberFormatException -> 0x02a8 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x02a8 }
            java.lang.String r10 = r10.group(r9)     // Catch:{ NumberFormatException -> 0x02a8 }
            r10.getClass()     // Catch:{ NumberFormatException -> 0x02a8 }
            long r16 = java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x02a8 }
            long r0 = r0 - r16
            r16 = 1
            long r0 = r0 + r16
            int r10 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r10 < 0) goto L_0x02b6
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x02b7
            r10 = 152(0x98, float:2.13E-43)
            java.lang.String r10 = X.Pxd.A00(r10)     // Catch:{ NumberFormatException -> 0x02a8 }
            java.lang.String r14 = "] ["
            java.lang.String r10 = X.002.A11(r10, r15, r14, r13, r11)     // Catch:{ NumberFormatException -> 0x02a8 }
            X.2AG.A04(r12, r10)     // Catch:{ NumberFormatException -> 0x02a8 }
            long r0 = java.lang.Math.max(r2, r0)     // Catch:{ NumberFormatException -> 0x02a8 }
            goto L_0x02b6
        L_0x02a8:
            r0 = 179(0xb3, float:2.51E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r0 = X.002.A0g(r0, r13, r11)
            X.2AG.A03(r12, r0)
            goto L_0x02b7
        L_0x02b6:
            r2 = r0
        L_0x02b7:
            int r0 = (r2 > r22 ? 1 : (r2 == r22 ? 0 : -1))
            if (r0 == 0) goto L_0x02bd
            long r27 = r2 - r5
        L_0x02bd:
            r0 = r27
        L_0x02bf:
            r8.A01 = r0
            r0 = 1492737511(0x58f95de7, float:2.19345362E15)
            r3 = 2000(0x7d0, float:2.803E-42)
            X.0fV r1 = X.0fi.A00(r4, r0)     // Catch:{ IOException -> 0x0329 }
            r8.A02 = r1     // Catch:{ IOException -> 0x0329 }
            if (r26 == 0) goto L_0x02d5
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0329 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0329 }
            r8.A02 = r0     // Catch:{ IOException -> 0x0329 }
        L_0x02d5:
            r8.A06 = r9
            r8.A04(r7)
            int r0 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x0326
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r0]     // Catch:{ IOException -> 0x0318 }
        L_0x02e2:
            int r0 = (r5 > r20 ? 1 : (r5 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x0326
            r0 = 4096(0x1000, double:2.0237E-320)
            long r0 = java.lang.Math.min(r5, r0)     // Catch:{ IOException -> 0x0318 }
            int r4 = (int) r0     // Catch:{ IOException -> 0x0318 }
            java.io.InputStream r1 = r8.A02     // Catch:{ IOException -> 0x0318 }
            r0 = 0
            int r4 = r1.read(r2, r0, r4)     // Catch:{ IOException -> 0x0318 }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ IOException -> 0x0318 }
            boolean r0 = r0.isInterrupted()     // Catch:{ IOException -> 0x0318 }
            if (r0 != 0) goto L_0x0307
            r0 = -1
            if (r4 == r0) goto L_0x0312
            long r0 = (long) r4     // Catch:{ IOException -> 0x0318 }
            long r5 = r5 - r0
            r8.A03(r4)     // Catch:{ IOException -> 0x0318 }
            goto L_0x02e2
        L_0x0307:
            java.io.InterruptedIOException r1 = new java.io.InterruptedIOException     // Catch:{ IOException -> 0x0318 }
            r1.<init>()     // Catch:{ IOException -> 0x0318 }
            X.47r r0 = new X.47r     // Catch:{ IOException -> 0x0318 }
            r0.<init>((X.C257263x7) r7, (java.io.IOException) r1, (int) r3, (int) r9)     // Catch:{ IOException -> 0x0318 }
            goto L_0x0317
        L_0x0312:
            X.47r r0 = new X.47r     // Catch:{ IOException -> 0x0318 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0318 }
        L_0x0317:
            throw r0     // Catch:{ IOException -> 0x0318 }
        L_0x0318:
            r2 = move-exception
            r8.A00()
            boolean r0 = r2 instanceof X.C2609547r
            if (r0 != 0) goto L_0x03ab
            X.47r r1 = new X.47r
            r1.<init>((X.C257263x7) r7, (java.io.IOException) r2, (int) r3, (int) r9)
            throw r1
        L_0x0326:
            long r5 = r8.A01
            return r5
        L_0x0329:
            r0 = move-exception
            r8.A00()
            X.47r r1 = new X.47r
            r1.<init>((X.C257263x7) r7, (java.io.IOException) r0, (int) r3, (int) r9)
            throw r1
        L_0x0333:
            java.util.Map r15 = r4.getHeaderFields()
            int r11 = r8.A04
            r10 = 416(0x1a0, float:5.83E-43)
            if (r11 != r10) goto L_0x036f
            java.lang.String r12 = r4.getHeaderField(r12)
            boolean r11 = android.text.TextUtils.isEmpty(r12)
            r13 = -1
            if (r11 != 0) goto L_0x0360
            java.util.regex.Pattern r11 = X.C10078RmG.A00
            java.util.regex.Matcher r12 = r11.matcher(r12)
            boolean r11 = r12.matches()
            if (r11 == 0) goto L_0x0360
            java.lang.String r11 = r12.group(r9)
            r11.getClass()
            long r13 = java.lang.Long.parseLong(r11)
        L_0x0360:
            int r11 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x036f
            r8.A06 = r9
            r8.A04(r7)
            int r2 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r2 == 0) goto L_0x036e
            return r0
        L_0x036e:
            return r5
        L_0x036f:
            java.io.InputStream r4 = r4.getErrorStream()
            if (r4 == 0) goto L_0x038f
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r0]     // Catch:{ IOException -> 0x0392 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0392 }
            r2.<init>()     // Catch:{ IOException -> 0x0392 }
        L_0x037e:
            int r1 = r4.read(r3)     // Catch:{ IOException -> 0x0392 }
            r0 = -1
            if (r1 == r0) goto L_0x038a
            r0 = 0
            r2.write(r3, r0, r1)     // Catch:{ IOException -> 0x0392 }
            goto L_0x037e
        L_0x038a:
            byte[] r16 = r2.toByteArray()     // Catch:{ IOException -> 0x0392 }
            goto L_0x0394
        L_0x038f:
            byte[] r16 = com.google.android.exoplayer2.util.Util.A06     // Catch:{ IOException -> 0x0392 }
            goto L_0x0394
        L_0x0392:
            byte[] r16 = com.google.android.exoplayer2.util.Util.A06
        L_0x0394:
            r8.A00()
            int r0 = r8.A04
            if (r0 != r10) goto L_0x03ac
            X.47s r14 = new X.47s
            r14.<init>()
        L_0x03a0:
            int r0 = r8.A04
            X.47q r2 = new X.47q
            r12 = r2
            r13 = r7
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17)
        L_0x03ab:
            throw r2
        L_0x03ac:
            r14 = 0
            goto L_0x03a0
        L_0x03ae:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ IOException -> 0x03b1 }
        L_0x03b0:
            throw r0     // Catch:{ IOException -> 0x03b1 }
        L_0x03b1:
            r0 = move-exception
            r8.A00()
            X.47r r1 = X.C2609547r.A00(r7, r0, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C257303xB.open(X.3x7):long");
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.A01;
            if (j != -1) {
                long j2 = j - this.A00;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min((long) i2, j2);
            }
            int read = this.A02.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.A00 += (long) read;
            A03(read);
            return read;
        } catch (IOException e) {
            throw C2609547r.A00(this.A05, e, 2);
        }
    }

    @Deprecated
    public C257303xB(String str, int i, int i2) {
        this((C257313xC) null, str, i, i2);
    }

    @Deprecated
    public C257303xB() {
        this((String) null, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD);
    }
}
