package X;

public final class WH8 implements AnonymousClass2h0 {
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.6Ar] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        throw r0;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object AJs(java.io.File r5) {
        /*
            r4 = this;
            r3 = 0
            if (r5 == 0) goto L_0x0033
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException | SecurityException -> 0x0033 }
            r2.<init>(r5)     // Catch:{ FileNotFoundException | SecurityException -> 0x0033 }
            byte[] r0 = X.15P.A00(r2)     // Catch:{ all -> 0x002c }
            r2.close()     // Catch:{ FileNotFoundException | SecurityException -> 0x0033 }
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r0)
            if (r1 == 0) goto L_0x0033
            X.6Ar r0 = new X.6Ar     // Catch:{  }
            r0.<init>()     // Catch:{  }
            X.2dv r0 = r0.A00(r1)     // Catch:{  }
            X.UJd r2 = new X.UJd
            r2.<init>(r0, r1)
            X.1T3 r1 = X.C249903kY.A06
            X.1T7 r0 = X.C249903kY.A05
            X.3kY r3 = X.C249903kY.A00(r0, r1, r2)
            return r3
        L_0x002c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002e }
        L_0x002e:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ FileNotFoundException | SecurityException -> 0x0033 }
            throw r0     // Catch:{ FileNotFoundException | SecurityException -> 0x0033 }
        L_0x0033:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WH8.AJs(java.io.File):java.lang.Object");
    }
}
