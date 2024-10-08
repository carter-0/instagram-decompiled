package X;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.QDl  reason: case insensitive filesystem */
public final class C7446QDl extends C22071Xux implements C13909Tl9 {
    public long A00;
    public long A01;
    public InputStream A02;
    public int A03;
    public SH8 A04;
    public HttpURLConnection A05;
    public boolean A06;
    public final C10341Rqe A07;
    public final C10341Rqe A08 = new C10341Rqe();

    public C7446QDl(C10341Rqe rqe) {
        super(true);
        this.A07 = rqe;
    }

    private HttpURLConnection A00(URL url, Map map, long j) {
        Map map2;
        Map map3;
        String A0e;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD);
        httpURLConnection.setReadTimeout(CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD);
        HashMap A1E = AnonymousClass7TE.A1E();
        C10341Rqe rqe = this.A07;
        synchronized (rqe) {
            map2 = rqe.A00;
            if (map2 == null) {
                map2 = Collections.unmodifiableMap(Pxe.A19(rqe.A01));
                rqe.A00 = map2;
            }
        }
        A1E.putAll(map2);
        C10341Rqe rqe2 = this.A08;
        synchronized (rqe2) {
            map3 = rqe2.A00;
            if (map3 == null) {
                map3 = Collections.unmodifiableMap(Pxe.A19(rqe2.A01));
                rqe2.A00 = map3;
            }
        }
        A1E.putAll(map3);
        A1E.putAll(map);
        Iterator A0s = AnonymousClass7TF.A0s(A1E);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            httpURLConnection.setRequestProperty(DbT.A13(A1J), DbS.A0s(A1J));
        }
        if (j == 0) {
            A0e = null;
        } else {
            A0e = 002.A0e("bytes=", "-", j);
        }
        if (A0e != null) {
            httpURLConnection.setRequestProperty("Range", A0e);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setDoOutput(false);
        SH8 sh8 = SH8.$redex_init_class;
        httpURLConnection.setRequestMethod("GET");
        0fi.A02(httpURLConnection, 419728071);
        return httpURLConnection;
    }

    public final void close() {
        try {
            InputStream inputStream = this.A02;
            if (inputStream != null) {
                inputStream.close();
            }
            this.A02 = null;
            A01();
            if (this.A06) {
                this.A06 = false;
                A02();
            }
        } catch (IOException e) {
            throw new C7454QDt(this.A04, e, (int) CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, 3);
        } catch (Throwable th) {
            this.A02 = null;
            A01();
            if (this.A06) {
                this.A06 = false;
                A02();
            }
            throw th;
        }
    }

    private void A01() {
        HttpURLConnection httpURLConnection = this.A05;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                STH.A04("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.A05 = null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.QDs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.io.IOException} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: X.QDs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: X.QDs} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long E0f(X.SH8 r23) {
        /*
            r22 = this;
            r8 = r22
            r7 = r23
            r8.A04 = r7
            r4 = 0
            r8.A00 = r4
            r8.A01 = r4
            r8.A03()
            r9 = 1
            android.net.Uri r0 = r7.A01     // Catch:{ IOException -> 0x01a6 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x01a6 }
            java.net.URL r3 = new java.net.URL     // Catch:{ IOException -> 0x01a6 }
            r3.<init>(r0)     // Catch:{ IOException -> 0x01a6 }
            long r0 = r7.A00     // Catch:{ IOException -> 0x01a6 }
            r20 = -1
            java.util.Map r2 = r7.A02     // Catch:{ IOException -> 0x01a6 }
            java.net.HttpURLConnection r6 = r8.A00(r3, r2, r0)     // Catch:{ IOException -> 0x01a6 }
            r8.A05 = r6     // Catch:{ IOException -> 0x01a6 }
            int r2 = r6.getResponseCode()     // Catch:{ IOException -> 0x01a6 }
            r8.A03 = r2     // Catch:{ IOException -> 0x01a6 }
            r6.getResponseMessage()     // Catch:{ IOException -> 0x01a6 }
            int r11 = r8.A03
            java.lang.String r2 = "Content-Range"
            r10 = 200(0xc8, float:2.8E-43)
            r18 = -1
            if (r11 < r10) goto L_0x0145
            r3 = 299(0x12b, float:4.19E-43)
            if (r11 > r3) goto L_0x0145
            r6.getContentType()
            int r3 = r8.A03
            if (r3 != r10) goto L_0x004a
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x004a
            r4 = r0
        L_0x004a:
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r1 = r6.getHeaderField(r0)
            java.lang.String r0 = "gzip"
            boolean r17 = r0.equalsIgnoreCase(r1)
            if (r17 != 0) goto L_0x00bb
            java.lang.String r0 = "Content-Length"
            java.lang.String r16 = r6.getHeaderField(r0)
            java.lang.String r15 = r6.getHeaderField(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r16)
            java.lang.String r14 = "]"
            java.lang.String r13 = "HttpUtil"
            if (r0 != 0) goto L_0x007c
            long r2 = java.lang.Long.parseLong(r16)     // Catch:{ NumberFormatException -> 0x0071 }
            goto L_0x007e
        L_0x0071:
            java.lang.String r1 = "Unexpected Content-Length ["
            r0 = r16
            java.lang.String r0 = X.002.A0g(r1, r0, r14)
            X.STH.A02(r13, r0)
        L_0x007c:
            r2 = -1
        L_0x007e:
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x00c7
            java.util.regex.Pattern r0 = X.C10050Rln.A01
            java.util.regex.Matcher r10 = r0.matcher(r15)
            boolean r0 = r10.matches()
            if (r0 == 0) goto L_0x00c7
            r0 = 2
            long r0 = X.Pxi.A0A(r10, r0)     // Catch:{ NumberFormatException -> 0x00be }
            long r10 = X.Pxi.A0A(r10, r9)     // Catch:{ NumberFormatException -> 0x00be }
            long r0 = r0 - r10
            r10 = 1
            long r0 = r0 + r10
            r11 = 0
            int r10 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r10 < 0) goto L_0x00b9
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x00c7
            java.lang.String r11 = "Inconsistent headers ["
            java.lang.String r10 = "] ["
            r12 = r11
            r11 = r16
            java.lang.String r10 = X.002.A11(r12, r11, r10, r15, r14)     // Catch:{ NumberFormatException -> 0x00be }
            X.STH.A03(r13, r10)     // Catch:{ NumberFormatException -> 0x00be }
            long r0 = java.lang.Math.max(r2, r0)     // Catch:{ NumberFormatException -> 0x00be }
        L_0x00b9:
            r2 = r0
            goto L_0x00c7
        L_0x00bb:
            r0 = r20
            goto L_0x00cf
        L_0x00be:
            java.lang.String r0 = "Unexpected Content-Range ["
            java.lang.String r0 = X.002.A0g(r0, r15, r14)
            X.STH.A02(r13, r0)
        L_0x00c7:
            int r0 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x00cd
            long r18 = r2 - r4
        L_0x00cd:
            r0 = r18
        L_0x00cf:
            r8.A01 = r0
            r0 = -1271092724(0xffffffffb43caa0c, float:-1.7570727E-7)
            r2 = 2000(0x7d0, float:2.803E-42)
            X.0fV r1 = X.0fi.A00(r6, r0)     // Catch:{ IOException -> 0x013b }
            r8.A02 = r1     // Catch:{ IOException -> 0x013b }
            if (r17 == 0) goto L_0x00e5
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x013b }
            r0.<init>(r1)     // Catch:{ IOException -> 0x013b }
            r8.A02 = r0     // Catch:{ IOException -> 0x013b }
        L_0x00e5:
            r8.A06 = r9
            r8.A05(r7)
            r10 = 0
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0138
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r0]     // Catch:{ IOException -> 0x012a }
        L_0x00f4:
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0138
            r0 = 4096(0x1000, double:2.0237E-320)
            long r0 = java.lang.Math.min(r4, r0)     // Catch:{ IOException -> 0x012a }
            int r6 = (int) r0     // Catch:{ IOException -> 0x012a }
            java.io.InputStream r1 = r8.A02     // Catch:{ IOException -> 0x012a }
            r0 = 0
            int r6 = r1.read(r3, r0, r6)     // Catch:{ IOException -> 0x012a }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ IOException -> 0x012a }
            boolean r0 = r0.isInterrupted()     // Catch:{ IOException -> 0x012a }
            if (r0 != 0) goto L_0x0119
            r0 = -1
            if (r6 == r0) goto L_0x0124
            long r0 = (long) r6     // Catch:{ IOException -> 0x012a }
            long r4 = r4 - r0
            r8.A04(r6)     // Catch:{ IOException -> 0x012a }
            goto L_0x00f4
        L_0x0119:
            java.io.InterruptedIOException r1 = new java.io.InterruptedIOException     // Catch:{ IOException -> 0x012a }
            r1.<init>()     // Catch:{ IOException -> 0x012a }
            X.QDt r0 = new X.QDt     // Catch:{ IOException -> 0x012a }
            r0.<init>((X.SH8) r7, (java.io.IOException) r1, (int) r2, (int) r9)     // Catch:{ IOException -> 0x012a }
            goto L_0x0129
        L_0x0124:
            X.QDt r0 = new X.QDt     // Catch:{ IOException -> 0x012a }
            r0.<init>(r7)     // Catch:{ IOException -> 0x012a }
        L_0x0129:
            throw r0     // Catch:{ IOException -> 0x012a }
        L_0x012a:
            r1 = move-exception
            r8.A01()
            boolean r0 = r1 instanceof X.C7454QDt
            if (r0 != 0) goto L_0x01a3
            X.QDt r0 = new X.QDt
            r0.<init>((X.SH8) r7, (java.io.IOException) r1, (int) r2, (int) r9)
            throw r0
        L_0x0138:
            long r4 = r8.A01
            return r4
        L_0x013b:
            r1 = move-exception
            r8.A01()
            X.QDt r0 = new X.QDt
            r0.<init>((X.SH8) r7, (java.io.IOException) r1, (int) r2, (int) r9)
            throw r0
        L_0x0145:
            java.util.Map r13 = r6.getHeaderFields()
            int r10 = r8.A03
            r3 = 416(0x1a0, float:5.83E-43)
            if (r10 != r3) goto L_0x0175
            java.lang.String r10 = r6.getHeaderField(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            r11 = -1
            if (r2 != 0) goto L_0x016b
            java.util.regex.Pattern r2 = X.C10050Rln.A00
            java.util.regex.Matcher r10 = r2.matcher(r10)
            boolean r2 = r10.matches()
            if (r2 == 0) goto L_0x016b
            long r11 = X.Pxi.A0A(r10, r9)
        L_0x016b:
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0175
            r8.A06 = r9
            r8.A05(r7)
            return r4
        L_0x0175:
            java.io.InputStream r2 = r6.getErrorStream()
            if (r2 == 0) goto L_0x0188
            r0 = 20
            java.util.ArrayDeque r1 = new java.util.ArrayDeque     // Catch:{ IOException -> 0x018b }
            r1.<init>(r0)     // Catch:{ IOException -> 0x018b }
            r0 = 0
            byte[] r14 = X.1W7.A01(r2, r1, r0)     // Catch:{ IOException -> 0x018b }
            goto L_0x018d
        L_0x0188:
            byte[] r14 = androidx.media3.common.util.Util.A07     // Catch:{ IOException -> 0x018b }
            goto L_0x018d
        L_0x018b:
            byte[] r14 = androidx.media3.common.util.Util.A07
        L_0x018d:
            r8.A01()
            int r0 = r8.A03
            if (r0 != r3) goto L_0x01a4
            X.RCg r12 = new X.RCg
            r12.<init>()
        L_0x0199:
            int r0 = r8.A03
            X.QDs r1 = new X.QDs
            r10 = r1
            r11 = r7
            r15 = r0
            r10.<init>(r11, r12, r13, r14, r15)
        L_0x01a3:
            throw r1
        L_0x01a4:
            r12 = 0
            goto L_0x0199
        L_0x01a6:
            r0 = move-exception
            r8.A01()
            X.QDt r0 = X.C7454QDt.A00(r7, r0, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7446QDl.E0f(X.SH8):long");
    }

    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.A05;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
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
            A04(read);
            return read;
        } catch (IOException e) {
            throw C7454QDt.A00(this.A04, e, 2);
        }
    }
}
