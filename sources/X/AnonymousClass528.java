package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.lang.ref.WeakReference;

/* renamed from: X.528  reason: invalid class name */
public class AnonymousClass528 extends View {
    public static final float[] A0N = {0.0f, 0.05f, 0.14f, 0.26f, 0.42f, 0.43f, 0.7f, 0.92f};
    public static final int[] A0O = {-11229, -80351, -155365, -367087, -649981, -652286, -2947736, -4652876};
    public float A00 = 0.9f;
    public float A01 = 0.38f;
    public float A02 = 0.17f;
    public int A03 = 12;
    public ValueAnimator A04;
    public Matrix A05;
    public Matrix A06;
    public Paint A07;
    public Paint A08;
    public Point A09;
    public RectF A0A;
    public RectF A0B;
    public boolean A0C;
    public float A0D;
    public float A0E;
    public float A0F;
    public float A0G;
    public float A0H;
    public float A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public LinearGradient A0M;

    public final void A00(float f) {
        if (this.A0I != f || this.A0C) {
            this.A0I = f;
            this.A0C = true;
            Paint paint = this.A07;
            float f2 = (float) this.A0L;
            float f3 = (float) this.A0K;
            float min = Math.min(f / 0.5f, 1.0f);
            paint.setStrokeWidth((f3 * min) + ((1.0f - min) * f2));
            float max = Math.max(0.0f, this.A0I - 0.5f) / 0.5f;
            float min2 = Math.min(1.0f, max / 0.4f);
            float f4 = ((float) this.A0K) / 2.0f;
            RectF rectF = this.A0A;
            Point point = this.A09;
            float f5 = ((float) point.x) - this.A0H;
            float f6 = ((float) point.y) + this.A0E;
            rectF.set(f5 - f4, f6 - f4, f5 + (this.A0F * (Math.max(0.0f, max - 0.4f) / 0.6f)), f6 + f4);
            RectF rectF2 = this.A0B;
            float f7 = this.A0G;
            float f8 = (((float) point.x) - this.A0H) - f7;
            float f9 = ((float) point.y) + this.A0E;
            rectF2.set(f8, f9 - f4, f8 + ((f7 + f4) * min2), f9 + f4);
            invalidate();
        }
    }

    public float getCheckLengthLongRatio() {
        return this.A00;
    }

    public float getCheckLengthShortRatio() {
        return this.A01;
    }

    public float getCheckmarkLeftOffsetRatio() {
        return this.A02;
    }

    public int getCircleStrokeThicknessRatio() {
        return this.A03;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.animation.ValueAnimator$AnimatorUpdateListener, X.52A, java.lang.Object] */
    public AnonymousClass528(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        setLayerType(2, (Paint) null);
        Paint paint = new Paint(1);
        this.A07 = paint;
        paint.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint(1);
        this.A08 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.A04 = ofFloat;
        ofFloat.setDuration(500);
        this.A04.setInterpolator(new AccelerateDecelerateInterpolator());
        ValueAnimator valueAnimator = this.A04;
        ? obj = new Object();
        obj.A00 = new WeakReference(this);
        valueAnimator.addUpdateListener(obj);
        this.A09 = new Point();
        this.A0C = true;
        this.A0A = new RectF();
        this.A0B = new RectF();
        this.A05 = new Matrix();
        this.A06 = new Matrix();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float min = ((float) this.A0J) * Math.min(this.A0I / 0.5f, 1.0f);
        Point point = this.A09;
        canvas.drawCircle((float) point.x, (float) point.y, min, this.A07);
        if (this.A0I >= 0.5f) {
            canvas.setMatrix(this.A06);
            RectF rectF = this.A0B;
            float f = this.A0D;
            Paint paint = this.A08;
            canvas.drawRoundRect(rectF, f, f, paint);
            if (this.A0I >= 0.75f) {
                canvas.setMatrix(this.A05);
                RectF rectF2 = this.A0A;
                float f2 = this.A0D;
                canvas.drawRoundRect(rectF2, f2, f2, paint);
            }
        }
        this.A0C = false;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int min = Math.min(size, size2);
        this.A0L = (min * 3) / 8;
        int i3 = min / this.A03;
        this.A0K = i3;
        int i4 = (min / 2) - (i3 / 2);
        this.A0J = i4;
        this.A0D = (float) i3;
        float f = (float) i4;
        this.A0E = (float) ((int) (0.3f * f));
        this.A0H = this.A02 * f;
        this.A0G = (float) ((int) (this.A01 * f));
        this.A0F = (float) ((int) (f * this.A00));
        Point point = this.A09;
        point.set(size / 2, size2 / 2);
        this.A05.setRotate(-45.0f, ((float) point.x) - this.A0H, ((float) point.y) + this.A0E);
        this.A06.setRotate(45.0f, ((float) point.x) - this.A0H, ((float) point.y) + this.A0E);
        int i5 = point.x;
        int i6 = this.A0J;
        int i7 = point.y;
        LinearGradient linearGradient = new LinearGradient((float) (i5 - i6), (float) (i7 + i6), (float) (i5 + i6), (float) (i7 - i6), A0O, A0N, Shader.TileMode.CLAMP);
        this.A0M = linearGradient;
        this.A07.setShader(linearGradient);
        this.A08.setShader(this.A0M);
        this.A0C = true;
        A00(this.A0I);
    }

    public void setCheckLengthLongRatio(float f) {
        this.A00 = f;
    }

    public void setCheckLengthShortRatio(float f) {
        this.A01 = f;
    }

    public void setCheckmarkLeftOffsetRatio(float f) {
        this.A02 = f;
    }

    public void setCircleStrokeThicknessRatio(int i) {
        this.A03 = i;
    }
}
