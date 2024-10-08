package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

public abstract class U1X extends Drawable implements X7S, AnonymousClass765 {
    public boolean A00 = true;
    public AnonymousClass764 A01;
    public boolean A02 = true;
    public boolean A03 = false;
    public boolean A04 = false;
    public final Matrix A05 = new Matrix();
    public final Matrix A06 = new Matrix();
    public final Matrix A07 = new Matrix();
    public final Matrix A08 = new Matrix();
    public final Matrix A09 = new Matrix();
    public final Matrix A0A = new Matrix();
    public final RectF A0B = new RectF();
    public final RectF A0C = new RectF();
    public final RectF A0D = new RectF();
    public final RectF A0E = new RectF();
    public final Drawable A0F;
    public final float[] A0G = new float[8];
    public final float[] A0H = new float[8];
    public final Path A0I = new Path();
    public final Path A0J = new Path();

    public final void ERU(boolean z) {
        this.A03 = true;
        this.A02 = true;
        invalidateSelf();
    }

    public final void Ehg(float[] fArr) {
        boolean z = false;
        0He.A01(AnonymousClass7TF.A1S(fArr.length, 8), "radii should have exactly 8 values");
        System.arraycopy(fArr, 0, this.A0H, 0, 8);
        this.A04 = false;
        int i = 0;
        do {
            z |= AnonymousClass7TF.A1R((fArr[i] > 0.0f ? 1 : (fArr[i] == 0.0f ? 0 : -1)));
            this.A04 = z;
            i++;
        } while (i < 8);
        this.A02 = true;
        invalidateSelf();
    }

    public final void Ehh(float f) {
        boolean z = false;
        0He.A00(Pxf.A1R((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))));
        Arrays.fill(this.A0H, f);
        if (f != 0.0f) {
            z = true;
        }
        this.A04 = z;
        this.A02 = true;
        invalidateSelf();
    }

    public void A00() {
        RectF rectF;
        AnonymousClass764 r0 = this.A01;
        Matrix matrix = this.A07;
        if (r0 != null) {
            r0.C9Q(matrix);
            AnonymousClass764 r02 = this.A01;
            rectF = this.A0E;
            r02.Bob(rectF);
        } else {
            matrix.reset();
            rectF = this.A0E;
            C13988Tno.A0v(rectF, this);
        }
        RectF rectF2 = this.A0B;
        Drawable drawable = this.A0F;
        C13990Tnq.A0q(rectF2, (float) drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        RectF rectF3 = this.A0C;
        C13988Tno.A0v(rectF3, drawable);
        Matrix matrix2 = this.A05;
        matrix2.setRectToRect(rectF2, rectF3, Matrix.ScaleToFit.FILL);
        Matrix matrix3 = this.A09;
        if (!matrix.equals(matrix3) || !matrix2.equals(this.A08)) {
            this.A00 = true;
            matrix.invert(this.A06);
            Matrix matrix4 = this.A0A;
            matrix4.set(matrix);
            matrix4.preConcat(matrix2);
            matrix3.set(matrix);
            this.A08.set(matrix2);
        }
        RectF rectF4 = this.A0D;
        if (!rectF.equals(rectF4)) {
            this.A02 = true;
            rectF4.set(rectF);
        }
    }

    public final void A01() {
        float[] fArr;
        if (this.A02) {
            Path path = this.A0I;
            path.reset();
            RectF rectF = this.A0E;
            float f = 0.0f / 2.0f;
            rectF.inset(f, f);
            if (this.A03) {
                C13992Tns.A0X(path, rectF);
            } else {
                int i = 0;
                while (true) {
                    fArr = this.A0G;
                    if (i >= fArr.length) {
                        break;
                    }
                    fArr[i] = (this.A0H[i] + 0.0f) - f;
                    i++;
                }
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
            float f2 = -0.0f / 2.0f;
            rectF.inset(f2, f2);
            Path path2 = this.A0J;
            path2.reset();
            float f3 = 0.0f + 0.0f;
            rectF.inset(f3, f3);
            if (this.A03) {
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
            } else {
                path2.addRoundRect(rectF, this.A0H, Path.Direction.CW);
            }
            float f4 = -f3;
            rectF.inset(f4, f4);
            path2.setFillType(Path.FillType.WINDING);
            this.A02 = false;
        }
    }

    public boolean A02() {
        if (this.A03 || this.A04) {
            return true;
        }
        return false;
    }

    public final void Ep9(AnonymousClass764 r1) {
        this.A01 = r1;
    }

    public final void clearColorFilter() {
        this.A0F.clearColorFilter();
    }

    public final int getAlpha() {
        return this.A0F.getAlpha();
    }

    public final ColorFilter getColorFilter() {
        return this.A0F.getColorFilter();
    }

    public final int getIntrinsicHeight() {
        return this.A0F.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.A0F.getIntrinsicWidth();
    }

    public final int getOpacity() {
        return this.A0F.getOpacity();
    }

    public final void onBoundsChange(Rect rect) {
        this.A0F.setBounds(rect);
    }

    public void setAlpha(int i) {
        this.A0F.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A0F.setColorFilter(colorFilter);
    }

    public U1X(Drawable drawable) {
        this.A0F = drawable;
    }

    public void draw(Canvas canvas) {
        AnonymousClass1Sz.A00();
        this.A0F.draw(canvas);
        AnonymousClass1Sz.A00();
    }

    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        this.A0F.setColorFilter(i, mode);
    }
}
