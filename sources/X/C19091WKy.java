package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* renamed from: X.WKy  reason: case insensitive filesystem */
public final class C19091WKy implements C20972X7c {
    public final float A00;
    public final float A01;
    public final int A02;
    public final Bitmap A03;
    public final Rect A04;

    public C19091WKy(Resources resources, Bitmap bitmap, int i) {
        this.A03 = bitmap;
        this.A02 = i;
        this.A01 = ((float) bitmap.getScaledWidth(resources.getDisplayMetrics())) / ((float) i);
        this.A00 = ((float) bitmap.getScaledHeight(resources.getDisplayMetrics())) / 1.0f;
        this.A04 = new Rect(0, 0, bitmap.getWidth() / i, bitmap.getHeight() / 1);
    }

    public final void AQN(Canvas canvas, Paint paint, Rect rect, int i) {
        0qQ.A0B(paint, 3);
        int i2 = this.A02;
        Rect rect2 = this.A04;
        Bitmap bitmap = this.A03;
        rect2.offsetTo((bitmap.getWidth() * (i % i2)) / i2, (bitmap.getHeight() * (i / i2)) / 1);
        canvas.drawBitmap(bitmap, rect2, rect, paint);
    }

    public final float BIe() {
        return this.A00;
    }

    public final float BIf() {
        return this.A01;
    }
}
