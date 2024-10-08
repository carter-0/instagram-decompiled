package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8M9  reason: invalid class name */
public final class AnonymousClass8M9 implements AnonymousClass8MA {
    public final int A00;
    public final int A01;
    public final C3510387i A02;
    public final C353828Ji A03;

    public final void AWm(C53394GnR gnR) {
        C53394GnR gnR2 = gnR;
        Bitmap bitmap = (Bitmap) gnR2.A01;
        RectF rectF = new RectF(0.0f, 0.0f, ((float) bitmap.getWidth()) * 1.0f, ((float) bitmap.getHeight()) * 1.0f);
        Canvas canvas = new Canvas(bitmap);
        Bitmap A012 = ((C353838Jj) this.A03.A00.A00()).A01(bitmap, rectF, this.A02.A09, ((float) bitmap.getWidth()) / ((float) this.A01), ((float) bitmap.getHeight()) / ((float) this.A00), (int) TimeUnit.MICROSECONDS.toMillis(gnR2.A00), true, false, true, true);
        if (A012 != null) {
            canvas.drawBitmap(A012, 0.0f, 0.0f, (Paint) null);
        }
    }

    public AnonymousClass8M9(C3510387i r1, C353828Ji r2, int i, int i2) {
        this.A02 = r1;
        this.A03 = r2;
        this.A01 = i;
        this.A00 = i2;
    }
}
