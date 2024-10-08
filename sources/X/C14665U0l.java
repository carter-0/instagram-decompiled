package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.instagram.android.R;

/* renamed from: X.U0l  reason: case insensitive filesystem */
public final class C14665U0l extends Drawable {
    public final ClipDrawable A00;
    public final Paint A01;
    public final RectF A02 = new RectF();
    public final ShapeDrawable A03;
    public final float[] A04;
    public final int[] A05;

    public C14665U0l(Context context) {
        boolean A022 = 0mk.A02(context);
        Paint paint = new Paint();
        this.A01 = paint;
        this.A04 = ABP.A00();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        this.A03 = shapeDrawable;
        this.A00 = new ClipDrawable(shapeDrawable, A022 ? 5 : 3, 1);
        AnonymousClass7TE.A1N(context, paint, R.color.design_dark_default_color_on_background);
        this.A05 = ABP.A01(context);
        this.A00.mutate().setLevel((int) (0.0f * 10000.0f));
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        canvas.drawRect(this.A02, this.A01);
        this.A00.draw(canvas);
    }

    public final int getOpacity() {
        return -1;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A02;
        rectF.set(rect);
        this.A00.setBounds(rect);
        this.A03.getPaint().setShader(new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, this.A05, this.A04, Shader.TileMode.CLAMP));
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
