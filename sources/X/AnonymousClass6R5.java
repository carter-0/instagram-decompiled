package X;

import java.util.concurrent.Callable;

/* renamed from: X.6R5  reason: invalid class name */
public final class AnonymousClass6R5 implements Callable {
    public final /* synthetic */ AnonymousClass6R2 A00;

    public AnonymousClass6R5(AnonymousClass6R2 r1) {
        this.A00 = r1;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0081, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r11 = this;
            java.lang.String r2 = "BloksComponentQueryDiskCache"
            java.lang.String r1 = "initialize_metadata"
            X.6R2 r5 = r11.A00
            r0 = 58
            java.lang.String r0 = X.002.A0T(r2, r1, r0)     // Catch:{ all -> 0x0086 }
            X.1KZ.A01(r0)     // Catch:{ all -> 0x0086 }
            X.6R1 r0 = r5.A01     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "__disk_metadata"
            com.facebook.stash.core.Stash r0 = r0.A00     // Catch:{ all -> 0x0086 }
            byte[] r0 = r0.readResourceToMemory(r1)     // Catch:{ all -> 0x0086 }
            if (r0 != 0) goto L_0x005b
            X.0sm r1 = X.0Yt.A0E()     // Catch:{ all -> 0x0086 }
        L_0x001f:
            X.0JR r0 = r5.A02     // Catch:{ all -> 0x0086 }
            long r9 = r0.now()     // Catch:{ all -> 0x0086 }
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0086 }
            r7.<init>()     // Catch:{ all -> 0x0086 }
            java.util.Set r0 = r1.entrySet()     // Catch:{ all -> 0x0086 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x0086 }
        L_0x0032:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0074
            java.lang.Object r6 = r8.next()     // Catch:{ all -> 0x0086 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ all -> 0x0086 }
            java.lang.Object r0 = r6.getValue()     // Catch:{ all -> 0x0086 }
            X.Q41 r0 = (X.Q41) r0     // Catch:{ all -> 0x0086 }
            long r0 = r0.A00     // Catch:{ all -> 0x0086 }
            long r3 = r9 - r0
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0032
            java.lang.Object r1 = r6.getKey()     // Catch:{ all -> 0x0086 }
            java.lang.Object r0 = r6.getValue()     // Catch:{ all -> 0x0086 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0086 }
            goto L_0x0032
        L_0x005b:
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0086 }
            r2.<init>(r0)     // Catch:{ all -> 0x0086 }
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch:{ all -> 0x007f }
            r0.<init>(r2)     // Catch:{ all -> 0x007f }
            java.lang.Object r1 = r0.readObject()     // Catch:{ all -> 0x007f }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, com.instagram.common.bloks.componentquery.cache.DiskCacheMetadata>"
            X.0qQ.A0C(r1, r0)     // Catch:{ all -> 0x007f }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x007f }
            r2.close()     // Catch:{ all -> 0x0086 }
            goto L_0x001f
        L_0x0074:
            java.util.concurrent.atomic.AtomicReference r0 = r5.A05     // Catch:{ all -> 0x0086 }
            r0.set(r7)     // Catch:{ all -> 0x0086 }
            X.1KZ.A00()
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x007f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ all -> 0x0086 }
            throw r0     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r0 = move-exception
            X.1KZ.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6R5.call():java.lang.Object");
    }
}
