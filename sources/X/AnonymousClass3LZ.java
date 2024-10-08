package X;

import android.graphics.Bitmap;

/* renamed from: X.3LZ  reason: invalid class name */
public final class AnonymousClass3LZ extends C240473La implements C240523Lf {
    public Bitmap A00;
    public final int A01;

    public AnonymousClass3LZ(Bitmap bitmap, C226932iD r4, String str, int i, int i2) {
        0qQ.A0B(str, 5);
        this.A00 = bitmap;
        this.A01 = i;
        A00("ENCODED_IMAGE_SIZE", Integer.valueOf(i2));
        A00("IMAGE_RENDERED", r4);
        A00("IMAGE_LOADED_SCANS", Integer.valueOf(i));
        A00("LOAD_SOURCE", str);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.3Lm, java.lang.Object] */
    public final synchronized C240593Lm BiU() {
        C240593Lm r0;
        int i = this.A01;
        if (i == -1) {
            C240593Lm r02 = C240593Lm.A03;
            0qQ.A08(r02);
            r0 = r02;
        } else {
            ? obj = new Object();
            obj.A00 = i;
            obj.A02 = true;
            obj.A01 = false;
            r0 = obj;
        }
        return r0;
    }

    public final synchronized Bitmap CBJ() {
        Bitmap bitmap;
        bitmap = this.A00;
        if (bitmap == null) {
            throw new IllegalStateException("IgCloseableStaticBitmap has been closed already and the bitmap is no longer available.");
        }
        return bitmap;
    }

    public final synchronized void close() {
        this.A00 = null;
    }

    public final synchronized int getHeight() {
        int i;
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            i = bitmap.getHeight();
        } else {
            i = 0;
        }
        return i;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int getSizeInBytes() {
        /*
            r1 = this;
            monitor-enter(r1)
            android.graphics.Bitmap r0 = r1.A00     // Catch:{ all -> 0x0013 }
            if (r0 != 0) goto L_0x0006
            goto L_0x0010
        L_0x0006:
            int r0 = r0.getAllocationByteCount()     // Catch:{ NullPointerException -> 0x000b }
            goto L_0x0011
        L_0x000b:
            int r0 = r0.getByteCount()     // Catch:{ all -> 0x0013 }
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            monitor-exit(r1)
            return r0
        L_0x0013:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3LZ.getSizeInBytes():int");
    }

    public final synchronized int getWidth() {
        int i;
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            i = bitmap.getWidth();
        } else {
            i = 0;
        }
        return i;
    }

    public final synchronized boolean isClosed() {
        throw AnonymousClass00P.createAndThrow();
    }
}
