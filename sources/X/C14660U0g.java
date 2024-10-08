package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.U0g  reason: case insensitive filesystem */
public final class C14660U0g extends Drawable {
    public float A00;
    public int A01;
    public ColorStateList A02;
    public final int A03;
    public final Paint A04;
    public final Paint A05;
    public final RectF A06 = new RectF();
    public final Drawable A07;

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C14660U0g(ColorStateList colorStateList, Drawable drawable, float f, int i, int i2, int i3, int i4) {
        Paint paint = new Paint(1);
        this.A04 = paint;
        AnonymousClass7TE.A1Q(paint);
        if (i3 > 0 && i4 != 0) {
            this.A03 = i3;
            Paint paint2 = new Paint(1);
            this.A05 = paint2;
            JTO.A1N(paint2);
            paint2.setColor(i4);
            paint2.setStrokeWidth((float) i3);
        }
        this.A01 = i;
        this.A00 = f;
        this.A02 = colorStateList;
        this.A07 = drawable;
        AnonymousClass7TE.A1R(drawable, i2);
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int A042 = JTO.A04(((float) Math.min(bounds.height(), bounds.width())) - (((float) this.A01) * 2.0f), 2.0f);
        RectF rectF = this.A06;
        C13988Tno.A0v(rectF, this);
        rectF.inset(0.0f, 0.0f);
        Paint paint = this.A04;
        paint.setColor(this.A02.getColorForState(getState(), 0));
        canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), (float) A042, paint);
        Paint paint2 = this.A05;
        if (paint2 != null) {
            float f = ((float) this.A03) / 2.0f;
            rectF.inset(f, f);
            float f2 = this.A00;
            canvas.drawRoundRect(rectF, f2, f2, paint2);
        }
        Drawable drawable = this.A07;
        if (drawable != null) {
            canvas.save();
            Rect bounds2 = drawable.getBounds();
            if ((bounds2.width() == 0 || bounds2.height() == 0) && drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
                AnonymousClass7TG.A13(drawable);
            }
            canvas.translate((((float) bounds.width()) / 2.0f) - (((float) bounds2.width()) / 2.0f), (((float) bounds.height()) / 2.0f) - (((float) bounds2.height()) / 2.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
    }
}
