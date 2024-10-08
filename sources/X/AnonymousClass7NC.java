package X;

/* renamed from: X.7NC  reason: invalid class name */
public final class AnonymousClass7NC implements AnonymousClass2h0 {
    public static final AnonymousClass7NC A00 = new Object();

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.6Ar] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.1zE.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0042, code lost:
        X.1zE.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0045, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object AJs(java.io.File r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x0046
            java.io.FileInputStream r7 = new java.io.FileInputStream
            r7.<init>(r9)
            java.nio.channels.FileChannel r6 = r7.getChannel()     // Catch:{ all -> 0x003f }
            long r1 = r9.length()     // Catch:{ all -> 0x0038 }
            int r0 = (int) r1     // Catch:{ all -> 0x0038 }
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r0)     // Catch:{ all -> 0x0038 }
        L_0x0015:
            long r3 = r6.position()     // Catch:{ all -> 0x0038 }
            long r1 = r6.size()     // Catch:{ all -> 0x0038 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0025
            r6.read(r5)     // Catch:{ all -> 0x0038 }
            goto L_0x0015
        L_0x0025:
            r5.flip()     // Catch:{ all -> 0x0038 }
            r6.close()     // Catch:{ all -> 0x003f }
            r7.close()
            X.6Ar r0 = new X.6Ar
            r0.<init>()
            X.2dv r0 = r0.A00(r5)
            return r0
        L_0x0038:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            X.1zE.A00(r6, r1)     // Catch:{ all -> 0x003f }
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            X.1zE.A00(r7, r1)
            throw r0
        L_0x0046:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7NC.AJs(java.io.File):java.lang.Object");
    }
}
