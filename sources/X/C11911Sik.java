package X;

import android.graphics.Bitmap;

/* renamed from: X.Sik  reason: case insensitive filesystem */
public final class C11911Sik implements C13796ThF, C13532Tc4 {
    public final Bitmap A00;
    public final C13813Thg A01;

    public final Class Bne() {
        return Bitmap.class;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return this.A00;
    }

    public final int getSize() {
        return C11424STg.A01(this.A00);
    }

    public final void initialize() {
        this.A00.prepareToDraw();
    }

    public final void recycle() {
        this.A01.E5H(this.A00);
    }

    public C11911Sik(Bitmap bitmap, C13813Thg thg) {
        if (bitmap != null) {
            this.A00 = bitmap;
            if (thg != null) {
                this.A01 = thg;
                return;
            }
            throw AnonymousClass7TE.A11("BitmapPool must not be null");
        }
        throw AnonymousClass7TE.A11("Bitmap must not be null");
    }
}
