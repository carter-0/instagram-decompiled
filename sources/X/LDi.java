package X;

import com.instagram.common.session.UserSession;

public final class LDi {
    public MTU A00;
    public final AnonymousClass1CO A01;
    public final UserSession A02;
    public final C64605Lep A03 = new C64605Lep(this);
    public final String A04;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ec, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00f0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r3 = "KaraokeTranscriptionFetcher"
            r9 = 0
            X.0qQ.A0B(r11, r9)
            java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x00fd }
            com.instagram.common.session.UserSession r6 = r10.A02     // Catch:{ IOException -> 0x00fd }
            java.lang.String r5 = r10.A04     // Catch:{ IOException -> 0x00fd }
            r4 = 1
            android.net.Uri$Builder r1 = new android.net.Uri$Builder     // Catch:{ IOException -> 0x00fd }
            r1.<init>()     // Catch:{ IOException -> 0x00fd }
            java.lang.String r0 = "https"
            android.net.Uri$Builder r1 = r1.scheme(r0)     // Catch:{ IOException -> 0x00fd }
            java.lang.String r0 = "shortwave.instagram.com"
            android.net.Uri$Builder r1 = r1.authority(r0)     // Catch:{ IOException -> 0x00fd }
            java.lang.String r0 = "v2"
            android.net.Uri$Builder r1 = r1.appendPath(r0)     // Catch:{ IOException -> 0x00fd }
            java.lang.String r0 = "transcribe"
            android.net.Uri$Builder r2 = r1.appendPath(r0)     // Catch:{ IOException -> 0x00fd }
            java.lang.String r1 = "detailed"
            java.lang.String r0 = "1"
            android.net.Uri$Builder r1 = r2.appendQueryParameter(r1, r0)     // Catch:{ IOException -> 0x00fd }
            java.lang.String r0 = "product"
            android.net.Uri$Builder r7 = r1.appendQueryParameter(r0, r5)     // Catch:{ IOException -> 0x00fd }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ IOException -> 0x00fd }
            r0 = 1975(0x7b7, float:2.768E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x00fd }
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch:{ IOException -> 0x00fd }
            r1.<init>(r0, r2)     // Catch:{ IOException -> 0x00fd }
            java.lang.Long r0 = X.C51968G9o.A0u()     // Catch:{ IOException -> 0x00fd }
            java.lang.String r0 = r1.format(r0)     // Catch:{ IOException -> 0x00fd }
            X.0qQ.A07(r0)     // Catch:{ IOException -> 0x00fd }
            java.lang.String r2 = X.AnonymousClass7TG.A0j()     // Catch:{ IOException -> 0x00fd }
            X.0Tu r5 = X.0Tu.A05     // Catch:{ IOException -> 0x00fd }
            r0 = 36320296449351887(0x81091e000020cf, double:3.03243995244053E-306)
            boolean r0 = X.182.A06(r5, r6, r0)     // Catch:{ IOException -> 0x00fd }
            if (r0 == 0) goto L_0x0072
            java.util.Locale r5 = X.AnonymousClass1Q2.A02()     // Catch:{ IOException -> 0x00fd }
            java.lang.String r1 = r5.toString()     // Catch:{ IOException -> 0x00fd }
            java.lang.String r0 = "lang"
            r7.appendQueryParameter(r0, r1)     // Catch:{ IOException -> 0x00fd }
            r5.toString()     // Catch:{ IOException -> 0x00fd }
        L_0x0072:
            X.1HV r0 = new X.1HV     // Catch:{ IOException -> 0x00fd }
            r0.<init>(r6)     // Catch:{ IOException -> 0x00fd }
            X.1Pq r6 = new X.1Pq     // Catch:{ IOException -> 0x00fd }
            r6.<init>(r0)     // Catch:{ IOException -> 0x00fd }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ IOException -> 0x00fd }
            r6.A01(r0)     // Catch:{ IOException -> 0x00fd }
            android.net.Uri r0 = r7.build()     // Catch:{ IOException -> 0x00fd }
            java.lang.String r0 = X.DbT.A10(r0)     // Catch:{ IOException -> 0x00fd }
            r6.A02 = r0     // Catch:{ IOException -> 0x00fd }
            r6.A05 = r4     // Catch:{ IOException -> 0x00fd }
            java.lang.String r0 = "X-Shortwave-ID"
            X.1Fn r1 = new X.1Fn     // Catch:{ IOException -> 0x00fd }
            r1.<init>(r0, r2)     // Catch:{ IOException -> 0x00fd }
            java.util.List r0 = r6.A06     // Catch:{ IOException -> 0x00fd }
            r0.add(r1)     // Catch:{ IOException -> 0x00fd }
            java.lang.String r8 = "KaraokeTranscriptionApi_readBytes_exception"
            java.lang.String r7 = "KaraokeTranscriptionApi"
            java.io.File r2 = X.AnonymousClass7TE.A0t(r11)     // Catch:{ FileNotFoundException | IOException -> 0x00f1 }
            long r4 = r2.length()     // Catch:{ FileNotFoundException | IOException -> 0x00f1 }
            int r1 = (int) r4     // Catch:{ FileNotFoundException | IOException -> 0x00f1 }
            byte[] r4 = new byte[r1]     // Catch:{ FileNotFoundException | IOException -> 0x00f1 }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ FileNotFoundException | IOException -> 0x00f1 }
            r0.<init>(r2)     // Catch:{ FileNotFoundException | IOException -> 0x00f1 }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException | IOException -> 0x00f1 }
            r2.<init>(r0)     // Catch:{ FileNotFoundException | IOException -> 0x00f1 }
            r2.read(r4, r9, r1)     // Catch:{ all -> 0x00ea }
            r2.close()     // Catch:{ FileNotFoundException | IOException -> 0x00f1 }
            r0 = 2180(0x884, float:3.055E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x00fd }
            java.lang.String r2 = "audio/m4a"
            X.1Fn r1 = new X.1Fn     // Catch:{ IOException -> 0x00fd }
            r1.<init>(r0, r2)     // Catch:{ IOException -> 0x00fd }
            X.5sA r0 = new X.5sA     // Catch:{ IOException -> 0x00fd }
            r0.<init>(r1, r4)     // Catch:{ IOException -> 0x00fd }
            r6.A00 = r0     // Catch:{ IOException -> 0x00fd }
            X.1QS r4 = r6.A00()     // Catch:{ IOException -> 0x00fd }
            X.1QT r1 = X.JTQ.A0E()     // Catch:{ IOException -> 0x00fd }
            java.lang.String r0 = "Karaoke"
            r1.A0A = r0     // Catch:{ IOException -> 0x00fd }
            X.1Fe r0 = X.1Fe.A02     // Catch:{ IOException -> 0x00fd }
            r1.A03 = r0     // Catch:{ IOException -> 0x00fd }
            X.1QU r2 = r1.A00()     // Catch:{ IOException -> 0x00fd }
            X.Lep r1 = r10.A03     // Catch:{ IOException -> 0x00fd }
            r1.A00 = r11     // Catch:{ IOException -> 0x00fd }
            X.1CO r0 = r10.A01     // Catch:{ IOException -> 0x00fd }
            r0.A02(r1, r4, r2)     // Catch:{ IOException -> 0x00fd }
            return
        L_0x00ea:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ec }
        L_0x00ec:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ FileNotFoundException | IOException -> 0x00f1 }
            throw r0     // Catch:{ FileNotFoundException | IOException -> 0x00f1 }
        L_0x00f1:
            r0 = move-exception
            X.0kD.A05(r7, r8, r0)     // Catch:{ IOException -> 0x00fd }
            X.MTU r0 = r10.A00     // Catch:{ IOException -> 0x00fd }
            if (r0 == 0) goto L_0x010a
            r0.DtU()     // Catch:{ IOException -> 0x00fd }
            return
        L_0x00fd:
            r1 = move-exception
            java.lang.String r0 = "KaraokeTranscriptionFetcher_error_building_request"
            X.0kD.A05(r3, r0, r1)
            X.MTU r0 = r10.A00
            if (r0 == 0) goto L_0x010a
            r0.DtU()
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LDi.A00(java.lang.String):void");
    }

    public LDi(AnonymousClass1CO r2, UserSession userSession, String str) {
        this.A02 = userSession;
        this.A01 = r2;
        this.A04 = str;
    }
}
