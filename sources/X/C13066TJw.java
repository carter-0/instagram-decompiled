package X;

/* renamed from: X.TJw  reason: case insensitive filesystem */
public final class C13066TJw implements Runnable {
    public final /* synthetic */ C10522Rtb A00;
    public final /* synthetic */ T6J A01;
    public final /* synthetic */ C7313Q3p A02;
    public final /* synthetic */ String A03;

    public C13066TJw(C10522Rtb rtb, T6J t6j, C7313Q3p q3p, String str) {
        this.A01 = t6j;
        this.A00 = rtb;
        this.A02 = q3p;
        this.A03 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        r4 = X.Pxe.A0b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        r1 = r6.read(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (r1 != -1) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        r6.closeEntry();
        r7 = X.DbT.A10(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        r4.write(r5, 0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r6.close();
        r9 = r3.A02.A01;
        r1 = X.AnonymousClass15Q.A05;
        r8 = X.Pxf.A1V(r7, r1);
        r4 = javax.crypto.Mac.getInstance("HmacSHA256");
        r4.init(new javax.crypto.spec.SecretKeySpec(X.Pxf.A1V("prepackaged", r1), "HmacSHA256"));
        r0 = X.C56478HzA.A00(r4.doFinal(r8)).toLowerCase();
        X.0qQ.A07(r0);
        X.0qQ.A0B(r9, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008a, code lost:
        if (r9.equalsIgnoreCase(r0) == false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008c, code lost:
        r3.A01.A00(r2, r7, X.0sn.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0093, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a1, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.1zE.A00(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a6, code lost:
        r1 = X.AnonymousClass7TE.A0z("Downloaded zip file does not have valid checksum");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ad, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ae, code lost:
        r3.A01.A01(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            X.T6J r2 = r10.A01
            X.2ZD r0 = r2.A00
            if (r0 == 0) goto L_0x00b4
            int r1 = r0.A01
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x00b4
            X.Rtb r3 = r10.A00
            java.io.ByteArrayOutputStream r0 = r2.A01
            byte[] r1 = r0.toByteArray()
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r1)
            java.util.zip.ZipInputStream r6 = new java.util.zip.ZipInputStream
            r6.<init>(r0)
            X.Q3p r2 = r10.A02
            r0 = 1
            X.0qQ.A0B(r2, r0)
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r0]     // Catch:{ all -> 0x009f }
            java.util.zip.ZipEntry r0 = r6.getNextEntry()     // Catch:{ all -> 0x009f }
        L_0x002c:
            if (r0 == 0) goto L_0x0094
            boolean r0 = r0.isDirectory()     // Catch:{ all -> 0x009f }
            if (r0 != 0) goto L_0x004c
            java.io.ByteArrayOutputStream r4 = X.Pxe.A0b()     // Catch:{ all -> 0x009f }
        L_0x0038:
            int r1 = r6.read(r5)     // Catch:{ all -> 0x009f }
            r0 = -1
            if (r1 != r0) goto L_0x0047
            r6.closeEntry()     // Catch:{ all -> 0x009f }
            java.lang.String r7 = X.DbT.A10(r4)     // Catch:{ all -> 0x009f }
            goto L_0x0051
        L_0x0047:
            r0 = 0
            r4.write(r5, r0, r1)     // Catch:{ all -> 0x009f }
            goto L_0x0038
        L_0x004c:
            java.util.zip.ZipEntry r0 = r6.getNextEntry()     // Catch:{ all -> 0x009f }
            goto L_0x002c
        L_0x0051:
            r6.close()     // Catch:{ Exception -> 0x00ad }
            X.6Qr r0 = r3.A02     // Catch:{ Exception -> 0x00ad }
            java.lang.String r9 = r0.A01     // Catch:{ Exception -> 0x00ad }
            java.nio.charset.Charset r1 = X.AnonymousClass15Q.A05     // Catch:{ Exception -> 0x00ad }
            byte[] r8 = X.Pxf.A1V(r7, r1)     // Catch:{ Exception -> 0x00ad }
            r6 = 0
            java.lang.String r5 = "HmacSHA256"
            javax.crypto.Mac r4 = javax.crypto.Mac.getInstance(r5)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r0 = "prepackaged"
            byte[] r1 = X.Pxf.A1V(r0, r1)     // Catch:{ Exception -> 0x00ad }
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch:{ Exception -> 0x00ad }
            r0.<init>(r1, r5)     // Catch:{ Exception -> 0x00ad }
            r4.init(r0)     // Catch:{ Exception -> 0x00ad }
            byte[] r0 = r4.doFinal(r8)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r0 = X.C56478HzA.A00(r0)     // Catch:{ Exception -> 0x00ad }
            java.lang.String r0 = r0.toLowerCase()     // Catch:{ Exception -> 0x00ad }
            X.0qQ.A07(r0)     // Catch:{ Exception -> 0x00ad }
            X.0qQ.A0B(r9, r6)     // Catch:{ Exception -> 0x00ad }
            boolean r0 = r9.equalsIgnoreCase(r0)     // Catch:{ Exception -> 0x00ad }
            if (r0 == 0) goto L_0x00a6
            X.Q3F r1 = r3.A01     // Catch:{ Exception -> 0x00ad }
            X.0sn r0 = X.0sn.A00     // Catch:{ Exception -> 0x00ad }
            r1.A00(r2, r7, r0)     // Catch:{ Exception -> 0x00ad }
            return
        L_0x0094:
            r6.close()     // Catch:{ Exception -> 0x00ad }
            java.lang.String r0 = "Found no Bloks bundle in the downloaded zip."
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ Exception -> 0x00ad }
            r1.<init>(r0)     // Catch:{ Exception -> 0x00ad }
            goto L_0x00ac
        L_0x009f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r1 = move-exception
            X.1zE.A00(r6, r0)     // Catch:{ Exception -> 0x00ad }
            goto L_0x00ac
        L_0x00a6:
            java.lang.String r0 = "Downloaded zip file does not have valid checksum"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ Exception -> 0x00ad }
        L_0x00ac:
            throw r1     // Catch:{ Exception -> 0x00ad }
        L_0x00ad:
            r1 = move-exception
            X.Q3F r0 = r3.A01
            r0.A01(r2, r1)
            return
        L_0x00b4:
            X.Rtb r3 = r10.A00
            java.lang.String r1 = "HTTP Request Failed for "
            java.lang.String r0 = r10.A03
            java.lang.String r0 = X.002.A0R(r1, r0)
            org.apache.http.client.ClientProtocolException r2 = new org.apache.http.client.ClientProtocolException
            r2.<init>(r0)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            X.Q3p r1 = r10.A02
            X.AnonymousClass7TG.A1N(r2, r1)
            X.Q3F r0 = r3.A01
            r0.A01(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13066TJw.run():void");
    }
}
