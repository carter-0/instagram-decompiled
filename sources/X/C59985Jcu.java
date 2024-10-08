package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.Jcu  reason: case insensitive filesystem */
public final class C59985Jcu extends Drawable {
    public int A00;
    public int A01;
    public Paint A02;
    public Path A03;
    public Path A04;
    public final float A05;
    public final int A06;
    public final RectF A07 = AnonymousClass7TE.A0Y();
    public final Bitmap A08;
    public final Matrix A09;
    public final Paint A0A;

    public C59985Jcu(Bitmap bitmap, Matrix matrix, float f, int i) {
        0qQ.A0B(bitmap, 1);
        this.A08 = bitmap;
        this.A05 = f;
        this.A09 = matrix;
        this.A06 = i;
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A0A = A0V;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        if (matrix != null) {
            RectF rectF = new RectF(0.0f, 0.0f, JTO.A02(bitmap), JTO.A01(bitmap));
            matrix.mapRect(rectF);
            this.A01 = (int) rectF.width();
            this.A00 = (int) rectF.height();
            bitmapShader.setLocalMatrix(matrix);
        } else {
            this.A01 = bitmap.getWidth();
            this.A00 = bitmap.getHeight();
        }
        A0V.setShader(bitmapShader);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A07.set(0.0f, 0.0f, (float) rect.width(), (float) rect.height());
        this.A04 = null;
        this.A03 = null;
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A01;
    }

    public final void setAlpha(int i) {
        this.A0A.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0A.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        AnonymousClass7TF.A12(canvas);
        AnonymousClass7TG.A0z(canvas, this);
        int i = this.A06;
        if ((i & 15) == 15) {
            RectF rectF = this.A07;
            float f = this.A05;
            canvas.drawRoundRect(rectF, f, f, this.A0A);
        } else {
            Path path = this.A04;
            if (path == null) {
                float f2 = this.A05;
                RectF rectF2 = this.A07;
                path = C63118Krm.A00(f2, 0.0f, 0.0f, rectF2.width(), rectF2.height(), i);
                this.A04 = path;
            }
            canvas.drawPath(path, this.A0A);
        }
        Paint paint = this.A02;
        if (paint != null) {
            Path path2 = this.A03;
            if (path2 == null) {
                float strokeWidth = paint.getStrokeWidth() / 2.0f;
                float f3 = this.A05;
                RectF rectF3 = this.A07;
                path2 = C63118Krm.A00(f3, strokeWidth, strokeWidth, rectF3.width() - strokeWidth, rectF3.height() - strokeWidth, i);
                this.A03 = path2;
            }
            canvas.drawPath(path2, paint);
        }
        canvas.restore();
    }
}
