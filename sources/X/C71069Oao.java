package X;

import java.io.IOException;
import java.net.HttpURLConnection;

/* renamed from: X.Oao  reason: case insensitive filesystem */
public final class C71069Oao {
    public final void A03(S5E s5e, String str) {
        boolean A1U = AnonymousClass7TF.A1U(0, s5e, str);
        String A00 = A00(s5e, str);
        if (A00.length() > 0) {
            HttpURLConnection A0d = C66584MXp.A0d(002.A0R("https://www.googleapis.com/drive/v3/files/", A00));
            A0d.setRequestMethod("DELETE");
            A0d.setUseCaches(false);
            A0d.setDoInput(A1U);
            A0d.setDoOutput(false);
            0qQ.A08(C74517PwC.A00);
            String str2 = s5e.A00.A00;
            str2.getClass();
            A0d.setRequestProperty("Authorization", 002.A0R("Bearer ", str2));
            0KC.A0D("GoogleDriveIntegration", 002.A0O("response code for deleting :", A0d.getResponseCode()));
            A0d.disconnect();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0096, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0097, code lost:
        X.1zE.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(X.S5E r4, java.lang.String r5) {
        /*
            java.lang.String r1 = "https://www.googleapis.com/drive/v3/files?q=name%3D'"
            java.lang.String r0 = "'&spaces=appDataFolder"
            java.lang.String r0 = X.002.A0g(r1, r5, r0)
            java.net.HttpURLConnection r3 = X.C66584MXp.A0d(r0)
            java.lang.String r0 = "GET"
            r3.setRequestMethod(r0)
            r5 = 0
            r3.setUseCaches(r5)
            r0 = 1
            r3.setDoInput(r0)
            r3.setDoOutput(r5)
            java.lang.String r1 = "Bearer "
            X.PwC r0 = X.C74517PwC.A00
            X.0qQ.A08(r0)
            X.SIw r0 = r4.A00
            java.lang.String r0 = r0.A00
            r0.getClass()
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "Authorization"
            r3.setRequestProperty(r0, r1)
            int r4 = r3.getResponseCode()
            r0 = 200(0xc8, float:2.8E-43)
            boolean r0 = X.AnonymousClass7TF.A1S(r4, r0)
            if (r0 == 0) goto L_0x009b
            r0 = 1939458693(0x7399ca85, float:2.4369171E31)
            X.0fV r1 = X.0fi.A00(r3, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r1)
            java.io.BufferedReader r4 = new java.io.BufferedReader
            r4.<init>(r0)
            java.lang.String r1 = r4.readLine()     // Catch:{ all -> 0x0094 }
        L_0x0054:
            if (r1 == 0) goto L_0x0080
            java.lang.String r0 = "id"
            boolean r0 = X.00l.A0d(r1, r0, r5)     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = ":"
            java.lang.String r1 = X.00l.A0K(r1, r0, r1)     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = ","
            java.lang.String r2 = X.00l.A0L(r1, r0, r1)     // Catch:{ all -> 0x0094 }
            java.lang.String r1 = "\""
            java.lang.String r0 = ""
            java.lang.String r0 = X.00p.A0g(r2, r1, r0, r5)     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = X.DbV.A12(r0)     // Catch:{ all -> 0x0094 }
            goto L_0x007c
        L_0x0077:
            java.lang.String r1 = r4.readLine()     // Catch:{ all -> 0x0094 }
            goto L_0x0054
        L_0x007c:
            r4.close()
            goto L_0x0085
        L_0x0080:
            r4.close()
            java.lang.String r2 = ""
        L_0x0085:
            java.lang.String r0 = "response data for getting file id :"
            java.lang.String r1 = X.002.A0R(r0, r2)
            java.lang.String r0 = "GoogleDriveIntegration"
            X.0KC.A0D(r0, r1)
            r3.disconnect()
            return r2
        L_0x0094:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            X.1zE.A00(r4, r1)
            throw r0
        L_0x009b:
            java.lang.String r2 = "Bad request: "
            java.lang.String r1 = " with error message: "
            java.io.InputStream r0 = r3.getErrorStream()
            X.0qQ.A07(r0)
            java.lang.String r0 = A01(r0)
            java.lang.String r1 = X.002.A05(r4, r2, r1, r0)
            java.lang.String r0 = "GoogleDriveIntegration"
            X.0KC.A0D(r0, r1)
            java.lang.String r1 = X.002.A0O(r2, r4)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71069Oao.A00(X.S5E, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A01(java.io.InputStream r2) {
        /*
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r2)
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r2.<init>(r0)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ all -> 0x0025 }
            r1.<init>()     // Catch:{ all -> 0x0025 }
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x0025 }
        L_0x0013:
            if (r0 == 0) goto L_0x001d
            r1.append(r0)     // Catch:{ all -> 0x0025 }
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x0025 }
            goto L_0x0013
        L_0x001d:
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0025 }
            r2.close()
            return r0
        L_0x0025:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r0 = move-exception
            X.1zE.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71069Oao.A01(java.io.InputStream):java.lang.String");
    }

    public static final String A02(HttpURLConnection httpURLConnection, int i) {
        boolean z;
        0fV errorStream;
        if (i == 200) {
            z = true;
            errorStream = 0fi.A00(httpURLConnection, -1778398725);
        } else {
            z = false;
            errorStream = httpURLConnection.getErrorStream();
        }
        0qQ.A0A(errorStream);
        String A01 = A01(errorStream);
        if (z) {
            return A01;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(i);
        A1A.append(":(");
        throw new IOException(C51975G9x.A0i(A01, A1A));
    }
}
