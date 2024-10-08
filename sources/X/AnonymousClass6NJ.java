package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import org.webrtc.CameraCapturer;

/* renamed from: X.6NJ  reason: invalid class name */
public final class AnonymousClass6NJ extends Drawable implements ValueAnimator.AnimatorUpdateListener {
    public float A00 = 0.0f;
    public float A01;
    public int A02;
    public ValueAnimator A03;
    public int[] A04;
    public float A05;
    public float A06;
    public float A07;
    public final Paint A08 = new Paint();

    public AnonymousClass6NJ(Context context, int i, int i2) {
        int[] iArr = {context.getColor(i), context.getColor(i2)};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.A03 = ofFloat;
        this.A04 = iArr;
        this.A02 = CameraCapturer.OPEN_CAMERA_TIMEOUT;
        this.A01 = 1.0f;
        ofFloat.addUpdateListener(this);
        ofFloat.setDuration((long) this.A02);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
    }

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
        this.A08.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A08.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.rotate(this.A00, this.A05, this.A06);
        canvas.drawCircle(this.A05, this.A06, this.A07, this.A08);
        canvas.restore();
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00 = ((Number) valueAnimator.getAnimatedValue()).floatValue() * 360.0f;
        invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        float f;
        float f2;
        float f3;
        float f4;
        float width = (float) rect.width();
        float height = (float) rect.height();
        this.A07 = ((float) Math.sqrt((double) ((width * width) + (height * height)))) / 2.0f;
        this.A05 = width / 2.0f;
        this.A06 = height / 2.0f;
        int i = (width > height ? 1 : (width == height ? 0 : -1));
        float f5 = this.A01;
        float f6 = 1.0f - f5;
        if (i > 0) {
            f3 = (f6 * width) / 2.0f;
            f4 = width * (((f5 - 1.0f) / 2.0f) + 1.0f);
            f2 = 0.0f;
            f = 0.0f;
        } else {
            f = height * (((f5 - 1.0f) / 2.0f) + 1.0f);
            f2 = (f6 * height) / 2.0f;
            f3 = 0.0f;
            f4 = 0.0f;
        }
        this.A08.setShader(new LinearGradient(f3, f2, f4, f, this.A04, (float[]) null, Shader.TileMode.CLAMP));
    }
}
