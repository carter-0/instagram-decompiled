package X;

import java.util.Map;

public abstract class SQM {
    public static final Map A00 = AnonymousClass7TE.A1E();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.QHX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.QHX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.QHX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.QHX} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized X.SQM A00(java.lang.String r5) {
        /*
            java.lang.Class<X.SQM> r4 = X.SQM.class
            monitor-enter(r4)
            java.util.Map r3 = A00     // Catch:{ all -> 0x0031 }
            java.lang.Object r2 = r3.get(r5)     // Catch:{ all -> 0x0031 }
            X.SQM r2 = (X.SQM) r2     // Catch:{ all -> 0x0031 }
            if (r2 != 0) goto L_0x002f
            java.lang.String r0 = "fbsdk_logged_out_id"
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x001e
            X.QHW r2 = new X.QHW     // Catch:{ all -> 0x0031 }
            r2.<init>()     // Catch:{ all -> 0x0031 }
        L_0x001a:
            r3.put(r5, r2)     // Catch:{ all -> 0x0031 }
            goto L_0x002f
        L_0x001e:
            android.content.Context r0 = X.AnonymousClass1KO.A00     // Catch:{ all -> 0x0031 }
            X.07t r1 = X.AnonymousClass07t.A00(r0)     // Catch:{ all -> 0x0031 }
            X.Rnt r0 = new X.Rnt     // Catch:{ all -> 0x0031 }
            r0.<init>(r5)     // Catch:{ all -> 0x0031 }
            X.QHX r2 = new X.QHX     // Catch:{ all -> 0x0031 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x0031 }
            goto L_0x001a
        L_0x002f:
            monitor-exit(r4)
            return r2
        L_0x0031:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SQM.A00(java.lang.String):X.SQM");
    }

    public static synchronized void A01() {
        synchronized (SQM.class) {
            A00.clear();
        }
    }
}
