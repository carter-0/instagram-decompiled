package X;

import android.graphics.Bitmap;

/* renamed from: X.UJf  reason: case insensitive filesystem */
public abstract class C15005UJf extends C240473La implements C240523Lf {
    public C249903kY A00;
    public final C240593Lm A01;
    public volatile Bitmap A02;

    public final void close() {
        C249903kY r1;
        synchronized (this) {
            r1 = this.A00;
            this.A00 = null;
            this.A02 = null;
        }
        if (r1 != null) {
            r1.close();
        }
    }

    public final synchronized boolean isClosed() {
        return DbW.A1a(this.A00);
    }

    public final C240593Lm BiU() {
        return this.A01;
    }

    public final Bitmap CBJ() {
        return this.A02;
    }

    public final int getHeight() {
        Bitmap bitmap = this.A02;
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    public final int getSizeInBytes() {
        Bitmap bitmap = this.A02;
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }

    public final int getWidth() {
        Bitmap bitmap = this.A02;
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    public C15005UJf(Bitmap bitmap, 1T3 r4, C240593Lm r5) {
        this.A02 = bitmap;
        this.A00 = C249903kY.A00(C249903kY.A05, r4, this.A02);
        this.A01 = r5;
    }

    public C15005UJf(C249903kY r2, C240593Lm r3) {
        C249903kY A04 = r2.A04();
        A04.getClass();
        this.A00 = A04;
        this.A02 = (Bitmap) A04.A05();
        this.A01 = r3;
    }
}
