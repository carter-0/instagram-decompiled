package X;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;

public final class U3A extends View {
    public static final float[] A0G = {0.0f, 0.05f, 0.14f, 0.26f, 0.42f, 0.43f, 0.7f, 0.92f};
    public static final int[] A0H = {-11229, -80351, -155365, -367087, -649981, -652286, -2947736, -4652876};
    public int A00;
    public ValueAnimator A01;
    public Matrix A02;
    public Matrix A03;
    public Paint A04;
    public Paint A05;
    public Point A06;
    public RectF A07;
    public RectF A08;
    public boolean A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public int A0E;
    public int A0F;

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        float min = ((float) this.A00) * Math.min(this.A0D / 0.5f, 1.0f);
        Point point = this.A06;
        0qQ.A0A(point);
        float f = (float) point.x;
        Point point2 = this.A06;
        0qQ.A0A(point2);
        float f2 = (float) point2.y;
        Paint paint = this.A04;
        0qQ.A0A(paint);
        canvas.drawCircle(f, f2, min, paint);
        if (this.A0D >= 0.5f) {
            canvas.setMatrix(this.A03);
            RectF rectF = this.A08;
            0qQ.A0A(rectF);
            float f3 = this.A0A;
            Paint paint2 = this.A05;
            0qQ.A0A(paint2);
            canvas.drawRoundRect(rectF, f3, f3, paint2);
            if (this.A0D >= 0.75f) {
                canvas.setMatrix(this.A02);
                RectF rectF2 = this.A07;
                0qQ.A0A(rectF2);
                float f4 = this.A0A;
                Paint paint3 = this.A05;
                0qQ.A0A(paint3);
                canvas.drawRoundRect(rectF2, f4, f4, paint3);
            }
        }
        this.A09 = false;
    }

    public final void A00(float f) {
        if (this.A0D != f || this.A09) {
            this.A0D = f;
            this.A09 = true;
            Paint paint = this.A04;
            0qQ.A0A(paint);
            float f2 = (float) this.A0F;
            float f3 = (float) this.A0E;
            float min = Math.min(this.A0D / 0.5f, 1.0f);
            paint.setStrokeWidth((f3 * min) + ((1.0f - min) * f2));
            float max = Math.max(0.0f, this.A0D - 0.5f) / 0.5f;
            float min2 = Math.min(1.0f, max / 0.4f);
            float A012 = C13988Tno.A01(this.A0E);
            RectF rectF = this.A07;
            0qQ.A0A(rectF);
            Point point = this.A06;
            0qQ.A0A(point);
            Point point2 = this.A06;
            0qQ.A0A(point2);
            Point point3 = this.A06;
            0qQ.A0A(point3);
            float max2 = ((float) point3.x) + (this.A0B * (Math.max(0.0f, max - 0.4f) / 0.6f));
            Point point4 = this.A06;
            0qQ.A0A(point4);
            rectF.set(((float) point.x) - A012, ((float) point2.y) - A012, max2, ((float) point4.y) + A012);
            RectF rectF2 = this.A08;
            0qQ.A0A(rectF2);
            Point point5 = this.A06;
            0qQ.A0A(point5);
            float f4 = ((float) point5.x) - this.A0C;
            Point point6 = this.A06;
            0qQ.A0A(point6);
            Point point7 = this.A06;
            0qQ.A0A(point7);
            float f5 = (float) point7.x;
            float f6 = this.A0C;
            float f7 = (f5 - f6) + ((f6 + A012) * min2);
            Point point8 = this.A06;
            0qQ.A0A(point8);
            rectF2.set(f4, ((float) point6.y) - A012, f7, ((float) point8.y) + A012);
            invalidate();
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int min = Math.min(size, size2);
        this.A0F = (min * 3) / 8;
        int i3 = min / 12;
        this.A0E = i3;
        int i4 = (min / 2) - (i3 / 2);
        this.A00 = i4;
        this.A0A = ((float) i3) / 4.0f;
        float f = (float) i4;
        this.A0C = (float) ((int) (0.45f * f));
        this.A0B = (float) ((int) (f * 0.65f));
        Point point = this.A06;
        0qQ.A0A(point);
        point.set(size / 2, size2 / 2);
        Matrix matrix = this.A02;
        0qQ.A0A(matrix);
        Point point2 = this.A06;
        0qQ.A0A(point2);
        float f2 = (float) point2.x;
        Point point3 = this.A06;
        0qQ.A0A(point3);
        matrix.setRotate(-90.0f, f2, (float) point3.y);
        Matrix matrix2 = this.A03;
        0qQ.A0A(matrix2);
        Point point4 = this.A06;
        0qQ.A0A(point4);
        float f3 = (float) point4.x;
        Point point5 = this.A06;
        0qQ.A0A(point5);
        matrix2.setRotate(0.0f, f3, (float) point5.y);
        Point point6 = this.A06;
        0qQ.A0A(point6);
        Point point7 = this.A06;
        0qQ.A0A(point7);
        Point point8 = this.A06;
        0qQ.A0A(point8);
        Point point9 = this.A06;
        0qQ.A0A(point9);
        LinearGradient linearGradient = new LinearGradient((float) (point6.x - this.A00), (float) (point7.y + this.A00), (float) (point8.x + this.A00), (float) (point9.y - this.A00), A0H, A0G, Shader.TileMode.CLAMP);
        Paint paint = this.A04;
        0qQ.A0A(paint);
        paint.setShader(linearGradient);
        Paint paint2 = this.A05;
        0qQ.A0A(paint2);
        paint2.setShader(linearGradient);
        this.A09 = true;
        A00(this.A0D);
    }
}
