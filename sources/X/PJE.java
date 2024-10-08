package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

public final class PJE implements C74359PtZ {
    public final int A00;

    public final Bitmap FHd(Bitmap bitmap) {
        int i = this.A00;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        0qQ.A07(createBitmap);
        Bitmap A002 = 0fO.A00(bitmap, i, i, false);
        0qQ.A07(A002);
        Canvas canvas = new Canvas(createBitmap);
        canvas.clipPath(I7E.A02(i));
        canvas.drawBitmap(A002, 0.0f, 0.0f, (Paint) null);
        return createBitmap;
    }

    public PJE(int i) {
        this.A00 = i;
    }
}
