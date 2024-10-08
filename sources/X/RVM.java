package X;

public abstract class RVM {
    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(1:(0))) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r2.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r2 != null) goto L_0x001e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0013 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(android.content.Context r3, X.XRw r4) {
        /*
            r2 = 0
            r1 = 0
            int r0 = r4.A00     // Catch:{ NotFoundException -> 0x0013 }
            int[] r0 = new int[]{r0}     // Catch:{ NotFoundException -> 0x0013 }
            android.content.res.TypedArray r2 = r3.obtainStyledAttributes(r0)     // Catch:{ NotFoundException -> 0x0013 }
            int r0 = r4.A01     // Catch:{ NotFoundException -> 0x0013 }
            int r0 = r2.getColor(r1, r0)     // Catch:{ NotFoundException -> 0x0013 }
            goto L_0x0017
        L_0x0013:
            int r0 = r4.A01     // Catch:{ all -> 0x001b }
            if (r2 == 0) goto L_0x001a
        L_0x0017:
            r2.recycle()
        L_0x001a:
            return r0
        L_0x001b:
            r0 = move-exception
            if (r2 == 0) goto L_0x0021
            r2.recycle()
        L_0x0021:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RVM.A00(android.content.Context, X.XRw):int");
    }
}
