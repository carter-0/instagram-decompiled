package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.U0z  reason: case insensitive filesystem */
public final class C14678U0z extends Drawable {
    public boolean A00;
    public final int A01;
    public final int A02;
    public final Paint A03;
    public final RectF A04 = new RectF();
    public final float[] A05;
    public final int[] A06;

    public C14678U0z(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A02 = dimensionPixelSize;
        this.A01 = AnonymousClass7TF.A02(context, R.dimen.abc_action_bar_elevation_material);
        Paint paint = new Paint(1);
        JTO.A1N(paint);
        AnonymousClass7TE.A1N(context, paint, R.color.grey_2);
        paint.setStrokeWidth((float) dimensionPixelSize);
        this.A03 = paint;
        this.A05 = ABP.A00();
        this.A06 = ABP.A01(context);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        RectF rectF = this.A04;
        float f = (float) this.A01;
        canvas.drawRoundRect(rectF, f, f, this.A03);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        float A012 = C13988Tno.A01(this.A02);
        this.A04.set(((float) rect.left) + A012, ((float) rect.top) + A012, ((float) rect.right) - A012, ((float) rect.bottom) - A012);
        A00(this);
    }

    public static final void A00(C14678U0z u0z) {
        LinearGradient linearGradient;
        boolean z = u0z.A00;
        Paint paint = u0z.A03;
        if (z) {
            RectF rectF = u0z.A04;
            linearGradient = new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, u0z.A06, u0z.A05, Shader.TileMode.CLAMP);
        } else {
            linearGradient = null;
        }
        paint.setShader(linearGradient);
        u0z.invalidateSelf();
    }

    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
