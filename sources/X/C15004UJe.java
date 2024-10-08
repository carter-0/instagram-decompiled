package X;

import android.graphics.Bitmap;

/* renamed from: X.UJe  reason: case insensitive filesystem */
public final class C15004UJe extends C15005UJf {
    public final void finalize() {
        if (!isClosed()) {
            0I1.A09("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", C51968G9o.A1Z(C51968G9o.A16(this), System.identityHashCode(this)));
            close();
        }
    }

    public C15004UJe(Bitmap bitmap, 1T3 r2, C240593Lm r3) {
        super(bitmap, r2, r3);
    }

    public C15004UJe(C249903kY r1, C240593Lm r2) {
        super(r1, r2);
    }
}
