package X;

import java.util.Random;

/* renamed from: X.8fV  reason: invalid class name and case insensitive filesystem */
public abstract class C360998fV {
    public static final Random A00 = new Random();

    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Object, X.8fd] */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.1zE.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C3034368u A00(X.C307556Qo r7, java.lang.String r8, java.lang.String r9) {
        /*
            r0 = 1
            X.0qQ.A0B(r7, r0)
            r6 = 0
            if (r8 == 0) goto L_0x0087
            java.lang.Class<X.1xI> r0 = X.AnonymousClass1xI.class
            monitor-enter(r0)
            monitor-exit(r0)
            java.util.Random r0 = A00
            int r3 = r0.nextInt()
            r5 = 0
            r2 = 3
            r7.AT5(r2, r3)
            java.lang.String r0 = "source"
            r7.AT1(r2, r3, r0, r9)
            java.lang.String r0 = "GraphQLBlokParse.parseBloksBundleTreeWithData"
            X.1KZ.A01(r0)
            r7.currentMonotonicTimestamp()
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IOException -> 0x0066 }
            r0.<init>(r8)     // Catch:{ IOException -> 0x0066 }
            android.util.JsonReader r4 = new android.util.JsonReader     // Catch:{ IOException -> 0x0066 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0066 }
            X.8fW r0 = new X.8fW     // Catch:{ all -> 0x005f }
            r0.<init>(r4)     // Catch:{ all -> 0x005f }
            r0.Crg()     // Catch:{ all -> 0x005f }
            X.8fY r0 = X.C361028fY.A00(r0)     // Catch:{ all -> 0x005f }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x005f }
            X.4tN r0 = r0.A00     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x005b
            X.3ew r1 = r0.A00     // Catch:{ all -> 0x005f }
            if (r1 == 0) goto L_0x005b
            r5 = 1
            r7.currentMonotonicTimestamp()     // Catch:{ all -> 0x005f }
            X.8fd r0 = new X.8fd     // Catch:{ all -> 0x005f }
            r0.<init>()     // Catch:{ all -> 0x005f }
            X.68u r0 = X.C3034368u.A02(r0, r1)     // Catch:{ all -> 0x005f }
            r4.close()     // Catch:{ IOException -> 0x0066 }
            r7.AT4(r2, r3)
            X.1KZ.A00()
            return r0
        L_0x005b:
            r4.close()     // Catch:{ IOException -> 0x0066 }
            goto L_0x0075
        L_0x005f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r0 = move-exception
            X.1zE.A00(r4, r1)     // Catch:{ IOException -> 0x0066 }
            throw r0     // Catch:{ IOException -> 0x0066 }
        L_0x0066:
            r1 = move-exception
            java.lang.String r0 = "BloksBundleParser"
            X.1Kn.A03(r0, r1)     // Catch:{ all -> 0x0079 }
            if (r5 == 0) goto L_0x0075
            r7.AT4(r2, r3)
        L_0x0071:
            X.1KZ.A00()
            return r6
        L_0x0075:
            r7.AT3(r2, r3)
            goto L_0x0071
        L_0x0079:
            r0 = move-exception
            if (r5 == 0) goto L_0x0083
            r7.AT4(r2, r3)
        L_0x007f:
            X.1KZ.A00()
            throw r0
        L_0x0083:
            r7.AT3(r2, r3)
            goto L_0x007f
        L_0x0087:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C360998fV.A00(X.6Qo, java.lang.String, java.lang.String):X.68u");
    }
}
