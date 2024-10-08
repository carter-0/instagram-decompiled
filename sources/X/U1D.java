package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

public final class U1D extends Drawable implements Animatable {
    public AnimatorSet A00;
    public boolean A01;
    public final List A02 = new ArrayList();
    public final List A03;

    public final void draw(Canvas canvas) {
        float f;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        for (C18504Vt1 vt1 : this.A03) {
            Paint paint = vt1.A01;
            if (paint != null) {
                C17558VaC vaC = vt1.A05;
                float f2 = vaC.A02;
                C17558VaC vaC2 = vt1.A04;
                float f3 = vaC2.A02;
                float f4 = vt1.A00;
                float A002 = C13988Tno.A00(f3, f2, f4);
                float f5 = vaC.A03;
                float A003 = C13988Tno.A00(vaC2.A03, f5, f4);
                float f6 = vaC.A04;
                float A004 = C13988Tno.A00(vaC2.A04, f6, f4);
                float f7 = vaC.A05;
                float A005 = C13988Tno.A00(vaC2.A05, f7, f4);
                float f8 = vaC.A00;
                float A006 = C13988Tno.A00(vaC2.A00, f8, f4);
                float f9 = vaC.A01;
                float A007 = C13988Tno.A00(vaC2.A01, f9, f4);
                float sqrt = (float) Math.sqrt((double) (((float) Math.pow((double) (A003 - A002), 2.0d)) + ((float) Math.pow((double) (A005 - A004), 2.0d))));
                float sqrt2 = (float) Math.sqrt((double) (((float) Math.pow((double) (f5 - f2), 2.0d)) + ((float) Math.pow((double) (f7 - f6), 2.0d))));
                if (sqrt2 == 0.0f) {
                    f = 1.0f;
                } else {
                    f = sqrt / sqrt2;
                }
                float A06 = ((float) AnonymousClass7TF.A06(this)) * f8;
                float A062 = ((float) JTP.A06(this)) * f9;
                canvas2.save();
                canvas2.translate((((float) AnonymousClass7TF.A06(this)) * A006) - A06, (((float) JTP.A06(this)) * A007) - A062);
                canvas2.rotate(vt1.A00 * vt1.A02, A06, A062);
                canvas2.scale(f, f, A06, A062);
                canvas2.drawPaint(paint);
                canvas2.restore();
            }
        }
    }

    public final int getOpacity() {
        return -1;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        for (C18504Vt1 vt1 : this.A03) {
            float width = (float) rect.width();
            float height = (float) rect.height();
            Paint paint = vt1.A01;
            if (paint == null) {
                paint = new Paint(5);
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                vt1.A01 = paint;
            }
            C17558VaC vaC = vt1.A05;
            paint.setShader(new LinearGradient(vaC.A02 * width, vaC.A04 * height, vaC.A03 * width, vaC.A05 * height, vt1.A07, (float[]) null, Shader.TileMode.CLAMP));
        }
    }

    public final void setAlpha(int i) {
    }

    public final void start() {
        A00(true);
    }

    public final void stop() {
        A00(false);
    }

    private final void A00(boolean z) {
        if (this.A01 != z) {
            AnimatorSet animatorSet = this.A00;
            if (animatorSet != null) {
                animatorSet.cancel();
                animatorSet.removeAllListeners();
                List<Animator> list = this.A02;
                for (Animator removeAllListeners : list) {
                    removeAllListeners.removeAllListeners();
                }
                this.A00 = null;
                list.clear();
            }
            if (z) {
                for (C18504Vt1 vt1 : this.A03) {
                    int i = 2;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    C51969G9p.A10(ofFloat);
                    boolean z2 = vt1.A06;
                    if (!z2) {
                        i = 1;
                    }
                    ofFloat.setRepeatMode(i);
                    int i2 = 0;
                    if (z2) {
                        i2 = -1;
                    }
                    ofFloat.setRepeatCount(i2);
                    ofFloat.setDuration(vt1.A03);
                    ofFloat.addUpdateListener(new W4K(0, vt1, this));
                    this.A02.add(ofFloat);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(this.A02);
                animatorSet2.start();
                this.A00 = animatorSet2;
            }
            this.A01 = z;
        }
    }

    public final boolean isRunning() {
        AnimatorSet animatorSet = this.A00;
        if (animatorSet != null) {
            return animatorSet.isRunning();
        }
        return false;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        for (C18504Vt1 vt1 : this.A03) {
            Paint paint = vt1.A01;
            if (paint != null) {
                paint.setColorFilter(colorFilter);
            }
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        AnimatorSet animatorSet = this.A00;
        if (animatorSet != null) {
            if (!z) {
                animatorSet.pause();
            } else {
                animatorSet.resume();
            }
        }
        return super.setVisible(z, z2);
    }

    public U1D(List list) {
        this.A03 = list;
    }
}
