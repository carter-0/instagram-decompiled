package com.instagram.ui.widget.gradientspinner;

import X.0nA;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C51965G9l;
import X.C64205LTv;
import X.DbW;
import X.DbY;
import X.JTO;
import X.JTP;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.instagram.android.R;

public class SpinningGradientBorder extends FrameLayout {
    public int A00;
    public LinearGradient A01;
    public final float A02;
    public final float A03;
    public final Paint A04;
    public final RectF A05;
    public final int A06;
    public final ValueAnimator A07;
    public final Matrix A08;

    public SpinningGradientBorder(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setCurrentPlayTime(long j) {
        this.A07.setCurrentPlayTime(j);
    }

    public void setSpinnerState(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            if (i != 0) {
                if (i == 1) {
                    this.A07.start();
                    invalidate();
                } else if (i != 2) {
                    throw DbW.A0b("Invalid SpinnerState ", i);
                }
            }
            this.A07.cancel();
            invalidate();
        }
    }

    private LinearGradient getGradient() {
        Context context = getContext();
        LinearGradient linearGradient = this.A01;
        if (linearGradient != null) {
            return linearGradient;
        }
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, AnonymousClass7TE.A02(this), AnonymousClass7TE.A03(this), context.getColor(R.color.fds_transparent), this.A06, Shader.TileMode.CLAMP);
        this.A01 = linearGradient2;
        return linearGradient2;
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(787297186);
        super.onDetachedFromWindow();
        this.A07.end();
        AnonymousClass0fD.A0D(-2123829886, A062);
    }

    public final void onDraw(Canvas canvas) {
        Paint paint;
        super.onDraw(canvas);
        int i = this.A00;
        if (i != 0) {
            if (i == 1) {
                paint = this.A04;
                paint.setShader(getGradient());
                Matrix matrix = this.A08;
                matrix.setRotate((AnonymousClass7TE.A04(this.A07.getAnimatedValue()) * 360.0f) - 0.099609375f, (float) (getWidth() / 2), (float) (getHeight() / 2));
                getGradient().setLocalMatrix(matrix);
            } else if (i == 2) {
                paint = this.A04;
                paint.setShader((Shader) null);
                paint.setColor(this.A06);
            } else {
                throw DbW.A0b("Invalid SpinnerState ", i);
            }
            RectF rectF = this.A05;
            float f = this.A03;
            rectF.set(f, f, AnonymousClass7TE.A02(this) - f, AnonymousClass7TE.A03(this) - f);
            float f2 = this.A02;
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
    }

    public SpinningGradientBorder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = 0;
        this.A02 = (float) DbY.A01(context);
        float A002 = 0nA.A00(context, 1.5f);
        this.A03 = A002;
        Paint A0D = JTP.A0D();
        this.A04 = A0D;
        JTO.A1N(A0D);
        A0D.setStrokeWidth(A002);
        A0D.setStrokeCap(Paint.Cap.ROUND);
        this.A05 = AnonymousClass7TE.A0Y();
        this.A08 = AnonymousClass7TE.A0U();
        float[] A1b = C51965G9l.A1b();
        // fill-array-data instruction
        A1b[0] = 0;
        A1b[1] = 1065353216;
        ValueAnimator duration = ValueAnimator.ofFloat(A1b).setDuration(1200);
        this.A07 = duration;
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatCount(-1);
        C64205LTv.A01(duration, this, 15);
        this.A06 = AnonymousClass7TF.A03(context, R.attr.gradientSpinnerDoneColor);
        setWillNotDraw(false);
    }

    public SpinningGradientBorder(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
