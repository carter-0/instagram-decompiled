package X;

public final class T7Z implements 1NU {
    public final int A00;
    public final Object A01;

    public T7Z(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [X.T6E, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0091, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c1, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c4, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d7, code lost:
        if (r7 == null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00dc, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00dd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00de, code lost:
        X.C9153RRe.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e1, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012e, code lost:
        return new X.1QY(((X.AnonymousClass1O8) r8.A01).A00).then(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0159, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x015a, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x015d, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object then(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x012f;
                case 1: goto L_0x011b;
                case 2: goto L_0x0117;
                case 3: goto L_0x00e2;
                case 4: goto L_0x0093;
                case 5: goto L_0x00c5;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.2ZL r9 = (X.2ZL) r9
            X.1Qb r7 = r9.A00()
            r7.getClass()
            X.2S1 r6 = X.AnonymousClass2S1.A02     // Catch:{ all -> 0x0091 }
            java.lang.Object r0 = r8.A01     // Catch:{ all -> 0x0091 }
            X.RAV r0 = (X.RAV) r0     // Catch:{ all -> 0x0091 }
            android.net.Uri r0 = r0.A00     // Catch:{ all -> 0x0091 }
            java.io.InputStream r5 = r7.AjD()     // Catch:{ all -> 0x0091 }
            monitor-enter(r6)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008e }
            int r0 = r0.hashCode()     // Catch:{ all -> 0x008e }
            java.lang.String r1 = java.lang.Integer.toHexString(r0)     // Catch:{ all -> 0x008e }
            X.1JG r0 = X.AnonymousClass2S1.A00(r6)     // Catch:{ all -> 0x008e }
            boolean r0 = r0.CJV(r1)     // Catch:{ all -> 0x008e }
            if (r0 != 0) goto L_0x0083
            X.1JG r0 = X.AnonymousClass2S1.A00(r6)     // Catch:{ all -> 0x008e }
            X.2ic r4 = r0.AR2(r1)     // Catch:{ all -> 0x008e }
            java.lang.Object r0 = r4.A00     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0083
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r0]     // Catch:{ Exception -> 0x0066 }
        L_0x0041:
            int r2 = r5.read(r3)     // Catch:{ Exception -> 0x0066 }
            r0 = -1
            if (r2 == r0) goto L_0x0053
            java.lang.Object r1 = r4.A00()     // Catch:{ Exception -> 0x0066 }
            X.3Ey r1 = (X.AnonymousClass3Ey) r1     // Catch:{ Exception -> 0x0066 }
            r0 = 0
            r1.write(r3, r0, r2)     // Catch:{ Exception -> 0x0066 }
            goto L_0x0041
        L_0x0053:
            r5.close()     // Catch:{ Exception -> 0x0066 }
            java.lang.Object r0 = r4.A00()     // Catch:{ Exception -> 0x0066 }
            X.3Ey r0 = (X.AnonymousClass3Ey) r0     // Catch:{ Exception -> 0x0066 }
            r0.A03()     // Catch:{ Exception -> 0x0066 }
            java.lang.Object r0 = r4.A00()     // Catch:{ all -> 0x008e }
            X.3Ey r0 = (X.AnonymousClass3Ey) r0     // Catch:{ all -> 0x008e }
            goto L_0x0074
        L_0x0066:
            r2 = move-exception
            java.lang.String r1 = "IgVideoSubtitleCache"
            java.lang.String r0 = "failed to add subtitle to cache"
            X.0wb.A06(r1, r0, r2)     // Catch:{ all -> 0x0078 }
            java.lang.Object r0 = r4.A00()     // Catch:{ all -> 0x008e }
            X.3Ey r0 = (X.AnonymousClass3Ey) r0     // Catch:{ all -> 0x008e }
        L_0x0074:
            r0.A02()     // Catch:{ all -> 0x008e }
            goto L_0x0083
        L_0x0078:
            r1 = move-exception
            java.lang.Object r0 = r4.A00()     // Catch:{ all -> 0x008e }
            X.3Ey r0 = (X.AnonymousClass3Ey) r0     // Catch:{ all -> 0x008e }
            r0.A02()     // Catch:{ all -> 0x008e }
            throw r1     // Catch:{ all -> 0x008e }
        L_0x0083:
            monitor-exit(r6)     // Catch:{ all -> 0x0091 }
            X.1XQ r3 = new X.1XQ     // Catch:{ all -> 0x0091 }
            r3.<init>()     // Catch:{ all -> 0x0091 }
            r0 = 200(0xc8, float:2.8E-43)
            r3.mStatusCode = r0     // Catch:{ all -> 0x0091 }
            goto L_0x00c1
        L_0x008e:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0091 }
            throw r0     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r1 = move-exception
            goto L_0x00d9
        L_0x0093:
            X.2ZL r9 = (X.2ZL) r9
            X.1Qb r7 = r9.A00()
            r0 = 0
            X.T6E r3 = new X.T6E     // Catch:{ all -> 0x00d6 }
            r3.<init>()     // Catch:{ all -> 0x00d6 }
            if (r7 == 0) goto L_0x00a9
            java.io.InputStream r0 = r7.AjD()     // Catch:{ all -> 0x00d6 }
            byte[] r0 = com.instagram.react.modules.base.IgNetworkingModule.inputStreamToByteArray(r0)     // Catch:{ all -> 0x00d6 }
        L_0x00a9:
            r3.A01 = r0     // Catch:{ all -> 0x00d6 }
            int r0 = r9.A02     // Catch:{ all -> 0x00d6 }
            r3.A00 = r0     // Catch:{ all -> 0x00d6 }
            java.util.List r1 = r9.A04     // Catch:{ all -> 0x00d6 }
            int r0 = r1.size()     // Catch:{ all -> 0x00d6 }
            X.1Fn[] r0 = new X.1Fn[r0]     // Catch:{ all -> 0x00d6 }
            java.lang.Object[] r0 = r1.toArray(r0)     // Catch:{ all -> 0x00d6 }
            X.1Fn[] r0 = (X.1Fn[]) r0     // Catch:{ all -> 0x00d6 }
            r3.A02 = r0     // Catch:{ all -> 0x00d6 }
            if (r7 == 0) goto L_0x00d5
        L_0x00c1:
            r7.close()
            return r3
        L_0x00c5:
            r0 = 0
            X.0qQ.A0B(r9, r0)
            java.lang.Object r0 = r8.A01
            X.4D7 r0 = (X.AnonymousClass4D7) r0
            r0.resumeWith(r9)
            X.1XQ r3 = new X.1XQ
            r3.<init>()
        L_0x00d5:
            return r3
        L_0x00d6:
            r1 = move-exception
            if (r7 == 0) goto L_0x00e1
        L_0x00d9:
            r7.close()     // Catch:{ all -> 0x00dd }
            throw r1
        L_0x00dd:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)
        L_0x00e1:
            throw r1
        L_0x00e2:
            X.2ZL r9 = (X.2ZL) r9
            r0 = 0
            X.0qQ.A0B(r9, r0)
            X.1Qb r0 = r9.A00()
            if (r0 == 0) goto L_0x0112
            java.io.InputStream r0 = r0.AjD()
            java.io.BufferedReader r3 = X.Pxg.A0X(r0)
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            r1 = 45
            X.PmD r0 = new X.PmD
            r0.<init>(r2, r1)
            X.1r9.A01(r3, r0)
            java.lang.String r0 = X.DbT.A10(r2)
            X.R8t r3 = new X.R8t
            r3.<init>(r0)
            int r0 = r9.A02
            r3.mStatusCode = r0
            return r3
        L_0x0112:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x0117:
            X.0qQ.A0A(r9)
            goto L_0x011f
        L_0x011b:
            r0 = 0
            X.0qQ.A0B(r9, r0)
        L_0x011f:
            java.lang.Object r0 = r8.A01
            X.1O8 r0 = (X.AnonymousClass1O8) r0
            X.1O9 r1 = r0.A00
            X.1QY r0 = new X.1QY
            r0.<init>(r1)
            java.lang.Object r3 = r0.then(r9)
            return r3
        L_0x012f:
            X.2ZL r9 = (X.2ZL) r9
            r0 = 0
            X.0qQ.A0B(r9, r0)
            X.1Qb r0 = r9.A00()
            if (r0 == 0) goto L_0x015e
            java.io.InputStream r2 = r0.AjD()
            java.io.ByteArrayOutputStream r0 = X.Pxe.A0b()     // Catch:{ all -> 0x0157 }
            byte[] r0 = r0.toByteArray()     // Catch:{ all -> 0x0157 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x0157 }
            X.R8s r3 = new X.R8s     // Catch:{ all -> 0x0157 }
            r3.<init>(r0)     // Catch:{ all -> 0x0157 }
            int r0 = r9.A02     // Catch:{ all -> 0x0157 }
            r3.mStatusCode = r0     // Catch:{ all -> 0x0157 }
            r2.close()
            return r3
        L_0x0157:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0159 }
        L_0x0159:
            r0 = move-exception
            X.1zE.A00(r2, r1)
            throw r0
        L_0x015e:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T7Z.then(java.lang.Object):java.lang.Object");
    }
}
