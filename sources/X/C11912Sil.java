package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: X.Sil  reason: case insensitive filesystem */
public final class C11912Sil implements C13796ThF, C13532Tc4 {
    public final Resources A00;
    public final C13796ThF A01;

    public final Class Bne() {
        return BitmapDrawable.class;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return new BitmapDrawable(this.A00, (Bitmap) this.A01.get());
    }

    public final int getSize() {
        return this.A01.getSize();
    }

    public final void initialize() {
        C13796ThF thF = this.A01;
        if (thF instanceof C13532Tc4) {
            ((C13532Tc4) thF).initialize();
        }
    }

    public final void recycle() {
        this.A01.recycle();
    }

    public C11912Sil(Resources resources, C13796ThF thF) {
        C9217RTu.A00(resources);
        this.A00 = resources;
        this.A01 = thF;
    }
}
