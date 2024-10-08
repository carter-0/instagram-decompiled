package X;

/* renamed from: X.SAy  reason: case insensitive filesystem */
public abstract class C11119SAy {
    public static final C13813Thg A00 = new QH6();

    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0012  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C11911Sik A00(android.graphics.drawable.Drawable r6, X.C13813Thg r7, int r8, int r9) {
        /*
            android.graphics.drawable.Drawable r4 = r6.getCurrent()
            boolean r0 = r4 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L_0x0018
            android.graphics.drawable.BitmapDrawable r4 = (android.graphics.drawable.BitmapDrawable) r4
            android.graphics.Bitmap r2 = r4.getBitmap()
        L_0x000e:
            X.Thg r7 = A00
        L_0x0010:
            if (r2 == 0) goto L_0x003e
            X.Sik r0 = new X.Sik
            r0.<init>(r2, r7)
            return r0
        L_0x0018:
            boolean r0 = r4 instanceof android.graphics.drawable.Animatable
            if (r0 != 0) goto L_0x0089
            java.lang.String r6 = "Unable to draw "
            r3 = 5
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 0
            java.lang.String r2 = "DrawableToBitmap"
            if (r8 != r1) goto L_0x0040
            int r0 = r4.getIntrinsicWidth()
            if (r0 > 0) goto L_0x0040
            boolean r0 = android.util.Log.isLoggable(r2, r3)
            if (r0 == 0) goto L_0x003e
            java.lang.StringBuilder r1 = X.AnonymousClass7TF.A0n(r6)
            r1.append(r4)
            java.lang.String r0 = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width"
        L_0x003b:
            X.Pxg.A1Q(r0, r2, r1)
        L_0x003e:
            r0 = 0
            return r0
        L_0x0040:
            if (r9 != r1) goto L_0x0058
            int r0 = r4.getIntrinsicHeight()
            if (r0 > 0) goto L_0x0058
            boolean r0 = android.util.Log.isLoggable(r2, r3)
            if (r0 == 0) goto L_0x003e
            java.lang.StringBuilder r1 = X.AnonymousClass7TF.A0n(r6)
            r1.append(r4)
            java.lang.String r0 = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height"
            goto L_0x003b
        L_0x0058:
            int r0 = r4.getIntrinsicWidth()
            if (r0 <= 0) goto L_0x0062
            int r8 = r4.getIntrinsicWidth()
        L_0x0062:
            int r0 = r4.getIntrinsicHeight()
            if (r0 <= 0) goto L_0x006c
            int r9 = r4.getIntrinsicHeight()
        L_0x006c:
            java.util.concurrent.locks.Lock r3 = X.SQc.A02
            r3.lock()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = r7.AWz(r8, r9, r0)
            android.graphics.Canvas r1 = X.JTO.A0B(r2)     // Catch:{ all -> 0x008b }
            r0 = 0
            r4.setBounds(r0, r0, r8, r9)     // Catch:{ all -> 0x008b }
            r4.draw(r1)     // Catch:{ all -> 0x008b }
            r1.setBitmap(r5)     // Catch:{ all -> 0x008b }
            r3.unlock()
            goto L_0x0010
        L_0x0089:
            r2 = 0
            goto L_0x000e
        L_0x008b:
            r0 = move-exception
            r3.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11119SAy.A00(android.graphics.drawable.Drawable, X.Thg, int, int):X.Sik");
    }
}
