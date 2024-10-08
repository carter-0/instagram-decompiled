package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: X.4Zd  reason: invalid class name */
public final class AnonymousClass4Zd extends C71572e9 implements AnonymousClass2eD {
    public float A00;
    public float A01;
    public final Matrix A02;
    public final Paint A03 = new Paint(1);

    public final void A09(float f) {
        this.A03.setAlpha(this.A01);
    }

    public final void A0A(Canvas canvas) {
        try {
            Bitmap bitmap = this.A0B.A02(this.A04.A0L).A00;
            if (bitmap != null && !bitmap.isRecycled()) {
                canvas.drawBitmap(bitmap, this.A02, this.A03);
            }
        } catch (AnonymousClass2dj unused) {
        }
    }

    public final void A0E(RectF rectF) {
        try {
            AnonymousClass2e5 r3 = this.A0B;
            Bitmap bitmap = r3.A02(this.A04.A0L).A00;
            if (bitmap != null && !bitmap.isRecycled()) {
                rectF.set(0.0f, 0.0f, ((float) bitmap.getWidth()) * r3.A00 * this.A00, ((float) bitmap.getHeight()) * r3.A00 * this.A01);
            }
        } catch (AnonymousClass2dj unused) {
        }
    }

    public final void ESG(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
    }

    public AnonymousClass4Zd(2dy r4, AnonymousClass2e5 r5) {
        super(r4, r5);
        AnonymousClass6BC A022 = r5.A02(r4.A0L);
        this.A00 = A022.A01.A01 / ((float) A022.A00.getWidth());
        this.A01 = A022.A01.A00 / ((float) A022.A00.getHeight());
        Matrix matrix = new Matrix();
        this.A02 = matrix;
        matrix.preScale(this.A00, this.A01);
    }

    public final void A07() {
        super.A07();
        Matrix matrix = this.A02;
        matrix.reset();
        float f = this.A00;
        float f2 = this.A0B.A00;
        matrix.preScale(f * f2, this.A01 * f2);
    }
}
