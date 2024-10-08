package X;

public final class NRC extends 0ng {
    public final /* synthetic */ C292835jb A00;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r7.markerAnnotate(43257040, "error", r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        r1 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0050 A[ExcHandler: IOException (r0v3 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:1:0x0015] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            java.lang.String r9 = "error"
            X.5jb r8 = r14.A00
            com.facebook.quicklog.LightweightQuickPerformanceLogger r7 = r8.A05
            r6 = 43257040(0x2940cd0, float:2.1754E-37)
            r7.markerStart(r6)
            long r0 = r8.A01
            java.lang.String r2 = "max_alloc_bytes"
            r7.markerAnnotate(r6, r2, r0)
            r5 = 3
            r4 = 0
            android.content.Context r1 = X.C60960kU.A00     // Catch:{ IOException -> 0x0050, all -> 0x0065 }
            java.lang.Class<android.os.storage.StorageManager> r0 = android.os.storage.StorageManager.class
            java.lang.Object r11 = r1.getSystemService(r0)     // Catch:{ IOException -> 0x0050, all -> 0x0065 }
            android.os.storage.StorageManager r11 = (android.os.storage.StorageManager) r11     // Catch:{ IOException -> 0x0050, all -> 0x0065 }
            if (r11 == 0) goto L_0x004a
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo()     // Catch:{ IOException -> 0x0050, all -> 0x0065 }
            java.lang.String r0 = r0.dataDir     // Catch:{ IOException -> 0x0050, all -> 0x0065 }
            java.io.File r0 = X.AnonymousClass7TE.A0t(r0)     // Catch:{ IOException -> 0x0050, all -> 0x0065 }
            java.util.UUID r10 = r11.getUuidForPath(r0)     // Catch:{ IOException -> 0x0050, all -> 0x0065 }
            long r2 = r11.getAllocatableBytes(r10)     // Catch:{ IOException -> 0x0050, all -> 0x0065 }
            java.lang.String r0 = "allocatable_bytes"
            r7.markerAnnotate(r6, r0, r2)     // Catch:{ IOException -> 0x0050, all -> 0x0065 }
            r12 = 0
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0048
            long r0 = r8.A01     // Catch:{ IOException -> 0x0050, all -> 0x0065 }
            long r0 = java.lang.Math.min(r2, r0)     // Catch:{ IOException -> 0x0050, all -> 0x0065 }
            r11.allocateBytes(r10, r0)     // Catch:{ IOException -> 0x0050, all -> 0x0065 }
            goto L_0x0059
        L_0x0048:
            r5 = 4
            goto L_0x005a
        L_0x004a:
            java.lang.String r0 = "StorageManager not available"
            r7.markerAnnotate(r6, r9, r0)     // Catch:{ IOException -> 0x0050 }
            goto L_0x005a
        L_0x0050:
            r0 = move-exception
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0063 }
            r7.markerAnnotate(r6, r9, r0)     // Catch:{ all -> 0x0063 }
            goto L_0x005a
        L_0x0059:
            r5 = 2
        L_0x005a:
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.A09
            r0.set(r4)
            r7.markerEnd(r6, r5)
            return
        L_0x0063:
            r1 = move-exception
            goto L_0x0068
        L_0x0065:
            r1 = move-exception
            r5 = 51
        L_0x0068:
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.A09
            r0.set(r4)
            r7.markerEnd(r6, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NRC.run():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NRC(C292835jb r2) {
        super(389273222);
        this.A00 = r2;
    }
}
