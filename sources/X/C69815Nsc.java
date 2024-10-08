package X;

/* renamed from: X.Nsc  reason: case insensitive filesystem */
public abstract class C69815Nsc {
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.1zE.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a8, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A00(X.0lg r13, java.io.File r14, X.0sP r15) {
        /*
            r10 = r15
            boolean r4 = X.C51970G9q.A1Y(r15)
            r7 = r14
            java.lang.Object r15 = r15.invoke(r14)
            X.0Tu r9 = X.0Tu.A05
            r0 = 36605834465973573(0x820cd0000d1545, double:3.21301534392139E-306)
            int r1 = X.DbS.A04(r9, r13, r0)
            if (r1 <= 0) goto L_0x00d8
            java.lang.String r6 = ""
            long r2 = r14.length()
            r11 = 0
            java.lang.String r5 = "AttachmentChunker"
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 == 0) goto L_0x00d5
            long r0 = (long) r1
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 < 0) goto L_0x00d5
            java.lang.Object r0 = r10.invoke(r14)
            java.io.File r0 = (java.io.File) r0
            java.lang.String r8 = r0.getCanonicalPath()
            r0 = 36605834466039110(0x820cd0000e1546, double:3.213015343962836E-306)
            int r9 = X.DbS.A04(r9, r13, r0)
            if (r9 <= 0) goto L_0x00d8
            float r1 = (float) r2
            float r0 = (float) r9
            float r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            float r10 = (float) r0
            int r12 = (int) r10
            byte[] r11 = X.C272134kB.A03(r14)
            X.2HY r0 = X.C229632nm.A0C(r4, r12)     // Catch:{ all -> 0x00a9 }
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r0)     // Catch:{ all -> 0x00a9 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x00a9 }
        L_0x0059:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x00af
            r0 = r14
            X.0sh r0 = (X.0sh) r0     // Catch:{ all -> 0x00a9 }
            int r1 = r0.A00()     // Catch:{ all -> 0x00a9 }
            java.lang.String r13 = "@chunk_"
            int r10 = r1 + 1
            java.lang.String r0 = "_of_"
            java.lang.String r0 = X.002.A0o(r8, r13, r0, r10, r12)     // Catch:{ all -> 0x00a9 }
            java.io.File r13 = X.AnonymousClass7TE.A0t(r0)     // Catch:{ all -> 0x00a9 }
            int r1 = r1 * r9
            int r10 = r10 * r9
            int r0 = (int) r2     // Catch:{ all -> 0x00a9 }
            int r0 = java.lang.Math.min(r10, r0)     // Catch:{ all -> 0x00a9 }
            X.2HY r10 = X.C229632nm.A0C(r1, r0)     // Catch:{ all -> 0x00a9 }
            r1 = 0
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x0097
            byte[] r0 = new byte[r1]     // Catch:{ all -> 0x00a9 }
        L_0x0088:
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ all -> 0x00a9 }
            r10.<init>(r13)     // Catch:{ all -> 0x00a9 }
            r10.write(r0)     // Catch:{ all -> 0x00a2 }
            r10.close()     // Catch:{ all -> 0x00a9 }
            r4.add(r13)     // Catch:{ all -> 0x00a9 }
            goto L_0x0059
        L_0x0097:
            int r1 = r10.A00     // Catch:{ all -> 0x00a9 }
            int r0 = r10.A01     // Catch:{ all -> 0x00a9 }
            int r0 = r0 + 1
            byte[] r0 = X.0Yw.A0W(r11, r1, r0)     // Catch:{ all -> 0x00a9 }
            goto L_0x0088
        L_0x00a2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r0 = move-exception
            X.1zE.A00(r10, r1)     // Catch:{ all -> 0x00a9 }
            throw r0     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r0 = move-exception
            X.0eQ r4 = new X.0eQ
            r4.<init>(r0)
        L_0x00af:
            boolean r3 = r4 instanceof X.0eQ
            r0 = r3 ^ 1
            if (r0 == 0) goto L_0x00b8
            r7.getPath()
        L_0x00b8:
            java.lang.Throwable r2 = X.0eR.A00(r4)
            if (r2 == 0) goto L_0x00cb
            java.lang.String r1 = "Failed to chunk "
            java.lang.String r0 = r7.getPath()
            java.lang.String r0 = X.002.A0g(r6, r1, r0)
            X.0KC.A0H(r5, r0, r2)
        L_0x00cb:
            java.util.List r0 = X.AnonymousClass7TE.A1I(r15)
            if (r3 == 0) goto L_0x00d2
            r4 = r0
        L_0x00d2:
            java.util.List r4 = (java.util.List) r4
            return r4
        L_0x00d5:
            r14.getPath()
        L_0x00d8:
            java.util.List r4 = X.AnonymousClass7TE.A1I(r15)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69815Nsc.A00(X.0lg, java.io.File, X.0sP):java.util.List");
    }
}
