package X;

import android.graphics.Bitmap;

/* renamed from: X.Rv9  reason: case insensitive filesystem */
public final class C10615Rv9 {
    public final int A00;
    public final int A01;
    public volatile Bitmap A02;

    public C10615Rv9(Bitmap bitmap) {
        this.A02 = bitmap;
        this.A00 = bitmap.getWidth();
        this.A01 = bitmap.getHeight();
    }
}
