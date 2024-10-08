package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* renamed from: X.5se  reason: invalid class name and case insensitive filesystem */
public abstract class C297965se {
    public static final Matrix A00 = new Matrix();

    public final void A00(Canvas canvas, Matrix matrix, C297975sf r25, int i) {
        int[] iArr;
        int i2;
        Canvas canvas2 = canvas;
        Matrix matrix2 = matrix;
        C297975sf r4 = r25;
        int i3 = i;
        if (this instanceof C324206yo) {
            C324206yo r5 = (C324206yo) this;
            C324196yn r11 = r5.A02;
            float f = r11.A01;
            float f2 = r5.A01;
            float f3 = r11.A00;
            float f4 = r5.A00;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (f - f2), (double) (f3 - f4)), 0.0f);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.preTranslate(f4, f2);
            matrix3.preRotate((float) Math.toDegrees(Math.atan((double) ((r11.A01 - f2) / (r11.A00 - f4)))));
            rectF.bottom += (float) i3;
            rectF.offset(0.0f, (float) (-i3));
            int[] iArr2 = C297975sf.A0B;
            iArr2[0] = r4.A00;
            iArr2[1] = r4.A01;
            iArr2[2] = r4.A02;
            Paint paint = r4.A05;
            float f5 = rectF.left;
            paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr2, C297975sf.A09, Shader.TileMode.CLAMP));
            canvas2.save();
            canvas2.concat(matrix3);
            canvas2.drawRect(rectF, paint);
        } else if (this instanceof C324176yl) {
            C324156yj r2 = ((C324176yl) this).A00;
            RectF rectF2 = C324156yj.A06;
            float f6 = r2.A03;
            float f7 = r2.A04;
            RectF rectF3 = new RectF(r2.A01, r2.A05, r2.A02, r2.A00);
            boolean z = false;
            if (f7 < 0.0f) {
                z = true;
            }
            Path path = r4.A07;
            if (z) {
                iArr = C297975sf.A0A;
                iArr[0] = 0;
                iArr[1] = r4.A00;
                iArr[2] = r4.A01;
                i2 = r4.A02;
            } else {
                path.rewind();
                path.moveTo(rectF3.centerX(), rectF3.centerY());
                path.arcTo(rectF3, f6, f7);
                path.close();
                float f8 = (float) (-i3);
                rectF3.inset(f8, f8);
                iArr = C297975sf.A0A;
                iArr[0] = 0;
                iArr[1] = r4.A02;
                iArr[2] = r4.A01;
                i2 = r4.A00;
            }
            iArr[3] = i2;
            float width = rectF3.width() / 2.0f;
            if (width > 0.0f) {
                float f9 = 1.0f - (((float) i3) / width);
                float[] fArr = C297975sf.A08;
                fArr[1] = f9;
                fArr[2] = ((1.0f - f9) / 2.0f) + f9;
                RadialGradient radialGradient = new RadialGradient(rectF3.centerX(), rectF3.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
                Paint paint2 = r4.A04;
                paint2.setShader(radialGradient);
                canvas2.save();
                canvas2.concat(matrix2);
                canvas2.scale(1.0f, rectF3.height() / rectF3.width());
                if (!z) {
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                    canvas2.drawPath(path, r4.A03);
                }
                canvas2.drawArc(rectF3, f6, f7, true, paint2);
            } else {
                return;
            }
        } else {
            C324216yp r52 = (C324216yp) this;
            for (C297965se A002 : r52.A02) {
                A002.A00(canvas2, r52.A00, r4, i3);
            }
            return;
        }
        canvas2.restore();
    }
}
