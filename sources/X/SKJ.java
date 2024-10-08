package X;

import java.io.File;

public final class SKJ {
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.OutputStream, java.io.Closeable, java.io.BufferedOutputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(java.io.InputStream r11, java.lang.String r12) {
        /*
            r10 = 0
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x00c1 }
            r3.<init>(r11)     // Catch:{ all -> 0x00c1 }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00c4 }
            r4.<init>(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r0 = ""
            A01(r12, r0)     // Catch:{ all -> 0x00be }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r7 = new byte[r0]     // Catch:{ all -> 0x00be }
            r6 = 0
            r9 = 0
        L_0x0016:
            java.util.zip.ZipEntry r1 = r3.getNextEntry()     // Catch:{ all -> 0x00be }
            if (r1 == 0) goto L_0x00b7
            java.lang.String r8 = r1.getName()     // Catch:{ all -> 0x00be }
            X.0qQ.A0A(r8)     // Catch:{ all -> 0x00be }
            java.lang.String r0 = ".."
            java.lang.String r2 = java.io.File.separator     // Catch:{ all -> 0x00be }
            java.lang.String r0 = X.002.A0R(r0, r2)     // Catch:{ all -> 0x00be }
            boolean r0 = X.00l.A0d(r8, r0, r6)     // Catch:{ all -> 0x00be }
            if (r0 != 0) goto L_0x00a8
            boolean r0 = r1.isDirectory()     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x003b
            A01(r12, r8)     // Catch:{ all -> 0x00be }
            goto L_0x0016
        L_0x003b:
            X.0qQ.A08(r2)     // Catch:{ all -> 0x00be }
            int r0 = X.C66581MXm.A04(r8)     // Catch:{ all -> 0x00be }
            int r0 = r0 + -1
            int r0 = X.00l.A07(r8, r2, r0)     // Catch:{ all -> 0x00be }
            r5 = -1
            if (r0 == r5) goto L_0x005a
            java.lang.String r0 = X.C51967G9n.A0q(r8, r6, r0)     // Catch:{ all -> 0x00be }
            java.lang.String r0 = X.002.A0g(r12, r2, r0)     // Catch:{ all -> 0x00be }
            java.io.File r0 = X.AnonymousClass7TE.A0t(r0)     // Catch:{ all -> 0x00be }
            r0.mkdirs()     // Catch:{ all -> 0x00be }
        L_0x005a:
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00be }
            r0.<init>(r12, r8)     // Catch:{ all -> 0x00be }
            java.lang.String r1 = X.JTP.A0u(r0)     // Catch:{ all -> 0x00be }
            java.io.File r0 = X.AnonymousClass7TE.A0t(r12)     // Catch:{ all -> 0x00be }
            java.lang.String r0 = X.JTP.A0u(r0)     // Catch:{ all -> 0x00be }
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x00b0
            java.lang.String r0 = X.002.A0g(r12, r2, r8)     // Catch:{ all -> 0x009c }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x009c }
            r2.<init>(r0)     // Catch:{ all -> 0x009c }
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x009a }
            r1.<init>(r2)     // Catch:{ all -> 0x009a }
        L_0x007f:
            int r0 = r4.read(r7)     // Catch:{ all -> 0x0097 }
            if (r0 == r5) goto L_0x008a
            r1.write(r7, r6, r0)     // Catch:{ all -> 0x0097 }
            int r9 = r9 + r0
            goto L_0x007f
        L_0x008a:
            r1.flush()     // Catch:{ all -> 0x0097 }
            r3.closeEntry()     // Catch:{ all -> 0x00be }
            X.C9234RUl.A00(r1)     // Catch:{ all -> 0x00be }
            X.C9234RUl.A00(r2)     // Catch:{ all -> 0x00be }
            goto L_0x0016
        L_0x0097:
            r0 = move-exception
            r10 = r1
            goto L_0x009e
        L_0x009a:
            r0 = move-exception
            goto L_0x009e
        L_0x009c:
            r0 = move-exception
            r2 = r10
        L_0x009e:
            r3.closeEntry()     // Catch:{ all -> 0x00be }
            X.C9234RUl.A00(r10)     // Catch:{ all -> 0x00be }
            X.C9234RUl.A00(r2)     // Catch:{ all -> 0x00be }
            goto L_0x00b6
        L_0x00a8:
            java.lang.String r0 = "zipEntryName contains ../"
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ all -> 0x00be }
            goto L_0x00b6
        L_0x00b0:
            java.lang.String r0 = "ZIP input flows into path traversal sink. The generated file doesn't start with "
            java.io.IOException r0 = X.Pxg.A0Z(r0, r12)     // Catch:{ all -> 0x00be }
        L_0x00b6:
            throw r0     // Catch:{ all -> 0x00be }
        L_0x00b7:
            X.C9234RUl.A00(r4)
            X.C9234RUl.A00(r3)
            return r9
        L_0x00be:
            r0 = move-exception
            r10 = r4
            goto L_0x00c5
        L_0x00c1:
            r0 = move-exception
            r3 = r10
            goto L_0x00c5
        L_0x00c4:
            r0 = move-exception
        L_0x00c5:
            X.C9234RUl.A00(r10)
            X.C9234RUl.A00(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SKJ.A00(java.io.InputStream, java.lang.String):int");
    }

    public static final void A01(String str, String str2) {
        File A0t = AnonymousClass7TE.A0t(002.A0g(str, File.separator, str2));
        if (!A0t.isDirectory()) {
            A0t.mkdirs();
        }
    }
}
