package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;

/* renamed from: X.Gco  reason: case insensitive filesystem */
public final class C52797Gco extends Drawable {
    public static final float[] A07 = {0.0f, 0.15428571f, 0.46666667f, 0.6027778f, 0.69166666f, 1.0f};
    public static final int[] A08;
    public static final int[] A09;
    public static final int[] A0A = {16777215, 16777215, C52686Gay.A00(-16777216, 0.3f), C52686Gay.A00(-16777216, 0.2f), 16777215};
    public float A00;
    public float A01;
    public float A02;
    public final float A03;
    public final Paint A04;
    public final boolean A05;
    public final RectF A06 = AnonymousClass7TE.A0Y();

    static {
        int A002 = C52686Gay.A00(-6278145, 0.1f);
        A09 = new int[]{A002, C52686Gay.A00(-15173646, 0.1f), C52686Gay.A00(-14298266, 0.1f), C52686Gay.A00(-668109, 0.1f), C52686Gay.A00(-37796, 0.1f), A002};
        int A003 = C52686Gay.A00(-7982634, 0.2f);
        A08 = new int[]{A003, C52686Gay.A00(-15111988, 0.2f), C52686Gay.A00(-14438052, 0.2f), C52686Gay.A00(-3494861, 0.2f), C52686Gay.A00(-2990252, 0.2f), A003};
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.A04.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
    }

    public C52797Gco(Context context, C307796Rn r4) {
        Paint paint = new Paint();
        this.A04 = paint;
        paint.setAntiAlias(false);
        paint.setDither(true);
        AnonymousClass7TE.A1Q(paint);
        this.A03 = C14573Tyc.A00(context, 12.0f);
        this.A05 = r4.CRA();
    }

    public final void draw(Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(94.0f, this.A00, this.A01);
        canvas.drawCircle(this.A00, this.A01, this.A02, this.A04);
        canvas.restoreToCount(save);
    }

    public final void onBoundsChange(Rect rect) {
        int[] iArr;
        super.onBoundsChange(rect);
        RectF rectF = this.A06;
        float f = this.A03;
        rectF.set(((float) rect.left) + f, ((float) rect.top) + f, ((float) rect.right) - f, ((float) rect.bottom) - f);
        this.A00 = rectF.centerX();
        this.A01 = rectF.centerY();
        this.A02 = ((float) rect.width()) / 2.0f;
        if (this.A05) {
            iArr = A08;
        } else {
            iArr = A09;
        }
        SweepGradient sweepGradient = new SweepGradient(this.A00, this.A01, iArr, A07);
        float f2 = this.A02;
        if (f2 > 0.0f) {
            float f3 = f / f2;
            float f4 = 1.0f - f3;
            float f5 = (f3 * 0.25f) + f4;
            if (f5 > 1.0f) {
                1Kn.A02("CDSCircularShadowDrawable", 002.A0N("Gradient quarter fraction cannot be greater than 1, value is: ", f5));
                return;
            }
            this.A04.setShader(new ComposeShader(new RadialGradient(this.A00, this.A01, f2, A0A, new float[]{0.0f, f4, f4, f5, 1.0f}, Shader.TileMode.CLAMP), sweepGradient, PorterDuff.Mode.SRC_IN));
        }
    }
}
