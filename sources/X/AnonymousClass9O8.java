package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;

/* renamed from: X.9O8  reason: invalid class name */
public final class AnonymousClass9O8 extends ShapeDrawable.ShaderFactory {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public final Matrix A04 = AnonymousClass7TE.A0U();
    public final Bitmap A05;
    public final BitmapShader A06;

    public final void A00() {
        Matrix matrix;
        float f;
        float height;
        Bitmap bitmap = this.A05;
        if (bitmap.getWidth() * this.A02 > this.A03 * bitmap.getHeight()) {
            float height2 = ((float) this.A02) / ((float) bitmap.getHeight());
            matrix = this.A04;
            matrix.setScale(height2, height2);
            f = ((((float) this.A03) - (((float) bitmap.getWidth()) * height2)) * 0.5f) + this.A00;
            height = this.A01;
        } else {
            float width = ((float) this.A03) / ((float) bitmap.getWidth());
            matrix = this.A04;
            matrix.setScale(width, width);
            f = this.A00;
            height = ((((float) this.A02) - (((float) bitmap.getHeight()) * width)) * 0.5f) + this.A01;
        }
        matrix.postTranslate(f, height);
        this.A06.setLocalMatrix(matrix);
    }

    public final Shader resize(int i, int i2) {
        this.A03 = i;
        this.A02 = i2;
        A00();
        return this.A06;
    }

    public AnonymousClass9O8(Bitmap bitmap) {
        this.A05 = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A06 = new BitmapShader(bitmap, tileMode, tileMode);
    }
}
