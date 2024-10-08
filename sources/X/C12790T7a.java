package X;

/* renamed from: X.T7a  reason: case insensitive filesystem */
public class C12790T7a implements 1NU {
    public final int A00;
    public final C13758TgU A01;
    public final 0sP A02;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.1zE.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        throw r0;
     */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.XEF then(X.2ZL r6) {
        /*
            r5 = this;
            int r0 = r5.A00     // Catch:{ RuntimeException -> 0x0065 }
            r4 = -1
            if (r0 > 0) goto L_0x0029
            if (r6 == 0) goto L_0x0051
            X.1Qb r0 = r6.A00()     // Catch:{ RuntimeException -> 0x0065 }
            if (r0 == 0) goto L_0x0051
            java.io.InputStream r3 = r0.AjD()     // Catch:{ RuntimeException -> 0x0065 }
        L_0x0011:
            int r1 = r3.available()     // Catch:{ all -> 0x0047 }
            r0 = 4096(0x1000, float:5.74E-42)
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x0047 }
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x0047 }
            int r1 = r3.read(r2)     // Catch:{ all -> 0x0047 }
            if (r1 == r4) goto L_0x004e
            X.TgU r0 = r5.A01     // Catch:{ all -> 0x0047 }
            r0.parseByteArray(r2, r1)     // Catch:{ all -> 0x0047 }
            goto L_0x0011
        L_0x0029:
            byte[] r2 = new byte[r0]     // Catch:{ RuntimeException -> 0x0065 }
            if (r6 == 0) goto L_0x0051
            X.1Qb r0 = r6.A00()     // Catch:{ RuntimeException -> 0x0065 }
            if (r0 == 0) goto L_0x0051
            java.io.InputStream r3 = r0.AjD()     // Catch:{ RuntimeException -> 0x0065 }
            int r1 = r3.read(r2)     // Catch:{ all -> 0x0047 }
        L_0x003b:
            if (r1 == r4) goto L_0x004e
            X.TgU r0 = r5.A01     // Catch:{ all -> 0x0047 }
            r0.parseByteArray(r2, r1)     // Catch:{ all -> 0x0047 }
            int r1 = r3.read(r2)     // Catch:{ all -> 0x0047 }
            goto L_0x003b
        L_0x0047:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            X.1zE.A00(r3, r1)     // Catch:{ RuntimeException -> 0x0065 }
            throw r0     // Catch:{ RuntimeException -> 0x0065 }
        L_0x004e:
            r3.close()     // Catch:{ RuntimeException -> 0x0065 }
        L_0x0051:
            X.0sP r2 = r5.A02     // Catch:{ RuntimeException -> 0x0065 }
            X.TgU r1 = r5.A01     // Catch:{ RuntimeException -> 0x0065 }
            java.lang.Class<X.XEE> r0 = X.XEE.class
            com.facebook.pando.TreeJNI r0 = r1.complete(r0)     // Catch:{ RuntimeException -> 0x0065 }
            X.0qQ.A07(r0)     // Catch:{ RuntimeException -> 0x0065 }
            java.lang.Object r0 = r2.invoke(r0)     // Catch:{ RuntimeException -> 0x0065 }
            X.XEF r0 = (X.XEF) r0     // Catch:{ RuntimeException -> 0x0065 }
            return r0
        L_0x0065:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12790T7a.then(X.2ZL):X.XEF");
    }

    public C12790T7a(C13758TgU tgU, 0sP r2, int i) {
        this.A02 = r2;
        this.A01 = tgU;
        this.A00 = i;
    }
}
