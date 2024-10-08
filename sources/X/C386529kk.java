package X;

/* renamed from: X.9kk  reason: invalid class name and case insensitive filesystem */
public final class C386529kk extends 0ng {
    public final /* synthetic */ C310466b6 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386529kk(C310466b6 r4) {
        super(622413651, 3, false, false);
        this.A00 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r5 = 1
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r5, r5, r0)
            X.0qQ.A07(r4)
            X.6b6 r3 = r6.A00
            androidx.fragment.app.FragmentActivity r0 = r3.A07
            java.io.File r1 = X.0mb.A04(r0)
            X.0qQ.A07(r1)
            java.lang.String r0 = r1.getPath()     // Catch:{ IOException -> 0x0036, all -> 0x003d }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0036, all -> 0x003d }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0036, all -> 0x003d }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x002f }
            X.JZK.A00(r0, r4, r2)     // Catch:{ all -> 0x002f }
            r2.close()     // Catch:{ IOException -> 0x0036, all -> 0x003d }
            java.lang.String r0 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x0036, all -> 0x003d }
            r3.A03 = r0     // Catch:{ IOException -> 0x0036, all -> 0x003d }
            r3.A06 = r5     // Catch:{ IOException -> 0x0036, all -> 0x003d }
            goto L_0x0036
        L_0x002f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ IOException -> 0x0036, all -> 0x003d }
            throw r0     // Catch:{ IOException -> 0x0036, all -> 0x003d }
        L_0x0036:
            r4.recycle()
            X.C310466b6.A01(r3)
            return
        L_0x003d:
            r0 = move-exception
            r4.recycle()
            X.C310466b6.A01(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C386529kk.run():void");
    }
}
