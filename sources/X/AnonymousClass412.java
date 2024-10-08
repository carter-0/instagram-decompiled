package X;

/* renamed from: X.412  reason: invalid class name */
public abstract class AnonymousClass412 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.util.concurrent.Future} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.util.concurrent.Future} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A00(java.util.concurrent.Future r1) {
        /*
            r0 = 0
        L_0x0001:
            java.lang.Object r1 = r1.get()     // Catch:{ InterruptedException -> 0x0006, all -> 0x0012 }
            goto L_0x0008
        L_0x0006:
            r0 = 1
            goto L_0x0001
        L_0x0008:
            if (r0 == 0) goto L_0x0011
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0011:
            return r1
        L_0x0012:
            r1 = move-exception
            if (r0 == 0) goto L_0x001c
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x001c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass412.A00(java.util.concurrent.Future):java.lang.Object");
    }
}
