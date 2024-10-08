package X;

import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: X.Ut7  reason: case insensitive filesystem */
public final class C16337Ut7 extends AnonymousClass8BH {
    public final float A00;
    public final float A01;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Vc8] */
    public final C17677Vc8 A01() {
        ? obj = new Object();
        obj.A08 = AnonymousClass05K.A01;
        obj.A04 = this.A00;
        obj.A05 = this.A01;
        return obj;
    }

    public final void A02(Drawable drawable, List list, int i, int i2) {
        int i3 = (int) (this.A00 * ((float) i));
        int i4 = (int) (this.A01 * ((float) i2));
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        int intrinsicHeight = drawable.getIntrinsicHeight() / 2;
        drawable.setBounds(i3 - intrinsicWidth, i4 - intrinsicHeight, i3 + intrinsicWidth, i4 + intrinsicHeight);
    }

    public C16337Ut7(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
