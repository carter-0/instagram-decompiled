package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;

public final class UKE extends C71572e9 implements AnonymousClass2eD {
    public int A00;
    public final WI7 A01;
    public final float A02;
    public final float A03;
    public final Matrix A04;
    public final Paint A05;

    public UKE(2dy r6, AnonymousClass2e5 r7) {
        super(r6, r7);
        WI7 wi7 = r6.A0Q;
        if (wi7 != null) {
            this.A01 = wi7;
            this.A05 = new Paint(1);
            Matrix matrix = new Matrix();
            this.A04 = matrix;
            try {
                AnonymousClass2e5 r2 = this.A0B;
                int[] iArr = this.A01.A01;
                if (iArr != null) {
                    AnonymousClass6BC A022 = r2.A02(iArr[this.A00]);
                    if (A022 != null) {
                        Bitmap bitmap = A022.A00;
                        0qQ.A07(bitmap);
                        float width = A022.A01.A01 / ((float) bitmap.getWidth());
                        this.A02 = width;
                        float height = A022.A01.A00 / ((float) bitmap.getHeight());
                        this.A03 = height;
                        matrix.preScale(width, height);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                0qQ.A0F("bitmapIndices");
                throw AnonymousClass00P.createAndThrow();
            } catch (AnonymousClass2dj unused) {
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A0A(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Bitmap A002 = A00();
        if (A002 != null) {
            canvas.drawBitmap(A002, this.A04, this.A05);
        }
    }

    public final void A0E(RectF rectF) {
        0qQ.A0B(rectF, 0);
        Bitmap A002 = A00();
        if (A002 != null) {
            AnonymousClass2e5 r2 = this.A0B;
            rectF.set(0.0f, 0.0f, ((float) A002.getWidth()) * r2.A00 * this.A02, ((float) A002.getHeight()) * r2.A00 * this.A03);
        }
    }

    private final Bitmap A00() {
        AnonymousClass6BC r0;
        try {
            AnonymousClass2e5 r2 = this.A0B;
            int[] iArr = this.A01.A01;
            if (iArr != null) {
                r0 = r2.A02(iArr[this.A00]);
                if (r0 != null) {
                    Bitmap bitmap = r0.A00;
                    0qQ.A07(bitmap);
                    if (!bitmap.isRecycled()) {
                        return bitmap;
                    }
                }
                return null;
            }
            0qQ.A0F("bitmapIndices");
            throw AnonymousClass00P.createAndThrow();
        } catch (AnonymousClass2dj unused) {
            r0 = null;
        }
    }

    public final void A09(float f) {
        this.A05.setAlpha(this.A01);
        float f2 = f - this.A04.A07;
        WI7 wi7 = this.A01;
        int i = (int) (wi7.A00 * this.A0B.A0E.A00 * f2);
        this.A00 = i;
        int[] iArr = wi7.A01;
        if (iArr != null) {
            int length = iArr.length - 1;
            if (i > length) {
                i = length;
            }
            this.A00 = i;
            if (i < 0) {
                i = 0;
            }
            this.A00 = i;
            return;
        }
        0qQ.A0F("bitmapIndices");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void ESG(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
    }

    public final void A07() {
        super.A07();
        Matrix matrix = this.A04;
        matrix.reset();
        float f = this.A02;
        float f2 = this.A0B.A00;
        matrix.preScale(f * f2, this.A03 * f2);
    }
}
