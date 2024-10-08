package X;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.Qvb  reason: case insensitive filesystem */
public final class C8489Qvb extends C8492Qve {
    public static final byte[] A02 = "\n".getBytes();
    public final C11233SGt A00;
    public final String A01 = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[]{"GoogleAnalytics", C10087RmP.A00, Build.VERSION.RELEASE, C11304SKp.A01(Locale.getDefault()), Build.MODEL, Build.ID});

    /* JADX WARNING: Can't wrap try/catch for region: R(6:19|20|21|22|(2:24|25)|(2:29|39)(1:40)) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r11.A0G("Network POST connection error", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        if (r4 != null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        r11.A0H("Error closing http post connection output stream", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0082, code lost:
        if (r8 != null) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        r8.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0089, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        if (r4 != null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0090, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0091, code lost:
        r11.A0H("Error closing http post connection output stream", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0094, code lost:
        if (r8 != null) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0096, code lost:
        r8.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0099, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return 0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(X.C8489Qvb r11, java.net.URL r12, byte[] r13) {
        /*
            java.lang.String r2 = "Error closing http post connection output stream"
            X.AnonymousClass3Qk.A02(r13)
            int r3 = r13.length
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            java.lang.String r9 = "POST bytes, url"
            r10 = 3
            r8 = 0
            r5 = r11
            r7 = r12
            X.ST5.A0A(r5, r6, r7, r8, r9, r10)
            X.SNL r0 = X.SDN.A0D
            java.lang.Object r1 = r0.A00
            java.lang.String r1 = (java.lang.String) r1
            r0 = 2
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x002a
            java.lang.String r1 = new java.lang.String
            r1.<init>(r13)
            java.lang.String r0 = "Post payload\n"
            r11.A0E(r0, r1)
        L_0x002a:
            r4 = 0
            X.SQt r1 = r11.A00     // Catch:{ IOException -> 0x0072, all -> 0x0070 }
            android.content.Context r0 = r1.A00     // Catch:{ IOException -> 0x0072, all -> 0x0070 }
            r0.getPackageName()     // Catch:{ IOException -> 0x0072, all -> 0x0070 }
            java.net.HttpURLConnection r8 = A01(r11, r12)     // Catch:{ IOException -> 0x0072, all -> 0x0070 }
            r0 = 1
            r8.setDoOutput(r0)     // Catch:{ IOException -> 0x0072 }
            r8.setFixedLengthStreamingMode(r3)     // Catch:{ IOException -> 0x0072 }
            r0 = -342800347(0xffffffffeb914825, float:-3.5126987E26)
            X.0fi.A02(r8, r0)     // Catch:{ IOException -> 0x0072 }
            r0 = -313428621(0xffffffffed517573, float:-4.0515222E27)
            X.0fY r4 = X.0fi.A01(r8, r0)     // Catch:{ IOException -> 0x0072 }
            r4.write(r13)     // Catch:{ IOException -> 0x0072 }
            A02(r11, r8)     // Catch:{ IOException -> 0x0072 }
            int r3 = r8.getResponseCode()     // Catch:{ IOException -> 0x0072 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 != r0) goto L_0x005b
            X.C8492Qve.A05(r1)     // Catch:{ IOException -> 0x0072 }
        L_0x005b:
            java.lang.String r1 = "POST status"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0072 }
            r11.A0F(r1, r0)     // Catch:{ IOException -> 0x0072 }
            r4.close()     // Catch:{ IOException -> 0x0068 }
            goto L_0x006c
        L_0x0068:
            r0 = move-exception
            r11.A0H(r2, r0)
        L_0x006c:
            r8.disconnect()
            return r3
        L_0x0070:
            r1 = move-exception
            throw r1
        L_0x0072:
            r1 = move-exception
            java.lang.String r0 = "Network POST connection error"
            r11.A0G(r0, r1)     // Catch:{ all -> 0x0089 }
            if (r4 == 0) goto L_0x0082
            r4.close()     // Catch:{ IOException -> 0x007e }
            goto L_0x0082
        L_0x007e:
            r0 = move-exception
            r11.A0H(r2, r0)
        L_0x0082:
            if (r8 == 0) goto L_0x0087
            r8.disconnect()
        L_0x0087:
            r3 = 0
            return r3
        L_0x0089:
            r1 = move-exception
            if (r4 == 0) goto L_0x0094
            r4.close()     // Catch:{ IOException -> 0x0090 }
            goto L_0x0094
        L_0x0090:
            r0 = move-exception
            r11.A0H(r2, r0)
        L_0x0094:
            if (r8 == 0) goto L_0x0099
            r8.disconnect()
        L_0x0099:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8489Qvb.A00(X.Qvb, java.net.URL, byte[]):int");
    }

    /* JADX INFO: finally extract failed */
    public static final void A02(C8489Qvb qvb, HttpURLConnection httpURLConnection) {
        0fV A002 = 0fi.A00(httpURLConnection, -1939423162);
        try {
            do {
            } while (A002.read(new byte[1024]) > 0);
            try {
                A002.close();
            } catch (IOException e) {
                qvb.A0H("Error closing http connection input stream", e);
            }
        } catch (Throwable th) {
            try {
                A002.close();
                throw th;
            } catch (IOException e2) {
                qvb.A0H("Error closing http connection input stream", e2);
                throw th;
            }
        }
    }

    public C8489Qvb(C11381SQt sQt) {
        super(sQt);
        this.A00 = new C11233SGt(sQt.A04);
    }

    public static final HttpURLConnection A01(C8489Qvb qvb, URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(AnonymousClass7TE.A0M(SDN.A02.A00));
            httpURLConnection.setReadTimeout(AnonymousClass7TE.A0M(SDN.A03.A00));
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", qvb.A01);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw JTO.A0u("Failed to obtain http connection");
    }

    public static void A03(String str, String str2, StringBuilder sb) {
        if (sb.length() != 0) {
            sb.append('&');
        }
        sb.append(URLEncoder.encode(str, ReactWebViewManager.HTML_ENCODING));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, ReactWebViewManager.HTML_ENCODING));
    }

    public final String A0K(C11250SHk sHk, boolean z) {
        String str;
        AnonymousClass3Qk.A02(sHk);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        try {
            Map map = sHk.A04;
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                String A13 = DbT.A13(A1J);
                if (!"ht".equals(A13) && !"qt".equals(A13) && !"AppUID".equals(A13) && !"z".equals(A13) && !"_gmsv".equals(A13)) {
                    A03(A13, DbS.A0s(A1J), A1A);
                }
            }
            long j = sHk.A02;
            A03("ht", String.valueOf(j), A1A);
            A03("qt", String.valueOf(C51966G9m.A07(j)), A1A);
            if (z) {
                String str2 = "0";
                AnonymousClass3Qk.A04("_s");
                AnonymousClass3Qk.A08(!"_s".startsWith("&"), "Short param name required");
                String A11 = DbT.A11("_s", map);
                if (A11 != null) {
                    str2 = A11;
                }
                long j2 = 0;
                try {
                    j2 = Long.parseLong(str2);
                } catch (NumberFormatException unused) {
                }
                if (j2 != 0) {
                    str = String.valueOf(j2);
                } else {
                    str = String.valueOf(sHk.A01);
                }
                A03("z", str, A1A);
            }
            return A1A.toString();
        } catch (UnsupportedEncodingException e) {
            A0H("Failed to encode name or value", e);
            return null;
        }
    }

    public final boolean A0L() {
        C11200SFa.A00();
        A0J();
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.A00.A00.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return true;
            }
        } catch (SecurityException unused) {
        }
        ST5.A0B(this, "No network connectivity", 2);
        return false;
    }
}
