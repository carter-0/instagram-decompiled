package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.google.common.io.Closeables;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: X.3EQ  reason: invalid class name */
public final class AnonymousClass3EQ {
    public int A00;
    public 1QU A01;
    public AnonymousClass3Ey A02;
    public AnonymousClass3Ey A03;
    public C227602jb A04;
    public String A05;
    public GZIPInputStream A06;
    public GZIPOutputStream A07;
    public GZIPOutputStream A08;
    public boolean A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    public final C238993Ei A01(1Fe r12, 1JI r13, 1J0 r14, boolean z) {
        int i;
        GZIPInputStream gZIPInputStream = null;
        try {
            String str = this.A0C;
            C227082ic AX8 = r13.AX8(str);
            if (AX8.A00 != null) {
                GZIPInputStream gZIPInputStream2 = new GZIPInputStream((C227602jb) AX8.A00());
                1J0 r4 = r14;
                if (r14 != null && z) {
                    try {
                        String str2 = this.A0B;
                        if (r12 == 1Fe.A02) {
                            i = 0;
                        } else {
                            i = -1;
                            if (r12 == 1Fe.A03) {
                                i = 1;
                            }
                        }
                        r4.A02(str2, (String) null, 0, i, r13.B22(str) + r13.B22(this.A0A));
                    } catch (Throwable th) {
                        th = th;
                        gZIPInputStream = gZIPInputStream2;
                        Closeables.A01(gZIPInputStream);
                        throw th;
                    }
                }
                StringBuilder sb = new StringBuilder();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = gZIPInputStream2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    sb.append(new String(bArr, 0, read, Charset.forName(ReactWebViewManager.HTML_ENCODING)));
                }
                C238993Ei parseFromJson = C238983Eh.parseFromJson(16P.A00(sb.toString()));
                if (parseFromJson != null) {
                    Closeables.A01(gZIPInputStream2);
                    return parseFromJson;
                }
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Attempt to parse String to AsyncHttpResponseInfo: %s. Length: %s. mResponseInfoIgDiskCacheKey: %s. IgDiskCache size in bytes %d", sb.toString(), Integer.valueOf(sb.length()), str, Long.valueOf(r13.size()));
                A03(r13);
                0wb.A03("HttpStoreEntry_nullAsyncHttpResponseInfo", formatStrLocaleSafe);
                throw new IOException(formatStrLocaleSafe);
            }
            throw new IOException("Http ResponseInfo file stream not available");
        } catch (Throwable th2) {
            th = th2;
            Closeables.A01(gZIPInputStream);
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.1JI r9, java.lang.String r10, java.lang.String r11) {
        /*
            java.lang.String r2 = "HttpStoreEntry"
            X.2ic r3 = r9.AX8(r10)
            r4 = 0
            java.lang.Object r0 = r3.A00     // Catch:{ IOException -> 0x004f, all -> 0x006c }
            if (r0 == 0) goto L_0x0040
            X.2ic r1 = r9.AR2(r11)     // Catch:{ IOException -> 0x004f, all -> 0x006c }
            java.lang.Object r0 = r1.A00     // Catch:{ IOException -> 0x004f, all -> 0x006c }
            if (r0 == 0) goto L_0x004b
            java.lang.Object r3 = r3.A00()     // Catch:{ IOException -> 0x004f, all -> 0x006c }
            X.2jb r3 = (X.C227602jb) r3     // Catch:{ IOException -> 0x004f, all -> 0x006c }
            java.lang.Object r1 = r1.A00()     // Catch:{ IOException -> 0x0050 }
            X.3Ey r1 = (X.AnonymousClass3Ey) r1     // Catch:{ IOException -> 0x0050 }
            java.nio.channels.FileChannel r4 = r3.A01()     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            java.nio.channels.FileChannel r9 = r1.A01()     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            r5 = 0
            long r7 = r4.size()     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            r4.transferTo(r5, r7, r9)     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            r1.A03()     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            r0 = 1
            r1.A02()
            com.google.common.io.Closeables.A01(r3)
            return r0
        L_0x003b:
            r0 = move-exception
            r4 = r1
            goto L_0x0066
        L_0x003e:
            r4 = r1
            goto L_0x0050
        L_0x0040:
            java.lang.String r0 = "Source file %s not found when copying"
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r10)     // Catch:{ IOException -> 0x004f, all -> 0x006c }
            X.0wb r0 = X.0wb.A01     // Catch:{ IOException -> 0x004f, all -> 0x006c }
            r0.Ew0(r2, r1)     // Catch:{ IOException -> 0x004f, all -> 0x006c }
        L_0x004b:
            com.google.common.io.Closeables.A01(r4)
            goto L_0x0063
        L_0x004f:
            r3 = r4
        L_0x0050:
            java.lang.String r0 = "IOException when copying file %s"
            java.lang.String r1 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r10)     // Catch:{ all -> 0x0065 }
            X.0wb r0 = X.0wb.A01     // Catch:{ all -> 0x0065 }
            r0.Ew0(r2, r1)     // Catch:{ all -> 0x0065 }
            if (r4 == 0) goto L_0x0060
            r4.A02()
        L_0x0060:
            com.google.common.io.Closeables.A01(r3)
        L_0x0063:
            r0 = 0
            return r0
        L_0x0065:
            r0 = move-exception
        L_0x0066:
            if (r4 == 0) goto L_0x006e
            r4.A02()
            goto L_0x006e
        L_0x006c:
            r0 = move-exception
            r3 = r4
        L_0x006e:
            com.google.common.io.Closeables.A01(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3EQ.A00(X.1JI, java.lang.String, java.lang.String):boolean");
    }

    public final void A02() {
        AnonymousClass3Ey r0 = this.A03;
        if (r0 != null) {
            r0.A02();
        }
        AnonymousClass3Ey r02 = this.A02;
        if (r02 != null) {
            r02.A02();
        }
        GZIPOutputStream gZIPOutputStream = this.A08;
        if (gZIPOutputStream != null) {
            try {
                gZIPOutputStream.close();
            } catch (IOException e) {
                0KC.A0H("HttpStoreEntry", "IOException when closing header output stream", e);
            }
        }
        GZIPOutputStream gZIPOutputStream2 = this.A07;
        if (gZIPOutputStream2 != null) {
            try {
                gZIPOutputStream2.close();
            } catch (IOException e2) {
                0KC.A0H("HttpStoreEntry", "IOException when closing body output stream", e2);
            }
        }
    }

    public final String toString() {
        return StringFormatUtil.formatStrLocaleSafe("{requestPath: %s, cacheKey: %s, requestId: %d}", this.A05, this.A0A, Integer.valueOf(this.A00));
    }

    public AnonymousClass3EQ(String str) {
        this.A0B = str;
        this.A0C = 002.A0R(str, "-resp_info_gzip");
        this.A0A = 002.A0R(str, "-body_gzip");
    }

    public final void A03(1JI r3) {
        A02();
        String str = this.A0C;
        if (r3.CJV(str)) {
            r3.ED4(str);
        }
        String str2 = this.A0A;
        if (r3.CJV(str2)) {
            r3.ED4(str2);
        }
    }
}
