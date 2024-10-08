package X;

public final class Si9 implements C13915TlH {
    public static final SJ8 A01;
    public static final SJ8 A02;
    public final ST0 A00;

    static {
        C13530Tc2 tc2 = SJ8.A04;
        A02 = new SJ8(tc2, 90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
        A01 = new SJ8(tc2, (Object) null, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:18|19|28|29|30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        if (r1 == null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005c, code lost:
        if (r1 == null) goto L_0x0061;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x005b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean ARr(X.C11856Shi r10, java.io.File r11, java.lang.Object r12) {
        /*
            r9 = this;
            X.ThF r12 = (X.C13796ThF) r12
            java.lang.String r7 = "BitmapEncoder"
            java.lang.Object r6 = r12.get()
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            X.SJ8 r5 = A01
            java.lang.Object r8 = r10.A00(r5)
            android.graphics.Bitmap$CompressFormat r8 = (android.graphics.Bitmap.CompressFormat) r8
            if (r8 != 0) goto L_0x001c
            boolean r0 = r6.hasAlpha()
            if (r0 == 0) goto L_0x0023
            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.PNG
        L_0x001c:
            r6.getWidth()
            r6.getHeight()
            goto L_0x0026
        L_0x0023:
            android.graphics.Bitmap$CompressFormat r8 = android.graphics.Bitmap.CompressFormat.JPEG
            goto L_0x001c
        L_0x0026:
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x0075 }
            X.SJ8 r0 = A02     // Catch:{ all -> 0x0075 }
            java.lang.Object r0 = r10.A00(r0)     // Catch:{ all -> 0x0075 }
            int r4 = X.Pxe.A09(r0)     // Catch:{ all -> 0x0075 }
            r3 = 0
            r1 = 0
            java.io.FileOutputStream r2 = X.JTO.A0t(r11)     // Catch:{ IOException -> 0x0050 }
            X.ST0 r0 = r9.A00     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            if (r0 == 0) goto L_0x0043
            X.RD0 r1 = new X.RD0     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            r1.<init>(r0, r2)     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            goto L_0x0044
        L_0x0043:
            r1 = r2
        L_0x0044:
            X.0fO.A02(r8, r6, r1, r4)     // Catch:{ IOException -> 0x0050 }
            r1.close()     // Catch:{ IOException -> 0x0050 }
            r3 = 1
            goto L_0x005e
        L_0x004c:
            r0 = move-exception
            r1 = r2
            goto L_0x0058
        L_0x004f:
            r1 = r2
        L_0x0050:
            r0 = 3
            android.util.Log.isLoggable(r7, r0)     // Catch:{ all -> 0x0055 }
            goto L_0x005c
        L_0x0055:
            r0 = move-exception
            if (r1 == 0) goto L_0x005b
        L_0x0058:
            r1.close()     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            throw r0     // Catch:{ all -> 0x0075 }
        L_0x005c:
            if (r1 == 0) goto L_0x0061
        L_0x005e:
            r1.close()     // Catch:{ IOException -> 0x0061 }
        L_0x0061:
            r0 = 2
            boolean r0 = android.util.Log.isLoggable(r7, r0)     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0074
            X.C11424STg.A01(r6)     // Catch:{ all -> 0x0075 }
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x0075 }
            r10.A00(r5)     // Catch:{ all -> 0x0075 }
            r6.hasAlpha()     // Catch:{ all -> 0x0075 }
        L_0x0074:
            return r3
        L_0x0075:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Si9.ARr(X.Shi, java.io.File, java.lang.Object):boolean");
    }

    public final Integer B1N(C11856Shi shi) {
        return AnonymousClass05K.A01;
    }

    public Si9(ST0 st0) {
        this.A00 = st0;
    }

    @Deprecated
    public Si9() {
        this.A00 = null;
    }
}
