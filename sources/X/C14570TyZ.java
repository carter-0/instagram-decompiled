package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.TyZ  reason: case insensitive filesystem */
public final class C14570TyZ extends Drawable {
    public final int A00;
    public final Paint A01;
    public final Paint A02;
    public final Path A03 = new Path();
    public final C14571Tya A04;
    public final C14571Tya A05;
    public final C14571Tya A06;
    public final C14581Tyl A07;
    public final boolean A08;
    public final float[] A09;

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        int save = canvas.save();
        try {
            if (this.A08) {
                canvas.clipPath(this.A03);
            }
            canvas.drawColor(this.A00);
            int A062 = JTP.A06(this);
            int A063 = AnonymousClass7TF.A06(this);
            float f = (float) A063;
            canvas2.drawRect(0.0f, 0.0f, f, (float) A062, this.A01);
            canvas.drawCircle(f, 0.0f, (float) ((int) Math.sqrt((double) ((((float) (A063 * A063)) / 4.0f) + (((float) (A062 * A062)) / 4.0f)))), this.A02);
            C14581Tyl tyl = this.A07;
            canvas.drawPath(tyl.A01, tyl.A00);
            C14571Tya tya = this.A05;
            canvas.drawPath(tya.A01, tya.A00);
            C14571Tya tya2 = this.A04;
            canvas.drawPath(tya2.A01, tya2.A00);
            C14571Tya tya3 = this.A06;
            canvas.drawPath(tya3.A01, tya3.A00);
        } catch (Exception unused) {
            1Kn.A02("CDSHarmonizationCompanyGradientDrawable", "Exception when drawing CDSHarmonizationCompanyGradientDrawable");
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
        canvas.restoreToCount(save);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void onBoundsChange(Rect rect) {
        Rect rect2 = rect;
        super.onBoundsChange(rect2);
        if (this.A08) {
            Path path = this.A03;
            path.reset();
            path.addRoundRect(new RectF(rect2), this.A09, Path.Direction.CW);
            path.close();
        }
        int height = rect2.height();
        int width = rect2.width();
        float f = (float) height;
        float f2 = (float) width;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A01.setShader(new LinearGradient(0.0f, f, f2, 0.0f, -16751392, -16743685, tileMode));
        float f3 = f2 * -0.333f;
        float f4 = -0.333f * f;
        float f5 = f2 * 1.333f;
        float f6 = 1.333f * f;
        C14581Tyl tyl = this.A07;
        C14616TzN tzN = tyl.A03;
        tzN.A00 = f5;
        tzN.A01 = f6;
        C14616TzN tzN2 = tyl.A04;
        tzN2.A00 = f5;
        tzN2.A01 = 0.55f * f;
        C14616TzN tzN3 = tyl.A02;
        tzN3.A00 = -0.37f * f2;
        tzN3.A01 = f6;
        C14571Tya tya = this.A06;
        C14616TzN tzN4 = tya.A05;
        tzN4.A00 = f3;
        tzN4.A01 = f4;
        C14616TzN tzN5 = tya.A06;
        tzN5.A00 = 0.032f * f2;
        tzN5.A01 = f4;
        C14616TzN tzN6 = tya.A04;
        tzN6.A00 = f3;
        tzN6.A01 = 1.078f * f;
        C14616TzN tzN7 = tya.A02;
        tzN7.A00 = 0.122f * f2;
        tzN7.A01 = 0.415f * f;
        C14616TzN tzN8 = tya.A03;
        tzN8.A00 = -0.01f * f2;
        tzN8.A01 = 0.753f * f;
        C14571Tya tya2 = this.A04;
        C14616TzN tzN9 = tya2.A05;
        tzN9.A00 = f3;
        tzN9.A01 = f4;
        C14616TzN tzN10 = tya2.A06;
        tzN10.A00 = 0.19f * f2;
        tzN10.A01 = f4;
        C14616TzN tzN11 = tya2.A04;
        tzN11.A00 = f3;
        tzN11.A01 = 1.087f * f;
        C14616TzN tzN12 = tya2.A02;
        tzN12.A00 = 0.197f * f2;
        tzN12.A01 = 0.473f * f;
        C14616TzN tzN13 = tya2.A03;
        tzN13.A00 = 0.025f * f2;
        tzN13.A01 = 0.803f * f;
        C14571Tya tya3 = this.A05;
        C14616TzN tzN14 = tya3.A05;
        tzN14.A00 = f3;
        tzN14.A01 = f4;
        C14616TzN tzN15 = tya3.A06;
        tzN15.A00 = 0.355f * f2;
        tzN15.A01 = f4;
        C14616TzN tzN16 = tya3.A04;
        tzN16.A00 = f3;
        tzN16.A01 = 1.043f * f;
        C14616TzN tzN17 = tya3.A02;
        tzN17.A00 = 0.27f * f2;
        tzN17.A01 = 0.49f * f;
        C14616TzN tzN18 = tya3.A03;
        tzN18.A00 = 0.057f * f2;
        tzN18.A01 = f * 0.807f;
        this.A02.setShader(new RadialGradient(f2, 0.0f, Math.max((float) Math.sqrt((double) ((((float) (width * width)) / 4.0f) + (((float) (height * height)) / 4.0f))), Float.MIN_VALUE), new int[]{C52686Gay.A00(-1, 0.25f), C52686Gay.A00(-1, 0.0f)}, (float[]) null, tileMode));
        Path path2 = tyl.A01;
        path2.reset();
        path2.moveTo(tzN2.A00, tzN2.A01);
        path2.lineTo(tzN3.A00, tzN3.A01);
        path2.lineTo(tzN.A00, tzN.A01);
        path2.close();
        tya3.A00();
        tya2.A00();
        tya.A00();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
        this.A07.A00.setColorFilter(colorFilter);
        this.A06.A00.setColorFilter(colorFilter);
        this.A04.A00.setColorFilter(colorFilter);
        this.A05.A00.setColorFilter(colorFilter);
        this.A02.setColorFilter(colorFilter);
    }

    public C14570TyZ(int i, float[] fArr) {
        this.A00 = i;
        this.A09 = fArr;
        0qQ.A0B(fArr, 0);
        int length = fArr.length;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            } else if (fArr[i2] > 0.0f) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        this.A08 = z;
        this.A01 = new Paint();
        this.A07 = new C14581Tyl();
        this.A06 = new C14571Tya(-11695, 100);
        this.A04 = new C14571Tya(-44416, 190);
        this.A05 = new C14571Tya(-6278145, 175);
        Paint paint = new Paint();
        this.A02 = paint;
        paint.setAntiAlias(true);
        AnonymousClass7TE.A1Q(paint);
        paint.setDither(true);
    }
}
