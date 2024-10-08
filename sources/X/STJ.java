package X;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class STJ {
    public long A00;
    public long A01 = -1;
    public C13924TlS A02;
    public URI A03;
    public final C11224SFy A04;
    public final C11420SSw A05;
    public final C10393RrU A06;
    public final S1R A07;
    public final Object A08 = Pxe.A0p();
    public volatile RVG A09;
    public volatile QN6 A0A;
    public volatile QN9 A0B;

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        throw new java.lang.Exception();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long A00(java.lang.Exception r9) {
        /*
            boolean r0 = r9 instanceof org.apache.http.client.HttpResponseException
            r7 = -1
            if (r0 == 0) goto L_0x006a
            java.lang.String r2 = r9.getMessage()     // Catch:{ Exception -> 0x006a }
            if (r2 == 0) goto L_0x0069
            int r0 = r2.length()     // Catch:{ Exception -> 0x006a }
            if (r0 == 0) goto L_0x0069
            java.lang.String r1 = "\\n"
            X.11S r0 = new X.11S     // Catch:{ Exception -> 0x006a }
            r0.<init>(r1)     // Catch:{ Exception -> 0x006a }
            r3 = 0
            java.util.List r2 = r0.A03(r2)     // Catch:{ Exception -> 0x006a }
            boolean r0 = r2.isEmpty()     // Catch:{ Exception -> 0x006a }
            r6 = 1
            if (r0 != 0) goto L_0x0044
            java.util.ListIterator r1 = X.C51968G9o.A18(r2)     // Catch:{ Exception -> 0x006a }
        L_0x0029:
            boolean r0 = r1.hasPrevious()     // Catch:{ Exception -> 0x006a }
            if (r0 == 0) goto L_0x0044
            int r0 = X.DbX.A06(r1)     // Catch:{ Exception -> 0x006a }
            if (r0 == 0) goto L_0x0029
            java.util.List r0 = X.DbX.A0y(r2, r1)     // Catch:{ Exception -> 0x006a }
        L_0x0039:
            java.lang.String[] r2 = X.DbU.A1b(r0, r3)     // Catch:{ Exception -> 0x006a }
            int r1 = r2.length     // Catch:{ Exception -> 0x006a }
            r0 = 2
            if (r1 < r0) goto L_0x0069
            r5 = r2[r6]     // Catch:{ Exception -> 0x006a }
            goto L_0x0047
        L_0x0044:
            X.0sn r0 = X.0sn.A00     // Catch:{ Exception -> 0x006a }
            goto L_0x0039
        L_0x0047:
            X.16F r0 = X.16P.A00(r5)     // Catch:{ IOException -> 0x0063 }
            X.RoK r0 = X.RVH.parseFromJson(r0)     // Catch:{ IOException -> 0x0063 }
            if (r0 == 0) goto L_0x005a
            long r3 = r0.A00     // Catch:{ IOException -> 0x0063 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x005a
            return r3
        L_0x005a:
            X.0qQ.A0B(r5, r6)     // Catch:{ IOException -> 0x0063 }
            X.RKB r0 = new X.RKB     // Catch:{ IOException -> 0x0063 }
            r0.<init>(r5)     // Catch:{ IOException -> 0x0063 }
            throw r0     // Catch:{ IOException -> 0x0063 }
        L_0x0063:
            X.RKB r0 = new X.RKB     // Catch:{ Exception -> 0x006a }
            r0.<init>()     // Catch:{ Exception -> 0x006a }
            throw r0     // Catch:{ Exception -> 0x006a }
        L_0x0069:
            return r7
        L_0x006a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STJ.A00(java.lang.Exception):long");
    }

    public static final void A01(STJ stj) {
        Integer num = AnonymousClass05K.A00;
        stj.A04((Exception) null, num, false);
        URI uri = stj.A03;
        if (uri != null) {
            HashMap A1E = AnonymousClass7TE.A1E();
            C11224SFy sFy = stj.A04;
            A1E.putAll(sFy.A0B);
            stj.A05(A1E, true);
            stj.A02.Dj7(DbT.A10(uri), A1E);
            stj.A0A = new QN6(sFy, stj);
            S1R s1r = stj.A07;
            LinkedHashMap linkedHashMap = new LinkedHashMap(A1E);
            QN6 qn6 = stj.A0A;
            if (qn6 != null) {
                stj.A09 = s1r.A00(qn6, (C10392RrT) null, num, uri, linkedHashMap);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A02(STJ stj, long j, boolean z) {
        Integer num = AnonymousClass05K.A01;
        stj.A04((Exception) null, num, false);
        stj.A02.Dj3(j, z);
        stj.A00 = j;
        C10393RrU rrU = stj.A06;
        rrU.A00 = SystemClock.uptimeMillis();
        ArrayList arrayList = rrU.A01;
        arrayList.add(new Object());
        if (DbT.A1b(arrayList)) {
            S49 s49 = (S49) arrayList.get(Pxe.A0A(arrayList));
            s49.A00 = s49.A00;
            s49.A01 = s49.A01;
        }
        C11224SFy sFy = stj.A04;
        stj.A0B = new QN9(sFy, rrU, stj, z);
        S1R s1r = stj.A07;
        HashMap A19 = Pxe.A19(sFy.A0B);
        if (!sFy.A0F) {
            A19.put("X-Entity-Length", String.valueOf(stj.A05.A00));
        }
        A19.put("Offset", String.valueOf(j));
        C11420SSw sSw = stj.A05;
        String str = sSw.A04;
        if (str != null) {
            A19.put("X-Entity-Type", str);
        }
        String str2 = sFy.A08;
        if (!(str2 == null && (str2 = sSw.A03) == null)) {
            A19.put("X-Entity-Name", str2);
        }
        stj.A05(A19, z);
        LinkedHashMap linkedHashMap = new LinkedHashMap(A19);
        URI uri = stj.A03;
        if (uri != null) {
            C10392RrT rrT = new C10392RrT(sSw, j);
            QN9 qn9 = stj.A0B;
            if (qn9 != null) {
                stj.A09 = s1r.A00(qn9, rrT, num, uri, linkedHashMap);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A03(STJ stj, Exception exc, Integer num, String str, Map map, int i, long j, boolean z) {
        String str2;
        File file;
        String str3;
        STJ stj2 = stj;
        long j2 = j;
        C13924TlS tlS = stj2.A02;
        Integer num2 = num;
        if (num2.intValue() != 0) {
            str2 = "POST";
        } else {
            str2 = "GET";
        }
        Exception exc2 = exc;
        String str4 = str;
        Map map2 = map;
        int i2 = i;
        boolean z2 = z;
        tlS.DEM(exc2, str4, str2, map2, i2, j2, z2);
        stj2.A04(exc2, num2, z2);
        if (z) {
            C11224SFy sFy = stj2.A04;
            C10543Rtx rtx = sFy.A07;
            int i3 = rtx.A01;
            rtx.A01 = i3 + 1;
            C11181SEh sEh = rtx.A02;
            if (i3 < sEh.A01 && (file = stj2.A05.A01) != null && file.exists()) {
                try {
                    if (sFy.A00) {
                        Uri.Builder A0I = Pxe.A0I();
                        A0I.scheme("https");
                        A0I.encodedAuthority(002.A0R("rupload.", IGPixelRequestBuffer.URL_PREFIX));
                        URI uri = stj2.A03;
                        if (uri != null) {
                            String A10 = DbT.A10(uri);
                            String A0C = 002.A0C(IGPixelRequestBuffer.URL_PREFIX, '/');
                            int A082 = 00l.A08(A10, A0C, 0, false);
                            if (A082 >= 0) {
                                str3 = C66580MXl.A0z(A10, A082 + A0C.length());
                            } else {
                                str3 = "";
                            }
                            A0I.appendEncodedPath(str3);
                            stj2.A03 = Pxg.A11(A0I);
                            sFy.A00 = false;
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
                if (j < 0) {
                    int i4 = rtx.A00;
                    rtx.A00 = Math.min(i4 << 1, sEh.A00);
                    j2 = (long) i4;
                }
                try {
                    Thread.sleep(j2);
                } catch (InterruptedException unused) {
                    Pxe.A1F();
                }
                if (sFy.A0D) {
                    A01(stj2);
                    return;
                } else {
                    A02(stj2, 0, sFy.A02.A01);
                    return;
                }
            }
        }
        tlS.DEX(new C8989RKf(exc2, str4, map2, i2, stj2.A00, false));
        stj2.A09 = null;
        stj2.A0A = null;
        stj2.A0B = null;
    }

    private final void A04(Exception exc, Integer num, boolean z) {
        String str;
        C11224SFy sFy = this.A04;
        C10542Rtw rtw = sFy.A06;
        if (rtw != null) {
            JSONObject A11 = DbS.A11();
            try {
                A11.put("mBytesUploaded", this.A00);
                if (num.intValue() != 0) {
                    str = "POST";
                } else {
                    str = "GET";
                }
                A11.put("method", str);
                A11.put("retryCount", sFy.A07.A01);
                if (exc != null) {
                    A11.put("exception", exc.getMessage());
                    A11.put("isRetriable", z);
                }
            } catch (JSONException unused) {
            }
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("debug", A11.toString());
            HashMap A1E2 = AnonymousClass7TE.A1E();
            A1E2.putAll(rtw.A02);
            A1E2.putAll(A1E);
            rtw.A01.logEvent("media_upload_debug_info", A1E2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (((X.RC3) r1).A01 == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A05(java.util.Map r6, boolean r7) {
        /*
            r5 = this;
            X.SFy r4 = r5.A04
            boolean r0 = r4.A0E
            if (r0 == 0) goto L_0x0015
            X.SSw r0 = r5.A05
            java.io.File r1 = r0.A01
            boolean r0 = r1 instanceof X.RC3
            if (r0 == 0) goto L_0x0015
            X.RC3 r1 = (X.RC3) r1
            boolean r0 = r1.A01
            r2 = 1
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            X.S16 r1 = r4.A05
            X.SEg r0 = r1.A01
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0074
            int r1 = r1.A00
            r0 = 1
            if (r1 >= r0) goto L_0x0074
            X.SEg r3 = r4.A02
            boolean r0 = r4.A0F
            if (r0 == 0) goto L_0x0037
            if (r2 == 0) goto L_0x0074
            X.SSw r2 = r5.A05
            java.io.File r0 = r2.A01
            if (r0 == 0) goto L_0x006f
            long r0 = r0.length()
            r2.A00 = r0
        L_0x0037:
            java.lang.Integer r0 = r3.A00
            if (r0 == 0) goto L_0x006a
            X.SSw r2 = r5.A05     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = "SHA-256"
            int r0 = r3.A02     // Catch:{ all -> 0x0069 }
            X.RrS r4 = r2.A01(r1, r0)     // Catch:{ all -> 0x0069 }
            if (r4 == 0) goto L_0x0074
            byte[] r1 = r4.A01     // Catch:{ all -> 0x0069 }
            r0 = 2
            java.lang.String r2 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x0069 }
            if (r7 == 0) goto L_0x005c
            java.lang.String r1 = "X-Entity-Digest"
            java.lang.String r0 = "sha256"
            java.lang.String r0 = X.C66580MXl.A10(r0, r2)     // Catch:{ all -> 0x0069 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0069 }
        L_0x005c:
            java.lang.String r3 = "X-Digest-Time-Ms"
            long r1 = r4.A00     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0069 }
            r6.put(r3, r0)     // Catch:{ all -> 0x0069 }
            r5.A01 = r1     // Catch:{ all -> 0x0069 }
        L_0x0069:
            return
        L_0x006a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x006f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.STJ.A05(java.util.Map, boolean):void");
    }

    public STJ(C11224SFy sFy, C11420SSw sSw, C13924TlS tlS, S1R s1r) {
        URI uri;
        this.A05 = sSw;
        this.A04 = sFy;
        this.A02 = tlS;
        this.A07 = s1r;
        String str = sFy.A09;
        str = (str == null || str.length() == 0) ? 002.A0R("rupload.", IGPixelRequestBuffer.URL_PREFIX) : str;
        Uri.Builder A0I = Pxe.A0I();
        A0I.scheme("https");
        A0I.encodedAuthority(str);
        A0I.appendPath(sFy.A03.A01);
        String str2 = sFy.A08;
        A0I.appendPath(str2 == null ? sSw.A03 : str2);
        String str3 = sFy.A0A;
        if (!(str3 == null || str3.length() == 0)) {
            A0I.appendQueryParameter("target", str3);
        }
        if (sFy.A0B.containsKey("Stream-Id")) {
            A0I.appendQueryParameter("segmented", "true");
            A0I.appendQueryParameter("phase", "transfer");
        }
        try {
            uri = Pxg.A11(A0I);
        } catch (URISyntaxException unused) {
            uri = null;
        }
        this.A03 = uri;
        this.A09 = null;
        this.A00 = 0;
        this.A06 = new C10393RrU();
    }
}
