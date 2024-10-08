package X;

import java.util.List;

/* renamed from: X.S3u  reason: case insensitive filesystem */
public abstract class C10984S3u {
    public final SE0 A00 = SE0.A01.A00();

    public final void A02(C307896Rx r4, AnonymousClass6Tm r5, String str) {
        C277014uI A0N;
        List A1I;
        if (this instanceof C7908Qce) {
            A0N = DbW.A0P(r5, 4);
            Object A0e = DbW.A0e(r5);
            0qQ.A0A(A0e);
            A1I = AnonymousClass7TE.A1I(A0e);
        } else {
            A0N = DbW.A0N(r5);
            A1I = AnonymousClass7TE.A1I(str);
        }
        C299275ur.A00(r4, new AnonymousClass6Tm(A1I), A0N);
    }

    /* JADX WARNING: type inference failed for: r12v3, types: [X.0TC, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009d, code lost:
        if (r1.startsWith(X.JTP.A0u(r9.getCacheDir())) != true) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a0, code lost:
        if (r0 != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
        r1 = X.Pxg.A0Y(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ad, code lost:
        if (r1.exists() != true) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e4, code lost:
        if (r14 != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        X.1zE.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01bc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01bd, code lost:
        X.1zE.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01c0, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x00b2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A01(X.C307896Rx r27, X.AnonymousClass6Tm r28) {
        /*
            r26 = this;
            java.lang.String r8 = "upload denied"
            r3 = 1
            r5 = r27
            X.6Rm r0 = r5.A03
            r16 = 0
            if (r0 == 0) goto L_0x01af
            android.content.Context r9 = r0.A00
        L_0x000e:
            java.lang.String r0 = X.C66579MXk.A00(r3)
            X.0qQ.A0C(r9, r0)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            r6 = r26
            boolean r2 = r6 instanceof X.C7908Qce
            r4 = r28
            if (r2 == 0) goto L_0x01a1
            java.lang.Object r1 = X.DbT.A0p(r4, r3)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>"
            X.0qQ.A0C(r1, r0)
            java.util.Map r1 = (java.util.Map) r1
            java.util.Collection r0 = r1.values()
            java.util.List r0 = X.00k.A0a(r0)
        L_0x0035:
            java.util.Iterator r15 = r0.iterator()
        L_0x0039:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x01d1
            java.lang.String r0 = X.AnonymousClass7TE.A18(r15)
            android.net.Uri r1 = X.DbT.A09(r0)
            X.6QE r0 = X.AnonymousClass6QE.A02
            android.net.Uri r11 = X.AnonymousClass6QJ.A01(r1, r3)
            X.SE0 r0 = r6.A00     // Catch:{ SecurityException -> 0x01cd }
            java.lang.String r1 = X.DbT.A10(r11)     // Catch:{ SecurityException -> 0x01cd }
            java.util.Set r0 = r0.A00     // Catch:{ SecurityException -> 0x01cd }
            boolean r0 = r0.contains(r1)     // Catch:{ SecurityException -> 0x01cd }
            if (r0 == 0) goto L_0x01c1
            java.lang.String r0 = r11.getScheme()
            if (r0 != 0) goto L_0x0069
            java.lang.String r0 = r11.getPath()
            android.net.Uri r11 = X.JTQ.A09(r0)
        L_0x0069:
            android.content.ContentResolver r10 = r9.getContentResolver()
            java.lang.String r1 = r11.getScheme()
            java.lang.String r0 = "content"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x014b
            java.lang.String r13 = r10.getType(r11)
        L_0x007d:
            java.lang.String r0 = r11.getScheme()
            java.lang.String r12 = "file"
            boolean r0 = X.0qQ.A0K(r0, r12)
            r14 = 1
            if (r0 == 0) goto L_0x00bc
            java.lang.String r1 = r11.getPath()
            if (r1 == 0) goto L_0x009f
            java.io.File r0 = r9.getCacheDir()
            java.lang.String r0 = X.JTP.A0u(r0)
            boolean r1 = r1.startsWith(r0)
            r0 = 1
            if (r1 == r3) goto L_0x00a0
        L_0x009f:
            r0 = 0
        L_0x00a0:
            if (r0 == 0) goto L_0x00bc
        L_0x00a2:
            java.io.File r1 = X.Pxg.A0Y(r11)
        L_0x00a6:
            if (r1 == 0) goto L_0x00af
            boolean r10 = r1.exists()
            r0 = 1
            if (r10 == r3) goto L_0x00b0
        L_0x00af:
            r0 = 0
        L_0x00b0:
            if (r0 != 0) goto L_0x015d
            r0 = 4138(0x102a, float:5.799E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A02(r5, r4, r0)
            return r16
        L_0x00bc:
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r13 = r0.getExtensionFromMimeType(r13)
            if (r13 == 0) goto L_0x0147
            java.lang.String r0 = r11.getScheme()
            boolean r0 = X.0qQ.A0K(r0, r12)
            if (r0 == 0) goto L_0x00e9
            java.lang.String r1 = r11.getPath()
            if (r1 == 0) goto L_0x00e7
            java.io.File r0 = r9.getFilesDir()
            java.lang.String r0 = X.JTP.A0t(r0)
            boolean r0 = r1.startsWith(r0)
            if (r0 != r3) goto L_0x00e7
        L_0x00e4:
            if (r14 == 0) goto L_0x00e9
            goto L_0x00a2
        L_0x00e7:
            r14 = 0
            goto L_0x00e4
        L_0x00e9:
            if (r2 == 0) goto L_0x0122
            java.lang.ref.WeakReference r0 = X.C7908Qce.A00
            if (r0 == 0) goto L_0x0120
            java.lang.Object r14 = r0.get()
            android.content.Context r14 = (android.content.Context) r14
            if (r14 == 0) goto L_0x0120
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "scp_temp_"
            r1.append(r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r12 = X.AnonymousClass7TF.A0i(r0, r1)
            r0 = 46
            java.lang.String r1 = X.002.A0D(r13, r0)
            java.io.File r0 = r14.getCacheDir()
            java.io.File r1 = java.io.File.createTempFile(r12, r1, r0)
        L_0x0117:
            if (r1 == 0) goto L_0x0147
            java.io.InputStream r11 = r10.openInputStream(r11)
            if (r11 == 0) goto L_0x00a6
            goto L_0x0138
        L_0x0120:
            r1 = 0
            goto L_0x0117
        L_0x0122:
            java.lang.String r12 = "scp_temp_"
            long r0 = java.lang.System.nanoTime()
            java.lang.String r1 = X.002.A0Q(r12, r0)
            r0 = 46
            java.lang.String r0 = X.002.A0D(r13, r0)
            java.io.File r1 = java.io.File.createTempFile(r1, r0)
            goto L_0x0117
        L_0x0138:
            java.io.FileOutputStream r10 = X.JTO.A0t(r1)     // Catch:{ all -> 0x01ba }
            X.C11108SAj.A00(r11, r10)     // Catch:{ all -> 0x01b3 }
            r10.close()     // Catch:{ all -> 0x01ba }
            r11.close()
            goto L_0x00a6
        L_0x0147:
            r1 = r16
            goto L_0x00a6
        L_0x014b:
            java.lang.String r0 = r11.toString()
            java.lang.String r1 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r0)
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r13 = r0.getMimeTypeFromExtension(r1)
            goto L_0x007d
        L_0x015d:
            X.OOC r0 = new X.OOC
            r0.<init>()
            java.lang.String r10 = X.JTP.A0t(r1)
            r0.A06(r10)
            java.lang.String r17 = "image/bmp"
            java.lang.String r18 = "image/gif"
            java.lang.String r19 = "image/heic"
            java.lang.String r20 = "image/png"
            java.lang.String r21 = "image/tiff"
            java.lang.String r22 = "image/webp"
            java.lang.String r23 = "image/jpeg"
            java.lang.String r24 = "video/mp4"
            java.lang.String r25 = "application/pdf"
            java.lang.String[] r10 = new java.lang.String[]{r17, r18, r19, r20, r21, r22, r23, r24, r25}
            r0.A07(r10)
            X.0TC r12 = new X.0TC
            r12.<init>()
            X.Ni4 r0 = r0.A00()     // Catch:{ SecurityException -> 0x018d }
            goto L_0x0196
        L_0x018d:
            r11 = move-exception
            java.lang.String r10 = "SecureFileBuilder"
            java.lang.String r0 = "Unable to build SecureFile"
            r12.EFT(r10, r0, r11)
            r0 = 0
        L_0x0196:
            if (r0 != 0) goto L_0x019c
            r6.A02(r5, r4, r8)
            return r16
        L_0x019c:
            r7.add(r1)
            goto L_0x0039
        L_0x01a1:
            r0 = 4
            java.lang.Object r0 = r4.A03(r0)
            X.DbS.A1Y(r0)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            goto L_0x0035
        L_0x01af:
            r9 = r16
            goto L_0x000e
        L_0x01b3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01b5 }
        L_0x01b5:
            r0 = move-exception
            X.1zE.A00(r10, r1)     // Catch:{ all -> 0x01ba }
            throw r0     // Catch:{ all -> 0x01ba }
        L_0x01ba:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01bc }
        L_0x01bc:
            r0 = move-exception
            X.1zE.A00(r11, r1)
            throw r0
        L_0x01c1:
            java.lang.String r0 = "Not allowed for upload: "
            java.lang.String r1 = X.002.A0R(r0, r1)     // Catch:{ SecurityException -> 0x01cd }
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch:{ SecurityException -> 0x01cd }
            r0.<init>(r1)     // Catch:{ SecurityException -> 0x01cd }
            throw r0     // Catch:{ SecurityException -> 0x01cd }
        L_0x01cd:
            r6.A02(r5, r4, r8)
            return r16
        L_0x01d1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10984S3u.A01(X.6Rx, X.6Tm):java.util.ArrayList");
    }
}
