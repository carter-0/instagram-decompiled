package X;

/* renamed from: X.5HU  reason: invalid class name */
public final class AnonymousClass5HU {
    public static final AnonymousClass5HU A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        r1 = (android.graphics.drawable.BitmapDrawable) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = (android.graphics.drawable.BitmapDrawable) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(android.graphics.drawable.Drawable r4, android.graphics.drawable.Drawable r5) {
        /*
            boolean r0 = r4 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L_0x007d
            r1 = r4
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            android.graphics.Bitmap r0 = r1.getBitmap()
            if (r0 == 0) goto L_0x007d
            android.graphics.Bitmap$Config r2 = r0.getConfig()
            if (r2 == 0) goto L_0x007d
            android.graphics.Bitmap r1 = r1.getBitmap()
            r0 = 1
            android.graphics.Bitmap r4 = r1.copy(r2, r0)
        L_0x001c:
            X.0qQ.A07(r4)
            if (r5 == 0) goto L_0x007b
            boolean r0 = r5 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L_0x0076
            r1 = r5
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            android.graphics.Bitmap r0 = r1.getBitmap()
            if (r0 == 0) goto L_0x0076
            android.graphics.Bitmap$Config r2 = r0.getConfig()
            if (r2 == 0) goto L_0x0076
            android.graphics.Bitmap r1 = r1.getBitmap()
            r0 = 1
            android.graphics.Bitmap r3 = r1.copy(r2, r0)
        L_0x003d:
            X.0qQ.A07(r3)
        L_0x0040:
            r1 = 0
            if (r3 == 0) goto L_0x0075
            int r2 = r4.getWidth()
            int r0 = r3.getWidth()
            if (r2 != r0) goto L_0x0075
            int r2 = r4.getHeight()
            int r0 = r3.getHeight()
            if (r2 != r0) goto L_0x0075
            byte[] r1 = A01(r4)
            byte[] r0 = A01(r3)
            boolean r1 = java.util.Arrays.equals(r1, r0)
            boolean r0 = r4.isRecycled()
            if (r0 != 0) goto L_0x006c
            r4.recycle()
        L_0x006c:
            boolean r0 = r3.isRecycled()
            if (r0 != 0) goto L_0x0075
            r3.recycle()
        L_0x0075:
            return r1
        L_0x0076:
            android.graphics.Bitmap r3 = X.1MF.A0D(r5)
            goto L_0x003d
        L_0x007b:
            r3 = 0
            goto L_0x0040
        L_0x007d:
            android.graphics.Bitmap r4 = X.1MF.A0D(r4)
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5HU.A00(android.graphics.drawable.Drawable, android.graphics.drawable.Drawable):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        X.1zE.A00(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] A01(android.graphics.Bitmap r3) {
        /*
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0017 }
            r0 = 100
            X.0fO.A02(r1, r3, r2, r0)     // Catch:{ all -> 0x0017 }
            byte[] r0 = r2.toByteArray()     // Catch:{ all -> 0x0017 }
            r2.close()
            X.0qQ.A07(r0)
            return r0
        L_0x0017:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r0 = move-exception
            X.1zE.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5HU.A01(android.graphics.Bitmap):byte[]");
    }
}
