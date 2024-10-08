package X;

import java.util.concurrent.CopyOnWriteArraySet;

public final class TL0 implements Runnable {
    public final CopyOnWriteArraySet A00 = new CopyOnWriteArraySet();
    public final RR6 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        r5.A01 = r3;
        r5.A00 = r4;
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        r5.A01 = r3;
        r5.A00 = r4;
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        r11 = 180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        r9 = X.C227792jv.A01(r0);
        r2 = new android.graphics.BitmapFactory.Options();
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007c, code lost:
        if ((r7 / r1) > r4) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0080, code lost:
        if ((r6 / r1) > r3) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        r2.inSampleSize = r1;
        r2.inJustDecodeBounds = false;
        r8 = A00(r2);
        r3 = r5.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008f, code lost:
        r1 = r1 * 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0094, code lost:
        if (r8 != null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        X.0KC.A0O("HighQualityBitmapManager", "Failed to decode high quality bitmap: %s", new java.lang.Object[]{r3});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009f, code lost:
        X.C11156SCl.A01.remove(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a4, code lost:
        if (r8 == null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a7, code lost:
        r1 = X.AnonymousClass7TE.A11(X.002.A0R(r3, ": on decoding high quality bitmap is null"));
        r0 = X.C11156SCl.A00;
        r7 = new X.C13012THu(r13, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b9, code lost:
        r0 = X.C11156SCl.A00;
        r7 = new X.TKS(r8, r9, r10, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c0, code lost:
        r0.post(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            r10 = r13
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException | SecurityException -> 0x00df }
            r0.<init>()     // Catch:{ IOException | SecurityException -> 0x00df }
            r9 = 1
            r0.inJustDecodeBounds = r9     // Catch:{ IOException | SecurityException -> 0x00df }
            r13.A00(r0)     // Catch:{ IOException | SecurityException -> 0x00df }
            int r7 = r0.outWidth     // Catch:{ IOException | SecurityException -> 0x00df }
            int r6 = r0.outHeight     // Catch:{ IOException | SecurityException -> 0x00df }
            X.RR6 r5 = r13.A01     // Catch:{ IOException | SecurityException -> 0x00df }
            int r4 = r5.A01     // Catch:{ IOException | SecurityException -> 0x00df }
            int r3 = r5.A00     // Catch:{ IOException | SecurityException -> 0x00df }
            boolean r0 = r5 instanceof X.RBZ     // Catch:{ IOException | SecurityException -> 0x00df }
            if (r0 == 0) goto L_0x0033
            boolean r0 = X.C227922kK.A0N     // Catch:{ IOException | SecurityException -> 0x00df }
            r0 = r5
            X.RBZ r0 = (X.RBZ) r0     // Catch:{ IOException | SecurityException -> 0x00df }
            java.lang.String r1 = r0.A00     // Catch:{ IOException | SecurityException -> 0x00df }
            X.2kK r0 = new X.2kK     // Catch:{ IOException | SecurityException -> 0x00df }
            r0.<init>((java.lang.String) r1)     // Catch:{ IOException | SecurityException -> 0x00df }
        L_0x0026:
            java.lang.String r1 = "Orientation"
            int r1 = r0.A0M(r1, r9)     // Catch:{ IOException | SecurityException -> 0x00df }
            r11 = 90
            r8 = 0
            switch(r1) {
                case 2: goto L_0x006c;
                case 3: goto L_0x0068;
                case 4: goto L_0x0066;
                case 5: goto L_0x0060;
                case 6: goto L_0x0058;
                case 7: goto L_0x005e;
                case 8: goto L_0x0056;
                default: goto L_0x0032;
            }     // Catch:{ IOException | SecurityException -> 0x00df }
        L_0x0032:
            goto L_0x006e
        L_0x0033:
            boolean r0 = r5 instanceof X.C8824RBa     // Catch:{ IOException | SecurityException -> 0x00df }
            if (r0 == 0) goto L_0x00cb
            r0 = r5
            X.RBa r0 = (X.C8824RBa) r0     // Catch:{ IOException | SecurityException -> 0x00df }
            android.content.ContentResolver r1 = r0.A00     // Catch:{ IOException | SecurityException -> 0x00df }
            android.net.Uri r8 = r0.A01     // Catch:{ IOException | SecurityException -> 0x00df }
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r2 = r1.openAssetFileDescriptor(r8, r0)     // Catch:{ IOException | SecurityException -> 0x00df }
            if (r2 == 0) goto L_0x00d0
            boolean r0 = X.C227922kK.A0N     // Catch:{ all -> 0x00c4 }
            java.io.FileDescriptor r1 = r2.getFileDescriptor()     // Catch:{ all -> 0x00c4 }
            X.2kK r0 = new X.2kK     // Catch:{ all -> 0x00c4 }
            r0.<init>((java.io.FileDescriptor) r1)     // Catch:{ all -> 0x00c4 }
            r2.close()     // Catch:{ IOException | SecurityException -> 0x00df }
            goto L_0x0026
        L_0x0056:
            r11 = 270(0x10e, float:3.78E-43)
        L_0x0058:
            r5.A01 = r3     // Catch:{ IOException | SecurityException -> 0x00df }
            r5.A00 = r4     // Catch:{ IOException | SecurityException -> 0x00df }
            r12 = 0
            goto L_0x0070
        L_0x005e:
            r11 = -90
        L_0x0060:
            r5.A01 = r3     // Catch:{ IOException | SecurityException -> 0x00df }
            r5.A00 = r4     // Catch:{ IOException | SecurityException -> 0x00df }
            r12 = 1
            goto L_0x0070
        L_0x0066:
            r12 = 1
            goto L_0x0069
        L_0x0068:
            r12 = 0
        L_0x0069:
            r11 = 180(0xb4, float:2.52E-43)
            goto L_0x0070
        L_0x006c:
            r12 = 1
            goto L_0x006f
        L_0x006e:
            r12 = 0
        L_0x006f:
            r11 = 0
        L_0x0070:
            X.9Iu r9 = X.C227792jv.A01(r0)     // Catch:{ IOException | SecurityException -> 0x00df }
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch:{ IOException | SecurityException -> 0x00df }
            r2.<init>()     // Catch:{ IOException | SecurityException -> 0x00df }
            r1 = 1
        L_0x007a:
            int r0 = r7 / r1
            if (r0 > r4) goto L_0x008f
            int r0 = r6 / r1
            if (r0 > r3) goto L_0x008f
            r2.inSampleSize = r1     // Catch:{ IOException | SecurityException -> 0x00df }
            r2.inJustDecodeBounds = r8     // Catch:{ IOException | SecurityException -> 0x00df }
            android.graphics.Bitmap r8 = r13.A00(r2)     // Catch:{ IOException | SecurityException -> 0x00df }
            java.lang.String r3 = r5.toString()     // Catch:{ IOException | SecurityException -> 0x00df }
            goto L_0x0092
        L_0x008f:
            int r1 = r1 * 2
            goto L_0x007a
        L_0x0092:
            java.lang.String r2 = "HighQualityBitmapManager"
            if (r8 != 0) goto L_0x009f
            java.lang.String r1 = "Failed to decode high quality bitmap: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r3}     // Catch:{ IOException | SecurityException -> 0x00df }
            X.0KC.A0O(r2, r1, r0)     // Catch:{ IOException | SecurityException -> 0x00df }
        L_0x009f:
            java.util.concurrent.ConcurrentHashMap r0 = X.C11156SCl.A01     // Catch:{ IOException | SecurityException -> 0x00df }
            r0.remove(r3)     // Catch:{ IOException | SecurityException -> 0x00df }
            if (r8 == 0) goto L_0x00a7
            goto L_0x00b9
        L_0x00a7:
            java.lang.String r0 = ": on decoding high quality bitmap is null"
            java.lang.String r0 = X.002.A0R(r3, r0)     // Catch:{ IOException | SecurityException -> 0x00df }
            java.lang.NullPointerException r1 = X.AnonymousClass7TE.A11(r0)     // Catch:{ IOException | SecurityException -> 0x00df }
            android.os.Handler r0 = X.C11156SCl.A00     // Catch:{ IOException | SecurityException -> 0x00df }
            X.THu r7 = new X.THu     // Catch:{ IOException | SecurityException -> 0x00df }
            r7.<init>(r13, r1)     // Catch:{ IOException | SecurityException -> 0x00df }
            goto L_0x00c0
        L_0x00b9:
            android.os.Handler r0 = X.C11156SCl.A00     // Catch:{ IOException | SecurityException -> 0x00df }
            X.TKS r7 = new X.TKS     // Catch:{ IOException | SecurityException -> 0x00df }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ IOException | SecurityException -> 0x00df }
        L_0x00c0:
            r0.post(r7)     // Catch:{ IOException | SecurityException -> 0x00df }
            return
        L_0x00c4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ IOException | SecurityException -> 0x00df }
            goto L_0x00de
        L_0x00cb:
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ IOException | SecurityException -> 0x00df }
            goto L_0x00de
        L_0x00d0:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ IOException | SecurityException -> 0x00df }
            java.lang.String r0 = "Failed to open file descriptor for "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r8, r0, r1)     // Catch:{ IOException | SecurityException -> 0x00df }
            java.io.IOException r0 = X.JTO.A0u(r0)     // Catch:{ IOException | SecurityException -> 0x00df }
        L_0x00de:
            throw r0     // Catch:{ IOException | SecurityException -> 0x00df }
        L_0x00df:
            r2 = move-exception
            java.lang.String r1 = "HighQualityBitmapManager"
            java.lang.String r0 = "Failed to decode high quality photo"
            X.0wb.A06(r1, r0, r2)
            android.os.Handler r1 = X.C11156SCl.A00
            X.THu r0 = new X.THu
            r0.<init>(r13, r2)
            r1.post(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TL0.run():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.graphics.Bitmap A00(android.graphics.BitmapFactory.Options r5) {
        /*
            r4 = this;
            X.RR6 r2 = r4.A01
            boolean r0 = r2 instanceof X.RBZ
            if (r0 == 0) goto L_0x000f
            X.RBZ r2 = (X.RBZ) r2
            java.lang.String r0 = r2.A00
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0, r5)
            return r0
        L_0x000f:
            boolean r0 = r2 instanceof X.C8824RBa
            if (r0 == 0) goto L_0x0045
            X.RBa r2 = (X.C8824RBa) r2
            android.content.ContentResolver r1 = r2.A00
            android.net.Uri r3 = r2.A01
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r2 = r1.openAssetFileDescriptor(r3, r0)
            if (r2 == 0) goto L_0x0036
            java.io.FileDescriptor r1 = r2.getFileDescriptor()     // Catch:{ all -> 0x002f }
            r0 = 0
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFileDescriptor(r1, r0, r5)     // Catch:{ all -> 0x002f }
            r2.close()
            return r0
        L_0x002f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            X.1zE.A00(r2, r1)
            throw r0
        L_0x0036:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failed to open file descriptor for "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r3, r0, r1)
            java.io.IOException r0 = X.JTO.A0u(r0)
            throw r0
        L_0x0045:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TL0.A00(android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public TL0(RR6 rr6) {
        this.A01 = rr6;
    }
}
