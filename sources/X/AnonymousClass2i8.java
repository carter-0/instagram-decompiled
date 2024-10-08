package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;

/* renamed from: X.2i8  reason: invalid class name */
public class AnonymousClass2i8 extends C226902i9 {
    public final int A00;
    public final int A01;
    public final Drawable A02;

    public final int A01() {
        return this.A00;
    }

    public final int A02() {
        return this.A01;
    }

    public final void A05(Drawable.Callback callback) {
        this.A02.setCallback(callback);
    }

    public AnonymousClass2i8(Drawable drawable) {
        int intrinsicWidth;
        this.A02 = drawable;
        boolean z = drawable instanceof NinePatchDrawable;
        int i = -1;
        if (z) {
            intrinsicWidth = -1;
        } else {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        this.A01 = intrinsicWidth;
        this.A00 = !z ? drawable.getIntrinsicHeight() : i;
    }
}
