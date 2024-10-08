package X;

import android.graphics.Bitmap;
import android.graphics.Paint;

public final class T89 implements C74359PtZ {
    public final int A00;

    public T89(int i) {
        this.A00 = i;
    }

    public final Bitmap FHd(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int i = this.A00;
        int i2 = i * 2;
        Bitmap A0B = AnonymousClass7TF.A0B(width + i2, bitmap.getHeight() + i2);
        float f = (float) i;
        JTO.A0B(A0B).drawBitmap(bitmap, f, f, (Paint) null);
        return A0B;
    }
}
